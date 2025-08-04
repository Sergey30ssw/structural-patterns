package builder;

public final class GamingPC {
    private final String cpu;
    private final String gpu;
    private final int ram;
    private final int ssd;
    private final boolean liquidCooling;
    private final boolean rgbLighting;

    private GamingPC(Builder builder) {
        this.cpu = builder.cpu;
        this.gpu = builder.gpu;
        this.ram = builder.ram;
        this.ssd = builder.ssd;
        this.liquidCooling = builder.liquidCooling;
        this.rgbLighting = builder.rgbLighting;
    }

    public static class Builder {
        private final String cpu;
        private final String gpu;
        private int ram = 16;
        private int ssd = 512;
        private boolean liquidCooling = false;
        private boolean rgbLighting = false;

        public Builder(String cpu, String gpu) {
            if (cpu == null || gpu == null) {
                throw new IllegalArgumentException("CPU and GPU are required");
            }
            this.cpu = cpu;
            this.gpu = gpu;
        }

        public Builder ram(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder ssd(int ssd) {
            this.ssd = ssd;
            return this;
        }

        public Builder liquidCooling(boolean liquidCooling) {
            this.liquidCooling = liquidCooling;
            return this;
        }

        public Builder rgbLighting(boolean rgbLighting) {
            this.rgbLighting = rgbLighting;
            return this;
        }

        public GamingPC build() {
            return new GamingPC(this);
        }
    }

    @Override
    public String toString() {
        return String.format(
                "GamingPC: CPU=%s, GPU=%s, RAM=%dGB, SSD=%dGB, LiquidCooling=%b, RGB=%b",
                cpu, gpu, ram, ssd, liquidCooling, rgbLighting
        );
    }
}