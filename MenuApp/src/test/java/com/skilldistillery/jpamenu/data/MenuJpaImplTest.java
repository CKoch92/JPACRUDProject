package com.skilldistillery.jpamenu.data;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.skilldistillery.jpamenu.entities.Winebottle;


@SpringBootTest
class MenuJpaImplTest {
	@Autowired
	MenuDAO dao;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	

		@Test
		void test_Return_wines_by_varietal() {
			
			List<Winebottle> bottles = dao.findByVarietal("cab");
			assertNotNull(bottles);
			assertEquals(2, bottles.size());
		}
	

}
