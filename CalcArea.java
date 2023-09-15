class AreaCalculate {
    int length;
    int width;

  void Area(int l, int w){
      length=l;
      width=w;
  }
  void result() {System.out.println(length*width);}
}
class CalcArea{
    public static void main(String[] args) {
        AreaCalculate ar=new AreaCalculate();
        ar.Area(3,4);
        ar.result();
    }
}
