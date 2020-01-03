import java.util.*;
import java.util.Collections;

class Admin{
private String name="Deepak";
private int password=123;

public Admin(String name,int password){
if(this.name.equalsIgnoreCase(name) && this.password==password){
System.out.println("Hello Deepak");
ArrayList<CustomerDataModel> a1=new ArrayList<CustomerDataModel>();
Customer cust=new Customer(a1);
}
else{
System.out.println("Wrong UserName and Password");
}
}
}
class Toyota {
double price;
public Toyota(double price){
this.price=price;
}
public double resaleValue(){
double resaleprice=(80*price)/100;
return resaleprice;
}
}
class Maruti {
double price;
public Maruti(double price){
this.price=price;
}
public double resaleValue(){

double resaleprice=(60*price)/100;
return resaleprice;
}
}
class Hyundai{
double price;
public Hyundai(double price){
this.price=price;
}
public double resaleValue(){
double resaleprice=(40*price)/100;
return resaleprice;
}
}
class Customer{
ArrayList<CustomerDataModel> list=new ArrayList<CustomerDataModel>();
ArrayList<CarModel> carinfo=new ArrayList<CarModel>();
public Customer(ArrayList<CustomerDataModel> list2){
System.out.println("Enter<1 Add New Customer><2 Add car to Existing Customer><3 Costomer list by Id><4 SortData by Name><5 Prizes><0 Exit>");
Scanner scanner2=new Scanner(System.in);
int myselection=scanner2.nextInt();
 switch (myselection) {
  case 1:
   addCustomer(1,list,carinfo);
    break;
  case 2:
	addCar(1,list2,carinfo);
    break;
  case 3:
    printDataUsingId(list2,carinfo);
    break;
  case 4:
  sortData(list2,carinfo);
  break;
   case 5:
    getPrize(list2,carinfo);
	break;
   case 0:
    System.exit(0);
	break;
   default:
  System.out.println("Enter Correct Input");
  Customer c2=new Customer(list2);
  }
  }

public Customer(ArrayList<CustomerDataModel> list2,ArrayList<CarModel> list3){
System.out.println("Enter<1 Add New Customer><2 Add car to Existing Customer><3 Costomer list by Id><4 SortData by Name><5 Prizes><0 Exit>");
Scanner scanner2=new Scanner(System.in);
int myselection=scanner2.nextInt();;
 switch (myselection) {
  case 1:
    addCustomer(1,list2,list3);
    break;
  case 2:
	addCar(1,list2,list3);
    break;
  case 3:
    printDataUsingId(list2,list3);
    break;
  case 4:
  sortData(list2,list3);
  break;
   case 5:
    getPrize(list2,list3);
	break;
   case 0:
    System.exit(0);
	break;
   default:
  System.out.println("Enter Correct Input");
  Customer c2=new Customer(list2,list3);
  }
  } 
  
public void addCustomer(int number,ArrayList<CustomerDataModel> list1,ArrayList<CarModel> list2){
ArrayList<Integer> excitingids=new ArrayList<Integer>();
int num=number;
for(int i=0;i<list1.size();i++){
excitingids.add(list1.get(i).getId());
//System.out.println(excitingids.get(i));
}
if(num==1){
System.out.println("Enter the Customer Id");
Scanner scanner1=new Scanner(System.in);
int id=scanner1.nextInt();

 if(excitingids.contains(id)){
System.out.println("User All Ready Exit");
addCustomer(1,list1,list2);
}
else{
System.out.println("Enter the Customer Name");
Scanner scanner2=new Scanner(System.in);
String name=scanner2.nextLine();

list1.add(new CustomerDataModel(id,name));
System.out.println("Enter 1 for Continue and 0 for quit");
Scanner scanner3=new Scanner(System.in);
int s=scanner3.nextInt();
addCustomer(s,list1,list2);
}
}
else{
Customer customer1=new Customer(list1,list2);
}
}
 public void addCar(int number,ArrayList<CustomerDataModel> list6,ArrayList<CarModel> list7){
            ArrayList<Integer> carlist1=new ArrayList<Integer>();
            int num=number;
            int userid=0;
            for(int i=0;i<list6.size();i++){
                carlist1.add(list6.get(i).getId());
                }
			System.out.println("Enter the User id");
            Scanner scan=new Scanner(System.in);
            userid=scan.nextInt();
            if(carlist1.contains(userid)){
                for(int i=0;i<list6.size();i++){
                    int id= list6.get(i).getId();
                    if(id==userid){
                        System.out.println("User id="+list6.get(i).getId());
                        System.out.println("Costomer Name="+list6.get(i).getName());
                        int exituserid=list6.get(i).getId();
                        String exitusername=list6.get(i).getName();

                        System.out.println("Enter the Customer Car Id");
                        Scanner scanner3=new Scanner(System.in);
                        int carid=scanner3.nextInt();

                        System.out.println("Enter the Customer Car Model");
                        Scanner scanner4=new Scanner(System.in);
                        String carmodel=scanner4.nextLine();

                        System.out.println("Enter the Customer Car price");
                        Scanner scanner5=new Scanner(System.in);
                        double carprice=scanner5.nextInt();
                        String car1="Maruti 800";
                        String car2="Maruti Suzuki Ertiga";
                        String car3="Maruti Suzuki Swift";
                        String car4="Hyundai Elite i20";
                        String car5="Hyundai Verna";
                        String car6="Hyundai Creta";
                        String car7="Toyota Glanza";
                        String car8="Toyota Fortuner";
                        String car9="Toyota Land Cruiser";
                        if(carmodel.equalsIgnoreCase(car1) || carmodel.equalsIgnoreCase(car2) || carmodel.equalsIgnoreCase(car3)){
                            Maruti price=new Maruti(carprice);
                            double resaleprice=price.resaleValue();

                            list7.add(new CarModel(exitusername,exituserid,carid,carprice,resaleprice,carmodel));
                        }

                        else if(carmodel.equalsIgnoreCase(car4) || carmodel.equalsIgnoreCase(car5) || carmodel.equalsIgnoreCase(car6)){
                            Hyundai price=new Hyundai(carprice);
                            double resaleprice=price.resaleValue();
                            list7.add(new CarModel(exitusername,exituserid,carid,carprice,resaleprice,carmodel));
                        }
                        else if(carmodel.equalsIgnoreCase(car7) || carmodel.equalsIgnoreCase(car8) || carmodel.equalsIgnoreCase(car9)){
                            Toyota price=new Toyota(carprice);
                            double resaleprice=price.resaleValue();

                            list7.add(new CarModel(exitusername,exituserid,carid,carprice,resaleprice,carmodel));
                        }
                        else {System.out.println("Car Model Not Exists Enter Right CarModel");}
                    }
                    else{
                        //System.out.println("Id is Not on "+i+" Index");
                    }
                }
                System.out.println("Enter 1 for Continue and 0 for quit");
                Scanner scanner3=new Scanner(System.in);
                int s=scanner3.nextInt();
				if(s==1){
                addCar(s,list6,list7);
				}
				else{
				Customer customer2=new Customer(list6,list7);
				}
            }
            else{
                System.out.println("User Not Find...");
				Customer customer2=new Customer(list6,list7);
                }
        }

public void sortData(ArrayList<CustomerDataModel> list4,ArrayList<CarModel> list5){
ArrayList<String> usname=new ArrayList<String>();
ArrayList<Integer> allids=new ArrayList<Integer>();
if(list5==null){
for(int i=0;i<list4.size();i++){
   usname.add(list4.get(i).getName());
 }
	        Collections.sort(usname);
            for(String str: usname){
			System.out.println(str);
	}
}
  else{
        System.out.println("All Customers");
		for(int i=0;i<list4.size();i++){
		System.out.println(list4.get(i).getId()+","+list4.get(i).getName());
		}
      Collections.sort(list5);
	  System.out.println("Customers who have Cars Sorted By Name");
      for(CarModel str: list5){
	  System.out.println(str.getCustomername()+", "+str.getCustomerid()+", "+str.getCarid()+", "+str.getCarmodel()+
                            ", "+str.getCarprice()+", "+str.getCarresalevalue());
  }
  Customer cu=new Customer(list4,list5);
}
}

public void getPrize(ArrayList<CustomerDataModel> list5,ArrayList<CarModel> list6){
ArrayList<Integer> prize=new ArrayList<Integer>();
ArrayList<Integer> randomprizelist=new ArrayList<Integer>();
ArrayList<Integer> givenids=new ArrayList<Integer>();
ArrayList<Integer> selectedids=new ArrayList<Integer>();
try{
for(int i=0;i<list5.size();i++){
   prize.add(list5.get(i).getId());
 }
   Iterator iterator = prize.iterator(); 
   System.out.println("All Customer Ids : "); 
   while (iterator.hasNext()) 
   System.out.print(iterator.next() + " "); 
   System.out.println();
   Random rand = new Random(); 
   int totalItems=6;
   for (int i =0;i<totalItems;i++) {  
   int randomIndex = rand.nextInt(list5.size()); 
   randomprizelist.add(prize.get(randomIndex)); 
 } 
 System.out.println("Please Enter 3 ids for Select Customer for price");
    for(int j=0;j<=2;j++){
	Scanner randomscanner=new Scanner(System.in);
	int takeid=randomscanner.nextInt();
	givenids.add(takeid);
	}
	for(int k=0;k<givenids.size();k++){
	 for(int l=0;l<randomprizelist.size();l++){
	 int winids=givenids.get(k);
	 if(randomprizelist.contains(winids)){
	  System.out.println("Winners Ids is="+givenids.get(k));
	  break;
	 }
       else{
	System.out.println("Id "+givenids.get(k) +" Is Not Selected");
         break;
       }
	 }
	 }
	Customer c5=new Customer(list5,list6);
	}
	catch(Exception e){
	System.out.println(e.toString());
	}
}
	
