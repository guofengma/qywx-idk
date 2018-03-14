package org.qywx.sdk.user.request;

import org.qywx.sdk.base.Request;
import org.qywx.sdk.user.response.UserConvertToOpenidRespone;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>userid转openid请求对象
 * <p>该接口使用场景为微信支付、微信红包和企业转账。
 * <p>●在使用微信支付的功能时，需要自行将企业微信的userid转成openid。
 * <p>●在使用微信红包功能时，需要将应用id和userid转成appid和openid才能使用。
 * <p>注：需要成员使用微信登录企业微信或者关注微信插件才能转成openid
 * @author Rocye
 * @version 2018.03.12
 */
public class UserConvertToOpenidRequest implements Request<UserConvertToOpenidRespone> {
    /** 应用接口唯一凭证 */
    private String accessToken;
	/** 请求参数 */
	private Map<String, Object> wxHashMap = new HashMap<String, Object>();

	/** 企业内的成员id */
    private String userid;
    /** 整型，仅用于发红包。其它场景该参数不要填，如微信支付、企业转账、电子发票 */
    private Long agentid;

    /**
     * 获取接口请求地址
     */
    public String getApiUrl(){
        String url = "https://qyapi.weixin.qq.com/cgi-bin/user/convert_to_openid?access_token="+ this.accessToken;
        return url;
    }

	/**
	 * 构造器
	 * @param userid	企业内的成员id
	 */
	public UserConvertToOpenidRequest(String userid) {
		this.userid = userid;
	}

	/**
	 * 构造器
	 * @param userid	企业内的成员id
	 * @param agentid	整型，仅用于发红包。其它场景该参数不要填，如微信支付、企业转账、电子发票
	 */
	public UserConvertToOpenidRequest(String userid, Long agentid) {
		this.userid = userid;
		this.agentid = agentid;
	}

	/**
     * 获取返回对象类
     */
    public Class<UserConvertToOpenidRespone> getResponseClass(){
        return UserConvertToOpenidRespone.class;
    }
    
    /**
     * 获取请求参数的HashMap
     */
    public Map<String, Object> getWxHashMap(){
		wxHashMap.put("userid", this.userid);
		if(this.agentid != null){
			wxHashMap.put("agentid", this.agentid);
		}
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

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

	public Long getAgentid() {
		return agentid;
	}
	public void setAgentid(Long agentid) {
		this.agentid = agentid;
	}

}
