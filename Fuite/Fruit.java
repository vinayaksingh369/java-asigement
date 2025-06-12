public class Fruit{
String name;
String color;
int weight;
public void setDetails(String name, String color, int weight) {
    this.name = name;
    this.color = color;
    this.weight = weight;
}
public String getDetails() {
    return "Name: " + name + "\tColor: " + color + "\tWeight: " + weight + " grams";
}
}