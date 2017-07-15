/**
 * Created by Abhijith on 15-Jul-17.
 * Highly divisible triangular number
 * Problem 12
 * The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:
 * <p>
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 * <p>
 * Let us list the factors of the first seven triangle numbers:
 * <p>
 * 1: 1
 * 3: 1,3
 * 6: 1,2,3,6
 * 10: 1,2,5,10
 * 15: 1,3,5,15
 * 21: 1,3,7,21
 * 28: 1,2,4,7,14,28
 * We can see that 28 is the first triangle number to have over five divisors.
 * <p>
 * What is the value of the first triangle number to have over five hundred divisors?
 */

import java.util.*;

public class highlyDivisibleTriangular {
    public static void main(String[] args) {
        HashMap<Integer, Integer> trianangleDivisor = new HashMap<>();
        ArrayList<Integer> triangleNumber = new ArrayList<>();
        int count = 0;
        int num = 0;
        int numOfDivisor = 0;
        for (int i = 1; i <= 10; i++) {
            count = count + i;
            triangleNumber.add(count);
        }
       for(int i = 1; i < triangleNumber.size();i++){
           numOfDivisor =0;
            num = triangleNumber.get(i);
            for(int j = 1; j <= num; j++ ){
                if(num % j == 0 ){
                    numOfDivisor +=1;
                }
            }
            trianangleDivisor.put(num,numOfDivisor);
       }
       System.out.println((trianangleDivisor));
  System.out.print(triangleNumber);
    }


    public static int largestPrimeFactor(int input){
        int i =2;
        while(input > 1){
            if(input%i == 0){
                input = input/i;

            }
            else i = i+1;

        }
        return  i;
    }
}


