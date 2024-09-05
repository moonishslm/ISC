package ir.isc.academy.springjpa.relation;

import jakarta.persistence.*;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name = "Item")

public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private double price;
    private String catalog;

    @OneToOne(mappedBy = "item", cascade = CascadeType.ALL)
    private CorruptedItem corruptedItem;


}
