package pk.inlab.web.app.blog.model;

import java.io.Serializable;

/**
 * A DTO for the {@link Post} entity
 */
public record PostDto(Long id, String postTitle, String postDescription, String postContent) implements Serializable {
}