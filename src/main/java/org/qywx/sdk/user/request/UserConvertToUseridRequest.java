package org.qywx.sdk.user.request;

import org.qywx.sdk.base.Request;
import org.qywx.sdk.user.response.UserConvertToOpenidRespone;
import org.qywx.sdk.user.response.UserConvertToUseridRespone;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>openid转userid请求对象
 * <p>该接口主要应用于使用微信支付、微信红包和企业转账之后的结果查询。
 * <p>开发者需要知道某个结果事件的openid对应企业微信内成员的信息时，可以通过调用该接口进行转换查询。
 * <p>权限说明：
 * <p>管理组需对openid对应的企业微信成员有查看权限。
 * @author Rocye
 * @version 2018.03.12
 */
public class UserConvertToUseridRequest implements Request<UserConvertToUseridRespone> {
    /** 应用接口唯一凭证 */
    private String accessToken;
	/** 请求参数 */
	private Map<String, Object> wxHashMap = new HashMap<String, Object>();

	/** 在使用微信支付、微信红包和企业转账之后，返回结果的openid */
    private String openid;

    /**
     * 获取接口请求地址
     */
    public String getApiUrl(){
        String url = "https://qyapi.weixin.qq.com/cgi-bin/user/convert_to_userid?access_token="+ this.accessToken;
        return url;
    }

	/**
	 * 构造器
	 * @param openid	在使用微信支付、微信红包和企业转账之后，返回结果的openid
	 */
	public UserConvertToUseridRequest(String openid) {
		this.openid = openid;
	}

	/**
     * 获取返回对象类
     */
    public Class<UserConvertToUseridRespone> getResponseClass(){
        return UserConvertToUseridRespone.class;
    }
    
    /**
     * 获取请求参数的HashMap
     */
    public Map<String, Object> getWxHashMap(){
		wxHashMap.put("openid", this.openid);
		return wxHashMap;
    }
    
    /**
     * 获取请求是否是Https
     */
    public boolean getUseHttps(){
        return true;
    }
    
    /**
     * 请求类型：1-普通Get 2-下载GET 3-普通POST 4-下载POST 5-无参上传   6-有参上传
     */
    public int getReqType(){
        return 3;
    }
    
    /**
     * 请求参数格式(kv,json,xml)
     */
    public String getParamFormat(){
		return "json";
    }
    
    /**
     * 设置AccessToken
     */
    public void setAccessToken(String accessToken){
        this.accessToken = accessToken;
    }

	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}

}
