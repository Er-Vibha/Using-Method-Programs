class An {
        int id;
        String name;
        double point;
    void insert(int i, String n, double p) {
        id=i;
        name=n;
        point=p;
    }
  void  display(){
      System.out.println(id+" "+name+" "+point);
  }
}
class And{
    public static void main(String[] args) {
       An a=new An();
        An a1=new An();
       a.insert(10, "Ram", 324.4);

       a1.insert(12, "Krishna", 234.7);
       a.display();

       a1.display();


    }
}