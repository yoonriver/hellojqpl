package jpql;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Order {

    @Id @GeneratedValue
    private Long id;
    private int orderAmount;
    @Embedded
    private Address address;
}
