public class Ellipse implements Shape{
  int dim1,dim2;
  public Ellipse(int dim1, int dim2){
    this.dim1 = dim1;
    this.dim2 = dim2;
  }

  @Override
  public double area(){
    System.out.println("Inside Area for Ellipse.");
    return PI * dim1 * dim2;
  }
}