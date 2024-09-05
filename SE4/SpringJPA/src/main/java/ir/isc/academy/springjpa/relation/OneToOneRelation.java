package ir.isc.academy.springjpa.relation;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OneToOneRelation {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void sampleRun() {
        Item item = new Item();
        item.setName("Asus ROG Ally Console Z1");
        item.setCatalog("Game");
        item.setPrice(449.99);

        CorruptedItem corruptedItem = new CorruptedItem();
        corruptedItem.setReason("Screen Broken");
        corruptedItem.setName(item.getName());

        item.setCorruptedItem(corruptedItem);
        corruptedItem.setItem(item);
        em.persist(item);

        //selecting and find records
        List<CorruptedItem> allCorruptedItem = em.createQuery("from CorruptedItem ", CorruptedItem.class).getResultList();
        allCorruptedItem.stream().forEach(s -> System.out.println(s));

        //updating record
        allCorruptedItem.get(0).setReason("Broken Buttons");

//        // deleting the item object
//        em.remove(item);
    }


}
