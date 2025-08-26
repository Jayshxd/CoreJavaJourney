package oop.inheritance;

public class BoxWeight extends Box {
    int weight;
    BoxWeight(int weight) {
        this.weight = weight;
    }
    BoxWeight() {
        this.weight = 0;
    }
    BoxWeight(BoxWeight other) {
        super(other);
        this.weight = other.weight;
    }
    BoxWeight(int l, int h, int w, int weight) {
        super(l,h,w);
        this.weight=weight;
    }



}
