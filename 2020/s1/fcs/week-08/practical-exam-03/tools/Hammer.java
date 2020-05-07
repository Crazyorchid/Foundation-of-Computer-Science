public class Hammer extends HandTool {
    Hammer(float weight, float value, boolean sharp) {
        super(weight, value);

    }

    @Override
    void useTool(int n, float price, int N, float v, String Y) {
        super.useTool(n, price, N, v, Y);
    }

    void useTool(int N, float price, int i, String Y) {
        Y = "Bang!";
        if (price > 0) {
            for (i = 0; i < N; i++) {
                price = (float) (value - i * 0.01);

            }
        } else {
            System.out.println(Y);


        }
    }
}

