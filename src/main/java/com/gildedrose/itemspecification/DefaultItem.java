package com.gildedrose.itemspecification;

import com.gildedrose.Item;

public class DefaultItem implements ItemSpecification {

    private static int MAXQUALITY = 50;
    private static int MINQUALITY = 0;

    protected Item item;

    public DefaultItem(Item item){
        this.item = item;
    }

    @Override
    public void update(){
        updateQuality();
        boundedQuality();
        updateSellIn();
    }

    protected void updateSellIn(){
        item.sellIn = item.sellIn -1;
    }

    protected void updateQuality(){
        if(item.sellIn>0){
            item.quality = item.quality -1;
        }else{
            item.quality = item.quality -2;
        }
    }

    protected void boundedQuality(){
        if(item.quality > getMaxQuality()){
            item.quality = getMaxQuality();
        }else if(item.quality < getMinQuality()){
            item.quality = getMinQuality();
        }
    }

    protected int getMaxQuality(){
        return MAXQUALITY;
    }

    protected int getMinQuality(){
        return MINQUALITY;
    }
}
