
public class StringTimes {
    public static void main(String[] args){
        StringTimes st = new StringTimes();
        System.out.println(st.stringTimes("Hi", 3)); 
        System.out.println(st.stringTimes("Hi", 1)); 
        System.out.println(st.stringTimes("Hi", 0)); 
    }
    public String stringTimes(String str, int n) {
        String result = "";
        while (n > 0) {
            result = result + str;
            n = n - 1;
        }
        return result;
}
}
