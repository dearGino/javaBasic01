package javaBasic01;

public class Lolipop extends Sweet {

    private String color = "прозрачный"; 


    public Lolipop (String name, float weight, float cost, String color){
        super(name, weight, cost);
        this.color = color;
    }
   
    public String getColor (){
        return color;
        }

    @Override
    public void getInfo (){
        System.out.println( color +" леденец " + getName()+":   "+getWeight()+"gr,  "+getCost()+"rub");
    }

}
