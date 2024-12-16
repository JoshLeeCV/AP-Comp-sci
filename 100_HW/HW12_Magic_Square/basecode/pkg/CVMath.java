package pkg;

public class CVMath {
    public static void specialSquare(int n){
        int count = 0;
        int num = 1;
        while (count < n){
            if (isPerfSquare(num)){
            if (isSumconsecutive(num)){
                    System.out.println(num);
                    count++;
            	}
            }
            num++;
    	}
    }
    private static boolean isPerfSquare(int num){
        int square = (int) Math.sqrt(num);
        return square * square == num;
    }
    private static boolean isSumconsecutive(int num){
        int sum = 0;
        int k = 1;
        while (sum < num){
            sum = sum + k;
            k++;
        }
        return sum == num;
    }
}