package Db1Aula2;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void ParaParLer1() {
        Application application = new Application();
        boolean expected = true;
        boolean response = application.soma(10,20);
        Assert.assertEquals(expected, response);

        if (expected == true) {
            System.out.println("NUMERO 1 MENOR");
        if(expected == false){
            System.out.println("NUMERO 2 MENOR");
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
