package gabriellee.project.rxjavaswitchmap.request;

import java.util.List;

import gabriellee.project.rxjavaswitchmap.models.Post;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RequestApi {

    @GET("posts")
    Observable<List<Post>> getPosts();

    @GET("posts/{id}")
    Observable<Post> getPost(
            @Path("id") int id
    );

}
