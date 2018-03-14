package org.qywx.sdk.dept;

import org.junit.Test;
import org.qywx.sdk.QyWxClient;
import org.qywx.sdk.base.Const;
import org.qywx.sdk.dept.request.DeptCreateRequest;
import org.qywx.sdk.dept.request.DeptDeleteRequest;
import org.qywx.sdk.dept.request.DeptListRequest;
import org.qywx.sdk.dept.request.DeptUpdateRequest;
import org.qywx.sdk.dept.response.DeptCreateRespone;
import org.qywx.sdk.dept.response.DeptDeleteRespone;
import org.qywx.sdk.dept.response.DeptListRespone;
import org.qywx.sdk.dept.response.DeptUpdateRespone;
import org.qywx.sdk.token.RedisQyWxToken;

public class DepartmentReqTest {

    /**
     * 测试获取部门列表
     */
    @Test
    public void testDeptListReq() {
        QyWxClient wxClient = new QyWxClient(new RedisQyWxToken(Const.CORPID, Const.AGENTID.toString(), Const.CORPSERCT));
        DeptListRequest deptListReq = new DeptListRequest();
        //{"errcode":0,"errmsg":"ok","department":[{"id":25,"name":"研发部","parentid":16,"order":99995000}]}
        DeptListRespone deptListRes  = wxClient.excute(deptListReq);
        System.out.println(deptListRes.getBody());
    }

	/**
	 * 测试创建部门
	 */
	@Test
	public void testDeptCreateReq() {
		QyWxClient wxClient = new QyWxClient(new RedisQyWxToken(Const.CORPID, Const.AGENTID.toString(), Const.CORPSERCT));
		DeptCreateRequest deptCreateReq = new DeptCreateRequest("研发一组", 25);
		DeptCreateRespone deptCreateRes  = wxClient.excute(deptCreateReq);
		System.out.println(deptCreateRes.getBody());
	}

	/**
	 * 测试更新部门
	 */
	@Test
	public void testDeptUpdateReq() {
		QyWxClient wxClient = new QyWxClient(new RedisQyWxToken(Const.CORPID, Const.AGENTID.toString(), Const.CORPSERCT));
		DeptUpdateRequest deptUpdateReq = new DeptUpdateRequest(9999, "研发一组X");
		DeptUpdateRespone deptUpdateRes  = wxClient.excute(deptUpdateReq);
		System.out.println(deptUpdateRes.getBody());
	}

	/**
	 * 测试删除部门
	 */
	@Test
	public void testDeptDeleteReq() {
		QyWxClient wxClient = new QyWxClient(new RedisQyWxToken(Const.CORPID, Const.AGENTID.toString(), Const.CORPSERCT));
		DeptDeleteRequest deptDeleteReq = new DeptDeleteRequest(9999);
		DeptDeleteRespone deptDeleteRes  = wxClient.excute(deptDeleteReq);
		System.out.println(deptDeleteRes.getBody());
	}

}
