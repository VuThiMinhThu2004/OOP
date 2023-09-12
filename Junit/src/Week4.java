public class Week4 {
    public static int max2Int(int a, int b) {
        return Integer.max(a, b);
    }

    public static int minArray(int[] array) {
        int xmin = array[0];

        for (int i = 1; i < array.length; i++) {
            if (xmin > array[i]) {
                xmin = array[i];
            }
        }

        return xmin;
    }

    public static String calculateBMI(double weight, double height) {
        double BMI = weight / (height * height);
        BMI = (double) Math.round(BMI * 10) / 10;
        if (BMI < 18.5) {
            return "Thiếu cân";
        }
        else if (BMI <= 22.9) {
            return "Bình thường";
        }
        else if (BMI <= 24.9) {
            return "Thừa cân";
        }
        return "Béo phì";
    }
}