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
        averageNum();
        maxNum();
        minNum();
        maxIndex();
        greaterThan50();
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

    public void averageNum(){
        int Sum = 0;
        int average;
        for(int q=0;q < nums.length;q++){
            Sum = Sum + nums[q];
        }
        average = Sum /nums.length;
        System.out.println(average);
    }

    public void maxNum(){
        int max = 0;
        for(int a=0; a<nums.length;a++){
            if(nums[a]>max){
                max = nums[a];
            }
        }
        System.out.println(max);
        }

    public void minNum(){
        int min = 150;  //set a number above the range of numbers that you can possibly get
        for(int b=0; b < nums.length; b++){
            if(nums[b] < min){
                min = nums[b];
            }
        }
        System.out.println(min);
    }

    //todo: make a method called maxIndex that finds the index aka bucket label that has the max number in the array

    public void maxIndex() {

        int max = 0;
        int indexNum = 0;   //has to start at 0
        for (int a = 0; a < nums.length; a++) {
            if (nums[a] > max) {
                max = nums[a];
                indexNum=a;
            }

        }
        System.out.println("the bucket with the maximum is " + indexNum);

    }



    public void greaterThan50(){
        int numbers_more_than_50 = 0;
        for(int z = 0; z < nums.length; z++){
            if(nums[z]>50){
                numbers_more_than_50++;
            }
        }
        System.out.println("There are " + numbers_more_than_50 + " numbers greater than 50!");
    }

}



