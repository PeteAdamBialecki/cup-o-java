public class Explore {
    public static void main(String[] args) {
        String[] friends = {"Ben", "Alena", "Rick"};
        int[][] scoreCards = {
            // Ben's
            {1, 2, 4, 2, 6, 5, 4, 3, 3, 2, 5, 7, 2, 7, 8, 4, 3, 2},
            // Alena's
            {2, 3, 5, 1, 1, 2, 3, 1, 1, 2, 4, 1, 3, 3, 2, 6, 3, 2},
            // Pasan's
            {4, 4, 2, 1, 2, 2, 1, 4, 2, 2, 2, 3, 2, 5, 8, 1, 2, 2}
        };

        for (int i = 0; i< friends.length; i++) {
            System.out.printf("%n %n %s %n-------------------%n",
                friends[i]);
            for (int j = 0; j < scoreCards[i].length; j++) {
                System.out.printf("Hole #%d: %d %n",
                    j + 1,
                    scoreCards[i][j]);
            }
        }

        // // Enhanced for-loop
        // for (String friend : friends) {
        //     System.out.printf("Hey %s! The movie starts in 30 minutes. See you soon! %n",
        //                         friend);
        // }
        // // Unenhanced for-loop
        // for (int i = 0; i < friends.length; i++) {
        //     String friend = friends[i];
        //     System.out.printf("Hey %s! The movie starts in 5 minutes! Get over here! %n",
        //                         friend);
        // }
        // int[] bensScoreCard = {1, 2, 1, 5, 2, 4, 4, 4, 3, 6, 1, 2, 5, 4, 3, 2, 6, 3};
        // for (int i = 0; i < bensScoreCard.length; i++) {
        //     System.out.printf("Hole #%d: %d %n",
        //                 i + 1,
        //                 bensScoreCard[i]);
        // }
    }
}