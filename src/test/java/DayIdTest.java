import FilatovaM8.DayId;
import Lesson7.Calculator;
import org.junit.Assert;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


//Add unit tests for this method.
////Think about:
////positive tests - all the days have correct return values
////negative tests - numbers < 1 and >7
////a null value (expect for exception)


import FilatovaM8.DayId;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

public class DayIdTest {

    @Test
    public void DayNumberTest() {
        int i =1;
        DayId dayId = new DayId();
        String actualResult = dayId.getDay(i);
        System.out.println(actualResult);
        Assert.assertEquals("Sunday",actualResult);
    }

    @Test
    public void DayNumberTestNegative1() {
        int i =8;
        DayId dayId = new DayId();
        String actualResult = dayId.getDay(i);
        System.out.println(actualResult);
        Assert.assertEquals("The number should be equal or smaller than 7",actualResult);
    }
    @Test
    public void DayNumberTestNegative2() {
        int i = -1;
        DayId dayId = new DayId();
        String actualResult = dayId.getDay(i);
        System.out.println(actualResult);
        Assert.assertEquals("Monday",actualResult);
           }




//    @Test
//    public void DayNumberTestNull() {
//        String i = null;
//        DayId dayId = new DayId();
//        String actualResult = dayId.getDay(i);
//        System.out.println(actualResult);
//        Assert.assertFalse(" Null", actualResult == null);
//
//    }

}
