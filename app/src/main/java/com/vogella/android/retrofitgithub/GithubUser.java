package com.vogella.android.retrofitgithub;

/**
 * Created by Migue on 29/01/2017.
 */

public class GithubUser {
    String login;
    String name;
    String email;

    @Override
    public String toString() {
        return(login);
    }
}
