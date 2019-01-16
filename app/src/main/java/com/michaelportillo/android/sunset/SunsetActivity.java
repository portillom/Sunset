package com.michaelportillo.android.sunset;

public class SunsetActivity extends SingleFragmentActivity {

    @Override
    protected SunsetFragment createFragment(){
        return SunsetFragment.newInstance();
    }
}
