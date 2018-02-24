package org.qywx.sdk.base.response;

import org.qywx.sdk.base.Response;

/**
 * 企业微信应用的全局唯一票据返回对象
 * @author Rocye
 * @version 2018.01.22
 */
public class AccessTokenGetRespone extends Response {

    /** 获取到的凭证 */
    private String access_token;
    /** 凭证有效时间，单位：秒 */
    private Long expires_in;
    
    public String getAccess_token() {
        return access_token;
    }
    public void setAccess_token(String accessToken) {
        access_token = accessToken;
    }
    
    public Long getExpires_in() {
        return expires_in;
    }
    public void setExpires_in(Long expiresIn) {
        expires_in = expiresIn;
    }
}
