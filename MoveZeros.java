import java.util.Scanner;

class Main{
    public static void moveZeroes(int[] nums) {
    int left = 0;
    int right = 0;
    
        while (right < nums.length) {
            if (nums[right] != 0) {
                // Swap non-zero element with the leftmost zero or non-zero element
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            right++;
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        moveZeroes(arr);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }	
}