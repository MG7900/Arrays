public class Arrays {

    public int[] nums;
    public Star[] stars;

    public static void main(String[] args) {
        System.out.println("arrays");
        new Arrays();


    }

    public Arrays(){

        //ten different buckets, which are labeled 0-9
        nums = new int[10];
        stars = new Star[7];

        nums[0] = 35;
        //below: go make a star object
        stars[0] = new Star();
        Star s1 = new Star();
        s1.printInfo();

        System.out.println();   //purely for line breaking

        stars[0].printInfo();

        System.out.println();

        //todo: change s1's color and points to be different
        //todo: call printInfo() again

        s1.color = "blue";
        s1.points = 90;
        s1.printInfo();

        stars[0].color = "orange";
        stars[0].points = 7;
        stars[0].printInfo();

        //todo: fill all the buckets in stars with stars
        stars[1] = new Star();  //making a new bucket every single time
        stars[1].color = "yellow";
        stars[1].points = 6;
        stars[1].printInfo();

//below: making a loop to fill in the buckets

        for(int y = 0; y < stars.length; y++){
            stars[y] = new Star();
            //todo: give points a random num between 0 and 10 inclusive
            stars[y].points = (int)(Math.random()*11);

        }
        System.out.println("experiment: " + stars[3].points);

        for(int x=0;x<10;x++){
            nums[x] = (int)(Math.random()*100)+1;
        }

        displayArray();
        displayStars();
        sumStarsPoints();
//        sumArray();
//        averageNum();
//        maxNum();
//        minNum();
//        maxIndex();
//        greaterThan50();
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

    //todo: make a displayStars that uses the printInfo from Star to print all the stars

    public void displayStars(){
        System.out.println();
        for(int a = 0; a < stars.length; a++){
            System.out.println("New Star " + a);
            stars[a].printInfo();
            System.out.println();
        }
    }


    //homework 3/6 below
    public void sumStarsPoints(){
        int sum = 0;
        for(int b = 0; b < stars.length; b++){
            sum = sum + stars[b].points;
        }
        System.out.println();
        System.out.println("Sum of Points of all stars = " + sum);
    }

}



