public class DelDel {
        public static void main(String[] args) {
        System.out.println(delDel("adelbckfndsiafjpeo")); 
    }

    public static String delDel(String str) {
        if (str.length() >= 4) {
            if (str.substring(1, 4).equals("del")) {
                return str.substring(0, 1) + str.substring(4);
            }
        }
        return str;
    }
}
