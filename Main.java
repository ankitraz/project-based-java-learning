import java.util.Scanner;
class video{
    String videoName;
    int rating;

    public void setVideoname (String name){
        this.videoName = name;
    }

    public String getVideoname(){
        return videoName;
    }

    public void addRating (){
        System.out.println("Enter rating for video: ");
        Scanner input = new Scanner(System.in);
        int rating = input.nextInt();
        this.rating = rating;
        System.out.println("Thanks for rating ");
        input.close();
    }

    public void getRating () {
        if (rating > -1) {
        System.out.println("Rating of " + videoName + " is : " + rating);
        } else {
            System.out.println("Rating not found!");
        }
    }

    public void doCheckout (){
        System.out.println("Enter the video name you want to  checkout: ");
        Scanner input = new Scanner(System.in);
        String videoname = input.next();
        if (videoName.equals(videoname) ){
            System.out.println("video checked-out sucessfully.");
        } else {
            System.out.println("video not found!");
        }
        input.close();
    }

    public void returnVideo(){
        System.out.println("Enter the video name ");
        Scanner input = new Scanner(System.in);
        String videoname = input.next();
        if (videoName.equals(videoname) ){
            System.out.println("video returned sucessfully.");
        } else {
            System.out.println("video not found!");
        }
        input.close();
    }
}

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        video v1 = new video();
        video v2 = new video();
        video v3 = new video();
        video v4 = new video();
        video v5 = new video();

        System.out.println("===================================================");
        v1.setVideoname("Avatar");
        v2.setVideoname("Titanic");
        v3.setVideoname("The Dark Knight");
        v4.setVideoname("The Avengers");
        v5.setVideoname("The Lion King");


        System.out.println("List of videos: ");
        System.out.println(v1.getVideoname());
        System.out.println(v2.getVideoname());
        System.out.println(v3.getVideoname());
        System.out.println(v4.getVideoname());
        System.out.println(v5.getVideoname());
        System.out.println("===================================================");

        v1.doCheckout();
        v1.addRating();
        v1.getRating();
        v1.returnVideo();
    }
}