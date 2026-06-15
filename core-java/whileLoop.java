public class whileLoop {
    public static void main(String args[]){
        int n=1;
        while(n<=4){
            System.out.println(n);
            n++;
        }

        System.out.println("==Nested while loop==");
        int i= 0;
        while(i<=4){
            System.out.println("Hi"+ i);
            int j = 1;
            while(j<=3){
                System.out.println("hello"+ j);
                j++;
            }
            i++;
        }
        System.out.println("bye"+ n);
    }
}
