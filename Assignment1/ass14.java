 class ass14 {
    public static void main(String[] args) {
        int n = 10; 
        int a = 0, b = 1; 
        System.out.println("Fibonacci Series up to 10 terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + ", "); 
           
            int nextTerm = a + b;
            a = b; 
            b = nextTerm; 
        }
    }
}
