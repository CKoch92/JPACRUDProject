package com.skilldistillery.jpamenu.data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.jpamenu.entities.Winebottle;


@Service
@Transactional
public class MenuDAOJpaImpl implements MenuDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Winebottle findById(int id) {
		
		return em.find(Winebottle.class, id);
		
	}
	
	@Override
	public List<Winebottle> findByLabel(String label) {
		label = "%"+label+"%";
		String jpql = "SELECT wb FROM Winebottle wb WHERE wb.label_name LIKE :keyword";
		List<Winebottle> labelResults = em.createQuery(jpql, Winebottle.class).setParameter("keyword", label).getResultList();
		return labelResults;
	}
	
	@Override
	public List<Winebottle> findByVineyard(String vineyard) {
		vineyard = "%"+vineyard+"%";
		String jpql = "SELECT wb FROM Winebottle wb WHERE wb.vineyard LIKE :keyword";
		List<Winebottle> vineyardResults = em.createQuery(jpql, Winebottle.class).setParameter("keyword", vineyard).getResultList();
		return vineyardResults;
	}
	
	@Override
	public List<Winebottle> findByVarietal(String varietal) {
		varietal = "%"+varietal+"%";
		String jpql = "SELECT wb FROM Winebottle wb WHERE wb.varietal LIKE :keyword";
		List<Winebottle> varietalResults = em.createQuery(jpql, Winebottle.class).setParameter("keyword", varietal).getResultList();
		return varietalResults;
	}
	
	@Override
	public List<Winebottle> findByVintage(String vintage) {
		int userVintage = Integer.parseInt(vintage);
		String jpql = "SELECT wb FROM Winebottle wb WHERE wb.vintage = keyword";
		List<Winebottle> vintageResults = em.createQuery(jpql, Winebottle.class).setParameter("keyword", userVintage).getResultList();
		return vintageResults;
	}
	@Override
	public List<Winebottle> findByType(String type) {
		type = "%"+type+"%";
		String jpql = "SELECT wb FROM Winebottle wb WHERE wb.type LIKE :keyword";
		List<Winebottle> typeResults = em.createQuery(jpql, Winebottle.class).setParameter("keyword", type).getResultList();
		return typeResults;
	}
	
	@Override 
	public List<Winebottle> addWineBottle (Winebottle createdBottle){
//		em.getTransaction().begin();
		em.persist(createdBottle);
		em.flush();
//		em.getTransaction().commit();
		
		List<Winebottle> createdList = new ArrayList<Winebottle>();
		createdList.add(createdBottle);
		
		return createdList;
	}
	
	@Override
	public Winebottle deleteWineBottle (int id) {
		Winebottle wb = em.find(Winebottle.class, id);
		em.remove(wb);
		
		return wb;
	}
	
	@Override
	public Winebottle retrieveWineBottle (int id) {
		Winebottle wb = em.find(Winebottle.class, id);
		return wb;
	}
	
	public Winebottle updateWineBottle (int id, String labelName, String vineyard, String vintage, String varietal, String type, String country, String state, String region, String price) {
		int userVintage = Integer.parseInt(vintage);
		double userPrice = Double.parseDouble(price);
		Winebottle wb = em.find(Winebottle.class, id);
		wb.setLabelName(labelName);
		wb.setVineyard(vineyard);
		wb.setVintage(userVintage);
		wb.setVarietal(varietal);
		wb.setType(type);
		wb.setCountry(country);
		wb.setState(state);
		wb.setRegion(region);
		wb.setPrice(userPrice);
		return wb;
	}
	
	

}
