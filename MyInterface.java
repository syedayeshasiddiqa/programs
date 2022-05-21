interface MyInterface {  
     int totalcents  = 20;  
    public void constructHome(); 
    public void constructLawn();
}

class CivilEngineer implements MyInterface{

    @Override
    public void constructHome() {
        System.out.println("Civil Eng 1's way of constructing a home!");
        
    }

    @Override
    public void constructLawn() {
    
        System.out.println("Civil Eng 1's way of constructing a lawn!");
        
    }