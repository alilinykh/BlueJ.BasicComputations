import java.util.Scanner; 


public class ShortCalculator {

    public short sumShortValues(short firstNum, short secondNum) {
        short result = (short)(firstNum + secondNum);
        return result;
    }
    public short diffShortValues(short firstNum, short secondNum) {
        short result = (short)Math.abs(firstNum - secondNum);
        return result;
    }
    public short productShortValues(short firstNum, short secondNum) {
        short result = (short)(firstNum * secondNum);
        return result;
    }
    public short quotientShortValues(short firstNum, short secondNum) {
        short result = (short)(firstNum / secondNum);
        return result;
    }
    public short remainderShortValues(short firstNum, short secondNum) {
        short result = (short)(firstNum % secondNum);
        return result;
    }
}
