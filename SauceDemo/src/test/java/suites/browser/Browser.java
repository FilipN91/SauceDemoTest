package suites.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Browser {
    public WebDriver driver;

    public void startChrome(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--disable-notifications", "--start-maximized"));
        driver.get("https://www.saucedemo.com/");
    }
    public void startFirefox(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver(new FirefoxOptions().addArguments("--disable-notifications", "--start-maximized"));
        driver.get("https://www.saucedemo.com/");
    }
}
