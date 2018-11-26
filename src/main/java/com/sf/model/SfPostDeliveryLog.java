package com.sf.model;

public class SfPostDeliveryLog {
	private String monthly_card_no;
	private String phone_number;
	private String begin_time;
	private String end_time;
	private String delivery_nums;
	public String getDelivery_nums() {
		return delivery_nums;
	}
	public void setDelivery_nums(String delivery_nums) {
		this.delivery_nums = delivery_nums;
	}
	private String remark;
	public String getMonthly_card_no() {
		return monthly_card_no;
	}
	public void setMonthly_card_no(String monthly_card_no) {
		this.monthly_card_no = monthly_card_no;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getBegin_time() {
		return begin_time;
	}
	public void setBegin_time(String begin_time) {
		this.begin_time = begin_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
