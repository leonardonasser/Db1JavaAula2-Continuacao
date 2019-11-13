package Db1Aula2;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void ParaParLer1() {
        Application application = new Application();
        String response = application.texto("vai da certo");
        String expected = response.toLowerCase();
        Assert.assertEquals(expected, response);

        System.out.printf(expected);

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
