package org.qywx.sdk.user.object;

/**
 * 部门成员信息
 * @author Rocye
 * @version 2018.02.26
 */
public class User {
	/** 成员UserID。对应管理端的帐号 */
	private String userid;
	/** 成员名称 */
	private String name;
	/** 成员所属部门id列表 */
	private int[] department;

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int[] getDepartment() {
		return department;
	}
	public void setDepartment(int[] department) {
		this.department = department;
	}

}
