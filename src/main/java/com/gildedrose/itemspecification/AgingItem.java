package com.gildedrose.itemspecification;

import com.gildedrose.Item;

public class AgingItem extends DefaultItem {

    public AgingItem(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality() {
        item.quality = item.quality +1;
    }
}
