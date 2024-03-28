public class Jutsu {

    private int chakra;
    private int dano;

    public Jutsu(int chakra, int dano) {
        if (chakra > 5) {
            this.setChakra(5);
        }
        if (dano > 10) {
            this.setDano(10);
        }
        this.setChakra(chakra);
        this.setDano(dano);
    }

    public int getChakra() {
        return chakra;
    }

    public void setChakra(int chakra) {
        this.chakra = chakra;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
}
