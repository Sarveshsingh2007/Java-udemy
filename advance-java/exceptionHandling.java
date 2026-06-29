public class exceptionHandling {
    public static void main(String[] args){
        int i = 2;
        int j = 0;
        String str = null;
        int nums[] = new int[5];
        try{
            j = 18/i;      // this is ArithmaticException
            // System.out.println(nums[0]);         //  ArrayIndexOutOfBoundsException
            System.out.println(str.length());
        }
        catch(ArithmeticException e){
            System.out.println("Cannot Divide by 0.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index is out of boundary.");
        }
        catch(Exception e){
            System.out.println("Something went wrong" + e);
        }
        System.out.println("Bye");

    }
}
