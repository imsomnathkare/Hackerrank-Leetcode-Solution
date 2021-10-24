import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    /*
     * Complete the 'getSubstringCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int getSubstringCount(String s) {
        int arr[] =new int[2];
        int res=0;
        
        if(s.charAt(0)=='0')
        
        arr[0]++;
        else
        arr[1]++;
        
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch !=s.charAt(i-1))
              arr[ch-'0']=1;
              else
              arr[ch-'0']++;
              
            if(arr[1-(ch-'0')]>0){
                arr[1-(ch-'0')]--;
                res ++;
            }
        }
        
        return res;

    }

}
public class SolutionCountBinarySubstring {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.getSubstringCount(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
