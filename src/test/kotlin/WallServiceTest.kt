import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {
    private val wallService: WallService = WallService()

    private fun getTestPost(): Post {
        return Post(
            id = 0,
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = 0,
            text = "Lorem Ipsum...",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = true,
            comments = null,
            copyRight = null,
            likes = 0,
            reposts = null,
            views = null,
            postType = "",
            signerId = 0,
            canPin = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            donut = null,
            postPonedId = 0
        )
    }

    @Test
    fun add() {
        var post = getTestPost()
        post = wallService.add(post)
        assertNotEquals(0, post.id)
    }

    @Test
    fun update() {
        val testPost = getTestPost()
        wallService.add(testPost.copy())
        wallService.add(testPost.copy())
        val res = wallService.update(testPost.copy(id = 10))
        assertEquals(true, res)
    }

}