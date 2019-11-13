package Db1Aula2;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void ParaParLer1() {
        Application application = new Application();
        Integer expected = 50;
        Integer response = application.soma(30);
        Assert.assertEquals(expected, response);

        Integer x;
        for(x=1;x<expected;x++){
            if (x % 2 == 1) {
                System.out.printf(x+" ");
            }
        }


    }

/*
    @Test
    public void Paraimparler() {
        Application application = new Application();
        boolean expected = false;
        boolean response = application.soma(1);
        Assert.assertNotEquals(expected, response);

        if (expected == false) {
            System.out.println("NUMERO IMPAR");

        }


    }
*/
}
