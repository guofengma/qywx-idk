package org.qywx.sdk.user.request;

import org.qywx.sdk.base.Request;
import org.qywx.sdk.user.response.UserListRespone;
import org.qywx.sdk.user.response.UserSimpleListRespone;

import java.util.Map;

/**
 * <p>获取部门成员详情请求对象
 * @author Rocye
 * @version 2018.2.26
 */
public class UserListRequest implements Request<UserListRespone> {
    /** 应用接口唯一凭证 */
    private String accessToken;

	/** 获取的部门id */
    private Integer department_id;
	/** 1/0：是否递归获取子部门下面的成员 */
    private Integer fetch_child;

    /**
     * 获取接口请求地址
     */
    public String getApiUrl(){
        String url = "https://qyapi.weixin.qq.com/cgi-bin/user/list?access_token="+ this.accessToken;
        if(this.department_id != null){
        	url += "&department_id=" + this.department_id;
		}
		if(this.fetch_child != null){
			url += "&fetch_child=" + this.fetch_child;
		}
        return url;
    }

	/**
	 * 构造器
	 * @param departmentId	获取的部门id
	 */
	public UserListRequest(Integer departmentId) {
		this.department_id = departmentId;
	}

	/**
	 * 构造器
	 * @param departmentId	获取的部门id
	 * @param fetchChild	1/0：是否递归获取子部门下面的成员
	 */
	public UserListRequest(Integer departmentId, Integer fetchChild) {
		this.department_id = departmentId;
		this.fetch_child = fetchChild;
	}

	/**
     * 获取返回对象类
     */
    public Class<UserListRespone> getResponseClass(){
        return UserListRespone.class;
    }
    
    /**
     * 获取请求参数的HashMap
     */
    public Map<String, Object> getWxHashMap(){
        return null;
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
        return 1;
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

	public Integer getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}

	public Integer getFetch_child() {
		return fetch_child;
	}
	public void setFetch_child(Integer fetch_child) {
		this.fetch_child = fetch_child;
	}

}
