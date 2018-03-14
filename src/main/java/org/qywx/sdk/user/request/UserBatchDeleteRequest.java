package org.qywx.sdk.user.request;

import org.qywx.sdk.base.Request;
import org.qywx.sdk.user.response.UserBatchDeleteRespone;
import java.util.HashMap;
import java.util.Map;

/**
 * 批量删除成员请求对象
 * @author Rocye
 * @version 2018.03.12
 */
public class UserBatchDeleteRequest implements Request<UserBatchDeleteRespone> {
    /** 应用接口唯一凭证 */
    private String accessToken;
	/** 请求参数 */
	private Map<String, Object> wxHashMap = new HashMap<String, Object>();

	/** 成员UserID列表 */
    private String[] useridlist;

    /**
     * 获取接口请求地址
     */
    public String getApiUrl(){
        String url = "https://qyapi.weixin.qq.com/cgi-bin/user/batchdelete?access_token="+ this.accessToken;
        return url;
    }

	/**
	 * 构造器
	 * @param useridlist	成员UserID列表。对应管理端的帐号。（最多支持200个）
	 */
	public UserBatchDeleteRequest(String[] useridlist) {
		this.useridlist = useridlist;
	}

	/**
     * 获取返回对象类
     */
    public Class<UserBatchDeleteRespone> getResponseClass(){
        return UserBatchDeleteRespone.class;
    }
    
    /**
     * 获取请求参数的HashMap
     */
    public Map<String, Object> getWxHashMap(){
		wxHashMap.put("useridlist", this.useridlist);
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

	public String[] getUseridlist() {
		return useridlist;
	}
	public void setUseridlist(String[] useridlist) {
		this.useridlist = useridlist;
	}

}
