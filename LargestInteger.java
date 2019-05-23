 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        int a = integers[0];
        int b = integers[1];
        int c = integers[2];
        int result;
        result = a > b ? a : b;
        result = b > c ? b : c;
        result = c > a ? c : a;
        return result;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        int a = integers[0];
        int b = integers[1];
        int c = integers[2];
        int result = Math.max(Math.max(a,b),Math.max(b,c));
        return result;
    }
}
