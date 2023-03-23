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
    @Test
    public void strongwhen_has_letters_numbers_and_symbols(){
        assertEquals(STRONG,passwordutil.assesPassword("fsdfsd%#$sgdfgy/(////"));
    }
    @Test
    public void invalidwhen_has_letters_numbers_and_symbols(){
        assertEquals(INVALID,passwordutil.assesPassword("fsdfsd%#$sgdfg!y/(////"));
    }
    @Test
    public void invalidwhen_has_space(){
        assertEquals(INVALID,passwordutil.assesPassword("fsdfsd%#$sgdfg!y/(//// "));
    }
}