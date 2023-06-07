class student{
    int Roll;//initialize variable
    String Name = new String();//creat new variable
}
class Result extends student{
    float Mark;//initialize variable
    void GetData(){
        Roll= 503336;
        Name ="Shiboshreee Roy";
        Mark = 3.80f;
        }
        void Display(){
            //print all data or show user data
            System.out.println("Student Name:"+Name);
            System.out.println("Student Roll:"+Roll);
            System.out.println("Mark :"+Mark);
        }
}
class inherit{
    public static void main(String[] args){
        Result obj =new Result();
        obj.GetData();
        obj.Display();
    }
}
