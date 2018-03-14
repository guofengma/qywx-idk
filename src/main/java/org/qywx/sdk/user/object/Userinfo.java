package org.qywx.sdk.user.object;

import java.util.Map;

/**
 * 部门成员详细信息
 * @author Rocye
 * @version 2018.02.26
 */
public class Userinfo {
	/** 成员UserID。对应管理端的帐号 */
	private String userid;
	/** 成员名称 */
	private String name;
	/** 成员所属部门id列表 */
	private int[] department;
	/** 部门内的排序值，默认为0。数量必须和department一致，数值越大排序越前面。值范围是[0, 2^32) */
	private int[] order;
	/** 职位信息 */
	private String position;
	/** 手机号码，第三方仅通讯录套件可获取 */
	private String mobile;
	/** 性别。0表示未定义，1表示男性，2表示女性 */
	private Integer gender;
	/** 邮箱，第三方仅通讯录套件可获取 */
	private String email;
	/** 标示是否为上级 */
	private Integer isleader;
	/** 头像url。注：如果要获取小图将url最后的”/0”改成”/100”即可 */
	private String avatar;
	/** 座机。第三方仅通讯录套件可获取 */
	private String telephone;
	/** 英文名 */
	private String english_name;
	/** 激活状态: 1=已激活，2=已禁用，4=未激活 已激活代表已激活企业微信或已关注微信插件。未激活代表既未激活企业微信又未关注微信插件 */
	private Integer status;
	/** 扩展属性，第三方仅通讯录套件可获取 */
	private Map<String, Object> extattr;

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

	public int[] getOrder() {
		return order;
	}
	public void setOrder(int[] order) {
		this.order = order;
	}

	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getIsleader() {
		return isleader;
	}
	public void setIsleader(Integer isleader) {
		this.isleader = isleader;
	}

	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEnglish_name() {
		return english_name;
	}
	public void setEnglish_name(String english_name) {
		this.english_name = english_name;
	}

	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}

	public Map<String, Object> getExtattr() {
		return extattr;
	}
	public void setExtattr(Map<String, Object> extattr) {
		this.extattr = extattr;
	}

}
