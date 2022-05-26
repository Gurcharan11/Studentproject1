package arrayofobject;

public class ArrayOfObject {

    public static void main(String[] args) {
        
    //define array of object
        Students [] list = new Students [3];
        Students s1 = new Students();
        s1.setName("john");
        s1.setAge(19);
        
        Students s2 = new Students();
        s2.setName("peter");
        s2.setAge(19);
        
        Students s3 = new Students();
        s3.setName("harman");
        s3.setAge(19);
        
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        
        for(int i = 0 ; i < list.length ; i++){
        System.out.println(list[i].getName()+ " " + list[i].getAge());}
        System.out.println("Learn Github Operations");
        //Pull Operation
        
    }
    
}
