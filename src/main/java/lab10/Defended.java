package lab10;

//этот класс, для того чтобы посмотреть возможности рефлексии
public class Defended {
    private String name;
    String aaa;
    private Defended(String name){
        this.name = name;
    }
    private String getName(){
        return  name;
    }
}