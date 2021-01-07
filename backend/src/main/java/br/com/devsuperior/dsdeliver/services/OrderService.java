package br.com.devsuperior.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.devsuperior.dsdeliver.dto.OrderDTO;
import br.com.devsuperior.dsdeliver.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repo;
	
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll(){
		return repo.findAll().stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	};
}
