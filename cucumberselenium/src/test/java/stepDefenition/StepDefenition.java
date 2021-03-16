package stepDefenition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefenition {

	private WebDriver driver; 
@Before 
	 public void testadddition() throws InterruptedException {
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver.exe");
driver = new ChromeDriver();
	  	    driver.get("https://www.marshu.com/articles/calculate-addition-calculator-add-two-numbers.php");
	    driver.manage().window().maximize();
	    Thread.sleep(2000); // Let the user actually see something!
	  
	
	   
//driver.quit();	
	    }
	 

		@Given("I have entered {int} into the calculator")
		public void i_have_entered_into_the_calculator(Integer int1) {
			WebElement Number1 = driver.findElement(By.name("n01"));
			Number1.sendKeys("50");
			 Thread.sleep(2000);
			
		}
	

		@Given("I have also entered {int} into the calculator")
		public void i_have_also_entered_into_the_calculator(Integer int1) {
		   
		}
		@When("I press add")
		public void i_press_add() {
		}
		
		@Then("the result should be {int} on the screen")
		public void the_result_should_be_on_the_screen(Integer int1) {
	    
		}



}
