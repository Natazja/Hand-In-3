fun main() {
    //OPGAVE 1

    val article1 : Article = Article("JASON BITTEL", "The world’s heaviest snake has been hiding a big secret")
    val article2 : Article = Article("ERIC ALT", "Did Pluto ever actually stop being a planet? Experts debate")
    val article3 : Article = Article("KIT CHAPMAN", "What's that lurking in the mist? Inside the eerie science of bogs")
    val article4 : Article = Article("RACHEL FOBAR", "Do happy hens make better eggs?")
    val article5 : Article = Article("JASON BITTEL", "Meet the vampire flies of the Galápagos Islandse")

    val arrayList: ArrayList<Article> = arrayListOf(article1, article2, article3, article4, article5)

    for (article in arrayList) {
        println(article)
    }

    //OPAGAVE 2

    val sandwich = Sandwich("JOEs Club", 75.60, 430)
    val pizza = Pizza("PMD", 89.95, 2300)
    val burger = Burger("Chicken Salsa", 84.95, 394)

    val fastFoodArray: ArrayList<FastFood> = arrayListOf(sandwich, pizza, burger)

    for (fastFood in fastFoodArray) {
        fastFood.printFastFoodDetails()
    }

    //OPGAVE 3
    val bike1 = Bicycle()
    val bike2 = Bicycle()

    bike1.changeGear(3)
    bike1.speedUp(15)
    bike1.applyBreaks(5)

    bike2.changeGear(5)
    bike2.speedUp(21)
    bike2.applyBreaks(7)

    //OPGAVE 4
    val post1 = RedditPost("Maire", "Blomster")
    post1.downVotes = 3
    post1.upVotes = 7
    println(post1)

    val post2 = RedditPost("Jesper", "Hav")
    post2.downVotes = 2
    post2.upVotes = 12
    println(post2)

    val post3 = RedditPost("Katrine", "Familie")
    post3.downVotes = 1
    post3.upVotes = 30
    println(post3)

    val postsSortedByUpvotes = RedditPost.sortByUpvotes(listOf(post1, post2, post3))
    println("\nPosts sorted by upvotes:")
    postsSortedByUpvotes.forEach { println(it) }

    val postsSortedByDownvotes = RedditPost.sortByDownvotes(listOf(post1, post2, post3))
    println("\nPosts sorted by downvotes:")
    postsSortedByDownvotes.forEach { println(it) }

    //OPGAVE 4.5
    val listOfPosts = RedditFrontPage()

    listOfPosts.addRedditPost(RedditPost("Line", "Hjerte"))

    listOfPosts.deleteRedditPost(0);

    listOfPosts.viewFrontPage();

    //OPGAVE 5
    val words = listOf("apple", "banana", "apple", "orange", "banana", "apple", "orange", "banana", "apple","banana", "apple", "orange", "banana","banana", "apple", "orange", "apple", "orange", "banana")

    val mapWords: MutableMap<String, Int> = mutableMapOf();

    for (word in words) {
        val wordCount = mapWords.getOrDefault(word, 0);
        mapWords[word] = wordCount + 1;
    }
    for ((word, count) in mapWords) {
        println("Word: $word, Count: $count");
    }
}