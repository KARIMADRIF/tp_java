package td3;

 class  point{
	int x;
	int y;
  public point(){
	  this.x=0;
	  this.y=0;
	  
 }
  
 public point(int x , int y) {
	 this.x=x;
	 this.y=y;
 }
  public void afficher() {
	  System.out.println("Point (" + x + ", " + y + ")");
  }
  public void deplacer(int dx, int dy) {
      this.x = this.x + dx;
      this.y = this.y + dy;
  }

  public double distanceOrigine() {
      return Math.sqrt(x * x + y * y);}
   public double distance(point p) {
    	  this.x= p.x- this.x;
          this.y=p.y-this.y	 ;
          return Math.sqrt(x*x+ y*y);
        		  
    	  
  }
}
 
 

 
 
 
 public class ex1 {
	 
		    public static void main(String[] args) {

		        point p1 = new point(1, 2);
		        point p2 = new point(4, 6);
                p1.deplacer(2,3);
                p1.afficher();
              
                p1.distanceOrigine();
		        double d = p1.distance(p2);

		        System.out.println("Distance entre p1 et p2 : " + d);
		    }
		}
	 
	 
 
 
