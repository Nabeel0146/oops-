import java.util.Scanner;
import java.util.Arrays;

class Sortarray {
void userdefine(String str[], int n) {
int i, j;
String temp;
for(i = 0; i < n; i++) {
for(j = i + 1; j < n; j++) {
if(str[i].compareTo(str[j]) > 0) {
temp = str[i];
str[i] = str[j];
str[j] = temp;
}
}
}
System.out.println("after sorting :");
for(i = 0; i < n; i++) {
System.out.print(str[i] + " ");
}
}
public static void main(String args[]) {
int option;
Scanner sc = new Scanner(System.in);
Sortarray sortArray = new Sortarray();
System.out.println("1. user defined");
System.out.println("2. builtin");
System.out.println("3. exit");
System.out.print("enter your choice : ");
option = sc.nextInt();
sc.nextLine();
while(option != 3) {
switch(option) {
case 1:
System.out.print("Enter the number of strings: ");
int n = sc.nextInt();
sc.nextLine();
String[] userArray = new String[n];
System.out.println("Enter " + n + " strings:");
for(int i = 0; i < n; i++) {
userArray[i] = sc.nextLine();
}
sortArray.userdefine(userArray, n);
break;
case 2:
System.out.print("Enter the number of strings: ");
n = sc.nextInt();
sc.nextLine();
String[] builtInArray = new String[n];
System.out.println("Enter " + n + " strings:");
for(int i = 0; i < n; i++) {
builtInArray[i] = sc.nextLine();
}
Arrays.sort(builtInArray);
System.out.println("after sorting (Builtin):");
for(int i = 0; i < n; i++) {
System.out.print(builtInArray[i] + " ");
}
System.out.println();
break;
case 3:
System.out.println("Exiting...");
break;
}
if(option != 3) {
System.out.println("\n1. user defined");
System.out.println("2. builtin");
System.out.println("3. exit");
System.out.print("enter your choice : ");
option = sc.nextInt();
sc.nextLine();
}
}
sc.close();
}
}
