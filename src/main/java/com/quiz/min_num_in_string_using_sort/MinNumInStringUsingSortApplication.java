package com.quiz.min_num_in_string_using_sort;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class MinNumInStringUsingSortApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        int[] arr = new int[index];
        int minNum = 0;
        
        for (int x = 0; x < index; x++) {
            arr[x] = scan.nextInt();
        }
        Arrays.sort(arr);
        minNum = arr[0];
		scan.close();
        System.out.println(minNum);
	}

}
