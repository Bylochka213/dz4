public class Main {
        public static void main(String[] args) {
        TreeSet<Integer> myTreeSet = new TreeSet<>();
        // Проверка на множество
        myTreeSet.put(100);
        try {
        myTreeSet.put(100);
        }catch (RuntimeException e){
        System.out.println("Вы поимали ошибку: " +e.getMessage());
        }
        //Проверка метода contains
        System.out.println("Проверка наличия эначения \"0\": " + myTreeSet.contains(100));
        System.out.println("Проверка наличия рандомного значения: " + myTreeSet.contains(44784));
        //Проверка метода удаления
        System.out.println("Проверка удаления Корня");
        myTreeSet.put(120);
        myTreeSet.put(40);
        System.out.println("До удаления корень равен: " + myTreeSet.getRoot());
        myTreeSet.remove(100); //удаление корня
        System.out.println("После удаления корень равен: " + myTreeSet.getRoot());
        System.out.println();
        System.out.println("Проверка удаления липестка");
        System.out.println("До удаления");
        myTreeSet.printTree();
        myTreeSet.remove(40);
        System.out.println("После удаления");
        myTreeSet.printTree();

        System.out.println("Проверка удаления деда ");
        TreeSet<Integer> integerMyTreeSet = new TreeSet<>();
        integerMyTreeSet.put(100);
        integerMyTreeSet.put(120);
        integerMyTreeSet.put(50);
        integerMyTreeSet.put(20);
        integerMyTreeSet.put(10);
        System.out.println("До удаления");
        integerMyTreeSet.printTree();
        integerMyTreeSet.remove(50);
        System.out.println("После удаления");
        integerMyTreeSet.printTree();

        }
        }