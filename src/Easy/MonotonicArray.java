package Easy;

public class MonotonicArray {

    public static boolean isMonotonic(int[] array){
        return isIncreasingMonotonic(array)||isIncreasingMonotonic(array);
    }
    public static boolean isIncreasingMonotonic(int[] array){
        for (int i=0;i<array.length-1;i++){
            if(array[i]<array[i+1])
                return false;
        }
return true;
    }
    public static boolean isDecreasingMonotonic(int[]array){
        for (int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1])
                return false;
        }
        return true;

    }
    public static void main(String[] args) {
    int[] array ={2,3,2,4};
        System.out.println(isMonotonic(array));
    }
}
