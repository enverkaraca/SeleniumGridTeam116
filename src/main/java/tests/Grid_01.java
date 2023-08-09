package tests;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.DriverManager;

public class Grid_01 {



    static WebDriver driver;

    public static void main(String[] args) throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://172.30.16.11:4444"), new ChromeOptions());
        driver.get("https://www.google.com");

    }
}