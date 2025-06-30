public class SplitAndCountString {
    public static void splitAndCount(String str) {
        int chars = 0;
        int nums = 0;
        int specialSymbs = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                chars++;
            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                nums++;
            } else {
                specialSymbs++;
            }
        }

        System.out.println("Alphabets : " + chars);
        System.out.println("Numbers : " +  nums);
        System.out.println("Special Symbols : " + specialSymbs);

    }

    public static void main(String[] args) {
        String str = "Gaurav02$$";
        splitAndCount(str);
    }
}