import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Topic_06_Condition_Statement {
    public static void main(String[] args) {
        boolean status = 5> 3;
        System.out.println(status);

        //Ham if se nhan vao 1 dieu kien dung
        //Kiem tra duy nhat 1 dieu kien
        //Neu dieu kien nay dung thi se action (xxx) trong phan than

        if(status){
            //Dung thi vao phan than cua if
            //Sai thi bo qua
            System.out.println("Go to if");
        }

        //Gan (assign)
        int studentNumber = 10;

        //== So Sanh
        status = (studentNumber ==10);
        System.out.println(status);

        WebDriver driver = new ChromeDriver();
        WebElement salePopup = driver.findElement(By.id(""));
        //Element luon luon co trong DOM du popup hien thi hay khong
        if (salePopup.isDisplayed()){

        }
        //Element khong co trong DOM khi popup khong hien thi
        List<WebElement> salePopups = driver.findElements(By.id(""));
        if(salePopups.size()>0 && salePopups.get(0).isDisplayed()){

        }

        //Uncheck to checkbox
        WebElement languagesCheckbox = driver.findElement(By.id(""));
        if (languagesCheckbox.isSelected()){
            languagesCheckbox.click();
        }

        //Check to checkbox
        if (!languagesCheckbox.isSelected()){
            languagesCheckbox.click();
        }


    }
}
