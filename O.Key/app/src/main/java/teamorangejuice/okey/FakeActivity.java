package teamorangejuice.okey;

/**
 * Created by wowoto9772 on 2017-07-09.
 */

import android.preference.PreferenceActivity;
import android.os.Bundle;

public class FakeActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("I'm not Activity.");
    }
}