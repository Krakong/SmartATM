public class Games {
    String gname;
    float price;
    int releaseYr;
    float size;
    String platform;

    Games(String gname,float price,int releaseYr,float size,String platform){
        this.gname = gname;
        this.price = price;
        this.releaseYr = releaseYr;
        this.size = size;
        this.platform = platform;
    }

    public void getInfo(){
        System.out.println("Game Name: "+ gname);
        System.out.println("Price: "+ price);
        System.out.println("Release Year: "+ releaseYr);
        System.out.println("Size in GB: "+ size);
        System.out.println("Platform: "+platform);
        System.out.println("----------------------------------------");
    }

    public void entertainment(){

    }
    public void learning(){

    }
}
