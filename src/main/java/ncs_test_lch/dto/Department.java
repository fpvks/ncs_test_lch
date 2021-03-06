package ncs_test_lch.dto;

public class Department {
	private int deptNo;
	private String deptName;
	private int floor;

	public Department() {}

	public Department(int deptNo) {
		this.deptNo = deptNo;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	@Override
	public String toString() {
		return String.format("Department [deptNo=%s, deptName=%s, floor=%s]", deptNo, deptName, floor);
	}
}
