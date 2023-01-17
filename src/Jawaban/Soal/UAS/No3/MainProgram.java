package Jawaban.Soal.UAS.No3;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {

        UAS1E social = new UAS1E();
        social.setUserID("001");
        social.setUserName("@whitehat");
        System.out.println("USER ID : " + social.getUserID());
        System.out.println("USER NAME : " + social.getUserName());
        int jum_msg = 3;
        Scanner sc = new Scanner(System.in);
        ArrayList<Messages> xMsg = new ArrayList<Messages>();
        for (int index = 0; index < jum_msg; index++) {
            Messages msg = new Messages();
            msg.setUserID(social.getUserID());
            msg.setUserName(social.getUserName());
            System.out.println("Post Message " + index + 1 + " = ");
            String _msg = sc.nextLine();
            msg.setWhatYouPosts(_msg);
            xMsg.add(msg);
        }
        social.setMY_MESSAGES(xMsg);

        /*
         * TODO :
         * Buatlah Method ShowPosts untuk menampilkan
         * pesan yang telah di posting oleh user
         */

        social.ShowPosts(social);

        // Untuk ShowPost method ada di Class UAS1E

    }
}
