interface TextModeration {

    boolean isOffensive(String post);

    default void displayModerationPolicy() {
        System.out.println("No abusive language allowed.");
    }

    static boolean containsRestrictedWords(String post) {
        return post.toLowerCase().contains("bad");
    }
}

interface SpamDetection {

    boolean isSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("No spam content allowed.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    @Override
    public boolean isOffensive(String post) {
        return TextModeration.containsRestrictedWords(post);
    }

    @Override
    public boolean isSpam(String post) {
        return post.toLowerCase().contains("buy now");
    }

    // Resolve conflict
    @Override
    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
}

public class ModerationDemo {

    public static void main(String[] args) {

        String posts[] = {
                "Buy Now and win prizes!",
                "You are a bad person.",
                "Have a great day!",
                "BUY NOW OFFER",
                "Learning Java is fun."
        };

        ContentModerator moderator = new ContentModerator();

        moderator.displayModerationPolicy();

        System.out.println();

        for (String post : posts) {

            if (moderator.isSpam(post))
                System.out.println(post + " -> Spam");

            else if (moderator.isOffensive(post))
                System.out.println(post + " -> Offensive");

            else
                System.out.println(post + " -> Valid");
        }
    }
}