public class test{
    static int count =5;
    public void increment(){
        count++;
    }
    public static void main(String...args){
        System.out.println(count);
        test obj1 = new test();
        obj1.increment();
        System.out.println(count);
        test obj2 = new test();
        System.out.println(obj2.count); 
        test obj3 = new test();
        obj3.count = 55;
        System.out.println(obj3.count);
    }
    
}