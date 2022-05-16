package algoexpert.arrays.hard;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Imagine that you're a teacher who's just graded the final exam in a class. You have a list of students scores on the final
 * exam in particular order(not necessarily sorted), you want to reward your student. You decide to do so fairly by giving
 * them arbitary rewards following two rules:
 * 1. All students must receive at least one reward
 * 2. Any given student must receive strictly more rewards than an adjacent student(a student immediately to the left or to
 * the right) with a lower score and must receive strictly fewer rewards that an adjacent student with a higher score
 *
 * write a function that takes in a list of scores and returns the minimum number of rewards that you must give out to students
 * to satisfy the two rules.
 *
 * You can assume that all students have different scores; in other words, the scores are all unique.
 *
 * scores = [8, 4, 2, 1, 3, 6, 7, 9, 5]
 *
 * 25
 */
public class MinRewards {

    public static int minRewards(int[] scores){
        int[] rewards = new int[scores.length];

        Arrays.fill(rewards, 1);
        for(int i = 1 ; i < scores.length; i++){
            int j = i - 1;
            if(scores[i] > scores[j]){
                rewards[i] = rewards[j] + 1;
            } else {
                while(j >= 0 && scores[j] > scores[j + 1]){
                    rewards[j] = Math.max(rewards[j], rewards[j + 1] + 1);
                    j--;
                }
            }
        }
        return IntStream.of(rewards).sum();
    }
    public static void main(String[] args) {
        System.out.println(minRewards(new int[] {8, 4, 2, 1, 3, 6, 7, 9, 5}));
    }
}
