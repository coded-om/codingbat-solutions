
public class GetSandwich {

    public String getSandwich(String str) {
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");

        if (first == -1 || last == -1 || first == last) {
            return "";
        }

        return str.substring(first + 5, last);
    }

    public static void main(String[] args) {
        GetSandwich obj = new GetSandwich();

        System.out.println(obj.getSandwich("breadjambread"));     // → "jam"
        System.out.println(obj.getSandwich("xxbreadjambreadyy")); // → "jam"
        System.out.println(obj.getSandwich("xxbreadyy"));         // → ""
        System.out.println(obj.getSandwich("breadbread"));        // → ""
        System.out.println(obj.getSandwich("breadbreadbread"));   // → "bread"
    }
}

