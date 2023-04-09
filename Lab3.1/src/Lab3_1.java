import java.util.Scanner;
public class Lab3_1 {
	public static void main(String[] args) {
		int n;
        Sach s[];
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap vao so quyen sach: ");
        n=scanner.nextInt();
        s=new Sach[n];
        for(int i=0;i<n;i++){
            s[i]=new Sach();
            s[i].Nhapsach();
        }
        System.out.println("Sach sau khi nhap la: ");
        for(int i=0;i<n;i++){
            s[i].Insach();
        }
    }

}
