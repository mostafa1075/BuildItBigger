package com.udacity.gradle.builditbigger;


import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

/**
 * Created by mosta on 10-Jun-18.
 */
public class EndpointsAsyncTaskTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void asyncTaskResponse_valid() {
        String error = mActivityTestRule.getActivity().getString(R.string.backend_connection_error);
        onView(withId(R.id.tellJoke_btn)).perform(click());
        onView(withId(R.id.joke_tv))
                .check(matches(not(withText(""))))
                .check(matches(not(withText(error))));
    }

}