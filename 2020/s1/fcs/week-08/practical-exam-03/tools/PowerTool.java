public abstract class PowerTool extends Tool{
    PowerTool(float weight, float value, int Power ) {
        super(weight, value);
    }
    int Power;

    public int getPower() {
        return Power;
    }



}
