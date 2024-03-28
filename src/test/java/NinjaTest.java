import org.junit.Assert;
import org.junit.Test;

public class NinjaTest {
    @Test
    public void deveRetornarNinjaComJutsuMaisForteSeOsDoisGastamOMesmoChakra(){
        Jutsu jutsuNinjaUm = new Jutsu(5, 10);
        Ninja ninjaUm = new Ninja("Naruto", jutsuNinjaUm);

        Jutsu jutsuNinjaDois = new Jutsu(5, 8);
        Ninja ninjaDois = new Ninja("Gaara", jutsuNinjaDois);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(ninjaUm, ninjaDois);

        Assert.assertSame(ninjaUm, ninjaVencedor);
    }

    @Test
    public void deveAtualizarOChakraDoOponenteDeAcordoComODanoDoJutsoQuandoAtacar() {
        Jutsu jutsuNinjaAtacante = new Jutsu(5, 10);
        Ninja ninjaAtacante = new Ninja("Naruto", jutsuNinjaAtacante);

        Jutsu jutsuNinjaOponente = new Jutsu(5, 8);
        Ninja ninjaOponente = new Ninja("Gaara", jutsuNinjaOponente);

        int nivelChakraEsperado = 90;

        ninjaAtacante.atacar(ninjaOponente);

        Assert.assertEquals(nivelChakraEsperado, ninjaOponente.getChakra());
    }

    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoONomeForItachi() {
        Jutsu jutsuNinjaUm = new Jutsu(1, 2);
        Ninja ninjaUm = new Ninja("Itachi", jutsuNinjaUm);

        Jutsu jutsuNinjaDois = new Jutsu(5, 10);
        Ninja ninjaDois = new Ninja("Naruto", jutsuNinjaDois);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(ninjaUm, ninjaDois);

        Assert.assertEquals(ninjaUm, ninjaVencedor);
    }

    @Test
    public void deveRetornarSegundoNinjaComoVencedorQuandoONomeForItachi() {
        Jutsu jutsuNinjaUm = new Jutsu(5, 10);
        Ninja ninjaUm = new Ninja("Naruto", jutsuNinjaUm);

        Jutsu jutsuNinjaDois = new Jutsu(1, 2);
        Ninja ninjaDois = new Ninja("Itachi", jutsuNinjaDois);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(ninjaUm, ninjaDois);

        Assert.assertEquals(ninjaDois, ninjaVencedor);
    }

    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoEmpatar() {
        Jutsu jutsuNinjaUm = new Jutsu(5, 10);
        Ninja ninjaUm = new Ninja("Naruto", jutsuNinjaUm);

        Jutsu jutsuNinjaDois = new Jutsu(5, 10);
        Ninja ninjaDois = new Ninja("Gaara", jutsuNinjaDois);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(ninjaUm, ninjaDois);

        Assert.assertEquals(ninjaUm, ninjaVencedor);
    }

}
