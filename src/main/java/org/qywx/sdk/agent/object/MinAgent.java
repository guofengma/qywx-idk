package org.qywx.sdk.agent.object;

/**
 * 企业应用列表对象
 * @author Rocye
 * @version 2018.01.22
 */
public class MinAgent {
	/** 企业应用id */
	private Long agentid;
	/** 企业应用名称 */
	private String name;
	/** 企业应用方形头像url */
	private String square_logo_url;

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

}
