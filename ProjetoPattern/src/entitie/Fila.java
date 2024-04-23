

/*1)	Singleton.
2)	Lidar com erros comuns em códigos.
3)	Inicialização “tardia”, utilizando o objeto apenas na primeira vez que for necessário
*/

package entitie;

public class Fila {
	
	private static Fila Instance; 
	

	public static Fila getInstance() {
		if (Instance == null) {
			Instance = new Fila();
		}
		return Instance;
	}
	
	public void ImprimeDocumentos() {
		System.out.println();
	}
	
	public void RemoveDocumento() {	
	}
	
	public void RemoveTodosDocumentos() {
	}
	
	private Fila() {
	}

}


