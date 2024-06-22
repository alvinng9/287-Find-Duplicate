package org.example;

import org.junit.Assert;
import org.junit.Test;

import org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findDuplicateTest() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.findDuplicate(new int[]{1, 3, 4, 2, 2}));
        Assert.assertEquals(3, solution.findDuplicate(new int[]{3,1,3,4,2}));
        Assert.assertEquals(3, solution.findDuplicate(new int[]{3,3,3,3,3}));
    }

}