package ACP;

/**
 *
 * @author Laura - sandbox code
 */

/*
    This carries out the addition implementation of MathOperation
*/
public class ACPAdd implements MathOperation{

    public Integer operate(Integer firstNum, Integer secondNum) {
	Integer addTotal = firstNum + secondNum;
	return(addTotal);
    }
}


