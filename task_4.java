
import java.util.ArrayList;

import java.util.Collections;

import java.util.List;
import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        /*
         * Реализовать консольное приложение, которое:
1. Принимает от пользователя и “запоминает” строки.
2. Если введено print, выводит строки так, чтобы последняя введенная
была первой в списке, а первая - последней. Collection.reverse(...)
3. Если введено revert, удаляет предыдущую введенную строку из памяти.
         */

         List<String> text = new ArrayList<>();
         Scanner input = new Scanner(System.in);
         while(true) {
            System.out.println(text.toString());
            System.out.println("Введите строку: ");
            String comand = input.nextLine();
            if (comand.equals("print")){
                Collections.reverse(text);
            }
            else if (comand.equals("revert")){
                text.remove(text.size()-1);
            }
            else {
            text.add(comand);
            }
            if (comand.equals("")){
                break;
            }
         }
         input.close();
    }
}
