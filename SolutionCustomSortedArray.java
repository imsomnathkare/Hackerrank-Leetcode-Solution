
2) Custom Sorted Array (Hacker Rank Solution)

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    /*
     * Complete the 'moves' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int moves(List<Integer> arr) {
    int count= 0;
    int evenCount=0;
    
    for(Integer num:arr){
        if(isEven(num))
            evenCount++;
    }
    
    for(int i=0;i<evenCount;i++){
        int value=arr.get(i);
        
        if(isOdd(value))
        count++;
    }
return count;
    }
    
    private static boolean isOdd(int num){
        
        return (num %2==1);
    }
    
     private static boolean isEven(int num){
        
        return (num %2==0);
    }

}
public class SolutionCustomSortedArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(bufferedReader.readLine().trim());
            arr.add(arrItem);
        }

        int result = Result.moves(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
