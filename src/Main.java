public class Main {
    public static void main(String[] args) {

        //Задание 1
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println(" ");

        for (int y = 10; y >= 1; y--) {
            System.out.print(y + " ");
        }

        System.out.println();

        //Задание 2
        for (int a = 5; a < 32; a = a + 7) {
            System.out.println("Сегодня пятница," + a + "-е число. Необходимо подготовить отчет");
        }

        //Задание 3
        for (int z = 0; z < 2123; z = z + 79) {
            if (z > 1821) {
                System.out.println(z);
            }
        }

    }
}
