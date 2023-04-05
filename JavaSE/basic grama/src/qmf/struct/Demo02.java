package qmf.struct;

public class Demo02 {
    public static void main(String[] args) {
        char a='c';
        switch (a){
            case 'c':
                System.out.println("优秀");
                //break;
            case 'a':
                System.out.println("haha");
                //break;
            default:
                System.out.println("xixi");
        }
        String name="Chinese";
        //编译   .java-->.class(字节码文件)
        //反编译   .java<--.class(字节码文件),用IDEA反编译
        switch (name){
            case "Chinese":
                System.out.println("优秀");
                break;
            case "America":
                System.out.println("haha");
                break;
            default:
                System.out.println("xixi");
        }
    }
}
