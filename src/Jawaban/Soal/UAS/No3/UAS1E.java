package Jawaban.Soal.UAS.No3;

import java.util.ArrayList;

public class UAS1E {

    private String UserID;
    private String UserName;

    private ArrayList<Messages> MY_MESSAGES;

    public UAS1E(){

    }

    public UAS1E(String userID, String userName, ArrayList<Messages> MY_MESSAGES) {
        UserID = userID;
        UserName = userName;
        this.MY_MESSAGES = MY_MESSAGES;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public ArrayList<Messages> getMY_MESSAGES() {
        return MY_MESSAGES;
    }

    public void setMY_MESSAGES(ArrayList<Messages> MY_MESSAGES) {
        this.MY_MESSAGES = MY_MESSAGES;
    }

    public void ShowPosts(UAS1E social) {
        System.out.println(social.getMY_MESSAGES());
    }
}

class Messages {
    private String UserID;
    private String UserName;
    private String WhatYouPosts;

    public Messages(){

    }

    public Messages(String userID, String userName, String whatYouPosts) {
        UserID = userID;
        UserName = userName;
        WhatYouPosts = whatYouPosts;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getWhatYouPosts() {
        return WhatYouPosts;
    }

    public void setWhatYouPosts(String whatYouPosts) {
        WhatYouPosts = whatYouPosts;
    }
}

