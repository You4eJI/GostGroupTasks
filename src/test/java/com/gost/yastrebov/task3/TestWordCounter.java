package com.gost.yastrebov.task3;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class TestWordCounter {
    private WordCounter counter;

    @Test(expected = IllegalArgumentException.class)
    public void emptyText() {
        counter = new WordCounter();
        counter.countWords("");
    }

    @Test
    public void breakLine() {
        counter = new WordCounter();
        Map<String, Integer> map = counter.countWords("Этот тест про-\nверяет пере-\nнос стро-\nки");
        Assert.assertEquals(5, map.size());
    }
}
