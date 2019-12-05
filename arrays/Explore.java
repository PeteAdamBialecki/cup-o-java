public class Explore {
    public static void main(String[] args) {
        String[] friends = {"Ben", "Alena", "Rick"};
        for (String friend : friends) {
            System.out.printf("Hey %s! The movie starts in 30 minutes. See you soon! %n",
                                friend);
        }
    }
}