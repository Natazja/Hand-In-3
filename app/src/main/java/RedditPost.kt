import java.text.SimpleDateFormat
import java.util.Date

class RedditPost(val author: String, val title: String) {
    private val date: String
    private var upvotes: Int
    private var downvotes: Int

    init {
        val sdf = SimpleDateFormat("dd-MM-yyyy HH-mm-ss")
        date = sdf.format(Date())
        upvotes = 1
        downvotes = 1
    }


    var upVotes: Int
        get() = upvotes
        set(value) {
            upvotes = value
        }

    var downVotes: Int
        get() = downvotes
        set(value) {
            downvotes = value
        }

    companion object {
        fun sortByUpvotes(posts: List<RedditPost>): List<RedditPost> {
            return posts.sortedByDescending { it.upVotes }
        }

        fun sortByDownvotes(posts: List<RedditPost>): List<RedditPost> {
            return posts.sortedByDescending { it.downVotes }
        }
    }

    override fun toString(): String {
        return "Author: $author, Title: $title, Timestamp: $date, Upvotes: $upvotes, Downvotes: $downvotes";
    }
}
