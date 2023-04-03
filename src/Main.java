public class Main {
    public static void main(String[] args) {

        CustomList<String> list = new CustomList<>();

        list.addLast("def");
        System.out.println(list.removeFirst());
        list.addLast("zxc");
        System.out.println(list.getFirst());



    }
}