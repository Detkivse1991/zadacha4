import java.util.Scanner;

public class Main
{
    public class Christmas Flowers
    {


    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println( "Вводим количество дней К:");
        int K=scanner.nextInt();
        String[] flowers={ "Герань", "Крокус", "Фиалка"};
        // Идет процесс повторяющихся действий
        for (int day=1; day<=K; day++)
        {
            //Меняем местами правый и центральный цветок
            String temp=flowers[2];
            flowers[2]=flowers[1];
            flowers[1]=temp;
            //Меняем местами левый и центральный цветок
            temp=flowers[0];
            flowers[0]=flowers[1];
            flowers[1]=temp;
        }
        System.out.println("Переставляем цветы до К дней:");
        for (String flower : flowers)
        {
            System.out.println(flower);
        }
        scanner.close();
    }}


