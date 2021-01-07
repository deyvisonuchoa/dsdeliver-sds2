package br.com.devsuperior.dsdeliver.services;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.devsuperior.dsdeliver.dto.OrderDTO;
import br.com.devsuperior.dsdeliver.dto.ProductDTO;
import br.com.devsuperior.dsdeliver.entities.Order;
import br.com.devsuperior.dsdeliver.entities.OrderStatus;
import br.com.devsuperior.dsdeliver.entities.Product;
import br.com.devsuperior.dsdeliver.repositories.OrderRepository;
import br.com.devsuperior.dsdeliver.repositories.ProductRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repo;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll(){
		return repo.findOrdersWithProducts().stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	};
	
	@Transactional
	public OrderDTO insert(OrderDTO dto){
		Order order = new Order(null, dto.getAddress(), dto.getLatitude(), dto.getLongitude(), Instant.now(), OrderStatus.PENDING);
		for(ProductDTO p : dto.getProducts()) {
			 Product product = productRepository.getOne(p.getId());
			 order.getProducts().add(product);
		}
		order = repo.save(order);
		return new OrderDTO(order);
	};
	
	@Transactional
	public OrderDTO alterStatus(Long id){
		Order order = repo.getOne(id);
		order.setStatus(OrderStatus.DELIVERED);
		return new OrderDTO(order);
	};
}
