package org.qywx.sdk.dept.object;

import com.alibaba.fastjson.JSON;

/**
 * 部门对象信息
 * @author Rocye
 * @version 2018.02.24
 */
public class Department {
	/** 部门id */
	private Integer id;
	/** 部门名称。 */
	private String name;
	/** 父部门id */
	private Integer parentid;
	/** 在父部门中的次序值 */
	private Integer order;

	public Department() { }

	/**
	 * 构造器
	 * @param id		部门id
	 * @param name		部门名称，长度限制为1~32个字符，字符不能包括\:?”<>｜
	 * @param parentid	父部门id
	 * @param order		在父部门中的次序值。order值大的排序靠前。有效的值范围是[0, 2^32)
	 */
	public Department(Integer id, String name, Integer parentid, Integer order) {
		this.id = id;
		this.name = name;
		this.parentid = parentid;
		this.order = order;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Integer getParentid() {
		return parentid;
	}
	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}

	public Integer getOrder() {
		return order;
	}
	public void setOrder(Integer order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}

}
