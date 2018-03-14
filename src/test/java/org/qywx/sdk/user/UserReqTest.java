package org.qywx.sdk.user;

import org.junit.Test;
import org.qywx.sdk.QyWxClient;
import org.qywx.sdk.base.Const;
import org.qywx.sdk.token.RedisQyWxToken;
import org.qywx.sdk.user.request.*;
import org.qywx.sdk.user.response.*;

public class UserReqTest {

    /**
     * 测试获取部门成员
     */
    @Test
    public void testUserSimpleListReq() {
        QyWxClient wxClient = new QyWxClient(new RedisQyWxToken(Const.CORPID, Const.AGENTID.toString(), Const.CORPSERCT));
        UserSimpleListRequest userSimpleListReq = new UserSimpleListRequest(25);
        UserSimpleListRespone userSimpleListRes  = wxClient.excute(userSimpleListReq);
        //{"errcode":0,"errmsg":"ok","userlist":[{"userid":"CX001","name":"郑","department":[25]}]}
        System.out.println(userSimpleListRes.getBody());
    }

	/**
	 * 测试获取部门成员详情
	 */
	@Test
	public void testUserListReq() {
		QyWxClient wxClient = new QyWxClient(new RedisQyWxToken(Const.CORPID, Const.AGENTID.toString(), Const.CORPSERCT));
		UserListRequest userListReq = new UserListRequest(25);
		UserListRespone userListRes  = wxClient.excute(userListReq);
		//{"errcode":0,"errmsg":"ok","userlist":[{"userid":"insun234","name":"罗航建","department":[25],"position":"","mobile":"18971512050","gender":"1","email":"","avatar":"http://p.qlogo.cn/bizmail/POzjWZCRbvuiapkddfBibZgr2Iz3FW4cBzsxu3zjZgwhgqh4zwVSuaMQ/0","status":4,"enable":1,"isleader":0,"extattr":{"attrs":[]},"hide_mobile":0,"english_name":"","telephone":"","order":[0]}]}
		System.out.println(userListRes.getBody());
	}

	/**
	 * 测试读取成员
	 */
	@Test
	public void testUserGetReq() {
		QyWxClient wxClient = new QyWxClient(new RedisQyWxToken(Const.CORPID, Const.AGENTID.toString(), Const.CORPSERCT));
		UserGetRequest userGetReq = new UserGetRequest("CX096");
		UserGetRespone userGetRes  = wxClient.excute(userGetReq);
		//{"errcode":0,"errmsg":"ok","userid":"CX096","name":"郑刚","department":[25],"position":"java开发工程师","mobile":"13297938997","gender":"1","email":"578646359@qq.com","avatar":"http://shp.qpic.cn/bizmp/HqUYFXLKUcibIx89XxAh6ZMxeZ3oCFKxmn7wsdZMocZCeCBRF89XlKQ/","status":1,"isleader":0,"extattr":{"attrs":[]},"english_name":"","telephone":"","enable":1,"hide_mobile":0,"order":[0]}
		System.out.println(userGetRes.getBody());
	}

	/**
	 * 测试创建成员
	 */
	@Test
	public void testUserCreateReq() {
		QyWxClient wxClient = new QyWxClient(new RedisQyWxToken(Const.CORPID, Const.AGENTID.toString(), Const.CORPSERCT));
		UserCreateRequest userCreateReq = new UserCreateRequest.Builder("xxyyzz", "测试甲", new int[]{25})
				.englishName("lurenjia")
				.position("测试职位")
				.build();
		UserCreateRespone userCreateRes  = wxClient.excute(userCreateReq);
		//{"errcode":60011,"errmsg":"no privilege to access/modify contact/party/agent...
		System.out.println(userCreateRes.getBody());
	}

	/**
	 * 测试更新成员
	 */
	@Test
	public void testUserUpdateReq() {
		QyWxClient wxClient = new QyWxClient(new RedisQyWxToken(Const.CORPID, Const.AGENTID.toString(), Const.CORPSERCT));
		UserUpdateRequest userUpdateReq = new UserUpdateRequest.Builder("xxyyzz")
				.englishName("lurenjia1")
				.position("测试职位1")
				.build();
		UserUpdateRespone userUpdateRes  = wxClient.excute(userUpdateReq);
		//{"errcode":60011,"errmsg":"no privilege to access/modify contact/party/agent...
		System.out.println(userUpdateRes.getBody());
	}

	/**
	 * 测试删除成员
	 */
	@Test
	public void testUserDeleteReq() {
		QyWxClient wxClient = new QyWxClient(new RedisQyWxToken(Const.CORPID, Const.AGENTID.toString(), Const.CORPSERCT));
		UserDeleteRequest userDeleteReq = new UserDeleteRequest("xxyyzz");
		UserDeleteRespone userDeleteRes  = wxClient.excute(userDeleteReq);
		//{"errcode":60011,"errmsg":"no privilege to access/modify contact/party/agent...
		System.out.println(userDeleteRes.getBody());
	}

	/**
	 * 测试批量删除成员
	 */
	@Test
	public void testUserBatchDeleteReq() {
		QyWxClient wxClient = new QyWxClient(new RedisQyWxToken(Const.CORPID, Const.AGENTID.toString(), Const.CORPSERCT));
		UserBatchDeleteRequest userBatchDeleteReq = new UserBatchDeleteRequest(new String[]{"xxx","yyy"});
		UserBatchDeleteRespone userBatchDeleteRes  = wxClient.excute(userBatchDeleteReq);
		//{"errcode":60011,"errmsg":"no privilege to access/modify contact/party/agent...
		System.out.println(userBatchDeleteRes.getBody());
	}

	/**
	 * 测试userid转openid
	 */
	@Test
	public void testUserConvertToOpenidReq() {
		QyWxClient wxClient = new QyWxClient(new RedisQyWxToken(Const.CORPID, Const.AGENTID.toString(), Const.CORPSERCT));
		UserConvertToOpenidRequest userConvertToOpenidReq = new UserConvertToOpenidRequest("CX001");
		UserConvertToOpenidRespone userConvertToOpenidRes  = wxClient.excute(userConvertToOpenidReq);
		//{"errcode":0,"errmsg":"ok","openid":"of5S2s6j42wTL1nNezg2JVk8hP7k"}
		System.out.println(userConvertToOpenidRes.getBody());
	}

	/**
	 * 测试openid转userid
	 */
	@Test
	public void testUserConvertToUseridReq() {
		QyWxClient wxClient = new QyWxClient(new RedisQyWxToken(Const.CORPID, Const.AGENTID.toString(), Const.CORPSERCT));
		UserConvertToUseridRequest userConvertToUseridReq = new UserConvertToUseridRequest("of5S2s6j42wTL1nNezg2JVk8hP7k");
		UserConvertToUseridRespone userConvertToUseridRes  = wxClient.excute(userConvertToUseridReq);
		//{"errcode":0,"errmsg":"ok","userid":"CX001"}
		System.out.println(userConvertToUseridRes.getBody());
	}

	/**
	 * 测试二次验证
	 */
	@Test
	public void testUserAuthsuccReq() {
		QyWxClient wxClient = new QyWxClient(new RedisQyWxToken(Const.CORPID, Const.AGENTID.toString(), Const.CORPSERCT));
		UserAuthsuccRequest userAuthsuccReq = new UserAuthsuccRequest("CX001");
		UserAuthsuccRespone userAuthsuccRes  = wxClient.excute(userAuthsuccReq);
		//{"errcode":0,"errmsg":"ok"}
		System.out.println(userAuthsuccRes.getBody());
	}

}
