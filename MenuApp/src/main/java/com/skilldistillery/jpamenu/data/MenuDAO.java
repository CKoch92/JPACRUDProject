package com.skilldistillery.jpamenu.data;

import java.util.List;

import com.skilldistillery.jpamenu.entities.Winebottle;

public interface MenuDAO {
	Winebottle findById(int id);
	List<Winebottle> findByLabel(String label);
	List<Winebottle> findByVineyard(String vineyard);
	List<Winebottle> findByVarietal(String varietal);
	List<Winebottle> findByVintage(String vintage);
	List<Winebottle> findByType(String type);
	List<Winebottle> addWineBottle(Winebottle createdBottle);
	Winebottle deleteWineBottle(int id);
	Winebottle retrieveWineBottle (int id);
	Winebottle updateWineBottle (int id, String labelName, String vineyard, String vintage, String varietal, String type, String country, String state, String region, String price);
}
