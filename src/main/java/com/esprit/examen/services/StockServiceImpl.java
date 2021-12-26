package com.esprit.examen.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.examen.entities.Stock;
import com.esprit.examen.repositories.StockRepository;

@Service
public class StockServiceImpl implements IStockService {

	@Autowired
	StockRepository stockRepository;

	@Override
	public List<Stock> addAllStock(List<? extends Stock> stocks) {
		// TODO Auto-generated method stub
		return (List<Stock>) stockRepository.saveAll(stocks);
	}

	/*toDo 9*/








}