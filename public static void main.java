// Разработайте программу, которая выбросит Exception, когда пользователь вводит
// пустую
// строку. Пользователю должно показаться сообщение, что пустые строки вводить
// нельзя.

public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[2] = 9; // Индекс последнего элемента в массиве - 2, поэтому заменяем элемент с индексом 2
   } catch (ArithmeticException ex) { // Добавляем обработку исключения деления на ноль
       System.out.println("Деление на ноль!");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}