package ir.isc.academy.springjpa.relation;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class ItemBaseRun {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void sampleRun() {

        //save new records
        Item item1 = new Item();
        item1.setName("Valve Steam Deck");
        item1.setCatalog("Game");
        item1.setPrice(798.62);
        em.persist(item1);

        Item item2 = new Item();
        item2.setName("PS5");
        item2.setCatalog("Game");
        item2.setPrice(449.99);
        em.persist(item2);


        //selecting and find records
        List<Item> allItem = em.createQuery("from Item", Item.class).getResultList();
        allItem.stream().forEach(s -> System.out.println(s));

        //updating record
        allItem.get(1).setName("Xbox One");


        //delete specific record
//        em.remove(allItem.get(0));
//
//        // delete all records
//        for (Item item : allItem) {
//            em.remove(item);
//
//        }


    }
}
