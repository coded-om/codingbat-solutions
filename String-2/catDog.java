public class CatDog {

    public boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 3);
            if (sub.equals("cat")) {
                catCount++;
            } else if (sub.equals("dog")) {
                dogCount++;
            }
        }

        return catCount == dogCount;
    }

    public static void main(String[] args) {
        CatDog obj = new CatDog();

        System.out.println(obj.catDog("catdog"));         // → true
        System.out.println(obj.catDog("catcat"));         // → false
        System.out.println(obj.catDog("1cat1cadodog"));   // → true
    }
}

