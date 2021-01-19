package homework6;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import homework6.entity.MetalAndColor;
import homework6.forms.MetalAndColorForm;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;


public class JdiMetalAndColorPage extends WebPage {

    private MetalAndColorForm metalAndColorForm;

    @FindBy(css = ".results li")
    private List<WebElement> result;

    public void fillMetalAndColorForm(MetalAndColor metalAndColor) {

        metalAndColorForm.fill(metalAndColor);
    }

    public void resultRowsHaveProperText(MetalAndColor metalAndColor) {

        List<String> expectedRows = metalAndColor.resultLogRow();
        List<String> actualRows = new ArrayList<>();
        for (WebElement element : result) {
            actualRows.add(element.getText().trim());
        }
        Assert.assertEquals(actualRows, expectedRows);
    }

}
