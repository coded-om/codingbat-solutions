public class GHappy {

    public boolean gHappy(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                boolean hasLeft = i > 0 && str.charAt(i - 1) == 'g';
                boolean hasRight = i < str.length() - 1 && str.charAt(i + 1) == 'g';
                
                if (!hasLeft && !hasRight) {
                    return false; // unhappy 'g'
                }
            }
        }
        return true; // all 'g's are happy
    }

    public static void main(String[] args) {
        GHappy obj = new GHappy();

        System.out.println(obj.gHappy("xxggxx"));     // true
        System.out.println(obj.gHappy("xxgxx"));      // false
        System.out.println(obj.gHappy("xxggyygxx"));  // false
        System.out.println(obj.gHappy("gg"));         // true
        System.out.println(obj.gHappy("g"));          // false
    }
}

