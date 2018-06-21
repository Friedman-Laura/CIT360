package ACP;

/**
 *
 * @author Laura - sandbox code
 */

/*
    This carries out the division implementation of MathOperation
*/
public class ACPDivide implements MathOperation {

    public Integer operate(Integer firstNum, Integer secondNum) {
        Integer divide = firstNum/secondNum;
	return(divide);
    }
}
