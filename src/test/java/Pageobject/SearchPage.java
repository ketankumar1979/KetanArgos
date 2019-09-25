package Pageobject;

import com.amazon.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends DriverFactory {
    @FindBy(id = "twotabsearchtextbox")
    WebElement searchTextBox;
}
