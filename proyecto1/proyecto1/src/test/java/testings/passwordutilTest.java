package testings;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static testings.passwordutil.SecurityLevel.*;

public class passwordutilTest{
     @Test
     public void weak_when_has_less_than_8_letters(){
         assertEquals(WEAK,passwordutil.assesPassword("123456"));
     }
     @Test
     public void weak_when_has_only_letters(){
         assertEquals(WEAK,passwordutil.assesPassword("adbcdefagt"));
     }
     @Test
     public void medium_when_has_letters_and_numbers(){
         assertEquals(MEDIUM,passwordutil.assesPassword("dasgfdvcvvcb12334"));
     }
}