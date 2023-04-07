
class Computer{
    public String video(){
         return "video playing";
    }
    public int maths(int a,int b){
        int c=a+b;
        if(c>=10) 
            return c;

        return 0;      
    }
}

public class two {
    public static void main(String args[]) {
        int a=8;
        int c=2;

        Computer obj=new Computer();
        int result=obj.maths(a,c);
        System.out.println(result);
        String video=obj.video();
        System.out.println(video);



    }
}
