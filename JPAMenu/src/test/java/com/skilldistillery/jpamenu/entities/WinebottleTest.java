package com.skilldistillery.jpamenu.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.skilldistillery.jpamenu.*;

class WinebottleTest {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Winebottle wine;
//	MenuDAO dao;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("Menu");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		wine = em.find(Winebottle.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		wine = null;
	}

	@Test
	void test_Wine_entity_mapping() {
		assertNotNull(wine);
		assertEquals("Les Pommiers", wine.getLabelName());
	}
	
//	@Test
//	void test_Return_wines_by_varietal() {
//		
//		List<Winebottle> bottles = dao.findByVarietal("cab");
//		assertNotNull(bottles);
//		assertEquals(2, bottles.size());
//	}

}
