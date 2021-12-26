package com.esprit.examen.services;

import java.util.List;
import com.esprit.examen.entities.Stock;

public interface IStockService {


	/* toDo 8 : 
	 * Interface de de la méthode d'ajout de plusieurs stocks à la fois */
	List<Stock> addAllStock(List<? extends Stock> stocks);

}
