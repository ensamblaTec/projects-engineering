package testings;

public class passwordutil {
public enum SecurityLevel{
    WEAK,MEDIUM,STRONG,INVALID
}

public static SecurityLevel assesPassword(String password){
    if(password.length() < 8){
    return SecurityLevel.WEAK;
    }
    if (password.matches("[a-zA-Z]+")){
        return SecurityLevel.WEAK;
    }
    if (password.matches("[a-zA-Z0-9]+")){
        return SecurityLevel.MEDIUM;
    }
    if (password.matches(".*[!¡:].*")){
        return SecurityLevel.INVALID;
    }
    if (password.matches(".*[ ].*")){
        return SecurityLevel.INVALID;
    }
    for (int i = 0; i < password.length(); i++) {
        if (password.charAt(i) == ' ') return SecurityLevel.INVALID;
    }

        return SecurityLevel.STRONG;
}

}
