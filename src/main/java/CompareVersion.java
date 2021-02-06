import java.util.*;

public class CompareVersion {

    public static void main(String[] args) {
        Scanner obj = new Scanner((System.in));
        System.out.println("Enter First Version: ");
        String version1 = obj.nextLine();
        System.out.println("Enter Second Version: ");
        String version2 = obj.nextLine();
        System.out.println("Compared Result : " + compareVersions(version1,version2));
    }

    public static int compareVersions(String version1, String version2){

        int numericV1 = 0 , numericV2 = 0;

        for(int i=0, j = 0 ; ( i < version1.length() || j < version2.length());){
            //
            while( i < version1.length() && version1.charAt(i) != '.' ){
                numericV1 = numericV1 * 10 + (version1.charAt(i) - '0');
                i++;
            }
            //
            while ( j < version2.length() && version2.charAt(j) != '.' ){
                numericV2 = numericV2 * 10 + (version2.charAt(j) - '0');
                j++;
            }

            if(numericV1 > numericV2) return 1;
            if(numericV2 > numericV1) return -1;

            //nextpart of string
            numericV1 = numericV2 = 0;
            i++;
            j++;
        }
        return 0;
    }
}
