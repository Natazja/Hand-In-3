class RedditFrontPage {
    val listOfPosts: MutableList<RedditPost> = mutableListOf()

    fun addRedditPost (post: RedditPost) {
        listOfPosts.add(post);
    }

    fun deleteRedditPost(index: Int) {
        if (index in 0 until listOfPosts.size) {
            listOfPosts.removeAt(index);
            println("Post with the index ${index} has been deleted");
        }
    }

    fun viewFrontPage () {
        println("The frontpage post is: ");
        listOfPosts.forEachIndexed { index, post ->
            println("$index: Author: ${post.author}, Title: ${post.title}");
        }
    }
}