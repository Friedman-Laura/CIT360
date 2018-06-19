package ACP;

/**
 *
 * @author Laura - sandbox code
 */

/*
    This carries out the addition implementation of HandleOperation
*/
public class ACPAdd implements HandleOperation{

    public Integer operate(Integer firstNum, Integer secondNum) {
	Integer addTotal = firstNum + secondNum;
	return(addTotal);
    }
}


