package org.qywx.sdk.user.response;

import org.qywx.sdk.base.Response;

/**
 * openid转userid返回对象
 * @author Rocye
 * @version 2018.03.13
 */
public class UserConvertToUseridRespone extends Response {
	/** 该openid在企业微信对应的成员userid */
	private String userid;

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
}
