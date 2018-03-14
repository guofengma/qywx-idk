package org.qywx.sdk.user.response;

import org.qywx.sdk.base.Response;
import org.qywx.sdk.dept.object.Department;
import org.qywx.sdk.user.object.User;

import java.util.List;

/**
 * 获取部门列表返回对象
 * @author Rocye
 * @version 2018.2.26
 */
public class UserSimpleListRespone extends Response {
	private List<User> userlist;

	public List<User> getUserlist() {
		return userlist;
	}
	public void setUserlist(List<User> userlist) {
		this.userlist = userlist;
	}

}
