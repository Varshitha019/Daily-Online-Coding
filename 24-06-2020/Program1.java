1.Create a class named 'Shape' with a method to print "This is This is shape". Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to print "This is rectangular shape" and "This is circular shape" respectively. Create a subclass
'Square' of 'Rectangle' having a method to print "Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.


class Shape{
  public void print_shape(){
    System.out.println("This is shape");
  }
}
class Rectangle extends Shape{
  public void print_rect(){
    System.out.println("This is rectangular shape");
  }
}
class Circle extends Shape{
  public void print_circle(){
    System.out.println("This is circular shape");
  }
}
class Square extends Rectangle{
  public void print_square(){
    System.out.println("Square is a rectangle");
  }
}
class Main{
  public static void main(String[] args){
    Square sq = new Square();  
    sq.print_shape();    
    sq.print_rect();    
    }
}
