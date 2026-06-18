 
public class Pascal1 {
    public static void main(String args[]) {
        int n = 6;
        int prev[] = new int[0];
        
        for (int i = 0; i < n; i++) {
            int curr[] = new int[i + 1];
            
            curr[0] = 1;
            if (i > 0) {
                curr[i] = 1;
            }
            
            for (int j = 1; j < i; j++) {
                curr[j] = prev[j - 1] + prev[j];
            }
            
            // Leading spaces for centering
            for (int k = 1; k <= n - i - 1; k++) {
                System.out.print("  ");
            }
            
            // Print numbers
            for (int num : curr) {
                System.out.printf("%4d", num);
            }
            
            System.out.println();
            
            prev = curr;
        }
    }
}