import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
      //Task 1
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of the day: ");
        int daysofweek = Integer.parseInt(s.nextLine());
        if (daysofweek == 1) {
            System.out.println("Monday");
        } else if (daysofweek == 2) {
            System.out.println("Tuesday");
        } else if (daysofweek == 3) {
            System.out.println("Wednesday");
        } else if (daysofweek == 4) {
            System.out.println("Thursday");
        } else if (daysofweek == 5) {
            System.out.println("Friday");
        } else if (daysofweek == 6) {
            System.out.println("Saturday");
        } else if (daysofweek == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Incorrectly variant");

        }



        //Task 2
        Scanner time = new Scanner(System.in);
        System.out.println("Введите время в часах:");
        int hour = Integer.parseInt(time.nextLine());
        if (hour > 4 & hour < 12) {
            System.out.println("Доброе утро");
        } else if (hour > 12 & hour < 16) {
            System.out.println("Добрый день");
        } else if (hour > 16 & hour < 24) {
            System.out.println("Добрый вечер");
        } else if (hour < 4 & hour <= 1) {
            System.out.println("Доброй ночи");
        } else {
            System.out.println("Неправильно введено время");
        }



        //Task 3
        Scanner animal = new Scanner(System.in);
        System.out.println("Выберите животное из предложенного списка: \n 1. Кошка. \n2. Собака. \n3.Конь. \n4.Баран. \n5.Ворона. \n6.Курица. \n7.Корова. \n8.Свинья. \n9.Осёл . \n10.Коза.");
        int choose = Integer.parseInt(animal.nextLine());
        if (choose == 1) {
            System.out.println("Спасибо за выбор: Мяу");
        } else if (choose == 2) {
            System.out.println("Спасибо за выбор: Гав");
        } else if (choose == 3) {
            System.out.println("Спасибо за выбор: иго-го");
        } else if (choose == 4) {
            System.out.println("Спасибо за выбор: бееее");
        } else if (choose == 5) {
            System.out.println("Спасибо за выбор: кар-кар");
        } else if (choose == 6) {
            System.out.println("Спасибо за выбор: кукареку/ко-ко-ко");
        } else if (choose == 7) {
            System.out.println("Спасибо за выбор: мууу");
        } else if (choose == 8) {
            System.out.println("Спасибо за выбор:  хрю-хрю");
        } else if (choose == 9) {
            System.out.println("Спасибо за выбор:  иа-иа-иа");
        } else if (choose == 10) {
            System.out.println("Спасибо за выбор:  меее");
        } else {
            System.out.println("В списке нет такого животного");
        }


        //Task 5
        Scanner birthday=new Scanner(System.in);
        int den,mesyac,god;
        System.out.println("Введите день рождения: ");
        den = Integer.parseInt(birthday.nextLine());
        System.out.println("Введите месяц рождения: ");
        mesyac = Integer.parseInt(birthday.nextLine());
        System.out.println("Введите год рождения: ");
        god = Integer.parseInt(birthday.nextLine());
        String day=""+den, month="."+mesyac, year="."+god;
        System.out.println("Дата рождения: " + day + month + year);

        if ((den>=21 & mesyac==3) || (den<=20 & mesyac==4))
        {
            System.out.println("Знак зодиака: Овен");
        }
        else if ((den>=21 & mesyac==4) || (den<=21 & mesyac==5))
        {
            System.out.println("Знак зодиака: Телец");
        }
        else if ((den>=22 & mesyac==5) || (den<=21 & mesyac==6))
        {
            System.out.println("Знак зодиака: Близнецы");
        }
        else if ((den>=22 & mesyac==6) || (den<22 & mesyac==7))
        {
            System.out.println("Знак зодиака: Рак");
        }
        else if ((den>=23 & mesyac==7) || (den<21 & mesyac==8))
        {
            System.out.println("Знак зодиака: Лев");
        }
        else if ((den>=22 & mesyac==8) || (den<23 & mesyac==9))
        {
            System.out.println("Знак зодиака: Дева");
        }
        else if ((den>=24 & mesyac==9) || (den<25 & mesyac==10))
        {
            System.out.println("Знак зодиака: Весы");
        }
        else if ((den>=24 & mesyac==10) || (den<22 & mesyac==11))
        {
            System.out.println("Знак зодиака: Скорпион");
        }
        else if ((den>=23 & mesyac==11) || (den<22 & mesyac==12))
        {
            System.out.println("Знак зодиака: Стрелец");
        }
        else if ((den>=23 & mesyac==12) || (den<20 & mesyac==1))
        {
            System.out.println("Знак зодиака: Козерог");
        }
        else if ((den>=21 & mesyac==1) || (den<19 & mesyac==2))
        {
            System.out.println("Знак зодиака: Водолей");
        }
        else if ((den>=20 & mesyac==2) || (den<20 & mesyac==3))
        {
            System.out.println("Знак зодиака: Рыбы");
        }
        else {
            System.out.println("Неправильно введена дата рождения");
        };

        if (god%12==4) {
            System.out.println("Год: Крыса");
        }
        else if (god%12==5) {
            System.out.println("Год: Бык");
        }
        else if (god%12==6) {
            System.out.println("Год: Тигр");
        }
        else if (god%12==7) {
            System.out.println("Год: Кролик");
        }
        else if (god%12==8) {
            System.out.println("Год: Дракон");
        }
        else if (god%12==9) {
            System.out.println("Год: Змея");
        }
        else if (god%12==10) {
            System.out.println("Год: Лошадь");
        }
        else if (god%12==11) {
            System.out.println("Год: Коза");
        }
                else if (god%12==0) {
            System.out.println("Год: Обезьяна");
        }
        else if (god%12==1) {
            System.out.println("Год: Петух");
        }
        else if (god%12==2) {
            System.out.println("Год: Собака");
        }
        else if (god%12==3) {
            System.out.println("Год: Свинья");
        }
        else {
            System.out.println("Неправильно введен год рождения");
        };

}}

