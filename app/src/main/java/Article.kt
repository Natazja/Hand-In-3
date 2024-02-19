import java.util.ArrayList;

open class Article (val author: String, val title: String) {

    override fun toString(): String {
        return "The article: $title, is written by: $author"
    }
}