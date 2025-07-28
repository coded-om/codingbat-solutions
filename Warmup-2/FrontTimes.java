public class FrontTimes {
    public static void main(String[] args) {
        FrontTimes ft = new FrontTimes();
        System.out.println(ft.frontTimes("Chocolate", 2));
        System.out.println(ft.frontTimes("Chocolate", 3));
        System.out.println(ft.frontTimes("A", 4));
        System.out.println(ft.frontTimes("", 4));
    }


public String frontTimes(String str, int n) {
    String front;
    if (str.length() >= 3) {
        front = str.substring(0, 3);
        } else {
    front = str;
}

String result = "";
    while (n > 0) {
    result = result + front;
    n--;
}

return result;
}

    
}
