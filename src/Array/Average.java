package Array;

public class Average {
    private  static  float  findAverage(int [] arr){
        int sum = 0;
        for(int val : arr){
            sum = sum + val;
        }

        return (float) sum/(float) arr.length;
    }
    public static void main(String[] args) {
        int [] arr = {12,3,5,376,53,3,};
        System.out.println(findAverage(arr));

    }
}
