package dropdown.com;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.com.Base_Class;
import pom_Class.com.Login_Page;
import pom_Class.com.Product_Page;

public class Dropdown_Functionality extends Base_Class {
	
	public static WebDriver driver=launch(1);
	public static Login_Page obj = new Login_Page(driver);
	public static Product_Page obj1 = new Product_Page(driver);
	
	
	@BeforeMethod
	private void swag_Labs() throws Throwable {
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String page = data_Driven("C:\\Users\\kalai\\eclipse-workspace\\Maven_Swag_Labs\\Swag labs.xlsx", 0, 8, 5);
		url(page);
		

	}
	
	@Test(priority = -1)
	private void first_User() throws Throwable {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String user_Name = data_Driven("C:\\Users\\kalai\\eclipse-workspace\\Maven_Swag_Labs\\Swag labs.xlsx", 0, 9, 5);
		sendkeys(obj.getUser(), user_Name);
		String password = data_Driven("C:\\Users\\kalai\\eclipse-workspace\\Maven_Swag_Labs\\Swag labs.xlsx", 0, 10, 5);
		sendkeys(obj.getPassword(), password);
		click(obj.getLogin());
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		select(obj1.getDropdown(), 1);
		screen_Shot("User_1_Name (Z to A)");
		select(obj1.getDropdown(), 2);
		screen_Shot("User_1_Price (low to high)");
		select(obj1.getDropdown(), "hilo");
		screen_Shot("User_1_Price (high to low)");
		select_Text(obj1.getDropdown(), "Name (A to Z)");
		screen_Shot("User_1_Name (A to Z)");
		click(obj1.getMenu());
		click(obj1.getLogout());
	
	}
	
	@Test
	private void second_User() throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String user_Name = data_Driven("C:\\Users\\kalai\\eclipse-workspace\\Maven_Swag_Labs\\Swag labs.xlsx", 0, 16, 5);
		sendkeys(obj.getUser(), user_Name);
		String password = data_Driven("C:\\Users\\kalai\\eclipse-workspace\\Maven_Swag_Labs\\Swag labs.xlsx", 0, 17, 5);
		sendkeys(obj.getPassword(), password);
		click(obj.getLogin());
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		select(obj1.getDropdown(), 1);
		screen_Shot("User_2_Name (Z to A)");
		select(obj1.getDropdown(), 2);
		screen_Shot("User_2_Price (low to high)");
		select(obj1.getDropdown(), "hilo");
		screen_Shot("User_2_Price (high to low)");
		select_Text(obj1.getDropdown(), "Name (A to Z)");
		screen_Shot("User_2_Name (A to Z)");

		click(obj1.getMenu());
		click(obj1.getLogout());
	

}
	@Test
	private void third_User() throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String user_Name = data_Driven("C:\\Users\\kalai\\eclipse-workspace\\Maven_Swag_Labs\\Swag labs.xlsx", 0, 23, 5);
		sendkeys(obj.getUser(), user_Name);
		String password = data_Driven("C:\\Users\\kalai\\eclipse-workspace\\Maven_Swag_Labs\\Swag labs.xlsx", 0, 24, 5);
		sendkeys(obj.getPassword(), password);
		click(obj.getLogin());
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		select(obj1.getDropdown(), 1);
		screen_Shot("User_3_Name (Z to A)");
		select(obj1.getDropdown(), 2);
		screen_Shot("User_3_Price (low to high)");
		select(obj1.getDropdown(), "hilo");
		screen_Shot("User_3_Price (high to low)");
		select_Text(obj1.getDropdown(), "Name (A to Z)");
		screen_Shot("User_3_Name (A to Z)");
		click(obj1.getMenu());
		click(obj1.getLogout());
	
	}
	@Test
	private void fourth_User() throws Throwable {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String user_Name = data_Driven("C:\\Users\\kalai\\eclipse-workspace\\Maven_Swag_Labs\\Swag labs.xlsx", 0, 30, 5);
		sendkeys(obj.getUser(), user_Name);
		String password = data_Driven("C:\\Users\\kalai\\eclipse-workspace\\Maven_Swag_Labs\\Swag labs.xlsx", 0, 31, 5);
		sendkeys(obj.getPassword(), password);
		click(obj.getLogin());
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		select(obj1.getDropdown(), 1);
		screen_Shot("User_4_Name (Z to A)");
		select(obj1.getDropdown(), 2);
		screen_Shot("User_4_Price (low to high)");
		select(obj1.getDropdown(), "hilo");
		screen_Shot("User_4_Price (high to low)");
		select_Text(obj1.getDropdown(), "Name (A to Z)");
		screen_Shot("User_4_Name (A to Z)");
		click(obj1.getMenu());
		click(obj1.getLogout());
	
	}
}
