public class javaclass{
    String name;
    int age;
    public javaclass(){
        System.out.println("Default constructor");

    }   
    public javaclass(int age, String name){
        this.age    = age;
        this.name = name;
        System.out.println("paratermized constructor");
    }
    public static void main(String args[]){
        javaclass jc = new javaclass();
        javaclass jc0 = new javaclass(10, "Saumyma");
        System.out.println(jc0.name + "   " + jc0.age);
    }


}