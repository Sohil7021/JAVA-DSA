public class Goal_Parser_Interpretation {
    public static void main(String[] args) {
        String command = "G()(al)";
        String ans = interpret(command);
        System.out.println(ans);

    }
    static String interpret(String command) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < command.length() ; i++) {
            if (command.charAt(i) == 'G') {
                builder.append("G");
            } else if (command.charAt(i) == '(') {
                if (command.charAt(i+1) == ')') {
                    builder.append("o");
                    i+=1;
                }else {
                    builder.append("al");
                    i+=3;
                }

            }
        }
        return builder.toString();

    }
}
