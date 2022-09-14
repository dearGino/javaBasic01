package javaBasic01;

public class Cookie extends Sweet {

    private String filling = "������"; 

    
    public Cookie (String name, float weight, float cost, String filling){
        super(name, weight, cost);
        this.filling = filling;
    }
   
    public String getFilling (){
        return filling;
        }

    @Override
    public void getInfo (){
        System.out.println( "������� " + getName()+ " � �������� " + getFilling() + ":   " +getWeight()+"gr,  "+getCost()+"rub");
    }

}
