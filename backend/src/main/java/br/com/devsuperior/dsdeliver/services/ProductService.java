package br.com.devsuperior.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.devsuperior.dsdeliver.dto.ProductDTO;
import br.com.devsuperior.dsdeliver.entities.Product;
import br.com.devsuperior.dsdeliver.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repo;
	
	@Transactional(readOnly = true)
	public List<ProductDTO> findAll(){
		return repo.findAllByOrderByNameAsc().stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	};
}
