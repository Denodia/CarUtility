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
int price;
public Toyota(int price){
this.price=price;
}
public int resaleValue(){
int resaleprice=(80*price)/100;
return resaleprice;
}
}
class Maruti {
int price;
public Maruti(int price){
this.price=price;
}
public int resaleValue(){

int resaleprice=(60*price)/100;
return resaleprice;
}
}
class Hyundai{
int price;
public Hyundai(int price){
this.price=price;
}
public int resaleValue(){
int resaleprice=(40*price)/100;
return resaleprice;
}
}
class Customer{
ArrayList<CustomerDataModel> list=new ArrayList<CustomerDataModel>();
ArrayList<CarModel> carinfo=new ArrayList<CarModel>();
public Customer(ArrayList<CustomerDataModel> list2){
System.out.println("Enter<1 Add New Customer><2 Add car to Exitsting Customer><3 Costomer list by Id><4 SortData by Name><5 Prices>");
Scanner scanner2=new Scanner(System.in);
int myselection=scanner2.nextInt();;
 switch (myselection) {
  case 1:
   addCustomer(1,list);
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
    getPrize(list2);
  default:
  System.out.println("Enter Correct Input");
  }
  }

public Customer(ArrayList<CustomerDataModel> list2,ArrayList<CarModel> list3){
System.out.println("<Car>Enter<1 Add New Customer><2 Add car to Exitsting Customer><3 Costomer list by Id><4 SortData by Name><5 Prices>");
Scanner scanner2=new Scanner(System.in);
int myselection=scanner2.nextInt();;
 switch (myselection) {
  case 1:
    addCustomer(1,list);
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
    getPrize(list2);
  }
  } 
  
public void addCustomer(int number,ArrayList<CustomerDataModel> list1){
int num=number;
if(num==1){
System.out.println("Enter the Customer Id");
Scanner scanner1=new Scanner(System.in);
int id=scanner1.nextInt();
System.out.println("Enter the Customer Name");
Scanner scanner2=new Scanner(System.in);
String name=scanner2.nextLine();

list.add(new CustomerDataModel(id,name));
System.out.println("Enter 1 for Continue and 0 for quit");
Scanner scanner3=new Scanner(System.in);
int s=scanner3.nextInt();
addCustomer(s,list);
}
else{
Customer customer1=new Customer(list);
}
}
public void addCar(int number,ArrayList<CustomerDataModel> list6,ArrayList<CarModel> list7){
int num=number;
if(num==1){
System.out.println("Enter the User id");
Scanner scan=new Scanner(System.in);
int userid=scan.nextInt();
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
   int carprice=scanner5.nextInt();
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
   int resaleprice=price.resaleValue();
   
   carinfo.add(new CarModel(exitusername,exituserid,carid,carprice,resaleprice,carmodel));
  }
	
  else if(carmodel.equalsIgnoreCase(car4) || carmodel.equalsIgnoreCase(car5) || carmodel.equalsIgnoreCase(car6)){
   Hyundai price=new Hyundai(carprice);
   int resaleprice=price.resaleValue();
   carinfo.add(new CarModel(exitusername,exituserid,carid,carprice,resaleprice,carmodel));
  }
	else if(carmodel.equalsIgnoreCase(car7) || carmodel.equalsIgnoreCase(car8) || carmodel.equalsIgnoreCase(car9)){
   Toyota price=new Toyota(carprice);
   int resaleprice=price.resaleValue();
   
   carinfo.add(new CarModel(exitusername,exituserid,carid,carprice,resaleprice,carmodel));
  }	
 break;
 }
else{
  System.out.print("No id");
  }
}
System.out.println("Enter 1 for Continue and 0 for quit");
Scanner scanner3=new Scanner(System.in);
int s=scanner3.nextInt();
addCar(s,list6,carinfo);
}
else{
Customer customer2=new Customer(list6,carinfo);
}
}
public void sortData(ArrayList<CustomerDataModel> list4,ArrayList<CarModel> list5){
ArrayList<String> usname=new ArrayList<String>();
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
    for(int i=0;i<list5.size();i++){
    usname.add(list5.get(i).getCustomername());
   System.out.println("Without Sorting Data="+usname.get(i));
    }
	  //Collections.sort(list5);
     // for(int m=0;m<list5.size();m++){
	 // System.out.println(list5.get(m).getCustomername()+" ");
	 
	 Collections.sort(usname);

	  for(String str: usname){
	  System.out.println("With Sorting Data="+str);
	   }
	   
	}
	}
	

public void getPrize(ArrayList<CustomerDataModel> list5){
ArrayList<Integer> prize=new ArrayList<Integer>();
ArrayList<Integer> randomprizelist=new ArrayList<Integer>();
ArrayList<Integer> givenids=new ArrayList<Integer>();
ArrayList<Integer> selectedids=new ArrayList<Integer>();


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
	System.out.println("Random Selected Ids="+randomprizelist);
	
	System.out.println("Please Enter 3 ids for Select Customer for price");
    for(int j=0;j<=2;j++){
	
	Scanner randomscanner=new Scanner(System.in);
	int takeid=randomscanner.nextInt();
	givenids.add(takeid);
	}
	try{
	 for(int k=0;k<=givenids.size();k++){
	 for(int l=0;l<=randomprizelist.size();l++){
	 int winids=givenids.get(l);
	 if(randomprizelist.contains(winids)){
	  System.out.println("Winners Ids is="+givenids.get(l));
	 }
	 else{
	 System.out.println("No Winner");
	    }
	 }
	}
   }
	catch(Exception e){
	 System.out.println(e);
 }
}
	

public void printDataUsingId(ArrayList<CustomerDataModel> list3,ArrayList<CarModel> list4){
System.out.println("Enter the User id");
Scanner scan=new Scanner(System.in);
int userid=scan.nextInt();
for(int i=0;i<list3.size();i++){
  int id= list3.get(i).getId();
  if(id==userid){
   System.out.print(list3.get(i).getId()+" ");
   System.out.println(list3.get(i).getName());
   Customer m2=new Customer(list3,list4);
  // break;
    }
else{
System.out.print("No id");
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

