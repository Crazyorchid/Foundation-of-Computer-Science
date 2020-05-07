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

     void useTool(int n) {



        }
    }
