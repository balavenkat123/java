

class Human{
    private int age;
    private String name;
    private int weight;

    public Human(){
        name="bala venkat";
        age=20;
        weight=79;
    }

    public int getAgeWeight(){
        return weight ;
        
    }
    public String getName(){
        return name;
    }
    // public int setAge(int a){
    //     return age=a;
    // }


}




public class four {
    public static void main(String[] args) {
        Human obj=new Human();
        
        System.out.println(obj.getName());
        System.out.println(obj.getAgeWeight());
        // int a=obj.setAge(30);
        // System.out.println(a);
        
    }
}
