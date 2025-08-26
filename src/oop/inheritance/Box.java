package oop.inheritance;

public class Box {
    int l,h,w;

    Box(int l, int h, int w) {
        this.l = l;
        this.h = h;
        this.w = w;

    }
    Box() {
        this.l=0;
        this.h=0;
        this.w=0;
    }

    Box(Box old){
        this.l=old.l;
        this.h=old.h;
        this.w=old.w;

    }
}
