class Numbers{
    public int add(final int a, final int b) {
        return a + b;
    }

    public int add(final int a, final int b, final int c) {
        return a + b + c;
    }

    public double add(final double a, final double b) {
        return a + b;
    }

    public static void main(final String[] args) {
        final Numbers n = new Numbers();
        double first, second ;
        first = 4.1 ;
        second = -2.6 ;
        System.out.println("Sum of 1 and 2 is: " + n.add(1, 2)) ;
        System.out.println("Sum of 1, 3 and 2 is: " + n.add(1, 2, 3)) ;
        System.out.println("Sum of 4.1 and -2.6 is: " + n.add(first, second)) ;
    }
}