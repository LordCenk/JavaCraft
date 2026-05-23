//Write a Java Program to demonstrate Scroll up/ Scroll down.
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        // Type casting driver to JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll Down
        js.executeScript("window.scrollBy(0,500)");

        System.out.println("Scrolled Down");

        Thread.sleep(2000);

        // Scroll Up
        js.executeScript("window.scrollBy(0,-500)");

        System.out.println("Scrolled Up");

        driver.quit();
    }
}
