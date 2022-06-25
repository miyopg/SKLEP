package pl.sda.project.shop.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.sda.project.shop.extra.OilBrands;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Getter
@NoArgsConstructor
@ToString
public class Oil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected Enum<OilBrands> brand;
    protected String density;
    protected Integer capacity;
    protected BigDecimal price;
    protected Integer quantity;
    @ManyToOne
    private Customer customers;
    @OneToMany(mappedBy = "oils")
    protected Set<OrderHistory> ordersSet;


}
