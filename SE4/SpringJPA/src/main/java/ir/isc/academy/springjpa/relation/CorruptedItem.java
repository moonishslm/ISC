package ir.isc.academy.springjpa.relation;

import jakarta.persistence.*;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table( name = "CorruptedItem")

public class CorruptedItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "item_id")
    private Item item;

    private String reason;
    private String name;

}
