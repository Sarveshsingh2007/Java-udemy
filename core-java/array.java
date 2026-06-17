public class array {
    public static void main(String[] args) {

        int nums[] = new int[4];
        nums[0] = 4;
        nums[1] = 3;
        nums[2] = 2;
        nums[3] = 1;

        int nums2[] = {1, 2, 3, 4, 5};

        System.out.println("Array 1:");
        for (int i = 0; i < 4; i++) {
            System.out.print(" " + nums[i]);
        }

        System.out.println(); 

        System.out.println("Array 2:");
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + nums2[i]);
        }
    }
}