package org.qywx.sdk.dept.response;

import org.qywx.sdk.base.Response;
import org.qywx.sdk.dept.object.Department;
import java.util.List;

/**
 * 获取部门列表返回对象
 * @author Rocye
 * @version 2018.2.26
 */
public class DeptListRespone extends Response {
	private List<Department> department;

	public List<Department> getDepartment() {
		return department;
	}
	public void setDepartment(List<Department> department) {
		this.department = department;
	}

}
