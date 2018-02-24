package org.qywx.sdk.agent.request;

import org.qywx.sdk.agent.response.AgentSetRespone;
import org.qywx.sdk.base.Request;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>设置应用请求对象
 * <p>权限说明：
 * <p>仅企业可调用，可设置当前凭证对应的应用；第三方不可调用。
 * @author Rocye
 * @version 2018.1.22
 */
public class AgentSetRequest implements Request<AgentSetRespone> {
    /** 应用接口唯一凭证 */
    private String accessToken;
	/** 请求参数 */
	private Map<String, Object> wxHashMap = new HashMap<String, Object>();

	/** 企业应用的id */
    private Long agentid;
    /** 企业应用是否打开地理位置上报 0：不上报；1：进入会话上报；*/
    private Integer report_location_flag;
    /** 企业应用头像的mediaid，通过素材管理接口上传图片获得mediaid，上传后会自动裁剪成方形和圆形两个头像 */
    private String logo_mediaid;
    /** 企业应用名称 */
    private String name;
    /** 企业应用详情 */
    private String description;
    /** 企业应用可信域名。注意：域名需通过所有权校验，否则jssdk功能将受限，此时返回错误码85005 */
    private String redirect_domain;
    /** 是否上报用户进入应用事件。0：不接收；1：接收。 */
    private String isreportenter;
    /** 应用主页url。url必须以http或者https开头。 */
    private String home_url;

    /**
     * 获取接口请求地址
     */
    public String getApiUrl(){
        String url = "https://qyapi.weixin.qq.com/cgi-bin/agent/set?access_token="+ this.accessToken;
        return url;
    }

	/**
	 * 构造器
	 * @param agentId	授权方应用id
	 */
	public AgentSetRequest(Long agentId) {
		this.agentid = agentId;
	}

	/**
	 * 全参构造器
	 * @param agentId				授权方应用id
	 * @param reportLocationFlag	企业应用是否打开地理位置上报 0：不上报；1：进入会话上报；
	 * @param logoMediaid			企业应用头像的mediaid，通过素材管理接口上传图片获得mediaid，上传后会自动裁剪成方形和圆形两个头像
	 * @param name					企业应用名称
	 * @param description			企业应用详情
	 * @param redirectDomain		企业应用可信域名。注意：域名需通过所有权校验，否则jssdk功能将受限，此时返回错误码85005
	 * @param isreportenter			是否上报用户进入应用事件。0：不接收；1：接收。
	 * @param homeUrl				应用主页url。url必须以http或者https开头。
	 */
	public AgentSetRequest(Long agentId, Integer reportLocationFlag, String logoMediaid, String name,
						   String description, String redirectDomain, String isreportenter, String homeUrl) {
		this.agentid = agentId;
		this.report_location_flag = reportLocationFlag;
		this.logo_mediaid = logoMediaid;
		this.name = name;
		this.description = description;
		this.redirect_domain = redirectDomain;
		this.isreportenter = isreportenter;
		this.home_url = homeUrl;
	}

	/**
     * 获取返回对象类
     */
    public Class<AgentSetRespone> getResponseClass(){
        return AgentSetRespone.class;
    }
    
    /**
     * 获取请求参数的HashMap
     */
    public Map<String, Object> getWxHashMap(){
    	wxHashMap.put("agentid", this.agentid);
    	if(this.report_location_flag != null){
			wxHashMap.put("report_location_flag", this.report_location_flag);
		}
		if(this.logo_mediaid != null){
    		wxHashMap.put("logo_mediaid", this.logo_mediaid);
		}
		if(this.name != null){
			wxHashMap.put("name", this.name);
		}
		if(this.description != null){
			wxHashMap.put("description", this.description);
		}
		if(this.redirect_domain != null){
			wxHashMap.put("redirect_domain", this.redirect_domain);
		}
		if(this.isreportenter != null){
			wxHashMap.put("isreportenter", this.isreportenter);
		}
		if(this.home_url != null){
			wxHashMap.put("home_url", this.home_url);
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


	public Long getAgentid() {
		return agentid;
	}
	public void setAgentid(Long agentid) {
		this.agentid = agentid;
	}

	public Integer getReport_location_flag() {
		return report_location_flag;
	}
	public void setReport_location_flag(Integer report_location_flag) {
		this.report_location_flag = report_location_flag;
	}

	public String getLogo_mediaid() {
		return logo_mediaid;
	}
	public void setLogo_mediaid(String logo_mediaid) {
		this.logo_mediaid = logo_mediaid;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getRedirect_domain() {
		return redirect_domain;
	}
	public void setRedirect_domain(String redirect_domain) {
		this.redirect_domain = redirect_domain;
	}

	public String getIsreportenter() {
		return isreportenter;
	}
	public void setIsreportenter(String isreportenter) {
		this.isreportenter = isreportenter;
	}

	public String getHome_url() {
		return home_url;
	}
	public void setHome_url(String home_url) {
		this.home_url = home_url;
	}

}
