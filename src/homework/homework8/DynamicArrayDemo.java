package homework.homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(9);
        da.add(64);
        da.add(105);
        da.add(36);
        da.add(47);
        da.add(12);
        da.add(54);
        da.add(93);
        da.add(65);
        da.add(43);
        da.add(21);
        da.add(5);
        da.add(85);
        da.add(775);
        System.out.print("Array list: ");
        da.printArray();
        System.out.println();
        System.out.println("Array is empty: " + da.isEmpty());
        System.out.println("Get element by index: " + da.getByIndex(2));
        System.out.println("get index by element: " + da.getFirstIndexByValue(6));
        System.out.print("Add method: ");
        da.addValue(5, 450);
        da.printArray();


    }
}
