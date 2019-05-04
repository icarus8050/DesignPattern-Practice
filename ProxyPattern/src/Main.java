public class Main {
    public static void main(String[] args) {
        Image image_1 = new ProxyImage("image_1");
        Image image_2 = new ProxyImage("image_2");

        image_1.displayImage();
        image_2.displayImage();
    }
}
