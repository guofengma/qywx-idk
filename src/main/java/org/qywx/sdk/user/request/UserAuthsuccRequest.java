package org.qywx.sdk.user.request;

import org.qywx.sdk.base.Request;
import org.qywx.sdk.user.response.UserAuthsuccRespone;
import java.util.Map;

/**
 * 二次验证请求对象
 * @author Rocye
 * @version 2018.03.14
 */
public class UserAuthsuccRequest implements Request<UserAuthsuccRespone> {
    /** 应用接口唯一凭证 */
    private String accessToken;

	/** 成员UserID */
    private String userid;

    /**
     * 获取接口请求地址
     */
    public String getApiUrl(){
        String url = "https://qyapi.weixin.qq.com/cgi-bin/user/authsucc?access_token="+ this.accessToken +"&userid="+ this.userid;
        return url;
    }

	/**
	 * 构造器
	 * @param userid	成员UserID。对应管理端的帐号
	 */
	public UserAuthsuccRequest(String userid) {
		this.userid = userid;
	}

	/**
     * 获取返回对象类
     */
    public Class<UserAuthsuccRespone> getResponseClass(){
        return UserAuthsuccRespone.class;
    }
    
    /**
     * 获取请求参数的HashMap
     */
    public Map<String, Object> getWxHashMap(){
        return null;
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
        return 1;
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

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

}
