import java.util.Arrays;

public class Tablero {
	
	private char[][] tablero;
	
	public Tablero(int tamaño, char caracter) {
		this.tablero=new char[tamaño][tamaño];
		rellena(caracter);
	}
	public String toString() {
		String res="";
		for(int i=0; i<tablero.length;i++) {
			for(int j=0;j<tablero[i].length;j++) {
				res+=tablero[i][j]+" ";
			}
			res+="\n";
		}
		return res;
	}
	
	public void rellena(char caracter) {
		for(int i=0; i<tablero.length;i++) {
			for(int j=0;j<tablero[i].length;j++) {
				tablero[i][j]=caracter;
			}
		}
	}
	
	public char getcasilla (int ancho,int alto) {
		return tablero[ancho][alto];
	}
	/*public void setCasilla (int ancho, int alto, char cambio) {
		//tablero[ancho][alto];
	}*/
	syso
	
	
	
	
	

}
