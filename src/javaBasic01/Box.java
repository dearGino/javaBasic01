package javaBasic01;

import java.util.ArrayList;
import java.util.Comparator;

public class Box implements BoxMethods{
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
    	if (index>=0 && index<sweetsArray.size()) {
            weight-=sweetsArray.get(index).getWeight();
            cost-=sweetsArray.get(index).getCost();
            System.out.print("Из коробки убрали:  ");
            sweetsArray.get(index).getInfo();
            sweetsArray.remove(index);
            System.out.println();
    	} else {
    		System.out.println("Неподходящий индекс");
    	}

    }

    public void removeSweetLast (){
    	if (sweetsArray.size()>0) {
            int index = sweetsArray.size();
            weight-=sweetsArray.get(index-1).getWeight();
            cost-=sweetsArray.get(index-1).getCost();
            System.out.print("Из коробки убрали:   ");
            sweetsArray.get(index-1).getInfo();
            sweetsArray.remove(index-1);
            System.out.println();
    	} else {
    		System.out.println("В коробке нет последнего элемента, потому что там пусто");
    	}
    }

    public double getCost (){
        return cost;
    }

    public double getWeight (){
        return weight;
    }
    
    
    public void getInsides (){
    	System.out.println("Посмотрим, что внутри коробки:....");
    	if(sweetsArray.size() == 0) {
    		System.out.println("Пусто и грустно.");
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
    	if (reference > 0) {
        	sortByWeight();
            while (weight > reference){
            	int index = sweetsArray.size()-1;
                weight -= sweetsArray.get(index).getWeight();
                sweetsArray.remove(index);
            }
            System.out.println("Оптимизируем коробку до " + reference + " gr по ВЕСУ");
        } else {
        	System.out.println("Неподходящий параметр веса");
        }
    }

    
    public void getRidOfCost (float reference){
    	if (reference > 0) {
        	sortByCost();
            while (weight > reference){
            	int index = sweetsArray.size()-1;
                weight -= sweetsArray.get(index).getWeight();
                sweetsArray.remove(index);
            }
            System.out.println("Оптимизируем коробку до " + reference + " gr по ЦЕНЕ");
    	} else {
        	System.out.println("Неподходящий параметр веса");
        }
    }
    
    
    
    private void sortByCost (){
        sweetsArray.sort(Comparator.comparingDouble(Sweet::getCost).reversed());

    }
    private void sortByWeight (){
    	sweetsArray.sort(Comparator.comparingDouble(Sweet::getWeight).reversed());
    }

    
}
