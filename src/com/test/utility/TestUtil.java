package com.test.utility;

import java.util.ArrayList;

import com.excel.utilities.XlsReader;

public class TestUtil {
	static XlsReader reader;
	
	public static ArrayList<Object[]> getDataFromExcel() {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			reader = new XlsReader("C:\\Eclips-SeleniumAutomation-Workspace\\AutomationJava\\src\\com\\testdata\\TestDataParaBank.xlsx");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		for(int rowNum = 2; rowNum <= reader.getRowCount("RegTestData"); rowNum++) {
			String payeeName = reader.getCellData("RegTestData", "payeeName", rowNum);
			String address = reader.getCellData("RegTestData", "address", rowNum);
			String city = reader.getCellData("RegTestData", "city", rowNum);
			String state = reader.getCellData("RegTestData", "state", rowNum);
			String zipCode = reader.getCellData("RegTestData", "zipCode", rowNum);
			String phone = reader.getCellData("RegTestData", "phone", rowNum);
			String accountNumber = reader.getCellData("RegTestData", "accountNumber", rowNum);
			String verifyAccountNumber = reader.getCellData("RegTestData", "verifyAccountNumber", rowNum);
			String amount = reader.getCellData("RegTestData", "amount", rowNum);
			
			Object ob[] = {payeeName, address, city, state, zipCode, phone, accountNumber, verifyAccountNumber, amount};
			myData.add(ob);
		}
		
		return myData;
	}
	
	public static ArrayList<Object[]> getDataFromLogin() {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			reader = new XlsReader("C:\\Eclips-SeleniumAutomation-Workspace\\AutomationJava\\src\\com\\testdata\\TestDataParaBank.xlsx");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		for(int rowNum = 2; rowNum <= reader.getRowCount("Login"); rowNum++) {
			String userName = reader.getCellData("Login", "username", rowNum);
			String password = reader.getCellData("Login", "password", rowNum);
			
			
			Object ob[] = {userName, password};
			myData.add(ob);
		}
		
		return myData;
	}

}
