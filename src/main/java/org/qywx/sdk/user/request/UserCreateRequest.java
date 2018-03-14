package org.qywx.sdk.user.request;

import org.qywx.sdk.base.Request;
import org.qywx.sdk.user.response.UserCreateRespone;

import java.util.HashMap;
import java.util.Map;

/**
 * 创建成员请求对象(Builder模式)
 * @author Rocye
 * @version 2018.03.12
 */
public class UserCreateRequest implements Request<UserCreateRespone> {
    /** 应用接口唯一凭证 */
    private String accessToken;
	/** 请求参数 */
	private Map<String, Object> wxHashMap = new HashMap<String, Object>();

	/** 成员UserID */
	private String userid;
	/** 成员名称 */
	private String name;
	/** 英文名(否) */
	private String english_name;
	/** 手机号码(否) */
	private String mobile;
	/** 成员所属部门id列表 */
	private int[] department;
	/** 部门内的排序值，默认为0。(否) */
	private int[] order;
	/** 职位信息(否) */
	private String position;
	/** 性别(否) */
	private Integer gender;
	/** 邮箱(否) */
	private String email;
	/** 座机(否) */
	private String telephone;
	/** 标示是否为上级(否) */
	private Integer isleader;
	/** 成员头像的mediaid，通过素材管理接口上传图片获得的mediaid(否) */
	private String avatar_mediaid;
	/** 启用/禁用成员(否) */
	private Integer enable;
	/** 是否邀请该成员使用企业微信(否) */
	private Boolean to_invite;
	/** 扩展属性，第三方仅通讯录套件可获取(否) */
	private Map<String, Object> extattr;

    /**
     * 获取接口请求地址
     */
    public String getApiUrl(){
        String url = "https://qyapi.weixin.qq.com/cgi-bin/user/create?access_token="+ this.accessToken;
        return url;
    }

	/**
	 * 构造器
	 * @param builder	构建器
	 */
	public UserCreateRequest(Builder builder) {
		this.userid = builder.userid;
		this.name = builder.name;
		this.english_name = builder.english_name;
		this.mobile = builder.mobile;
		this.department = builder.department;
		this.order = builder.order;
		this.position = builder.position;
		this.gender = builder.gender;
		this.email = builder.email;
		this.isleader = builder.isleader;
		this.enable = builder.enable;
		this.avatar_mediaid = builder.avatar_mediaid;
		this.telephone = builder.telephone;
		this.to_invite = builder.to_invite;
		this.extattr = builder.extattr;
	}

	/**
     * 获取返回对象类
     */
    public Class<UserCreateRespone> getResponseClass(){
        return UserCreateRespone.class;
    }
    
    /**
     * 获取请求参数的HashMap
     */
    public Map<String, Object> getWxHashMap(){
		wxHashMap.put("userid", this.userid);
		wxHashMap.put("name", this.name);
		wxHashMap.put("department", this.department);
		if(this.english_name != null){
			wxHashMap.put("english_name", this.english_name);
		}
		if(this.mobile != null){
			wxHashMap.put("mobile", this.mobile);
		}
		if(this.order != null){
			wxHashMap.put("order", this.order);
		}
		if(this.position != null){
			wxHashMap.put("position", this.position);
		}
		if(this.gender != null){
			wxHashMap.put("gender", this.gender);
		}
		if(this.email != null){
			wxHashMap.put("email", this.email);
		}
		if(this.telephone != null){
			wxHashMap.put("telephone", this.telephone);
		}
		if(this.isleader != null){
			wxHashMap.put("isleader", this.isleader);
		}
		if(this.avatar_mediaid != null){
			wxHashMap.put("avatar_mediaid", this.avatar_mediaid);
		}
		if(this.enable != null){
			wxHashMap.put("enable", this.enable);
		}
		if(this.extattr != null){
			wxHashMap.put("extattr", this.extattr);
		}
		if(this.to_invite != null){
			wxHashMap.put("to_invite", this.to_invite);
		}
		return wxHashMap;
    }
    
    /**
     * 获取请求是否是Https
     */
    public boolean getUseHttps(){
        return true;
    }
    
    /**
     * 请求类型：1-普通Get 2-下载GET 3-普通POST 4-下载POST 5-无参上传   6-有参上传
     */
    public int getReqType(){
        return 3;
    }
    
    /**
     * 请求参数格式(kv,json,xml)
     */
    public String getParamFormat(){
		return "json";
    }
    
    /**
     * 设置AccessToken
     */
    public void setAccessToken(String accessToken){
        this.accessToken = accessToken;
    }


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

	public String getEnglish_name() {
		return english_name;
	}
	public void setEnglish_name(String english_name) {
		this.english_name = english_name;
	}

	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Integer getIsleader() {
		return isleader;
	}
	public void setIsleader(Integer isleader) {
		this.isleader = isleader;
	}

