package javaBasic01;

import java.util.ArrayList;
import java.util.Comparator;

public class Box {
    private double weight;
    private double cost;
    private ArrayList<Sweet> sweetsArray;
    
    public Box(){
        this.weight=0;
        this.cost=0;
        sweetsArray = new ArrayList<>();
    }

    public void add (Sweet sweet){
        sweetsArray.add(sweet);
        weight+=sweet.getWeight();
        cost+=sweet.getCost();
    }

    public void removeSweet (int index){
        weight-=sweetsArray.get(index).getWeight();
        cost-=sweetsArray.get(index).getCost();
        System.out.print("�� ������� �������:  ");
        sweetsArray.get(index).getInfo();
        sweetsArray.remove(index);
        System.out.println();
    }

    public void removeSweetLast (){
        int index = sweetsArray.size();
        weight-=sweetsArray.get(index-1).getWeight();
        cost-=sweetsArray.get(index-1).getCost();
        System.out.print("�� ������� �������:   ");
        sweetsArray.get(index-1).getInfo();
        sweetsArray.remove(index-1);
        System.out.println();
    }

    public double getCost (){
        return cost;
    }

    public double getWeight (){
        return weight;
    }
    
    
    public void getInsides (){
    	System.out.println("������� � �������, � ���:....");
    	if(sweetsArray.size() == 0) {
    		System.out.println("����� � �������.");
    	} else {
    		int i=1;
    		for(Sweet sweet : sweetsArray){
                System.out.print(i+" ");
                i++;
    			sweet.getInfo();
            }
            System.out.println();
    	} 
    }

    
    public void getRidOfWeight (float reference){
    	sortByWeight();
        while (weight > reference){
        	int index = sweetsArray.size()-1;
            weight-= sweetsArray.get(index).getWeight();
            sweetsArray.remove(index);
        }
        System.out.println("�������� ������. ��� ������� " + getWeight());
    }

    
    public void getRidOfCost (float reference){
    	sortByCost();
        while (cost > reference){
        	int index = sweetsArray.size()-1;
            cost= cost- sweetsArray.get(index).getCost();
            sweetsArray.remove(index);
        }
        System.out.println("�������� ������. C�������� ������� "+getCost());
    }
    
    
    
    private void sortByCost (){
        sweetsArray.sort(Comparator.comparingDouble(Sweet::getCost).reversed());

    }
    private void sortByWeight (){
    	sweetsArray.sort(Comparator.comparingDouble(Sweet::getWeight).reversed());
    }

    
}
