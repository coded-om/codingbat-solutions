public class StringExample {
    
    public static void main(String[] args) {
        StringExample se = new StringExample();
        System.out.println(se.example("Bob"));
        System.out.println(se.example("Alice"));
        System.out.println(se.example("John"));
        System.out.println(se.example(""));
    }
    
    public String example(String name) {
        return "xyz" + name;
    }
}
