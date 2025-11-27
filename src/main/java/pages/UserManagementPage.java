package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class UserManagementPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By adminMenu = By.xpath("//span[text()='Admin']");
    private By addUserButton = By.xpath("//button[contains(.,'Add')]");
    private By newUsernameField = By.xpath("//label[text()='Username']/following::input[1]");
    private By passwordField = By.xpath("//label[text()='Password']/following::input[1]");
    private By saveButton = By.xpath("//button[contains(.,'Save')]");

    public UserManagementPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void createUser(String username, String password) {
        wait.until(ExpectedConditions.elementToBeClickable(adminMenu)).click();
        wait.until(ExpectedConditions.elementToBeClickable(addUserButton)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(newUsernameField)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
    }
}
