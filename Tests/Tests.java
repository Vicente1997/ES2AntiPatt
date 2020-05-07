
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Tests {
    @Test
    public void getName_String(){
        Apresentador apresentador= new Apresentador("Joaquim", 23, "joaquim@email.com", "TVI");

        assertEquals("Joaquim", apresentador.getNome());


        assertEquals("TVI", apresentador.getLocalTrabalho());


    }


    @Test
    public void getEmail_String() throws NoSuchFieldException, IllegalAccessException{
        Apresentador apresentador= new Apresentador("Joaquim", 23, "joaquim@email.com", "TVI");

        Field field = apresentador.getClass().getDeclaredField("email");
        field.setAccessible(true);

        assertEquals("joaquim123@email.com", apresentador.getEmail());
        assertEquals("joaquim123@email.com", field.get(apresentador));


    }




    @Test
    public void getPosition_String() {
        Apresentador apresentador= new Apresentador("Afonso", 32, "afonso@gmail.com", "TVI");

        assertEquals("Apresentador", apresentador.getLocalTrabalho());
        assertEquals((Integer)32, apresentador.getIdade());


    }
}
