package com.vogella.android.retrofitgithub;

/**
 * Created by Migue on 29/01/2017.
 */

public class GithubRepo {
    String name;
    String url;

    @Override
    public String toString() {
        return(name + " " +  url);
    }

}
