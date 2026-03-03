public class Arrays {
    public int[] nums;
    public static void main(String[] args) {
        System.out.println("Welcome to Arrays");
        new Arrays();
    }

    public Arrays(){

        nums= new int[10];
        for (int x= 0; x<nums.length;x++){
            nums[x]= (int)(Math.random()*999)+1;
        }
        //nums[9]= 11;
        //nums[8]= 22;
        //nums[7]= 11;
        //nums[6]= 25;
        //nums[5]= 111;
        //nums[4]= 9023;
        //nums[3]= 67;
        //nums[2]= 4;
        //nums[1]= 332;
        //nums[0]= 1;
        //System.out.println(nums[9]);
        displayArray();
        sumArray();
    }

    public void displayArray(){
        System.out.println(nums[3]);
        for(int x=0;x< nums.length;x++){
            System.out.println("Bucket "+x+": "+ nums[x]);
        }
    }

    public void sumArray(){
        int total= 0;
        for(int x=0;x< nums.length;x++){
            total=total+nums[x];
        }
        System.out.println(total);
    }

}
