// Andy Ninh
// February 16th, 2025

public class Main {
    public static void main(String[] args) {
        System.out.println("There was an old woman who swallowed a fly.");
        iDontKnow();
        perhaps();

        System.out.println("There was an old woman who swallowed a spider,");
        System.out.println("That wriggled and iggled and jiggled inside her.");
        swallowSpider();
        iDontKnow();
        perhaps();

        System.out.println("There was an old woman who swallowed a bird,");
        System.out.println("How absurd to swallow a bird.");
        swallowBird();
        swallowSpider();
        iDontKnow();
        perhaps();

        System.out.println("There was an old woman who swallowed a cat,");
        System.out.println("Imagine that to swallow a cat.");
        swallowCat();
        swallowBird();
        swallowSpider();
        iDontKnow();
        perhaps();

        System.out.println("There was an old woman who swallowed a dog,");
        System.out.println("What a hog to swallow a dog.");
        System.out.println("She swallowed the dog to catch the cat,");
        swallowCat();
        swallowBird();
        swallowSpider();
        iDontKnow();
        perhaps();

        System.out.println("There wa an old woman who swallowed a horse,");
        System.out.println("She died of course.");
    }

    public static void iDontKnow()
    {
        System.out.println("I don't know why she swallowed that fly,");
    }

    public static void perhaps()
    {
        System.out.println("Perhaps she'll die.\n");
    }

    public static void swallowSpider()
    {
        System.out.println("She swallowed the spider to catch the fly,");
    }

    public static void swallowBird()
    {
        System.out.println("She swallowed the bird to catch the spider,");
    }

    public static void swallowCat()
    {
        System.out.println("She swallowed the cat to catch the bird,");
    }
}