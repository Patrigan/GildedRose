package com.gildedrose.itemspecification;

import com.gildedrose.Item;

public class ConjuredItem extends DefaultItem {

    public ConjuredItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        super.updateQuality();
        super.updateQuality();
    }
}
