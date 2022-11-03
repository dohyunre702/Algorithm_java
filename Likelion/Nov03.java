package Likelion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//에라토스테네스의 체 배열 - checks를 참고해 true인 nums[i]만 출력
public class Nov03 {
    public static void main(String[] args) {
        int N = 50;
        int[] nums = new int[N - 1]; //n-1만큼. 2~50 (49개)
        boolean[] checks = new boolean[nums.length]; //nums만큼 checks 생성

        Arrays.fill(checks, true); //checks를 true로 초기화. (기본값 = false라서)

        for (int i = 0; i < nums.length; i++) nums[i] = i + 2; //2-49까지 nums에 저장

        int multipleOf = 2;
        for (int i = 2; i < nums.length; i += 2) checks[i] = false; //2배수 지우기

        List<Integer> prime = new ArrayList<>();
        for (int i = 0; i < checks.length; i++) {
            if (checks[i]) prime.add(nums[i]);
        }
            System.out.println(prime);
        }
    }

