package com.test;

import com.excel.utilities.XlsReader;

public class DataDrivenTestDemo {

	public static void main(String[] args) {
		
		XlsReader reader = new XlsReader("C:\\Eclips-SeleniumAutomation-Workspace\\AutomationJava\\src\\com\\testdata\\TestDataParaBank.xlsx");
		
		String payeeName = reader.getCellData("RegTestData", "payeeName", 2);
		System.out.println(payeeName);

	}

}
