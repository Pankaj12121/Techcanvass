package com.demo.webdriver.menuNavigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.demo.webdriver.implicitExplicitWait.BaseScript;

public class DriverNavigate {
	String browserCloseFalse;
	/*------level1-----------*/
	By adminMenu,pim,leave,time,recruitment,performance,dashboard,directory;

	/*------level2-----------*/
	By userMgmt,job,organization,qualifications,nationalities,configuration;//Admin menu
	By PIMconfigurations,employeeList,AddEmployee,reports;//pim menu
	By entitlements,reportsleave,configure,leavelist,assignleave;//leave menu
	By Timesheet,attendance,timeReports,projectinfo;//time
	By candidates,vacancies;
	/*------level3-----------*/
	By users;//Admin menu/usersMgmt
	By jobTitles,payGrades,employmentStatus,jobCategory,workShifts;//Admin menu/job
	By generalInformation,locations,structures;//Admin menu/organization
	By skill,education,licenses,languages,memberships;//Admin menu/qualifications
	By emailConfigurations,emailSubscriptions,localization,modules,socialMediaAuthentication;//Admin menu/configurations
	By optionalFields,customFields,dataImporting,reportingMethods,terminationReasons;//Admin menu/pim
	By addEntitlements,employeeEntitlements,leaveEntitlementsAndUsageReport,leavePeriod,leaveType,workWeek,Holidays;//Admin menu/leaves
	By employeeTimessheet,employeeRecords,configurationTimesheet,projectReports,employeeReports,attendanceSummary,customers,projects;//Admin menu/time
	By blank;
	/*------------------------------------------------------------------------------------*/
	WebDriver driver;

	BaseScript BS = new BaseScript();

