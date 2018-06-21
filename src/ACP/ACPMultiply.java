package ACP;

/**
 *
 * @author Laura - sandbox code
 */

/*
    This carries out the multiplication implementation of MathOperation
*/
public class ACPMultiply implements MathOperation {

    public Integer operate(Integer firstNum, Integer secondNum) {
	Integer multiply = firstNum * secondNum;
	return(multiply);
    }
}
