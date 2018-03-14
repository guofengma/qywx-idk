package org.qywx.sdk.user.response;

import org.qywx.sdk.base.Response;
import org.qywx.sdk.user.object.User;
import org.qywx.sdk.user.object.Userinfo;

import java.util.List;

/**
 * 获取部门成员详情返回对象
 * @author Rocye
 * @version 2018.2.26
 */
public class UserListRespone extends Response {
	private List<Userinfo> userlist;

	public List<Userinfo> getUserlist() {
		return userlist;
	}
	public void setUserlist(List<Userinfo> userlist) {
		this.userlist = userlist;
	}

}
