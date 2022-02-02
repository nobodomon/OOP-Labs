public class Triangle implements Shape{
  int dim1,dim2;
  public Triangle(int dim1, int dim2){
    this.dim1 = dim1;
    this.dim2 = dim2;
  }

  @Override
  public double area(){
    System.out.println("Inside Area for Triangle.");
    return 0.5 * dim1 * dim2;
  }
}