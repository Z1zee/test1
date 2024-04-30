package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DirectoryPage {public void Directory (){
    PageFactory.initElements(Driver.getDriver(), this);
}
    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
    public WebElement button;

    @FindBy(xpath = "(//*[text()='HR Manager'])[1]")
    public WebElement HrManager;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement search;

}
