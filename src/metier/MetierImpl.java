package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
	
	//couplage Faible
	private IDao dao;

	@Override
	public double caclul() {
		double data = dao.getData();
		double res = data * 223 * Math.cos(data);
		return res;
	}

	// Pour Injecter dans la variablke dao un objet d'une classe qui implémente l'interface IDao
	public void setDao(IDao dao) {
		this.dao = dao;
	}

	public MetierImpl(IDao dao) {
		super();
		this.dao = dao;
	}

	public MetierImpl() {
		super();
	}

}
