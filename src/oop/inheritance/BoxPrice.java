package oop.inheritance;

public class BoxPrice extends BoxWeight {
    int price;
    BoxPrice(int l, int h, int w, int weight , int price) {
        super(l,h,w,weight);
        this.price=price;
    }
    BoxPrice(BoxPrice other) {
        super(other);
        this.price=other.price;

    }
    BoxPrice(){
        this.price=0;
    }

}
