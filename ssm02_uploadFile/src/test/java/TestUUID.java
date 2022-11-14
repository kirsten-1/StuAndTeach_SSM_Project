import org.junit.jupiter.api.Test;

import java.util.UUID;


public class TestUUID {
    @Test
    public void testUUID(){
        String s = UUID.randomUUID().toString();
        System.out.println(s);
    }
}
