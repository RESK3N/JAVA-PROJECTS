import java.util.Scanner;

//java program to make a library system
class lib{
    Scanner sc = new Scanner(System.in);
    private String books[]=new String[10];
    private int len=0;
    lib(){run();}
    public void run(){
        int ch;

        while(true){
            String s;
            System.out.println("________________________________");
            System.out.println("Library Management System ");
            System.out.println("Enter Your Choice: \n1.To Show all available books\n2.To add book");
            System.out.println("3.To issue a book\n4.To return a book\n5.To EXIT");
            ch=sc.nextInt();
            switch(ch){
                case 1:showBooks();break;
                case 2:System.out.println("Adding Book\nEnter Book Name: ");
                s=sc.next();
                addBook(s);break;
                case 3:System.out.println("Issuing Book\nEnter Book Name: ");
                s=sc.next();
                issue(s);break;
                case 4:System.out.println("Returning Book\nEnter Book Name: ");
                s=sc.next();
                addBook(s);break;
                case 5:System.exit(0);
                default:
                    System.out.println("Invalid Choice, Try Again !");
            }
        }
    }
    public void showBooks(){
        System.out.println("Available Books:");
        for(String str:books){
            if(str!=null){
                System.out.println(str);
            }
        }
    }
    public void addBook(String book){
        books[len]=book;
        len++;
    }
    public void issue(String book){
        boolean flag=true;
        int point=0;
        for(int i=0;i<len;i++){
            if(book.equals(books[i])){
                books[i]=null;
                System.out.println("Book "+book+" Issued");
                flag=false;
                point=i;
            }
        }if(flag){
            System.out.println("Book not found !");
        }else{
            for(int i=point;i<len;i++){
                books[i]=books[i+1];
                len--;
            }
        }
    }
}
public class library {
    public static void main(String[] args) {
    lib obj=new lib();
    }
}
