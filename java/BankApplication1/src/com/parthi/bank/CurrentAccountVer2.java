package com.parthi.bank;

public class CurrentAccountVer2 extends CurrentAccount implements Insurance {

	@Override
	public String getInsuranceName() {
		// TODO Auto-generated method stub
		return "jeevan bhima";
	}

	@Override
	public double getInsuranceAmount() {
		// TODO Auto-generated method stub
		return 600000;
	}

}
