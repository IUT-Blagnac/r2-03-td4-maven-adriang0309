
public class Main {
    //Main du code
	public static void main(String argv[]) {
        Pile maPile = new Pile(10);
        if (!maPile.est_vide()) System.out.println("NOK");

        maPile.empiler(5);
        if (maPile.est_vide()) System.out.println("NOK");

        int element = 0;
		try {
			element = maPile.depiler();
		} catch (Exception e) {
			
		}
        if (!maPile.est_vide()) System.out.println("NOK");
        if (element != 5) System.out.println("NOK");
    System.out.println("Bonjour"); //Changé pour le TP4 de Qualite
    }

}
