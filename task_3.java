
import java.util.LinkedList;
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        /*
         * Реализовать консольное приложение, которое:
1. Принимает от пользователя строку вида
text~num. kamila~0. vasya~1.
2. Нужно рассплитить строку по ~, сохранить text в связный список на
позицию num. Использовать метод Split
3. Если введено print~num, выводит строку из позиции num в связном
списке и удаляет её из списка.
print~1 -> vasya. Удаление прошло успешно
         */
        LinkedList<String> list = new LinkedList<>();
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println(list.toString());
            System.out.println("Введите команду: ");
            String comand = input.nextLine();
            String[] parts = comand.split("~");
            if(parts.length !=2){
                System.out.println("Неправильная команда: ");
                continue;
            }
            //System.out.println(Arrays.toString(parts));
            String text = parts[0];
            int number = Integer.parseInt(parts[1]);
            if (text.equals("print")){
                if (number >= list.size()){
                    System.out.println("Вне размера листа: ");
                    continue;
                }
                String remove = list.remove(number);
                System.out.println("Удаление элемента: " + remove + " прошло успешно");}
            else {
                if (number > list.size()){
                    System.out.println("Вне размера листа: ");
                    continue;
                }
                list.add(number, text);
            }
            

        }
        

    }
}
