package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void main(String[] args) {
		String pp = System.getProperty("user.dir");
		System.out.println(pp+"src\\test\\resources\\Reports\\JVMReport");
	
	}
	public static void generateJVMReport(String json) {
		File loc=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReport");
		Configuration con=new Configuration(loc,"bigw");
		con.addClassifications("BrowserName", "Chrome");
		con.addClassifications("OS", "Windows 10");
		con.addClassifications("Sprint", "25");
		con.addClassifications("Environment", "QA");
		
		List<String> jsonfiles=new ArrayList<>();
		jsonfiles.add(json);
		ReportBuilder r=new ReportBuilder(jsonfiles,con);
		r.generateReports();
	}

}
