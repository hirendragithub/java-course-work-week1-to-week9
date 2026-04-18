public class MiniBookCorner {
public static void main(String[] args) {
String[] cats = {"Fiction", "Nepali"};
String[][] titles = new String[2][1];
double[][] prices = new double[2][1];
titles[0][0] = "Asahamati - 5";
prices[0][0] = 750.0;
titles[1][0] = "Palpasa Cafe";
prices[1][0] = 550.0;
for (int i = 0; i < cats.length; i++) {
System.out.println(cats[i] + ": " + titles[i][0] + " - Rs." + prices[i][0]);
}
}
}