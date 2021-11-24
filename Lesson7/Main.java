package Lesson7;
 
import java.util.Scanner;
 
public class Main{

    public static void main(String[] args) {
        client = new User("123","123");
        Scanner scanner = new Scanner(System.in);
        card = new Product[10];
        System.out.println("Авторизация \n Введите логин и пароль пользователя:");
        String login = (String)scanner.nextLine();
        String password = (String)scanner.nextLine();
        if (!client.isAuth(login, password)) {
            getMenu();
        }
 
    }
    
    public static void getMenu() {
        System.out.println("\n Меню");
        System.out.println("1.Категории товаров");
        System.out.println("2.Корзина");
        System.out.println("3.Оплатить");
        System.out.println("0.Выход");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        
        if(sc.hasNextInt()) {
            int number = sc.nextInt();
            switch(number) {
                case 1: {
                    getCategory(all);
                    break;
                }
                case 2: {
                    getBasket(card);
                    break;
                }
                case 3: {
                    Buy();
                    break;
                }
                case 0: {
                    break;
                }
                default:{
                    System.out.println("Мансур дурак");
                    break;
                }
            }  
        } else {
            System.out.println("Мансур неправильный");
            getMenu();
        }
    }

    public static void Buy() {
        Basket cards = new Basket(card);
        client.purchased = cards;
        System.out.println("Товарный чек");
        for(int i = 0; i < client.purchased.purchased.length; ++i) {
            if(client.purchased.purchased[i] == null) break;
            System.out.println((i+1) + ". " + client.purchased.purchased[i].nameProduct + " в количестве. " + client.purchased.purchased[i].count + " Стоит " 
        + client.purchased.purchased[i].cost*client.purchased.purchased[i].count + " руб.");
        }
        double gc = getCash(client.purchased.purchased);
        System.out.print("Общая сумма покупок составляет = " + gc + "руб.");
        
    }

    public static double getCash(Product[] p) {
        double cash = 0.0;
        for(int i = 0; i < p.length; ++i) {
            if(p[i] == null) break;
            cash+=p[i].cost*p[i].count;
        }
        return cash;
    }

    public static void getCategory(Category[] c) {
        for(int i = 0; i < c.length; ++i)System.out.println("№"+ (i+1) + " " + c[i].nameCategory);
        System.out.println("0.Назад");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number == 0)getMenu();
        else seeProduct(all[number-1]);
        
    }

    public static void getBasket(Product[] b) {
        if(b[0] == null) {
            System.out.println("Корзина пустая");
            getMenu();
        };
        for(int i = 0; i < b.length; ++i) {
            if(b[i] == null) break;
            System.out.println((i+1) + ". " + b[i].nameProduct + " в количестве " 
        + b[i].count + " по " + b[i].cost);
        }
        System.out.println("0.Назад");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number == 0)getMenu();
    }
    
    public static void seeProduct(Category cat) { 
        for(int i = 0; i < cat.products.length; ++i) {
            System.out.println((i+1) + ". " + cat.products[i].nameProduct + " по " 
        + cat.products[i].cost);
        }
        System.out.println("0.Назад");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number == 0)getCategory(all);
        else buyProduct(cat.products[number-1]);
    }
    
    private static void buyProduct(Product p) {
        System.out.println("Сколько вам нужно товаров?");
        Scanner sc = new Scanner(System.in);
        p.count = sc.nextInt();
        System.out.println("Товар " + p.nameProduct + " в количестве " + p.count + " по " + p.cost + " был добавлен в вашу корзину");  
        for(int i = 0; i < card.length; ++i) {
            if(card[i] == null) {
                card[i] = p;
                break;
            }
            else {
                if(i+1 == card.length && card[i] == null) {
                    System.out.println("Корзина заполнена");
                    break;
                } 
            }
        }
        
        getCategory(all);
    }
 
    static Product breadb = new Product("Хлеб черный", 30.0);
    static Product breadw = new Product("Хлеб белый", 28.0);
    static Product bun = new Product("Плюшка", 55.5);
 
    static Product milk = new Product("Молоко", 123.0);
    static Product kefir = new Product("Кефир", 86.0);
    static Product curd = new Product("Творог", 75.0123);

    static Product soap = new Product("Мыло", 109.99);
    static Product powder = new Product("Стиральный порошок", 249.99);
    static Product matches = new Product("Спички", 34.00);
 
    static Product[] Bakery = { breadb, breadw, bun };
    static Product[] Diary = { milk, kefir, curd };
    static Product[] Grocery = { soap, powder, matches };
 
    static Category bakery = new Category("Хлебобулочные изделия", Bakery);
    static Category diary = new Category("Молочные изделия", Diary);
    static Category grocery = new Category("Бакалея", Grocery);
 
    static Category[] all = { bakery, diary, grocery };
    static Product[] card;
    static User client;
 
}