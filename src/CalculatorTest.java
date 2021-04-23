import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test    //the annotation tells the junit framework that the below method is executable test method.
    public void calculatorInitialValueZero(){      //test method
        Calculator calculator = new Calculator();
        assertEquals(0,calculator.getValue());
    }

    @Test
    public  void  valueWhenFiveAdded(){
        Calculator calculator = new Calculator();
        calculator.add(5);
        assertEquals(5,calculator.getValue());

    }

    @Test
    public void valueWhenTwoSubtracted(){
        Calculator calculator = new Calculator();
        calculator.subtract(2);
        assertEquals(-2,calculator.getValue());
    }

}
