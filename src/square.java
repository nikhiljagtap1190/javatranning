class Square {
    static void square(int n) {
        System.out.printf("square of upto %d is ", n).println();
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d*%d=%d", i, i, i * i).println();

        }
    }

    public static void main(String args[])
    {
        square(6);
    }
}