import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void getName_String(){
        Apresentador apresentador= new Apresentador("Joaquim", 23, "joaquim@email.com", "TVI");

        assertEquals("Joaquim", apresentador.getNome());




        //Free ride Anti Pattern
    }


    @Test
    public void getEmail_String() throws NoSuchFieldException, IllegalAccessException{
        Apresentador apresentador= new Apresentador("Joaquim", 23, "joaquim@email.com", "TVI");



        assertEquals("joaquim123@email.com", apresentador.getEmail());


        //Anal probe Anti Pattern
    }




    @Test
    public void getPosition_String() {
        Apresentador apresentador= new Apresentador("Afonso", 32, "afonso@gmail.com", "TVI");

        assertEquals("Apresentador", apresentador.getLocalTrabalho());


        //Free ride Anti Pattern
    }
}

