package interfaceConceito;

public class Televisao implements DispositivoEletronico{
	
	@Override
	public void ligar() {
		System.out.println("Televisão ligada");
	}

	@Override
	public void desligar() {
		System.out.println("Televisão desligada");
	}
}