	public String getAvatar_mediaid() {
		return avatar_mediaid;
	}
	public void setAvatar_mediaid(String avatar_mediaid) {
		this.avatar_mediaid = avatar_mediaid;
	}

	public Integer getEnable() {
		return enable;
	}
	public void setEnable(Integer enable) {
		this.enable = enable;
	}

	public Boolean getTo_invite() {
		return to_invite;
	}
	public void setTo_invite(Boolean to_invite) {
		this.to_invite = to_invite;
	}

	public Map<String, Object> getExtattr() {
		return extattr;
	}
	public void setExtattr(Map<String, Object> extattr) {
		this.extattr = extattr;
	}

	//构建器
	public static class Builder {
		/** 成员UserID */
		private String userid;
		/** 成员名称 */
		private String name;
		/** 英文名(否) */
		private String english_name;
		/** 手机号码(否) */
		private String mobile;
		/** 成员所属部门id列表 */
		private int[] department;
		/** 部门内的排序值，默认为0。(否) */
		private int[] order;
		/** 职位信息(否) */
		private String position;
		/** 性别(否) */
		private Integer gender;
		/** 邮箱(否) */
		private String email;
		/** 座机(否) */
		private String telephone;
		/** 标示是否为上级(否) */
		private Integer isleader;
		/** 成员头像的mediaid，通过素材管理接口上传图片获得的mediaid(否) */
		private String avatar_mediaid;
		/** 启用/禁用成员(否) */
		private Integer enable;
		/** 是否邀请该成员使用企业微信(否) */
		private Boolean to_invite;
		/** 扩展属性，第三方仅通讯录套件可获取(否) */
		private Map<String, Object> extattr;

		/**
		 * 构建器构造函数
		 * @param userid		成员UserID。对应管理端的帐号，企业内必须唯一。不区分大小写，长度为1~64个字节
		 * @param name			成员名称。长度为1~64个字符
		 * @param department	成员所属部门id列表,不超过20个
		 */
		public Builder(String userid, String name, int[] department) {
			this.userid = userid;
			this.name = name;
			this.department = department;
		}

		/** 英文名。长度为1-64个字节，由字母、数字、点(.)、减号(-)、空格或下划线(_)组成 */
		public Builder englishName(String englishName){
			this.english_name = englishName;
			return this;
		}

		/** 手机号码。企业内必须唯一，mobile/email二者不能同时为空 */
		public Builder mobile(String mobile){
			this.mobile = mobile;
			return this;
		}

		/** 部门内的排序值，默认为0，成员次序以创建时间从小到大排列。数量必须和department一致，数值越大排序越前面。有效的值范围是[0, 2^32) */
		public Builder order(int[] order){
			this.order = order;
			return this;
		}

		/** 职位信息。长度为0~128个字符 */
		public Builder position(String position){
			this.position = position;
			return this;
		}

		/** 性别。1表示男性，2表示女性 */
		public Builder gender(Integer gender){
			this.gender = gender;
			return this;
		}

		/** 邮箱。长度不超过64个字节，且为有效的email格式。企业内必须唯一，mobile/email二者不能同时为空 */
		public Builder email(String email){
			this.email = email;
			return this;
		}

		/** 座机。由1-32位的纯数字或’-‘号组成。 */
		public Builder telephone(String telephone){
			this.telephone = telephone;
			return this;
		}

		/** 上级字段，标识是否为上级。在审批等应用里可以用来标识上级审批人 */
		public Builder isLeader(Integer isleader){
			this.isleader = isleader;
			return this;
		}

		/** 成员头像的mediaid，通过素材管理接口上传图片获得的mediaid */
		public Builder avatarMediaid(String avatarMediaid){
			this.avatar_mediaid = avatarMediaid;
			return this;
		}

		/** 启用/禁用成员。1表示启用成员，0表示禁用成员 */
		public Builder enable(Integer enable){
			this.enable = enable;
			return this;
		}

		/** 是否邀请该成员使用企业微信（将通过微信服务通知或短信或邮件下发邀请，每天自动下发一次，最多持续3个工作日），默认值为true。 */
		public Builder toInvite(Boolean toInvite){
			this.to_invite = toInvite;
			return this;
		}

		/** 自定义字段。自定义字段需要先在WEB管理端添加，见扩展属性添加方法，否则忽略未知属性的赋值。自定义字段长度为0~32个字符，超过将被截断 */
		public Builder extattr(Map<String, Object> extattr){
			this.extattr = extattr;
			return this;
		}

		/** 构建 */
		public UserCreateRequest build(){
			return new UserCreateRequest(this);
		}

	}
}
