package zad2;

import java.util.*;

class Hailstone implements Iterable<Integer> {
 
     int x;
     int y;
 
  
 
    public Hailstone(int x) {
        if (x <= 0) {
            throw new IllegalArgumentException();
        }
 
        this.x = x;
    }
    public int poczatkowa(int y) {
        return y=x;
    }
    public Iterator<Integer> iterator() {
        this.y = -1;
        return this.new HailstoneIterator();
    }
 
     class HailstoneIterator implements Iterator<Integer> {
 
        public boolean hasNext() {
            return Hailstone.this.y != 1;
        }
 
        public Integer next() {
            if (Hailstone.this.y == -1) {
                Hailstone.this.y = Hailstone.this.x;
            } else {
                if (Hailstone.this.y % 2 == 0) {
                    Hailstone.this.y /= 2;
                } else {
                    Hailstone.this.y *= 3;
                    Hailstone.this.y++;
                }
            }
            return Hailstone.this.y;
        }
    }
}