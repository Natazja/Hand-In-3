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
}