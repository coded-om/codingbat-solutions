public class StringExample {
    
    public static void main(String[] args) {
        StringExample se = new StringExample();
        System.out.println(se.helloName("Mohammed"));
        System.out.println(se.helloName("Ali"));
        System.out.println(se.helloName(""));
    }
    
    public String helloName(String name) {
        return "Hello " + name + "!";
    }
}
