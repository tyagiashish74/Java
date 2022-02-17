public class Bmw extends Car{
    String modal="";
    public Bmw(int c,int m,String col,int ty,String md){
        super(c,m,col,ty);
        modal=md;
    }
    public void show_bmw_details(){
        System.out.println("BMW modal is " +modal);
    }

}
