package Db1Aula2;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void ValidarQuantidadeDeDB1START() {
        Application application = new Application();
        Integer response = application.texto("vai da certo");
        Integer expected = 8;
        Assert.assertEquals(expected, response);

        System.out.printf("DB1START Tem "+expected+" letras");

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
