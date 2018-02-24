package org.qywx.sdk.agent.object;

import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * 企业微信应用自定义菜单实体类
 * @author Rocye
 * @version 2018-02-24
 */
public class WXMenu {
    /** 菜单列表 */
	private List<WXButton> button;

	public WXMenu() {
    }
	
    public WXMenu(List<WXButton> button) {
        this.button = button;
    }
    
    public List<WXButton> getButton() {
        return button;
    }
    public void setButton(List<WXButton> button) {
        this.button = button;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
	
}
