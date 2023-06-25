public class Test {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(5);
        set.add(3);
        set.add(8);
        set.add(1);

        System.out.println("Set: " + set);
        System.out.println("Size: " + set.size());
        System.out.println("Contains 3? " + set.contains(3));
        System.out.println("Contains 6? " + set.contains(6));

        set.remove(8);

        System.out.println("Set after removal: " + set);
        System.out.println("Size: " + set.size());
    }
}
