package HerokuApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class DragAndDropAnElement {
    WebDriver driver;
    @Test
    public void dragAndDrop() {

        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement clickOnDragAndDrop = driver.findElement(By.xpath("//a[text()='Drag and Drop']"));
        clickOnDragAndDrop.click();

        WebElement aBox = driver.findElement(By.id("column-a"));
        WebElement bBox = driver.findElement(By.id("column-b"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(aBox, bBox).perform();
    }
}
