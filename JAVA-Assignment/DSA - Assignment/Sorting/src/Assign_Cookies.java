import java.lang.reflect.Array;
import java.util.Arrays;

public class Assign_Cookies {

    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        int ans = findContentChildren(g,s);
        System.out.println(ans);

    }
    static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int children = 0;
        int cookies = 0;

        while (children < g.length && cookies < s.length) {
            if (s[cookies] >= g[children]) {
                children++;
            }
            cookies++;
        }
        return children;

    }
}
