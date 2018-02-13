public class UserDefinedFunctions {
    public static void main(String args[]) {
        /*
        3개의 수 최대 공약수를 찾기
         */

        System.out.println(function(400, 300, 200));

    }

    public static int function(int firstNumber, int secondNumber, int thirdNumber) {

        // 3개의 수 중에서 가장 작은 숫자를 찾기
        int min;
        if(firstNumber > secondNumber) {
            if(secondNumber > thirdNumber) {
                min = thirdNumber;
            } else {
                min = secondNumber;
            }
        } else {
            if(firstNumber > thirdNumber) {
                min = thirdNumber;
            } else {
                min = firstNumber;
            }
        }

        // 나머지 값이 0 을 찾기
        for(int i=min; i>0; i--) {
            if(firstNumber % i == 0 && secondNumber % i == 0 && thirdNumber % i == 0) {
                return i;
            }
        }

        return -1;
    }
}
