import java.util.Arrays;

    public static int betterSum(int [] arr,int target) {
        int count = 0;
        int sum;
        int start = 0, end = arr.length - 1;
        Arrays.sort(arr);
        while(start<end){
            sum=arr[start]+arr[end];
            if(sum==target){
                ++count;
                start++;
                end--;
            }
            else if(target>sum){
                start++;
            }
            else{
                end--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] arr={64 ,93 ,26 ,55, 77, 81, 14, 90, 52, 95, 11, 31, 1 ,10 ,86, 19, 53 ,92, 61, 24, 65, 40 ,27, 69, 63, 89 ,22, 58,32, 5, 6 ,29, 91, 75,37, 38, 4,100, 50,94, 15, 51, 76, 9, 96 ,79, 30, 42 ,73, 47, 98, 12};

        int target=100;
         int value=betterSum(arr,target);
        System.out.println(value);

    }

