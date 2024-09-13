class prg{
    int rollno; 
    String name; 
    prg(){
        rollno=15; 
        name="rakesh"; 
    }
void displaydetails(){ 
    System.out.println(rollno + name);
}
    } 
    class Main{
        public static void main(String[] args) {
            prg s1=new prg(); 
            s1.displaydetails();
        }
    }
