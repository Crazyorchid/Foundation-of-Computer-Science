public abstract class Tool implements Asset {
    float weight;
    float value;

    Tool(float weight, float value) {
        this.weight = weight;
        this.value = value;

    }

    public float getValue() {

        return value;
    }

    public float getWeight() {

        return weight;
    }

    void useTool(int N, float price, int i, float count, String Y) {
        Y = "Bang";

        count = (float) 0.01;

        if (price > 0) {

            for (i = 0; i < N; i++) {
                price = (float) (value - i * count);

            }
        } else {
            System.out.println(Y);


        }
    }
}
