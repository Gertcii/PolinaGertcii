package homework6;

import com.epam.jdi.light.elements.complex.Checklist;
import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.JDropdown;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.complex.RadioButtons;
import homework6.entity.Data;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class JdiMetalAndColorPage extends WebPage {

    @UI("[name=custom_radio_odd]")
    private RadioButtons oddRadio;

    @UI("[name=custom_radio_even]")
    private RadioButtons evenRadio;

    @FindBy(css = "#elements-checklist input")
    private Checklist elements;

    @JDropdown(root = "div[ui=dropdown]",
            value = ".filter-option",
            list = "li",
            expand = ".caret")
    @FindBy(id = "colors")
    private Dropdown color;

    @JDropdown(root = "div[ui=combobox]",
            value = "//button",
            list = "li",
            expand = ".caret")
    @FindBy(id = "metals")
    private Dropdown metals;

    @FindBy(id = "salad-dropdown")
    private Button vegetablesBtn;

    @FindBy(css = "#salad-dropdown  input")
    private Checklist vegetables;

    @FindBy(id = "submit-button")
    private Button submit;

    @FindBy(css = ".info-panel-body-result div.info-panel-section")
    private WebElement result;

    public void selectNumberInSummary(Data data) {
        oddRadio.select(data.getSummary().get(0));
        evenRadio.select(data.getSummary().get(1));

    }

    public void selectElements(Data data) {
        elements.select(data.getElements().get(0));
        elements.select(data.getElements().get(1));
    }

    public void selectColor(Data data) {

        color.select(data.getColor());
    }

    public void selectMetal(Data data) {
        metals.select(data.getMetals());
    }

    public void selectVegetables(Data data) {

        /*
        нашла это в word документе на гитхаб, но метод areSelected() отсутствует в библиотеке((
        или я что-то не то делала?
        List<String> selectedOptions = vegetables.areSelected();
        for(String s: selectedOptions){
            vegetables.select(s);
            }
         */
        vegetablesBtn.click();
        vegetables.select("Vegetables");
        for (int i = 0; i < data.getVegetables().size(); i++) {
            vegetables.select(data.getVegetables().get(i));
        }

    }

    public void submit() {
        submit.click();
    }

    public void resultRowsHaveProperText(Data data) {

        String[] resList = result.getText().split("\n");
        Assert.assertEquals(resList[0].trim(), data.getSummaryRow());
        Assert.assertEquals(resList[1].trim(), data.getElementsRow());
        Assert.assertEquals(resList[2].trim(), data.getColorRow());
        Assert.assertEquals(resList[3].trim(), data.getMetalRow());
        Assert.assertEquals(resList[4].trim(), data.getVegetablesRow());
    }

}
