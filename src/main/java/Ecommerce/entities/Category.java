package Ecommerce.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Category implements Serializable {
    public Category(Object object, String string, Object object2, Object object3, Object object4) {
		// TODO Auto-generated constructor stub
	}
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String photo;
    public Category() {
		super();
	}
	
	private String description;
    @OneToMany(mappedBy = "category")
    private Collection<Product> products;
}