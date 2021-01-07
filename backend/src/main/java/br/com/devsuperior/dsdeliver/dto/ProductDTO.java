package br.com.devsuperior.dsdeliver.dto;

import java.io.Serializable;

import br.com.devsuperior.dsdeliver.entities.Product;

public class ProductDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private Double price;
	private String description;
	private String image_Uri;
	
	public ProductDTO() {
		
	}

	public ProductDTO(Long id, String name, Double price, String description, String image_Uri) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.image_Uri = image_Uri;
	}
	
	public ProductDTO(Product product) {
		id = product.getId();
		name = product.getName();
		price = product.getPrice();
		description = product.getDescription();
		image_Uri = product.getImgUrl();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage_Uri() {
		return image_Uri;
	}

	public void setImage_Uri(String image_Uri) {
		this.image_Uri = image_Uri;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDTO other = (ProductDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