	public static void main(String[] args) throws InterruptedException {
		BaseScript.main(args);
		WebDriver driver=BaseScript.getDriver();
		DriverNavigate DN= new DriverNavigate(driver);
		DN.menuMouseOver();
		DN.menuMouseOverAndClick();
		driver.navigate().forward();

	}
	public DriverNavigate(WebDriver driver){
		/*-------Level1 menu item---------------------------*/
		this.driver=driver;
		adminMenu=By.xpath("//a[@id='menu_admin_viewAdminModule']/b");
		pim=By.xpath("//a[@id='menu_pim_viewPimModule']/b");
		leave=By.xpath("//a[@id='menu_leave_viewLeaveModule']/b");
		time= By.xpath("//a[@id='menu_time_viewTimeModule']/b");
		recruitment=By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']/b"); 
		performance=By.xpath("//a[@id='menu__Performance']/b"); 
		dashboard=By.xpath("//a[@id='menu_dashboard_index']/b"); 
		directory=By.xpath("//a[@id='menu_directory_viewDirectory']/b");

		/*-------Level2 menu item---------------------------*/
		userMgmt=By.linkText("User Management");//Admin menu
		job=By.linkText("Job");//Admin menu
		organization=By.linkText("Organization");//Admin menu
		qualifications=By.linkText("Qualifications");//Admin menu
		nationalities=By.linkText("Nationalities");//Admin menu
		configuration=By.linkText("Configuration");//Admin menu
		PIMconfigurations=By.id("menu_pim_Configuration");//pim menu
		employeeList=By.linkText("Employee List");//pim menu
		AddEmployee=By.linkText("Add Employee");//pim menu
		reports=By.linkText("Reports");//pim menu
		entitlements=By.linkText("Entitlements");//leave menu
		reportsleave=By.id("menu_leave_Reports");//leave menu
		configure=By.linkText("Configure");//leave menu
		leavelist=By.linkText("Leave List");//leave menu
		assignleave=By.linkText("Assign Leave");//leave menu
		Timesheet=By.linkText("Timesheets");//time menu
		attendance=By.linkText("Attendance");//time menu
		timeReports=By.id("menu_time_Reports");//time menu
		projectinfo=By.linkText("Project Info");//time menu
		candidates=By.linkText("Candidates");//recruitment menu
		vacancies=By.linkText("Vacancies");//recruitment menu

		/*-------Level3 menu item---------------------------*/
		users=By.linkText("Users");//Admin menu//User mgmt
		jobTitles=By.xpath("//a[contains(text(),'Job Titles')]");//Admin menu//job
		payGrades=By.xpath("//a[contains(text(),'Pay Grades')]");//Admin menu//job
		employmentStatus=By.xpath("//a[contains(text(),'Employee Status')]");//Admin menu//job
		jobCategory=By.xpath("//a[contains(text(),'Job Categories')]");//Admin menu//job
		workShifts=By.xpath("//a[contains(text(),'Work Shifts')]");//Admin menu//job
		generalInformation=By.xpath("//a[contains(text(),'General Information')]");//Admin menu//Organization
		locations=By.xpath("//a[contains(text(),'Locations)]");//Admin menu//Organization
		structures=By.xpath("//a[contains(text(),'Structure')]");//Admin menu//Organization
		skill=By.xpath("//a[contains(text(),'Skills')]");//Admin menu//Qualifications
		education=By.xpath("//a[contains(text(),'Education')]");//Admin menu//Qualifications
		licenses=By.xpath("//a[contains(text(),'Licenses')]");//Admin menu//Qualifications
		languages=By.xpath("//a[contains(text(),'Languages')]");//Admin menu//Qualifications
		memberships=By.xpath("//a[contains(text(),'Memberships')]");//Admin menu//Qualifications
		emailConfigurations=By.xpath("//a[contains(text(),'Email Configuration')]");//Admin menu//Configuration
		emailSubscriptions=By.xpath("//a[contains(text(),'Email Subscriptions')]");//Admin menu//Configuration
		localization=By.xpath("//a[contains(text(),'Localization')]");//Admin menu//Configuration
		modules=By.xpath("//a[contains(text(),'Modules')]");//Admin menu//Configuration
		socialMediaAuthentication=By.xpath("//a[contains(text(),'Social Media Authentication')]");//Admin menu//Configuration
		optionalFields=By.xpath("//a[contains(text(),'Optional Fields')]");//pim//configuration
		customFields=By.xpath("//a[contains(text(),'Custom Fields')]");//pim//configuration
		dataImporting=By.xpath("//a[contains(text(),'Data Import')]");//pim//configuration
		reportingMethods=By.xpath("//a[contains(text(),'Reporting Methods')]");//pim//configuration
		terminationReasons=By.xpath("//a[contains(text(),'Termination Reasons')]");//pim//configuration
		addEntitlements=By.xpath("//a[contains(text(),'Add Entitlements')]");//pim//leaves
		employeeEntitlements=By.xpath("//a[contains(text(),'Employee Entitlements')]");//pim//leaves
		leaveEntitlementsAndUsageReport=By.xpath("//a[contains(text(),'Leave Entitlements And Usage Report')]");//pim//leaves
		leavePeriod=By.xpath("//a[contains(text(),'Leave Period')]");//pim//leaves
		leaveType=By.xpath("//a[contains(text(),'Leave Types')]");//pim//leaves
		workWeek=By.xpath("//a[contains(text(),'Work Week')]");//pim//leaves
		Holidays=By.xpath("//a[contains(text(),'Holidays')]");//pim//leaves
		employeeTimessheet=By.xpath("//a[contains(text(),'Employee Timesheets')]");//Time//TimeSheets
		employeeRecords=By.xpath("//a[contains(text(),'Employee Records')]");//Time//Attendance
		configurationTimesheet=By.id("id=menu_attendance_configure");//Time//Attendance
		projectReports=By.xpath("//a[contains(text(),'Project Reports')]");//Time//Reports
		employeeReports=By.xpath("//a[contains(text(),'Employee Reports')]");//Time//Reports
		attendanceSummary=By.xpath("//a[contains(text(),'Attendance Summary')]");//Time//Reports
		customers=By.xpath("//a[contains(text(),'Customers')]");//Time//projectInfo
		projects=By.xpath("//a[contains(text(),'Projects')]");//Time//projects
	}

	public void menuMouseOver() throws InterruptedException{

		BS.actionMouseOver( adminMenu);
		BS.actionMouseOver(pim);
		BS.actionMouseOver(leave);
		BS.actionMouseOver(recruitment);
		BS.actionMouseOver(time);
		BS.actionMouseOver(performance);
		BS.actionMouseOver(dashboard);
		BS.actionMouseOver(directory);

	}
	public void menuMouseOverAndClick() throws InterruptedException{

		BS.actionClick(adminMenu,userMgmt,users);
		BS.actionClick(pim,leave,workWeek);
		BS.actionClick(time,Timesheet,employeeTimessheet);
		BS.actionClick(time,projects,projectinfo);
		BS.actionClick(adminMenu,configuration,modules);
		BS.actionClick(time,reports,projectReports);
		BS.actionClick(pim,leave,Holidays);
		BS.actionClick(adminMenu,qualifications,education);

	}
}
