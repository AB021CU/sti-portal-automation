package sapiens.claims;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;

import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class ClaimsQuestionnaire {

    private static final Logger logger = getLogger(Claims.class);


    public void questionnaireClaimsHandler(WebDriver wdriver)
    {
        String xpath = "//*[@class='required']/../..//input[contains(@class,'QuestionnaireTextInput') and not(@disabled)] | //*[@class='required']/../..//select[not(@disabled)]";
        List<WebElement> queFieldList = wdriver.findElements(By.xpath(xpath));
        List<WebElement> queFieldList1 = wdriver.findElements(By.xpath(xpath));
        boolean i = true;
        while(i)
        {
            int queFieldcount = queFieldList.size();
            for (WebElement queField : queFieldList1) {
                try {
                    Select QueField = new Select(queField);
                    QueField.selectByIndex(1);
                } catch (Exception e) {
                }
                try {
                    queField.sendKeys("Test");
                } catch (Exception e) {
                }

            }
            queFieldList1 = wdriver.findElements(By.xpath(xpath));
            if(queFieldcount == queFieldList1.size() )
            {
                i= false;
            }
            else
            {
                for (WebElement queField : queFieldList) {
                    queFieldList1.remove(queField);
                }
                    queFieldList.addAll(queFieldList1);
                }
            }
        }
    }


