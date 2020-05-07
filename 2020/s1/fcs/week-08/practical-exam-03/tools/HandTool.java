public abstract class HandTool extends Tool{
    HandTool(float weight, float value) {
        super(weight, value);
    }

    boolean sharp;

    public boolean isSharp() {
        return sharp;
    }


    void useTool(int N, float price, int i, float count, String Y) {
        Y = "Bang";

        count = (float) 0.01;

        if (price > 0) {

            for (i = 0; i < N; i++) {
                price = (float) (value - i * count);

            }
        }else {
            System.out.println(Y);

        }
    }
}
