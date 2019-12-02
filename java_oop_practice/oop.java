public class oop{
    public static void main(String arsg[]){
        account a1 = new account("saumya");
        account a2 = new account("rahul");
        System.out.println(a1.name);
        System.out.println(a1.id);
        System.out.println(a2.name);
        System.out.println(a2.id);
        System.out.println(account.bank);
        

        int arr[] = new int[3];
        
    }

}
class account{
    int id;
    static String bank = "HDFC";
    int amount = 0;
    String name;
    static int nextid = 0;
    account(String name){
        id = nextid;
        nextid +=1;
        this.name = name;

    }
   
    
    
}
