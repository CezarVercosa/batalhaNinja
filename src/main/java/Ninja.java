public class Ninja {

    private String nome;
    private int chakra;
    private Jutsu jutsu;

    public Ninja(String nome, Jutsu jutsu) {
        this.setNome(nome);
        this.setChakra(100);
        this.setJutsu(jutsu);
    }

    public void atacar(Ninja ninjaOponente) {
        ninjaOponente.receberGolpe(this.jutsu.getDano());
        this.setChakra(chakra - this.jutsu.getChakra());
    }

    public void receberGolpe(int dano) {
        this.setChakra(this.chakra - dano);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getChakra() {
        return chakra;
    }

    public void setChakra(int chakra) {
        this.chakra = chakra;
    }

    public Jutsu getJutsu() {
        return jutsu;
    }

    public void setJutsu(Jutsu jutsu) {
        this.jutsu = jutsu;
    }
}
