package dao;

public class DaoImpl implements IDao {

	@Override
	public double getData() {
		/***
		 * Se connecter � la BD pour r�cup�rer la donn�e
		 * 
		 */
		System.out.println("Version base de donn�es ....");
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
