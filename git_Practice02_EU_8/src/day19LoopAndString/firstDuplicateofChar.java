package day19LoopAndString;

public class firstDuplicateofChar {
    public static void main(String[] args) {
        String s = "qwertrewq";
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (c == ch) {
                    count++;
                }


                if ((count == 2) && res.contains("" + c)) {
                    res += "" + c;
                    break;


                }

            }
            System.out.println(res);

        }
    }
}
