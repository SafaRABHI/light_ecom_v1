package Ecommerce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import Ecommerce.dao.CategoryRepository;
import Ecommerce.dao.ProductRepository;
import Ecommerce.entities.Category;
import Ecommerce.entities.Product;

import java.util.Random;
import net.bytebuddy.utility.RandomString;

@SpringBootApplication
public class LightEcomV1Application implements CommandLineRunner {
	 @Autowired
	    private ProductRepository productRepository;
	 @Autowired
	    private CategoryRepository categoryRepository;
	 @Autowired
	    private RepositoryRestConfiguration repositoryRestConfiguration;
	
public static void main(String[] args) {
		SpringApplication.run(LightEcomV1Application.class, args);
	}
@Override
public void run(String... args) throws Exception {
	 repositoryRestConfiguration.exposeIdsFor(Product.class,Category.class);
   Category C1 = new Category("Computers");
	 categoryRepository.save(C1);
	 System.out.println(C1.getName());
	 
  categoryRepository.save(new Category("Printers"));
  categoryRepository.save(new Category("Smart phones"));
  Random rnd=new Random();
  categoryRepository.findAll().forEach(c->{
 	 for (int i = 0; i <10 ; i++) {
          Product p=new Product();
          p.setName(RandomString.make(18));
          p.setCurrentPrice(100+rnd.nextInt(10000));
          p.setAvailable(rnd.nextBoolean());
          p.setPromotion(rnd.nextBoolean());
          p.setSelected(rnd.nextBoolean());
          p.setCategory(c);
          p.setPhotoName("unknown.png");
          productRepository.save(p);
             
 	 }
 
      
  });
}
}