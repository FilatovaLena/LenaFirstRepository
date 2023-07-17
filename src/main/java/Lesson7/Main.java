package Lesson7;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);


    public static void main(String[] args) {

        double result = Calculator.calculate(2, 3, Calculator.Type.SUMMARY);
       logger.info("result " + result);

//        double result = Calculator.calculate(2, 3, Calculator.Type.MULTIPLICATION);
//        System.out.println("result " + result);

        result = Calculator.calculate(244, 3, Calculator.Type.SUBTRACTION);
        logger.info("result " + result);
        result = Calculator.calculate(244, 3, Calculator.Type.DIVISION);
        logger.info("result " + result);
    }
}