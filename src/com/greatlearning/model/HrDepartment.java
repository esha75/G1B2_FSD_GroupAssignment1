package com.greatlearning.model;

public class HrDepartment extends SuperDepartment {
	public String departmentName(){
		return "HR Department";
	}
	public String getTodaysWork(){
		return "Fill Today's timesheet and mark your attendance";
	}
	public String getWorkDeadline(){
		return "Complete By EOD";
	}
	public String doActivity() {
		return "Team Lunch";
	}
}
