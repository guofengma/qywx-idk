package org.qywx.sdk.token;

import org.qywx.sdk.base.QyWxToken;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>【默认例子实现类，不会生成到jar包去】
 * <p>企业微信接口调用凭证全局变量实现
 * @author Rocye
 * @version 2018.01.22
 */
public class GlobalQyWxToken extends QyWxToken {
    /**
     * <p>access_token有效期正常情况下为7200秒，有效期内重复获取返回相同结果
     * <p>这里是access_token的内存全局缓存
     */
    private static Map<String, Map<String, Object>> ACCESS_TOKEN_MAP = new HashMap<String, Map<String,Object>>(0);
    
    /**
     * 构造函数
     * @param corpId		企业ID
	 * @param agentId		应用唯一标识
     * @param corpSecret	应用的凭证密钥
     */
    public GlobalQyWxToken(String corpId, String agentId, String corpSecret) {
        super(corpId, agentId, corpSecret);
    }

    /**
     * 获取微信Token
     * @return Token数据键值对
     */
    public Map<String, Object> getWxToken() {
        long nowTime = System.currentTimeMillis();
        if(ACCESS_TOKEN_MAP.containsKey(this.agentId) && nowTime < (Long.parseLong(ACCESS_TOKEN_MAP.get(this.agentId).get("time").toString())-5000)){
            return ACCESS_TOKEN_MAP.get(this.agentId);
        }else{
            return null;
        }
    }

    /**
     * 保存微信Token
     * @param tokenMap 接口返回Token数据键值对
     */
    public void setWxToken(Map<String, Object> tokenMap) {
        ACCESS_TOKEN_MAP.put(this.agentId, tokenMap);
    }

}
