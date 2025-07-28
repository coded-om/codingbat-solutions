public class MakeAbba {
    
    public static void main(String[] args) {
        MakeAbba ma = new MakeAbba();
        System.out.println(ma.makeAbba("Hi", "Bye"));
        System.out.println(ma.makeAbba("Yo", "Alice"));
        System.out.println(ma.makeAbba("What", "Up"));
    }
    
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }
}
