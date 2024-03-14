import java.until.scanner;
public class calculator {
    public static void
    main(String[] args) {
          scanner scanner = new 
scanner (Sytem.in);

system.out.print("masukan angka pertama: ");
    double angka1 = 
scanner.nextDouble(); 

system.out.print("masukkan operator (+,-,*,/): "); 
String operator =

scanner.next();
        
System.out.print("Masukkan angka kedua: ");
double angka2 = scanner.nextDouble();

double hasil = 0.0;

switch (operator) {
    case "+":
        hasil = angka1 + angka2;
        break;
    case "-":
        hasil = angka1 - angka2;
        break;
    case "*":
        hasil = angka1 * angka2;
        break;
    case "/":
        hasil = angka1 / angka2;
        break;
    default:
        System.out.println("Operator yang dimasukkan tidak valid.");
        return;
}

System.out.println("Hasil: " + hasil);

scanner.close();
}
}