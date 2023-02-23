
public class Pile {

	int[] pile;
	int sommet = -1;

	/**
	 * Constructeur par défaut.
	 * Construit une Pile
	 */
	Pile(int pfTaille){
		this.pile = new int[pfTaille];
	}

	/**
	 * Indique si la Pile est vide (true) ou pas.
	 * @return true si la Pile est vide
	 */
	public boolean est_vide() {
		if(this.sommet == -1)
		{
			return true;
		}
		return false;
	}

	/**
	 * Empile pfElement sur le haut de la Pile.
	 * @param pfElement
	 */
	public void empiler(int pfElement) {
		this.sommet++;
		this.pile[sommet] = pfElement;
	}

	/**
	 * Dépile le sommet de la Pile.
	 * @see 	Pile#estVide()
	 */
	public int depiler() throws Exception {
		if(this.est_vide()) {
			throw new Exception("La pile est vide");
		}
		this.sommet--;
		return this.pile[sommet + 1];
	}
	
	/**
	 * Permet d'obtenir la valeur contenu au sommet de la Pile.
	 * @return la valeur au sommet de la Pile
	 */
	public int sommet() {
		return this.pile[this.sommet];
	}
	
	/**
	 * Permet de vider la Pile
	 */
	public void vider(){
		this.sommet = -1;
	}

}
