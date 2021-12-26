package com.esprit.examen.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.esprit.examen.entities.Stock;
import com.esprit.examen.services.IStockService;
import io.swagger.annotations.Api;


@RestController
@Api(tags = "Gestion des stocks")
@RequestMapping("/stock")
public class StockRestController {

	@Autowired
	IStockService stockService;
		
	/*Lancer le job d'ajout des lignes stocks dans la base de données
	 * manuellement via le web service suivant : */
	@PostMapping("/add-stocks")
	public List<Stock> addALLStock(@RequestBody List<? extends Stock> stocks) {
		return stockService.addAllStock(stocks);
	}


}
