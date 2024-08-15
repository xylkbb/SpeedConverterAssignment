public class Assignment {
    public static void main(String[] args) {
        System.out.println(toMPH(1.5));
        System.out.println(toMPH(10.25));
        System.out.println(toMPH(-5.6));
        System.out.println(toMPH(25.42));
        System.out.println(toMPH(75.114));

    }

    public static long toMPH(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            double mph = kilometersPerHour / 1.609;
            return Math.round(mph);
        }
    }

}
