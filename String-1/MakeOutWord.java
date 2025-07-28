public class MakeOutWord {
    
    public static void main(String[] args) {
        MakeOutWord mow = new MakeOutWord();
        System.out.println(mow.makeOutWord("<<>>", "Yay"));
        System.out.println(mow.makeOutWord("<<>>", "WooHoo"));
        System.out.println(mow.makeOutWord("[[]]", "word"));
    }
    
    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }
}
