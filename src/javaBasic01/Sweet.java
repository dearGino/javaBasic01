package javaBasic01;

public class Sweet {
	private String name;
    private double weight;
    private double cost;


    public Sweet(String name, float weight, float cost){
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public double getCost (){
        return cost;
    }

    public double getWeight (){
        return weight;
    }

    public String getName (){
        return name;
    }
    
    public void getInfo (){
    }
}
