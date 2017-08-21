public class S70 {
    public int climbStairs(int n) {
        if(n<=2) return n;
        int g = 1;
        int f =0;
        while(0<n--){
            g = g + f;
            f = g - f;
        }
        return g;
    }
}
