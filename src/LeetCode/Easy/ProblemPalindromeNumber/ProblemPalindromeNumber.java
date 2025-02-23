package LeetCode.Easy.ProblemPalindromeNumber;

import java.util.ArrayList;
import java.util.List;

public class ProblemPalindromeNumber {

    public static void main(String[] args) {

        List<Integer> nums =new ArrayList<>(List.of(121, -121, 10));

        nums.forEach(n -> System.out.println(isPalindrome(n)));
    }


    private static boolean checkPalindrome(String num){
        int left = 0;
        int right = num.length() -1;
        while(left < right){
            if(num.charAt(left) != num.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        String num = x+"";
        return checkPalindrome(num);
    }
}
