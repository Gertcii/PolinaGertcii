package homework6.forms;

import com.epam.jdi.light.elements.complex.Checklist;
import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.JDropdown;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.complex.RadioButtons;
import homework6.entity.MetalAndColor;

public class MetalAndColorForm extends Form<MetalAndColor> {

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

    @Override
    public void fill(MetalAndColor metalAndColor){

        oddRadio.select(metalAndColor.getSummary().get(0));
        evenRadio.select(metalAndColor.getSummary().get(1));
        elements.select(metalAndColor.getElements().get(0));
        elements.select(metalAndColor.getElements().get(1));
        color.select(metalAndColor.getColor());
        metals.select(metalAndColor.getMetals());
        vegetablesBtn.click();
        vegetables.select("Vegetables");
        for (int i = 0; i < metalAndColor.getVegetables().size(); i++) {
            vegetables.select(metalAndColor.getVegetables().get(i));
        }
        submit.click();

    }


}
