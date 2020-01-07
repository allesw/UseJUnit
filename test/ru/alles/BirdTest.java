package ru.alles;

import org.junit.Assert;
import org.junit.Test;
import ru.alles.good.Bird;
import ru.alles.good.Crow;

public class BirdTest {

    @Test
    public void nameBird(){
        Bird bird = new Crow("Crya");
        Assert.assertEquals("Wrong name", "Crya", bird.getName());
    }

    @Test
    public void toStringTest(){
        Bird bird = new Crow("Crya");
        Assert.assertTrue(bird.toString().contains("Crya"));
    }

    @Test(expected = RuntimeException.class)
    public void isEmptyName(){
        Bird bitd = new Crow("");
    }

}
