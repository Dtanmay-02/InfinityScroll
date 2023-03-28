import static sun.text.bidi.BidiBase.R;

import androidx.appcompat.app.AppCompatActivity;

public class Startup<Bundle> extends AppCompatActivity {

    private static final Object R = ;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onStart(savedInstanceState);
            setContentView(R.layout.activity_startup); // Replace "activity_my" with the name of your layout file
        }
    }

}
