public class Defanging_an_IP_Address {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String ans = defang(address);
        System.out.println(ans);

    }
    static String defang(String address) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < address.length() ; i++) {
            if (address.charAt(i) == '.') {
                builder.append("[.]");

            }else {
                builder.append(address.charAt(i));
            }
        }

        return builder.toString();

    }
}
