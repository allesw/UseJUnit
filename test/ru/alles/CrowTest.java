package ru.alles;

import org.junit.Assert;
import org.junit.Test;
import ru.alles.good.Crow;

public class CrowTest {
    @Test
    public void flyingTest(){
        Crow crow = new Crow("Crya");
        crow.feed();
        Assert.assertFalse(crow.isFlying());

    }
}
