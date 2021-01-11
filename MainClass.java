public class MainClass{
    public static void main(String[] args) {
        InnerClass innerclass = new InnerClass();
        innerclass.setName("Saumya");
        System.out.println(innerclass.name);
    }

    private static class InnerClass{
        private String name;

        private void setName(String name) {
            this.name = name;
        }
    }
}