package org.qywx.sdk.agent.response;

import org.qywx.sdk.base.Response;
import java.util.Map;

/**
 * 获取应用返回对象
 * @author Rocye
 * @version 2018.1.22
 */
public class AgentGetRespone extends Response {

    /** 企业应用id */
    private Long agentid;
    /** 企业应用名称 */
    private String name;
    /** 企业应用方形头像 */
    private String square_logo_url;
    /** 企业应用详情 */
    private String description;
    /** 企业应用是否被禁用 */
    private Integer close;
    /** 企业应用可信域名 */
    private String redirect_domain;
    /** 企业应用是否打开地理位置上报 0：不上报；1：进入会话上报； */
    private Integer report_location_flag;
    /** 是否上报用户进入应用事件。0：不接收；1：接收 */
    private Integer isreportenter;
    /** 应用主页url */
    private String home_url;

    /** 企业应用可见范围（人员），其中包括userid */
    private Map<String,Object> allow_userinfos;
    /** 企业应用可见范围（部门） */
    private Map<String,Object> allow_partys;
    /** 企业应用可见范围（标签） */
    private Map<String,Object> allow_tags;

	public Long getAgentid() {
		return agentid;
	}
	public void setAgentid(Long agentid) {
		this.agentid = agentid;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSquare_logo_url() {
		return square_logo_url;
	}
	public void setSquare_logo_url(String square_logo_url) {
		this.square_logo_url = square_logo_url;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getClose() {
		return close;
	}
	public void setClose(Integer close) {
		this.close = close;
	}

	public String getRedirect_domain() {
		return redirect_domain;
	}
	public void setRedirect_domain(String redirect_domain) {
		this.redirect_domain = redirect_domain;
	}

	public Integer getReport_location_flag() {
		return report_location_flag;
	}
	public void setReport_location_flag(Integer report_location_flag) {
		this.report_location_flag = report_location_flag;
	}

	public Integer getIsreportenter() {
		return isreportenter;
	}
	public void setIsreportenter(Integer isreportenter) {
		this.isreportenter = isreportenter;
	}

	public String getHome_url() {
		return home_url;
	}
	public void setHome_url(String home_url) {
		this.home_url = home_url;
	}

	public Map<String, Object> getAllow_userinfos() {
		return allow_userinfos;
	}
	public void setAllow_userinfos(Map<String, Object> allow_userinfos) {
		this.allow_userinfos = allow_userinfos;
	}

	public Map<String, Object> getAllow_partys() {
		return allow_partys;
	}
	public void setAllow_partys(Map<String, Object> allow_partys) {
		this.allow_partys = allow_partys;
	}

	public Map<String, Object> getAllow_tags() {
		return allow_tags;
	}
	public void setAllow_tags(Map<String, Object> allow_tags) {
		this.allow_tags = allow_tags;
	}

}
