package org.qywx.sdk.agent.request;

import org.qywx.sdk.agent.response.MenuDeleteRespone;
import org.qywx.sdk.agent.response.MenuGetRespone;
import org.qywx.sdk.base.Request;

import java.util.Map;

/**
 * <p>删除菜单请求对象
 * @author Rocye
 * @version 2018.2.24
 */
public class MenuDeleteRequest implements Request<MenuDeleteRespone> {
    /** 应用接口唯一凭证 */
    private String accessToken;
	/** 授权方应用id */
    private Long agentid;

    /**
     * 获取接口请求地址
     */
    public String getApiUrl(){
        String url = "https://qyapi.weixin.qq.com/cgi-bin/menu/delete?access_token="+ this.accessToken +"&agentid=" + this.agentid;
        return url;
    }

	/**
	 * 构造器
	 * @param agentid	授权方应用id
	 */
	public MenuDeleteRequest(Long agentid) {
		this.agentid = agentid;
	}

	/**
     * 获取返回对象类
     */
    public Class<MenuDeleteRespone> getResponseClass(){
        return MenuDeleteRespone.class;
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

	public Long getAgentid() {
		return agentid;
	}
	public void setAgentid(Long agentid) {
		this.agentid = agentid;
	}

}
