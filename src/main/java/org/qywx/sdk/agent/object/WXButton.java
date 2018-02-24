package org.qywx.sdk.agent.object;

import com.alibaba.fastjson.JSON;
import java.util.ArrayList;
import java.util.List;

/**
 * 企业微信应用自定义菜单中按钮的实体类(采用Builder模式实现)
 * 1、一级菜单数组，个数应为1~3个
 * 2、二级菜单数组，个数应为1~5个
 * @author Rocye
 * @version 2018.2.23
 */
public class WXButton {
	/** (不能为空)菜单标题，不超过16个字节，子菜单不超过40个字节 */
	private String name;
	/** 菜单的响应动作类型：
	 * 1、click：点击推事件  2、view：跳转URL  3、scancode_push：扫码推事件
	 * 4、scancode_waitmsg：扫码推事件且弹出“消息接收中”提示框    5、pic_sysphoto：弹出系统拍照发图
	 * 6、pic_photo_or_album：弹出拍照或者相册发图    7、pic_weixin：弹出微信相册发图器
	 * 8、location_select：弹出地理位置选择器 */
	private String type;
	/** (click等点击类型必须)菜单KEY值，用于消息接口推送，不超过128字节 */
	private String key;
	/** (view类型必须)网页链接，用户点击菜单可打开链接，不超过1024字节 */
	private String url;
	/** (可以为空)二级菜单数组，个数应为1~5个 */
	private List<WXButton> sub_button;

	/**
	 * 构造器
	 */
	public WXButton() {

	}

	/**
	 * 私有构造器
	 * @param builder	Builder构建器
	 */
	private WXButton(Builder builder) {
		this.name = builder.name;
		this.type = builder.type;
		this.key = builder.key;
		this.url = builder.url;
		this.sub_button = builder.sub_button;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public List<WXButton> getSub_button() {
		return sub_button;
	}
	public void setSub_button(List<WXButton> sub_button) {
		this.sub_button = sub_button;
	}

	/**
	 * 构建器类
	 */
	public static class Builder{
		private final String name;
		private String type;
		private String key;
		private String url;
		private List<WXButton> sub_button;

		/**
		 * Builder构造方法
		 * @param name	(不能为空)菜单标题，不超过16个字节，子菜单不超过40个字节
		 */
		public Builder(String name) {
			this.name = name;
		}

		/**
		 * 菜单的响应动作类型：
		 * 1、click：点击推事件  2、view：跳转URL  3、scancode_push：扫码推事件
		 * 4、scancode_waitmsg：扫码推事件且弹出“消息接收中”提示框    5、pic_sysphoto：弹出系统拍照发图
		 * 6、pic_photo_or_album：弹出拍照或者相册发图    7、pic_weixin：弹出微信相册发图器
		 * 8、location_select：弹出地理位置选择器
		 */
		public Builder type(String type){
			this.type = type;
			return this;
		}

		/** (click等点击类型必须)菜单KEY值，用于消息接口推送，不超过128字节 */
		public Builder key(String key){
			this.key = key;
			return this;
		}

		/** (view类型必须)网页链接，用户点击菜单可打开链接，不超过1024字节 */
		public Builder url(String url){
			this.url = url;
			return this;
		}

		/** 二级菜单数组，个数应为1~5个 */
		public Builder subButton(WXButton button){
			if(this.sub_button == null){
				this.sub_button = new ArrayList<WXButton>();
			}
			this.sub_button.add(button);
			return this;
		}

		/** 生成Button */
		public WXButton build(){
			return new WXButton(this);
		}
	}

	@Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}
