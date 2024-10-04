package Leetcode;

import java.util.Arrays;

public class Divide_Players_Into_Teams_of_Equal_Skill {
    public static void main(String[] args) {
        int[] skill = {3,2,5,1,3,4};;
        long ans = dividePlayer(skill);
        System.out.println(ans);

    }
    static long dividePlayer(int[] skill) {
        Arrays.sort(skill);
        int n = skill.length;

        long totalChemistry = 0;

        int targetSum = skill[0] + skill[n-1];

        for (int i = 0; i < n / 2 ; i++) {
            int currentTeamSkill = skill[i] + skill[n - i - 1];

            if (currentTeamSkill != targetSum) {
                return -1;
            }
            totalChemistry += (long) skill[i] * (long) skill[n-i-1];
        }

        return totalChemistry;

    }
}
