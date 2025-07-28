public class LastTwo {
    
    public static void main(String[] args) {
        LastTwo lt = new LastTwo();
        System.out.println(lt.lastTwo("coding"));
        System.out.println(lt.lastTwo("cat"));
        System.out.println(lt.lastTwo("ab"));
        System.out.println(lt.lastTwo("a"));
        System.out.println(lt.lastTwo(""));
    }
    
    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        String front = str.substring(0, str.length() - 2);
        String lastTwo = str.substring(str.length() - 2);
        return front + lastTwo.charAt(1) + lastTwo.charAt(0);
    }
}
