
public class Operations extends Variables {
    int x = 5;
    int y = 7;

    public static int addition (int x, int y){
        int sum =  x + y;
        return sum;
    }

    public static double exponent (int x, int counter){
        double result = 1.0;
        for (int i = 0; i < counter; i++){
            result = result * x;
        }
        return result;
    }

    private void hiddenOperation(){}
    protected void protectedOperation(){}
}
