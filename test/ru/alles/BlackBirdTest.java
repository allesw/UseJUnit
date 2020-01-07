package ru.alles;

import org.junit.Assert;
import org.junit.Test;
import ru.alles.good.Blackbird;

public class BlackBirdTest {
    @Test
    public void flyingTest(){
        Blackbird blackbird = new Blackbird("Kar");
        blackbird.feed();
        Assert.assertTrue(blackbird.isFlying());
    }
}
