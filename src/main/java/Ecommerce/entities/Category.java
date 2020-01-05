/*package Ecommerce.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Category implements Serializable {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String name;
    private String photo;
    private String description;
    @OneToMany(mappedBy = "category")
    private Collection<Product> products;
  
    public Category(Long id, String name, String photo, String description) {
	
    	this.id = id;
		this.name = name;
		this.photo = photo;
		this.description = description;
		
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

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Collection<Product> getProducts() {
		return products;
	}

	public void setProducts(Collection<Product> products) {
		this.products = products;
	}
	
    public Category() {
		super();
	}
	
	
}*/
package Ecommerce.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Table (name= "category")
public class Category implements Serializable {
	
    /*public Category(Object object, String name, Object object2, Object object3, Object object4) {
		this.name=name;// TODO Auto-generated constructor stub
	}*/
	
	
	
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String photo;
    
    public Category() {
		super();
	}
	
	public Category(String name) {
		super();
		this.name = name;
	}



	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", photo=" + photo + ", description=" + description + "]";
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
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Collection<Product> getProducts() {
		return products;
	}
	public void setProducts(Collection<Product> products) {
		this.products = products;
	}
	private String description;
    @OneToMany(mappedBy = "category")
    private Collection<Product> products;
}