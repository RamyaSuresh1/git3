package org.tsetrunner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	public static void genReport(String jsonfile) {
		File f=new File("C:\\Users\\Ramya\\eclipse-workspace\\Cucum\\src\\test\\resources\\Feature\\Reports");
		Configuration cong=new Configuration(f,"Fb Login");
		cong.addClassifications("OS", "WINDOWS");
		cong.addClassifications("Browser", "Chrome");
		cong.addClassifications("Version", "99");
		cong.addClassifications("Sprint", "22");
		cong.addClassifications("Test", "Fb loginTest");
		List<String>jsonfiles=new ArrayList<String>();
		jsonfiles.add(jsonfile);
		ReportBuilder builder=new ReportBuilder(jsonfiles, cong);
		builder.generateReports();
		
	}

}
