public class Circle implements Shape{
  int dim1,dim2;
  public Circle(int dim1, int dim2){
    this.dim1 = dim1;
    this.dim2 = dim2;
  }

  @Override
  public double area(){
    System.out.println("Inside Area for Circle.");
    return PI * Math.pow(dim1,2);
  }
}