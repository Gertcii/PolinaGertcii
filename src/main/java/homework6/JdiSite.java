package homework6;


import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import homework6.entity.MetalAndColor;
import homework6.entity.User;

@JSite("https://jdi-testing.github.io/jdi-light/")
public class JdiSite {

    @Url("index.html")
    @Title("Home Page")
    private static JdiHomePage homePage;

    @Url("metals-colors.html")
    @Title("Metal and Colors")
    private static JdiMetalAndColorPage metalAndColorPage;

    public static void openHomePage() {
        homePage.open();
        homePage.checkOpened();
    }

    public static void login(User user) {
        homePage.login(user);
    }

    public static String getUserName() {
        return homePage.getUserName();
    }

    public static void openMetalsAndColorsPageViaHeaderMenu() {
        homePage.openMetalsAndColorsPage();
        metalAndColorPage.checkOpened();
    }

    public static void fillMetalAndColor(MetalAndColor metalAndColor) {
        metalAndColorPage.fillMetalAndColorForm(metalAndColor);
    }

    public static void resultRowsHaveProperText(MetalAndColor metalAndColor) {
        metalAndColorPage.resultRowsHaveProperText(metalAndColor);
    }


}
