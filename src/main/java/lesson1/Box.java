package lesson1;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> arrayList;

    public void addFruit(T t){
        arrayList.add(t);
    }
    public Box() {
        this.arrayList = new ArrayList<>();
    }

    public ArrayList<T> getArrayList() {
        return arrayList;
    }

    public void setToZeroArrayList() {
        this.arrayList.clear();
    }

    public void addFromAnotherBox(Box box){
        for (Object e: box.getArrayList()) {
            arrayList.add((T) e);
        }
        box.setToZeroArrayList();
    }

    public boolean compare(Box box){
        if (box.getWeight() == this.arrayList.size()) {
            return true;
        }
        return false;
    }

    public int getWeight() {
        return this.arrayList.size();
    }

}
