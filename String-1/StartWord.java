public class StartWord {
    
    public static void main(String[] args) {
        StartWord sw = new StartWord();
        System.out.println(sw.startWord("hippo", "hi"));
        System.out.println(sw.startWord("hippo", "xip"));
        System.out.println(sw.startWord("hippo", "i"));
        System.out.println(sw.startWord("hippo", "hip"));
        System.out.println(sw.startWord("h", "ix"));
    }
    
    public String startWord(String str, String word) {
        if (str.length() < word.length()) {
            return "";
        }
        
        if (word.length() == 1) {
            return str.substring(0, 1);
        }
        
        String strPart = str.substring(1, word.length());
        String wordPart = word.substring(1);
        
        if (strPart.equals(wordPart)) {
            return str.substring(0, word.length());
        }
        
        return "";
    }
}
