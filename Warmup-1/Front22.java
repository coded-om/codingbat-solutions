public class Front22 {
        public static void main(String[] args) {
        System.out.println(front22("kitten"));
        System.out.println(front22("Ha"));
        System.out.println(front22("H"));
    }
    public static String front22(String str) {
        int take = 2;
        if (take > str.length()) {
            take = str.length();
        }
        String front = str.substring(0, take);
        return front + str + front;
    }
    
}
