package org.qywx.sdk.dept.response;

import org.qywx.sdk.base.Response;

/**
 * 创建部门返回对象
 * @author Rocye
 * @version 2018.2.26
 */
public class DeptCreateRespone extends Response {
	/** 创建的部门id */
	private Integer id;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

}
