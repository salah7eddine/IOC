package pres;

import dao.DaoImpl;
import dao.IDao;
import metier.MetierImpl;

public class PresentationOne {
	
	 public static void main(String[] args) {
		 /***
		  * injection des dépendance par 
		  * Instanciation static => new
		  * en utilisant un setter ou via le constructeur
		  */
		 
		 IDao dao = new DaoImpl();
		 MetierImpl metier = new MetierImpl(dao);
		 //metier.setDao(dao);
		 System.out.println("" + metier.caclul());
		 
	 }
}
