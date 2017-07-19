import static org.junit.Assert.*;

import org.junit.Test;

import model.Dado;
import model.Jogada;
import model.TipoJogada;

public class GeneralTest {

	@Test
	public void testJogadaGeneral() {	
		Jogada jogada = new Jogada();
		Dado[] dados = new Dado[5];
		dados[0] = new Dado();
		dados[1] = new Dado();
		dados[2] = new Dado();
		dados[3] = new Dado();
		dados[4] = new Dado();
		
		dados[0].setValor(5);
		dados[1].setValor(5);
		dados[2].setValor(5);
		dados[3].setValor(5);
		dados[4].setValor(5);
		
		TipoJogada tipoJogada = TipoJogada.GENERAL;
	    
		jogada.setTipoJogada(tipoJogada);
		jogada.calcularPontuacao(dados);
		
		assertEquals(50, jogada.getPontos());
	}
	
	@Test
	public void testJogadaAleatoria() {
		Jogada jogada = new Jogada();
		Dado[] dados = new Dado[5];
		dados[0] = new Dado();
		dados[1] = new Dado();
		dados[2] = new Dado();
		dados[3] = new Dado();
		dados[4] = new Dado();
		
		dados[0].setValor(1);
		dados[1].setValor(2);
		dados[2].setValor(3);
		dados[3].setValor(4);
		dados[4].setValor(5);
		
		TipoJogada tipoJogada = TipoJogada.ALEATORIA;
	    
		jogada.setTipoJogada(tipoJogada);
		jogada.calcularPontuacao(dados);
		
		assertEquals(15, jogada.getPontos());
	}
	
	@Test
	public void testJogadaTrincaComTres() {
		Jogada jogada = new Jogada();
		Dado[] dados = new Dado[5];
		dados[0] = new Dado();
		dados[1] = new Dado();
		dados[2] = new Dado();
		dados[3] = new Dado();
		dados[4] = new Dado();
		
		dados[0].setValor(2);
		dados[1].setValor(2);
		dados[2].setValor(2);
		dados[3].setValor(1);
		dados[4].setValor(3);
		
		TipoJogada tipoJogada = TipoJogada.TRINCA;
	    
		jogada.setTipoJogada(tipoJogada);
		jogada.calcularPontuacao(dados);
		
		assertEquals(10, jogada.getPontos());
	}
	
	@Test
	public void testJogadaTrincaSemTres() {
		Jogada jogada = new Jogada();
		Dado[] dados = new Dado[5];
		dados[0] = new Dado();
		dados[1] = new Dado();
		dados[2] = new Dado();
		dados[3] = new Dado();
		dados[4] = new Dado();
		
		dados[0].setValor(2);
		dados[1].setValor(1);
		dados[2].setValor(2);
		dados[3].setValor(1);
		dados[4].setValor(3);
		
		TipoJogada tipoJogada = TipoJogada.TRINCA;
	    
		jogada.setTipoJogada(tipoJogada);
		jogada.calcularPontuacao(dados);
		
		assertEquals(0, jogada.getPontos());
	}
	
	@Test
	public void testJogadaQuadraComQuatro() {
		Jogada jogada = new Jogada();
		Dado[] dados = new Dado[5];
		dados[0] = new Dado();
		dados[1] = new Dado();
		dados[2] = new Dado();
		dados[3] = new Dado();
		dados[4] = new Dado();
		
		dados[0].setValor(2);
		dados[1].setValor(2);
		dados[2].setValor(2);
		dados[3].setValor(2);
		dados[4].setValor(3);
		
		TipoJogada tipoJogada = TipoJogada.QUADRA;
	    
		jogada.setTipoJogada(tipoJogada);
		jogada.calcularPontuacao(dados);
		
		assertEquals(11, jogada.getPontos());
	}
	
	@Test
	public void testJogadaQuadraSemQuatro() {
		Jogada jogada = new Jogada();
		Dado[] dados = new Dado[5];
		dados[0] = new Dado();
		dados[1] = new Dado();
		dados[2] = new Dado();
		dados[3] = new Dado();
		dados[4] = new Dado();
		
		dados[0].setValor(2);
		dados[1].setValor(2);
		dados[2].setValor(2);
		dados[3].setValor(1);
		dados[4].setValor(3);
		
		TipoJogada tipoJogada = TipoJogada.QUADRA;
	    
		jogada.setTipoJogada(tipoJogada);
		jogada.calcularPontuacao(dados);
		
		assertEquals(0, jogada.getPontos());
	}
	
	
	@Test
	public void testJogadaDe1() {
		Jogada jogada = new Jogada();
		Dado[] dados = new Dado[5];
		dados[0] = new Dado();
		dados[1] = new Dado();
		dados[2] = new Dado();
		dados[3] = new Dado();
		dados[4] = new Dado();
		
		dados[0].setValor(1);
		dados[1].setValor(1);
		dados[2].setValor(1);
		dados[3].setValor(5);
		dados[4].setValor(5);
		
		TipoJogada tipoJogada = TipoJogada.JOGADADE1;
	    
		jogada.setTipoJogada(tipoJogada);
		jogada.calcularPontuacao(dados);
		
		assertEquals(3, jogada.getPontos());
	}
        @Test
	public void testJogadaDe2() {
		Jogada jogada = new Jogada();
		Dado[] dados = new Dado[5];
		dados[0] = new Dado();
		dados[1] = new Dado();
		dados[2] = new Dado();
		dados[3] = new Dado();
		dados[4] = new Dado();
		
		dados[0].setValor(2);
		dados[1].setValor(2);
		dados[2].setValor(2);
		dados[3].setValor(5);
		dados[4].setValor(5);
		
		TipoJogada tipoJogada = TipoJogada.JOGADADE2;
	    
		jogada.setTipoJogada(tipoJogada);
		jogada.calcularPontuacao(dados);
		
		assertEquals(6, jogada.getPontos());
	}
        @Test
	public void testJogadaDe3() {
		Jogada jogada = new Jogada();
		Dado[] dados = new Dado[5];
		dados[0] = new Dado();
		dados[1] = new Dado();
		dados[2] = new Dado();
		dados[3] = new Dado();
		dados[4] = new Dado();
		
		dados[0].setValor(3);
		dados[1].setValor(3);
		dados[2].setValor(3);
		dados[3].setValor(5);
		dados[4].setValor(5);
		
		TipoJogada tipoJogada = TipoJogada.JOGADADE3;
	    
		jogada.setTipoJogada(tipoJogada);
		jogada.calcularPontuacao(dados);
		
		assertEquals(9, jogada.getPontos());
	}
        @Test
	public void testJogadaDe4() {
		Jogada jogada = new Jogada();
		Dado[] dados = new Dado[5];
		dados[0] = new Dado();
		dados[1] = new Dado();
		dados[2] = new Dado();
		dados[3] = new Dado();
		dados[4] = new Dado();
		
		dados[0].setValor(4);
		dados[1].setValor(4);
		dados[2].setValor(4);
		dados[3].setValor(5);
		dados[4].setValor(5);
		
		TipoJogada tipoJogada = TipoJogada.JOGADADE4;
	    
		jogada.setTipoJogada(tipoJogada);
		jogada.calcularPontuacao(dados);
		
		assertEquals(12, jogada.getPontos());
	}
	
	


}
