package Db1Aula2;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void ValidarQuantidadeDeDB1START() {
        Application application = new Application();
        Integer response = application.texto("vai da certo");
        Integer expected = 10;
        Assert.assertEquals(expected, response);
Integer x=0;

        System.out.printf("DB1START Tem 8 letras, mas está com "+expected+" caracteres contando com os espaço");

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
