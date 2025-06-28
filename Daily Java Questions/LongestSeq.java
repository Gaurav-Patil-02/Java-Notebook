class LongestSeq{

    public static void longestSeq(String s){
        char firstChar = s.charAt(0);
        String ans = "";

        for(char ch : s.toCharArray()){
            if(firstChar > ch){
                firstChar = ch;
            }
        }
       while(s.contains(String.valueOf(firstChar))) {
         ans += String.valueOf(firstChar);
            firstChar++;
       }
        System.out.println(ans);
        
    }
    public static void main(String[] args) {
        String s = "ball";
        longestSeq(s);
    }
}