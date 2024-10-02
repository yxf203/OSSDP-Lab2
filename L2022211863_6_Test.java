package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.example.Solution6;
import static org.junit.jupiter.api.Assertions.*;

class L2022211863_6_Test {
    /**
     * 等价类划分原则：
     * 1. 所有的元素都不是其他元素的子集
     * 2. 至少有一个元素是其他某个元素的子集
     * 边界值分析原则：
     * 考虑元素的最小长度和最长长度，如每个List元素里面都只有一个String元素
     *
     * */

    /**
     * 测试验证子集和父集内元素出现顺序一样时是否能正常去掉子集的下标。
     * 例如，例子中的["leetcode","google","facebook"]和其子集["google","facebook"]中元素出现顺序一致。
     * 输入：favoriteCompanies = [["leetcode","google","facebook"],["google","microsoft"],["google","facebook"],["google"],["amazon"]]
     * 输出：[0,1,4]
     * */
    @Test
    public void test1(){
        Solution6 s = new Solution6();
        List<List<String>> favoriteCompanies = new ArrayList<>();
        favoriteCompanies.add(new ArrayList<>(Arrays.asList("leetcode", "google", "facebook")));
        favoriteCompanies.add(new ArrayList<>(Arrays.asList("google", "microsoft")));
        favoriteCompanies.add(new ArrayList<>(Arrays.asList("google", "facebook")));
        favoriteCompanies.add(new ArrayList<>(Arrays.asList("google")));
        favoriteCompanies.add(new ArrayList<>(Arrays.asList("amazon")));
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        expected.add(4);
        assertEquals(expected, s.peopleIndexes(favoriteCompanies));
    }

    /**
     * 测试验证子集和父集内元素出现顺序不一致时是否能正常去掉子集的下标。
     * 例如，例子中的["leetcode","google","facebook"]和其子集["facebook","google"]中元素出现顺序不一致。
     * 输入：favoriteCompanies = [["leetcode","google","facebook"],["leetcode","amazon"],["facebook","google"]]
     * 输出：[0,1]
     * */
    @Test
    public void test2(){
        Solution6 s = new Solution6();
        List<List<String>> favoriteCompanies = new ArrayList<>();
        favoriteCompanies.add(new ArrayList<>(Arrays.asList("leetcode", "google", "facebook")));
        favoriteCompanies.add(new ArrayList<>(Arrays.asList("leetcode", "amazon")));
        favoriteCompanies.add(new ArrayList<>(Arrays.asList("facebook", "google")));
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        assertEquals(expected, s.peopleIndexes(favoriteCompanies));
    }
    /**
     * 测试边界的情况，即List元素中也只有一个String元素，查看是否能正确输出。
     * 输入：favoriteCompanies = [["leetcode"],["google"],["facebook"],["amazon"]]
     * 输出：[0,1,2,3]
     * */
    @Test
    public void test3(){
        Solution6 s = new Solution6();
        List<List<String>> favoriteCompanies = new ArrayList<>();
        favoriteCompanies.add(new ArrayList<>(Arrays.asList("leetcode")));
        favoriteCompanies.add(new ArrayList<>(Arrays.asList("google")));
        favoriteCompanies.add(new ArrayList<>(Arrays.asList("facebook")));
        favoriteCompanies.add(new ArrayList<>(Arrays.asList( "amazon")));
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        assertEquals(expected, s.peopleIndexes(favoriteCompanies));
    }
}