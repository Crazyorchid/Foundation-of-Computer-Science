public class PowerDrill extends PowerTool{
    PowerDrill(float weight, float value, int Power) {
        super(weight, value, 800);
    }

    @Override
    void useTool(int N, float price, int i, float count, String Y) {
        super.useTool(N, price, i, (float) 0.03, "Zssh");
    }
}
