package org.qywx.sdk.user.response;

import org.qywx.sdk.base.Response;

/**
 * userid转openid返回对象
 * @author Rocye
 * @version 2018.03.13
 */
public class UserConvertToOpenidRespone extends Response {
	/** 企业微信成员userid对应的openid，若有传参agentid，则是针对该agentid的openid。否则是针对企业微信corpid的openid */
	private String openid;
	/** 应用的appid，若请求包中不包含agentid则不返回appid。该appid在使用微信红包时会用到 */
	private String appid;

	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}

}
