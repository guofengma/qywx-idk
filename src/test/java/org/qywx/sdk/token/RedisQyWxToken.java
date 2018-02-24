package org.qywx.sdk.token;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.apache.log4j.Logger;
import org.qywx.common.RedisConnectionFactory;
import org.qywx.sdk.base.QyWxToken;
import redis.clients.jedis.Jedis;
import java.util.Map;

/**
 * <p>【默认例子实现类，不会生成到jar包去】
 * <p>企业微信接口调用凭证Redis实现
 * @author Rocye
 * @version 2018.01.22
 */
public class RedisQyWxToken extends QyWxToken {
    /** 日志对象 */
    private final static Logger logger = Logger.getLogger(RedisQyWxToken.class.getName());

    /**
     * 构造函数
     * @param corpId		企业ID
	 * @param agentId		应用唯一标识
	 * @param corpSecret	应用的凭证密钥
     */
    public RedisQyWxToken(String corpId, String agentId, String corpSecret) {
		super(corpId, agentId, corpSecret);
    }

    /**
     * 获取微信Token
     * @return Token数据键值对
     */
    public Map<String, Object> getWxToken() {
        Jedis jedis = null;
        try{
            jedis = RedisConnectionFactory.getJedisInstance();
            String jsonString = jedis.get("qytoken:" + this.agentId);
            if(jsonString == null){
                return null;
            }else{
                Map<String, Object> tokenMap = JSON.parseObject(jsonString, new TypeReference<Map<String, Object>>(){});
                long nowTime = System.currentTimeMillis();
                if(nowTime < (Long.parseLong(tokenMap.get("time").toString())-5000)){
                    return tokenMap;
                }else{
                    return null;
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            logger.error("从Redis中取AccessToken时：" + e.toString());
            return null;
        }finally{
			if(jedis != null){
				jedis.close();
			}
        }
    }

    /**
     * 保存微信Token
     * @param tokenMap 接口返回Token数据键值对
     */
    public void setWxToken(Map<String, Object> tokenMap) {
        Jedis jedis = null;
        try{
            jedis = RedisConnectionFactory.getJedisInstance();
            String jsonString = JSON.toJSONString(tokenMap);
            jedis.set("qytoken:" + this.agentId, jsonString);
        }catch (Exception e) {
            e.printStackTrace();
            logger.error("往Redis中写AccessToken串时：" + e.toString());
        }finally{
        	if(jedis != null){
				jedis.close();
			}
        }
    }

}
