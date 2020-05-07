public class Chisel extends HandTool{
    Chisel(float weight, float value, boolean sharp) {
        super();
    }

    @Override
    void useTool(int N, float price, int i, float count, String Y) {
        super.useTool(N, price, i, (float) 0.02, "Scrap");
    }
}

