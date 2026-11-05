// Name: Ayush Kumar
// Roll No: 25103153
// ID: BCS2025535
// Assignment No: 04
// Task No: 01

class Main {
    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;
        return f;
    }

    static int nCr(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }

    public static void main(String[] args) {
        System.out.println("5C2 = " + nCr(5, 2));
    }
}
