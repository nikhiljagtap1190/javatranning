class Multiplication {
   static void mulTable(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d*%d=%d",n,i,n*i).println();
        }
    }
    public static void main(String[] args) {
     /*  int i;
        for(i=1;i<=10;i++)
        {
            System.out.printf("5*%d =%d",i,5*i).println();
        }

      */
        mulTable(7);
    }
}