package gabriellee.project.rxjavaswitchmap;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import gabriellee.project.rxjavaswitchmap.models.Post;

public class ViewPostActivity extends AppCompatActivity {

    private static final String TAG = "ViewPostActivity";

    private TextView text;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_post);
        text = findViewById(R.id.text);

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        if(getIntent().hasExtra("post")){
            Post post = getIntent().getParcelableExtra("post");
            text.setText(post.getTitle());
        }
    }

}
