import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Arnold on 07.04.2018.
 */
public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "d:\\Shikov\\java\\silenium\\geckodriver.exe");
        System.out.println("test");

        FirefoxDriver driver = new FirefoxDriver();
//        driver.get("about:config");
        driver.get("https://www.sportdepo.ru");
        WebElement element = driver.findElementByCssSelector(".img_magsvach > p > a");
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver webDriver) {
                return webDriver.getCurrentUrl().startsWith("sportdepo",12);
            }
        });
        System.out.println(element.getText());
        driver.quit();
    }
}
