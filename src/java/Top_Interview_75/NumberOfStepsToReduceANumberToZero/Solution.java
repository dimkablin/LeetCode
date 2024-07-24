package Top_Interview_75.NumberOfStepsToReduceANumberToZero;

class Solution {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
        System.out.println(numberOfSteps(8));
        System.out.println(numberOfSteps(123));
    }
    public static int numberOfSteps(int num) {
        int i = 0;
        for( ;num != 0; ++i) {
            if ((num&1)==0) {
                num >>= 1;
            } else {
                --num;
            }
        }
        return i;
    }
}
