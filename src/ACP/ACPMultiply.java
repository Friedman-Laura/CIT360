package ACP;

/**
 *
 * @author Laura - sandbox code
 */

/*
    This carries out the multiplication implementation of HandleOperation
*/
public class ACPMultiply implements HandleOperation {

    public Integer operate(Integer firstNum, Integer secondNum) {
	Integer multiply = firstNum * secondNum;
	return(multiply);
    }
}
