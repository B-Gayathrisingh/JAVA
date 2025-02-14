
import java.util.Arrays;

public class secondlargestnumber{
    public static void main(String [] args){
        int[] arr={12,23,4,56754,234,432,98654};
        Arrays.sort(arr);
        System.out.println("secondlargest number:" +arr[arr.length-2]);
    }
}