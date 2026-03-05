public class Arrays {
    public int[] nums;
    public Astronaut[] astros;
    public static void main(String[] args) {
        System.out.println("Welcome to Arrays");
        new Arrays();
    }

    public Arrays(){

        nums= new int[10];

        for (int x= 0; x<nums.length;x++){
            nums[x]= (int)(Math.random()*999)+1;
        }

        astros= new Astronaut[12];

        for (int x=0; x<astros.length;x++){
            astros[x].name= "phil"+x;
            astros[x].eyes= (int)(Math.random()* astros.length);
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
        averageNum();
        maxNum();
        minNum();

        Astronaut a1 = new Astronaut();
        a1.printInfo();

        System.out.println(astros[4]);

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

    public void averageNum(){
        System.out.println("Average: "+ java.util.Arrays.stream(nums).average());
    }
    public void maxNum(){
        System.out.println("Max: "+ java.util.Arrays.stream(nums).max());
    }
    public void minNum(){
        System.out.println("Min: "+ java.util.Arrays.stream(nums).min());
    }
}
