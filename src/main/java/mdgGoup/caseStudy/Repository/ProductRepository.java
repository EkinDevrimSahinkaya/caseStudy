package mdgGoup.caseStudy.Repository;

import mdgGoup.caseStudy.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    public Product findById(int id);
}
