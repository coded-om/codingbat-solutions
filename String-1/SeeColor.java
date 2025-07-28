public class SeeColor {
    
    public static void main(String[] args) {
        SeeColor sc = new SeeColor();
        System.out.println(sc.seeColor("redxx"));
        System.out.println(sc.seeColor("xxred"));
        System.out.println(sc.seeColor("blueTimes"));
        System.out.println(sc.seeColor("yellowcard"));
        System.out.println(sc.seeColor("re"));
    }
    
    public String seeColor(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("red")) {
            return "red";
        }
        if (str.length() >= 4 && str.substring(0, 4).equals("blue")) {
            return "blue";
        }
        return "";
    }
}
