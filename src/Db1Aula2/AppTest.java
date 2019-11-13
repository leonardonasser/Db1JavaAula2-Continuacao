package Db1Aula2;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void ValidarTrocaDeItem4() {
        Application application = new Application();
        Integer response = application.texto("vai da certo","oaskosakosak");
        Integer expected = 3;
        Assert.assertEquals(expected, response);
Integer x=0;

        System.out.print(" E agora o item4 tem "+ expected+" letras");

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
