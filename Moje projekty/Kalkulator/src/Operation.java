public class Operation {
    public static double nwd (double a, double b){
        while (a != b){
            if (a>b) a-=b;
            else b-=a;
        }
        return a;
    }

    public static double nww (double a, double b){
        double iloczyn = a*b;
        return iloczyn/nwd(a, b);
    }
}
