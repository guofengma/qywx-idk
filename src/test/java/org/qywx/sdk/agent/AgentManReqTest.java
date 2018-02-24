package org.qywx.sdk.agent;

import org.junit.Test;
import org.qywx.sdk.QyWxClient;
import org.qywx.sdk.agent.object.WXButton;
import org.qywx.sdk.agent.request.*;
import org.qywx.sdk.agent.response.*;
import org.qywx.sdk.base.Const;
import org.qywx.sdk.token.RedisQyWxToken;
import java.util.ArrayList;
import java.util.List;

public class AgentManReqTest {

    /**
     * 测试获取应用列表
     */
    @Test
    public void testAgentListReq() {
        QyWxClient wxClient = new QyWxClient(new RedisQyWxToken(Const.CORPID, Const.AGENTID.toString(), Const.CORPSERCT));
        AgentListRequest agentListReq = new AgentListRequest();
        AgentListRespone agentListRes  = wxClient.excute(agentListReq);
        //{"errcode":0,"errmsg":"ok","agentlist":[{"agentid":1000005,"name":"实验室","square_logo_url":"http://p.qlogo.cn/bizmail/wFrXFWF75kcC6N4eN9epPfGRoataUAxiakEibVjNvlzgqD9lOUcj2QkQ/0"}]}
        System.out.println(agentListRes.getBody());
    }

	/**
	 * 测试获取应用
	 */
	@Test
	public void testAgentGetReq() {
		QyWxClient wxClient = new QyWxClient(new RedisQyWxToken(Const.CORPID, Const.AGENTID.toString(), Const.CORPSERCT));
		AgentGetRequest agentGetReq = new AgentGetRequest(Const.AGENTID);
		AgentGetRespone agentGetRes  = wxClient.excute(agentGetReq);
		//{"errcode":0,"errmsg":"ok","agentid":1000005,"name":"实验室","square_logo_url":"http://p.qlogo.cn/bizmail/wFrXFWF75kcC6N4eN9epPfGRoataUAxiakEibVjNvlzgqD9lOUcj2QkQ/0","description":"","allow_userinfos":{"user":[]},"allow_partys":{"partyid":[25]},"close":0,"redirect_domain":"","report_location_flag":0,"isreportenter":0,"home_url":""}
		System.out.println(agentGetRes.getBody());
	}

	/**
	 * 测试设置应用
	 */
	@Test
	public void testAgentReq() {
		QyWxClient wxClient = new QyWxClient(new RedisQyWxToken(Const.CORPID, Const.AGENTID.toString(), Const.CORPSERCT));
		AgentSetRequest agentSetReq = new AgentSetRequest(Const.AGENTID);
		agentSetReq.setHome_url("http://www.weiyihu.com");
		AgentSetRespone agentSetRes  = wxClient.excute(agentSetReq);
		//{"errcode":0,"errmsg":"ok"}
		System.out.println(agentSetRes.getBody());
	}

	/**
	 * 测试创建菜单
	 */
	@Test
	public void testCreateMenuReq() {
		QyWxClient wxClient = new QyWxClient(new RedisQyWxToken(Const.CORPID, Const.AGENTID.toString(), Const.CORPSERCT));
		List<WXButton> buttons = new ArrayList<WXButton>();
		buttons.add(new WXButton.Builder("菜单1")
				.subButton(new WXButton.Builder("点击推事件").type("click").key("CLICK").build())
				.subButton(new WXButton.Builder("跳转URL").type("view").url("http://www.soso.com/").build())
				.build());

		buttons.add(new WXButton.Builder("菜单2")
				.subButton(new WXButton.Builder("扫码推事件").type("scancode_push").key("SCANCODEPUSH").build())
				.subButton(new WXButton.Builder("扫码带提示").type("scancode_waitmsg").key("SCANCODEMSG").build())
				.build());

		buttons.add(new WXButton.Builder("菜单3")
				.subButton(new WXButton.Builder("系统拍照发图").type("pic_sysphoto").key("PICSYSPHOTO").build())
				.subButton(new WXButton.Builder("拍照或者相册发图").type("pic_photo_or_album").key("PICPHOTOALBUM").build())
				.subButton(new WXButton.Builder("微信相册发图").type("pic_weixin").key("PICWEIXIN").build())
				.subButton(new WXButton.Builder("发送位置").type("location_select").key("LOCATION").build())
				.build());

		MenuCreateRequest menuCreateReq = new MenuCreateRequest(Const.AGENTID, buttons);
		MenuCreateRespone menuCreateRes  = wxClient.excute(menuCreateReq);
		//{"errcode":0,"errmsg":"ok"}
		System.out.println(menuCreateRes.getBody());
	}

	/**
	 * 测试获取菜单
	 */
	@Test
	public void testGetMenuReq() {
		QyWxClient wxClient = new QyWxClient(new RedisQyWxToken(Const.CORPID, Const.AGENTID.toString(), Const.CORPSERCT));
		MenuGetRequest menuGetReq = new MenuGetRequest(Const.AGENTID);
		MenuGetRespone menuGetRes  = wxClient.excute(menuGetReq);
		//{"errcode":0,"errmsg":"ok","button":[{"name":"菜单1","sub_button":[{"type":"click","name":"点击推事件","key":"CLICK","sub_button":[]},{"type":"view","name":"跳转URL","key":"http://www.soso.com/","sub_button":[],"url":"http://www.soso.com/"}]},{"name":"菜单2","sub_button":[{"type":"scancode_push","name":"扫码推事件","key":"SCANCODEPUSH","sub_button":[]},{"type":"scancode_waitmsg","name":"扫码带提示","key":"SCANCODEMSG","sub_button":[]}]},{"name":"菜单3","sub_button":[{"type":"pic_sysphoto","name":"系统拍照发图","key":"PICSYSPHOTO","sub_button":[]},{"type":"pic_photo_or_album","name":"拍照或者相册发图","key":"PICPHOTOALBUM","sub_button":[]},{"type":"pic_weixin","name":"微信相册发图","key":"PICWEIXIN","sub_button":[]},{"type":"location_select","name":"发送位置","key":"LOCATION","sub_button":[]}]}]}
		System.out.println(menuGetRes.getBody());
	}

	/**
	 * 测试删除菜单
	 */
	@Test
	public void testDeleteMenuReq() {
		QyWxClient wxClient = new QyWxClient(new RedisQyWxToken(Const.CORPID, Const.AGENTID.toString(), Const.CORPSERCT));
		MenuDeleteRequest menuDeleteReq = new MenuDeleteRequest(Const.AGENTID);
		MenuDeleteRespone menuDeleteRes  = wxClient.excute(menuDeleteReq);
		//{"errcode":0,"errmsg":"ok"}
		System.out.println(menuDeleteRes.getBody());
	}

}