	public void printDataUsingId(ArrayList<CustomerDataModel> list3,ArrayList<CarModel> list8){
            boolean ans = list8.isEmpty();
            ArrayList<Integer> carlist1=new ArrayList<Integer>();
            if(ans==true){
                for(int i=0;i<list3.size();i++){
                    carlist1.add(list3.get(i).getId());
                }
            }
            else{
                for(int i=0;i<list8.size();i++){
                    carlist1.add(list8.get(i).getCustomerid());
                }
            }
            if(ans==true){
                System.out.println("Enter the User id");
                Scanner scan1=new Scanner(System.in);
                int userid=scan1.nextInt();
                if(carlist1.contains(userid)){
                    for(int i=0;i<list3.size();i++){
                        int id= list3.get(i).getId();
                        if(id==userid){
                            System.out.print(list3.get(i).getId()+" ");
                            System.out.println(list3.get(i).getName());
                            Customer m2=new Customer(list3,list8);
                            
                        }
                        else{}
                    } }
                else{
                    System.out.println("Id Not Found..");
					Customer m2=new Customer(list3,list8);
                }
            }

            else{
                System.out.println("Enter the User id");
                Scanner scan=new Scanner(System.in);
                int userid=scan.nextInt();
                if(carlist1.contains(userid)){
                    for(int i=0;i<list8.size();i++){
                        int id= list8.get(i).getCustomerid();
                        if(id==userid){
                            System.out.println(list8.get(i).getCustomername()+", "+list8.get(i).getCustomerid()+", "+list8.get(i).getCarid()+", "+list8.get(i).getCarmodel()+
                                    ", "+list8.get(i).getCarprice()+", "+list8.get(i).getCarresalevalue());
                           
                           
                        }
                        else{ 
                        	
                        	}
                    }
                    Customer m2=new Customer(list3,list8);
                    
                }
                else{
                    for(int i=0;i<list3.size();i++){
                        carlist1.add(list3.get(i).getId());
                    }
                        if(carlist1.contains(userid)){
                            for(int j=0;j<list3.size();j++){
                                int id= list3.get(j).getId();
                                if(id==userid){
                                    System.out.print(list3.get(j).getId()+" ");
                                    System.out.println(list3.get(j).getName());
                                  
                                    
                                }
                                else{}
                            }
                            Customer m3=new Customer(list3,list8);
                        }
                        else{
                            System.out.println("User Not Found...");
    						Customer m2=new Customer(list3,list8);
                        }
                    
                   
                }
            }
        }
    }

public class CarUtility{
public static void main(String args[]){
try{
System.out.println("Enter the Admin Name and Password");
Scanner scanner=new Scanner(System.in);
String name=scanner.nextLine();
int password=scanner.nextInt();
Admin check=new Admin(name,password);
}
 catch(InputMismatchException b) { 
            System.out.println("Wrong Input"); 
             
	} 

}
}
