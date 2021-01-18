package homework6;

import com.epam.jdi.light.elements.common.Label;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.Icon;
import homework6.entity.User;
import homework6.forms.LoginForm;

public class JdiHomePage extends WebPage {

    public LoginForm loginForm;

    @FindBy(id = "user-name")
    public Label userName;
    @FindBy(id = "user-icon")
    public Icon userIcon;
    @FindBy(xpath = "//a[text()='Metals & Colors']")
    public Button metalsAndColors;

    public void login(User user) {
        userIcon.click();
        loginForm.login(user);
    }

    public String getUserName() {
        return userName.getText();
    }

    public void openMetalsAndColorsPage() {
        metalsAndColors.click();
    }
}
