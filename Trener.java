
public class Trener {
	private Polecenie mode;
	public void setMode(Polecenie polecenie){
	mode = polecenie;
	}
	 
	public void rozkaz(){
	mode.wykonaj();
	}
	 
	public void cofnij(){
	mode.cofnij();
	}
}