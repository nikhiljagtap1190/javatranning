class Para {
    static void printnumber(int n) {
        int i;
        for (i = 1; i <= n; i++) {
            System.out.printf("%d*%d=%d", i, i, i * i);
            System.out.println();
        }
    }

    static void printnumber() {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.printf("5*%d=%d", i, 5 * i).println();
        }
    }
}
    class Methods {
    public static void main(String[] args) {
        Para p=new Para();
        p.printnumber();
        System.out.println("overloading=");
        p.printnumber(10);

        
    }
}