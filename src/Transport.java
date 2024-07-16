public class Transport{

    private float speed;
    public int weight;
    public String color;
    public byte[] coordinate;

    public void SetValue(float speed_, int weight_, String color_, byte[] coordinate_) {
        speed = speed_;
        weight = weight_;
        color = color_;
        coordinate = coordinate_;
    }

    public String getValue() {
        String info = ("Object speed: " + speed + " Weight: " + weight + " Color: " + color + "\n");
        String infoCoordinate = "Coordinate:\n";

        for (int i = 0; i < coordinate.length; i++)
            infoCoordinate += coordinate[i] + "\n";

        return info + infoCoordinate;
    }
}