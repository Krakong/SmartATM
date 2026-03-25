public class GamesMain {
    public static void main(String[]args){
        Games game1 = new Games("God Of War",2999,2018,78,"PS5 and Windows");
        game1.getInfo();
        Games game2 = new Games("Ghost of Tsushima",3499,2020,59,"PS5 and Windows");
        game2.getInfo();
        Games game3 = new Games("Ghost of Yotei",5199,2025,88,"PS5 Exclusive");
        game3.getInfo();
        Games game4 = new Games("Expedition 33",1999,2025,53,"PS5 and Windows");
        game4.getInfo();
    }
}
