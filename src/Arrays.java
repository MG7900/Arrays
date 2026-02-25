public class Arrays {

    public int[] nums;

    public static void main(String[] args) {
        System.out.println("arrays");
        new Arrays();

    }

    public Arrays(){

        //ten different buckets, which are labeled 0-9
        nums = new int[10];

        for(int x=0;x<10;x++){
            nums[x] = (int)(Math.random()*100)+1;
        }

        displayArray();
        sumArray();
    }

    public void displayArray(){
//        for(int i=0;i<10;i++) {
//            System.out.print(nums[i] + ", ");
//        }

        //using nums.length ensures
        for(int i=0;i<nums.length;i++){
            System.out.println(i + ": " + nums[i]);
        }



    }

    public void sumArray(){
        int sum = 0;
        for(int q=0;q<nums.length;q++){
            sum = sum+nums[q];
        }
        System.out.println();
        System.out.println(sum);
    }

    //hw below

}
