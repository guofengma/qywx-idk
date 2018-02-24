package org.qywx.sdk.agent.response;

import org.qywx.sdk.agent.object.WXButton;
import org.qywx.sdk.base.Response;
import java.util.List;

/**
 * 获取菜单返回对象
 * @author Rocye
 * @version 2018.2.24
 */
public class MenuGetRespone extends Response {
	private List<WXButton> button;

	public List<WXButton> getButton() {
		return button;
	}
	public void setButton(List<WXButton> button) {
		this.button = button;
	}

}
