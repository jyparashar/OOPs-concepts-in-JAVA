package RuntimePolymorphismPkg_9_1;

class Bank {
    float getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    float getRateOfInterest() {
        return 8.4f;
    }
    void show()
    {
        System.out.println("In Bank Class...");
    }
}

class ICICI extends Bank {
    @Override
    float getRateOfInterest() {
        return 7.3f;
    }
}

class AXIS extends Bank {
    @Override
    float getRateOfInterest() {
        return 9.7f;
    }
}

public class runtimepoly1 {
    public static void main(String args[]) {
       
    	Bank b;
    	b = new Bank();
    	   	
    	b = new SBI(); 
        //b.show()
    	System.out.println(b.getRateOfInterest());
        
        b = new AXIS();
        System.out.println(b.getRateOfInterest()); 
        //Dynamic Method Dispatch        
        
        b = new ICICI();
        System.out.println(b.getRateOfInterest());
        
        System.out.println(b instanceof SBI);
        
//        //Anonymous Objects
        System.out.println(new SBI().getRateOfInterest());
   }
}









