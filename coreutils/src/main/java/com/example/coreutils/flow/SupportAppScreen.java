package com.example.coreutils.flow;

import android.content.Context;
import android.content.Intent;

import java.io.Serializable;

import androidx.fragment.app.Fragment;
import ru.terrakok.cicerone.Screen;

/**
 * AppScreen is base class for description and creation application screen.<br>
 * NOTE: If you have described the creation of Intent then Activity will be started.<br>
 * Recommendation: Use Intents for launch external application.
 */
public abstract class SupportAppScreen extends Screen implements Serializable {

    public Fragment getFragment() {
        return null;
    }

    public Intent getActivityIntent(Context context) {
        return null;
    }
}