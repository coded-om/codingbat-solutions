public class EndOther {

    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        return a.endsWith(b) || b.endsWith(a);
    }

    public static void main(String[] args) {
        EndOther obj = new EndOther();

        System.out.println(obj.endOther("Hiabc", "abc"));      // → true
        System.out.println(obj.endOther("AbC", "HiaBc"));      // → true
        System.out.println(obj.endOther("abc", "abXabc"));     // → true
    }
}

