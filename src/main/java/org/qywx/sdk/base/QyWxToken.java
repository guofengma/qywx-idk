package org.qywx.sdk.base;

import java.util.Map;

/**
 * 企业微信应用接口调用凭证超类
 * @author Rocye
 * @version 2018.01.19
 */
public abstract class QyWxToken {
	/** 企业ID */
	private String corpId;
	/** 应用唯一标识 */
	protected String agentId;
	/** 应用的凭证密钥 */
	private String corpSecret;
    
    /**
     * 构造函数
     * @author Rocye
     * @param corpId		企业ID
     * @param agentId		应用唯一标识
     * @param corpSecret	应用的凭证密钥
     */
    protected QyWxToken(String corpId, String agentId, String corpSecret) {
        this.corpId = corpId;
        this.agentId = agentId;
        this.corpSecret = corpSecret;
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

	public String getAgentId() {
		return agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	/**
     * 获取微信Token
     * @return Token数据键值对
     */
    public abstract Map<String, Object> getWxToken();
    
    /**
     * 保存微信Token
     * @param tokenMap 接口返回Token数据键值对
     */
    public abstract void setWxToken(Map<String, Object> tokenMap);
    
}
