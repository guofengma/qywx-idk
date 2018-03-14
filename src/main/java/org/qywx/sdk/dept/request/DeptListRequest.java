package org.qywx.sdk.dept.request;

import org.qywx.sdk.agent.response.MenuGetRespone;
import org.qywx.sdk.base.Request;
import org.qywx.sdk.dept.response.DeptListRespone;

import java.util.Map;

/**
 * <p>获取部门列表请求对象
 * @author Rocye
 * @version 2018.2.24
 */
public class DeptListRequest implements Request<DeptListRespone> {
    /** 应用接口唯一凭证 */
    private String accessToken;
	/** 部门id。获取指定部门及其下的子部门。 如果不填，默认获取全量组织架构 */
    private Integer id;

    /**
     * 获取接口请求地址
     */
    public String getApiUrl(){
        String url = "https://qyapi.weixin.qq.com/cgi-bin/department/list?access_token="+ this.accessToken;
        if(this.id != null){
        	url += "&id=" + this.id;
		}
        return url;
    }

	/**
	 * 构造器
	 */
	public DeptListRequest() { }

	/**
	 * 构造器
	 * @param id	部门id
	 */
	public DeptListRequest(Integer id) {
		this.id = id;
	}

	/**
     * 获取返回对象类
     */
    public Class<DeptListRespone> getResponseClass(){
        return DeptListRespone.class;
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

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

}
