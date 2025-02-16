public class pattern4 {
    public static void main(String[] args) {
                int n = 4; 
        
                for (int i = 0; i < n; i++) {
                    for (int j = i; j < i + n; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
            }
        }