package com.skilldistillery.jpamenu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.jpamenu.data.MenuDAO;
import com.skilldistillery.jpamenu.entities.Winebottle;

@Controller
public class WineBottleController {
	
	@Autowired
	private MenuDAO dao;
	
	@RequestMapping(path = {"/", "home.do"})
	public String index(Model model) {
		model.addAttribute("winebottle", dao.findById(1));//DEBUG
		return "index";
	}
	@RequestMapping(path = "goHome.do")
	public String goHome() {
		return "index";
	}
	
	@RequestMapping(path="searchByLabel.do")
	public String showWineByLabel(String label, Model model) {
		model.addAttribute("wineBottleList", dao.findByLabel(label));
		return "winebottle/displaybottle";
	}
	
	@RequestMapping(path="searchByVineyard.do")
	public String showWineByVineyard(String vineyard, Model model) {
		model.addAttribute("wineBottleList", dao.findByVineyard(vineyard));
		return "winebottle/displaybottle";
	}
	
	@RequestMapping(path="searchByVarietal.do")
	public String showWineByVarietal(String varietal, Model model) {
		model.addAttribute("wineBottleList", dao.findByVarietal(varietal));
		return "winebottle/displaybottle";
	}
	
	@RequestMapping(path="searchByVintage.do")
	public String showWineByVintage(String vintage, Model model) {
		model.addAttribute("wineBottleList", dao.findByVintage(vintage));
		return "winebottle/displaybottle";
	}
	
	@RequestMapping(path="searchByType.do")
	public String showWineByType(String type, Model model) {
		model.addAttribute("wineBottleList", dao.findByType(type));
		return "winebottle/displaybottle";
	}
	
	@RequestMapping(path = "createWineBottle.do", params = { "labelName", "vineyard", "vintage", "varietal", "type", "country", "state", "region", "price"})
	public String  addWineBottle(Model model, String labelName, String vineyard, String vintage, String varietal, String type, String country, String state, String region, String price) {
		int userVintage = Integer.parseInt(vintage);
		double userPrice = Double.parseDouble(price);
		Winebottle createdBottle = new Winebottle(labelName, vineyard, userVintage, varietal, type, country, state, region, userPrice);
		model.addAttribute("wineBottleList", dao.addWineBottle(createdBottle));
		return "winebottle/displaybottle";
	}
	
	@RequestMapping (path = "addBottlePage.do")
	public String addWine() {
		return "add";
	}
	
	@RequestMapping (path = "searchBottlePage.do")
	public String searchWine() {
		return "searchpage";
	}

	@RequestMapping (path = "deleteBottlePage.do")
	public String deleteWine() {
		return "delete";
	}

	@RequestMapping (path = "deleteWineBottle.do", params = "id")
	public String deleteBottle(Model model, String id) {
		int bottleId = Integer.parseInt(id);
		model.addAttribute("deletedBottle", dao.deleteWineBottle(bottleId));
		return "winebottle/deleteconfirm";
	}
	
	@RequestMapping (path = "updateBottlePage.do")
	public String editWine() {
		return "updateselection";
	}
	
	@RequestMapping (path = "updateWineBottle.do", params = "id")
	public String updateBottle (Model model, String id) {
		int bottleId = Integer.parseInt(id);
		model.addAttribute("bottle", dao.retrieveWineBottle(bottleId));
		return "update";
	}
	
	@RequestMapping (path = "updatedWineBottle.do", params = { "id", "labelName", "vineyard", "vintage", "varietal", "type", "country", "state", "region", "price"})
	public String bottleUpdated (Model model, int id, String labelName, String vineyard, String vintage, String varietal, String type, String country, String state, String region, String price) {
		Winebottle updatedBottle = dao.updateWineBottle(id, labelName, vineyard, vintage, varietal, type, country, state, region, price);
		model.addAttribute("bottle", updatedBottle);
		return "winebottle/updateconfirm";
	}
}
