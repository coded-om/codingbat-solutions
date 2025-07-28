public class StringExample {
    
    public static void main(String[] args) {
        StringExample se = new StringExample();
        System.out.println(se.example("Mohammed"));
        System.out.println(se.example("Ali"));
        System.out.println(se.example(""));
    }
    
    public String example(String name) {
        return "xyz" + name;
    }
}
