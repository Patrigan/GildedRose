package com.gildedrose;

import com.gildedrose.itemspecification.ItemSpecification;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemSpecification itemSpecification = ItemSpecificationFactory.getItemSpecification(item);
            itemSpecification.update();
        }
    }
}