package homework6;


import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import homework6.entity.Data;
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

    public static void selectSummaryCheckbox(Data data) {
        metalAndColorPage.selectNumberInSummary(data);
    }

    public static void selectElements(Data data) {
        metalAndColorPage.selectElements(data);
    }

    public static void selectColor(Data data) {
        metalAndColorPage.selectColor(data);
    }

    public static void selectMetal(Data data) {
        metalAndColorPage.selectMetal(data);
    }

    public static void selectVegetable(Data data) {
        metalAndColorPage.selectVegetables(data);
    }

    public static void clickSubmit() {
        metalAndColorPage.submit();
    }

    public static void resultRowsHaveProperText(Data data) {
        metalAndColorPage.resultRowsHaveProperText(data);
    }


}
