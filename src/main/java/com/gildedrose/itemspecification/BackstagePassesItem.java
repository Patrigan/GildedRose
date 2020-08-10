package com.gildedrose.itemspecification;

import com.gildedrose.Item;

public class BackstagePassesItem extends DefaultItem{

    public BackstagePassesItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        if(item.sellIn > 10){
            item.quality = item.quality +1;
        }else if(item.sellIn > 5){
            item.quality = item.quality +2;
        }else if(item.sellIn >= 0){
            item.quality = item.quality +3;
        }else{
            item.quality = 0;
        }
    }
}
