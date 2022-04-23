package ext;

import dao.IDao;

public class DaoImplV2 implements IDao{

	@Override
	public double getData() {
		System.out.println("Version capteaurs");
		double data = 77;
		return data;
	}

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
