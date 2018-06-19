package ACP;

/**
 *
 * @author Laura - sandbox code
 */

/*
    This carries out the division implementation of HandleOperation
*/
public class ACPDivide implements HandleOperation {

    public Integer operate(Integer firstNum, Integer secondNum) {
        Integer divide = firstNum/secondNum;
	return(divide);
    }
}
