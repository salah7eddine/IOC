package dao;

public class DaoImpl implements IDao {

	@Override
	public double getData() {
		/***
		 * Se connecter à la BD pour récupérer la donnée
		 * 
		 */
		System.out.println("Version base de données ....");
		double temp = Math.random() * 40;
		return temp;
	}
	
	
	

	/*
	 * private DaoImpl() {
	 * 
	 * }
	 * 
	 * public static DaoImpl getInstance() {
	 * 
	 * // do some change return new DaoImpl(); }
	 */




	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateClient(String name) {
		// TODO Auto-generated method stub
		
	}

}
