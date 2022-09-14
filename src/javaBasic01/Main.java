package javaBasic01;
class Main{
	public static void main(String[] args) {
		//Создание коробки
		Box box =new Box();
		
        //Создание сладостей
        Lolipop lolipop1 = new Lolipop("Рачки", 150, 90, "красный");
        Lolipop lolipop2 = new Lolipop("Льдинка", 75, 70, "голубой");
        Lolipop lolipop3 = new Lolipop("Фруктики", 100, 100, "желтый");
        Lolipop lolipop4 = new Lolipop("Фруктики", 120, 80, "зеленый");
        Lolipop lolipop5 = new Lolipop("Кока-кола", 85, 90, "красный");
        Cookie cookie1 = new Cookie("Мишка", 250, 120, "шоколадная крошка");
        Cookie cookie2 = new Cookie("Кранч", 100, 90, "арахис");
        Cookie cookie3 = new Cookie("M&Ms", 90, 80, "M&Ms");
        Cookie cookie4 = new Cookie("Кокосик", 80, 120, "кокосовая стружка");
        Cookie cookie5 = new Cookie("Полезное", 130, 80, "отруби");
 
        //Что внутри коробки?
        box.getInsides();
        
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
        
        //Что внутри коробки?
        box.getInsides();
        
        //Какой вес коробки?
        System.out.println("Сейчас коробка весит - " + box.getWeight());
        
        //Какая стоимость коробки?
        System.out.println("Сейчас коробка сладостей стоит - " + box.getCost()+"\n");
        
        //Убрать из коробки сладость с индексом 5
        box.removeSweet(5);

        //Убрать из коробки последнюю добавленную сладость
        box.removeSweetLast();
        
        //Какой вес коробки?
        System.out.println("Сейчас коробка весит - " + box.getWeight());
        //Какая стоимость коробки?
        System.out.println("Сейчас коробка сладостей стоит - " + box.getCost()+"\n");
        
        
        
        //Что внутри коробки сейчас?
        box.getInsides();
        
        //Желаемый вес коробки- 800гр, уберем часть сладостей
        System.out.println("Сейчас коробка сладостей весит - " + box.getWeight());
        box.getRidOfWeight(600);
        System.out.println("Теперь коробка весит " + box.getWeight()+" gr\n");
     
        //Что внутри коробки
        box.getInsides();
        
        //Желаемый вес коробки- 200гр, уберем часть сладостей
        System.out.println("Сейчас коробка сладостей весит - " + box.getWeight());
        box.getRidOfCost(200);
        System.out.println("Теперь коробка весит " + box.getWeight()+" gr\n");
        
        //Что внутри коробки
        box.getInsides();
	}
}

