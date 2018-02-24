package org.qywx.sdk.base.request;

import org.qywx.sdk.base.Request;
import org.qywx.sdk.base.response.AccessTokenGetRespone;
import java.util.Map;

/**
 * <p>企业微信应用的全局唯一票据请求对象
 * <p>权限说明：
 * <p>每个应用有独立的secret，所以每个应用的access_token应该分开来获取
 * @author Rocye
 * @version 2018.01.22
 */
public class AccessTokenGetRequest implements Request<AccessTokenGetRespone> {
    /** 企业ID */
    private String corpId;
    /** 应用的凭证密钥 */
    private String corpSecret;
    
    /**
     * 构造函数
     * @author Rocye
     */
    public AccessTokenGetRequest() {
    }
    
    /**
     * 构造函数
     * @author Rocye
     * @param corpId		企业ID
     * @param corpSecret	应用的凭证密钥
     */
    public AccessTokenGetRequest(String corpId, String corpSecret) {
        this.corpId = corpId;
        this.corpSecret = corpSecret;
    }

    /**
     * 获取接口请求地址
     */
    public String getApiUrl() {
        String url = "https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid="+ this.corpId +"&corpsecret="+ this.corpSecret;
        return url;
    }

    /**
     * 请求参数格式(kv,json,xml)
     */
    public String getParamFormat() {
        return "";
    }

    /**
     * 请求类型：1-普通Get 2-下载GET 3-普通POST 4-下载POST 5-无参上传   6-有参上传
     */
    public int getReqType() {
        return 1;
    }

    /**
     * 获取返回对象类
     */
    public Class<AccessTokenGetRespone> getResponseClass() {
        return AccessTokenGetRespone.class;
    }

    /**
     * 获取请求是否是Https
     */
    public boolean getUseHttps() {
        return true;
    }

    /**
     * 获取请求参数的HashMap
     */
    public Map<String, Object> getWxHashMap() {
        return null;
    }

    /**
     * 设置AccessToken
     */
    public void setAccessToken(String accessToken) {
        //这里不需要
    }

	public String getCorpId() {
		return corpId;
	}
	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getCorpSecret() {
		return corpSecret;
	}
	public void setCorpSecret(String corpSecret) {
		this.corpSecret = corpSecret;
	}
}
