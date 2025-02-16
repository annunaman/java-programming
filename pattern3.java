public class pattern3 {
    public static void main(String[] args) {
        int n = 4; 
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) { 
                int num = i + 1;
                for (int j = 0; j < n - i; j++) {
                    System.out.print(num++ + " ");
                }
            } else { 
                int num = n;
                for (int j = 0; j < n - i; j++) {
                    System.out.print(num-- + " ");
                }
            }
            System.out.println(); 
        }
    }
}

    
