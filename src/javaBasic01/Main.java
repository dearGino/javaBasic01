package javaBasic01;
class Main{
	public static void main(String[] args) {
		//Создание коробки
		Box box =new Box();
		
        //Создани сладостей
        Lolipop lolipop1 = new Lolipop("Рачки", 150, 90, "красный");
        Lolipop lolipop2 = new Lolipop("Льдинка", 75, 70, "голубой");
        Lolipop lolipop3 = new Lolipop("Фруктики", 100, 100, "желтый");
        Lolipop lolipop4 = new Lolipop("Фруткики", 120, 80, "зеленый");
        Lolipop lolipop5 = new Lolipop("Ирис-кис", 85, 90, "коричневый");
        Cookie cookie1 = new Cookie("Мишка", 250, 120, "шоколадная крошка");
        Cookie cookie2 = new Cookie("Кранч", 100, 90, "арахис");
        Cookie cookie3 = new Cookie("M&Ms", 90, 80, "M&Ms");
        Cookie cookie4 = new Cookie("Кокосик", 80, 120, "кокосовая стружка");
        Cookie cookie5 = new Cookie("Полезное", 130, 80, "отруби");
 
        //Добавление сладостей в коробку
        box.add(lolipop1);
        box.add(lolipop2);
        box.add(lolipop3);
        box.add(lolipop4);
        box.add(lolipop5);
        box.add(cookie1);
        box.add(cookie2);
        box.add(cookie3);
        box.add(cookie4);
        box.add(cookie5);
        
        //Вывод содержимого коробки
        box.getInsides();
        
        //Сколько весит коробка?
        box.getWeight();
        
        //Сколько стоит коробка?
        box.getCost();
        
        //Убрать из коробки сладость под индексом 5
        box.removeSweet(5);

        //Убрать из коробки последнюю положенную сладость 
        box.removeSweetLast();
        
        //Убрать из коробки последнюю добавленну сладость
        box.getInsides();

        //Денег всего - 1200р, надо скорректировать цену коробки
        System.out.println("Стоимость коробки сейчас - " + box.getCost());
        box.getRidOfCost(1200);
        
        //Просмотр изменений
        box.getInsides();
        
        //Нужно сладостей на 200 грамм, надо скорректировать цену коробки
        System.out.println("Вес коробки сейчас - " + box.getWeight());
        box.getRidOfWeight(200);
     

        //Просмотр изменений
        box.getInsides();
	}
}

