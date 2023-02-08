import java.util.Scanner;

public class main{
    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);
        int angkaSatu = inputUser.nextInt();
        int angkaDua = inputUser.nextInt();
        System.out.println("tambah=" + (angkaSatu+angkaDua));
        System.out.println("kurang="+ (angkaSatu-angkaDua));
        System.out.println("kali=" + (angkaSatu*angkaDua));
        System.out.println("bagi=" + (angkaSatu/angkaDua));
    }
}