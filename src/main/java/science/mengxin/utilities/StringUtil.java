package science.mengxin.utilities;

import java.security.MessageDigest;

/**
 * User:    mengxin
 * Date:    11/01/2018
 * Project: noobchain
 * Package: science.mengxin.utilities
 * Description: StringUtil.
 *
 * @author mengxin
 * @version 1.0
 */
public class StringUtil {
    //Applies Sha256 to a string and returns the result.
    public static String applySha256(String input){
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            //Applies sha256 to our input,
            byte[] hash = digest.digest(input.getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer(); // This will contain hash as hexidecimal
            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        }
        catch(Exception e) {
            throw new RuntimeException(e);
        }
    }	}
