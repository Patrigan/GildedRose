package com.gildedrose;

import com.gildedrose.itemspecification.*;

public class ItemSpecificationFactory {

    public static ItemSpecification getItemSpecification(Item item){
        switch(item.name){
            case "Sulfuras, Hand of Ragnaros": return new LegendaryItem(item);
            case "Aged Brie": return new AgingItem(item);
            case "Backstage passes to a TAFKAL80ETC concert": return new BackstagePassesItem(item);
            case "Conjured": return new ConjuredItem(item);
            default: return new DefaultItem(item);
        }
    }
}
