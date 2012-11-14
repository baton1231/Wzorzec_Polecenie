
public class Main {
	public static void main(String[]args){
		Trener trener = new Trener();
		Zawodnik z1 = new Zawodnik("Mo¿e");
		Zawodnik z2 = new Zawodnik("dostanê");
		Zawodnik z3 = new Zawodnik("trójkê.");

		Bieganie bieganie = new Bieganie(z1);
		Plywanie plywanie = new Plywanie(z3);

		trener.setMode(bieganie);
		trener.rozkaz();
		trener.setMode(plywanie);
		trener.rozkaz();
		trener.cofnij();

		System.out.println();

		Polecenie []tab = { new Cwiczenie(z2), new Bieganie(z2), new Plywanie(z2)};
		PelnyTrening pelnyTrening = new PelnyTrening(tab);
		trener.setMode(pelnyTrening);
		trener.rozkaz();
	}
}