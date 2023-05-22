public class SinhVien
{
    static int ID = 1001;        // static variable
    String name = "Phuc";        // instance variable

    public void showAge()
    {
        int age = 20;            // local variable
        System.out.println("Age is: " + age);

    }
    public void showName()
    {
        System.out.println("Name is: " + name);
    }

    public static void showID()
    {
        System.out.println("ID is: " + ID);
    }

    public static void showClassName()
    {
        System.out.println("Class Name is: " + ThongTin.className);
    }

}
