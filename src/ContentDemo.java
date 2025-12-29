import java.util.ArrayList;
import java.util.List;

public class ContentDemo {
    public static void main(String[] args) {
        List<ContentItem> items = new ArrayList<>();


        items.add(new VideoLecture("Java Basics", 2023, 45, "4K"));
        items.add(new VideoLecture("Spring Boot Intro", 2021, 120, "HD"));
        items.add(new PodcastEpisode("Tech Talk", 2024, 30, "Alice"));
        items.add(new PodcastEpisode("Dev Life", 2020, 60, "Bob"));

        int currentYear = java.time.Year.now().getValue();


        for (ContentItem item : items) {
            System.out.println(item.toString() + " | License Cost: $" + item.getLicenseCost(currentYear));

            if (item instanceof Downloadable) {
                Downloadable d = (Downloadable) item;
                d.download();
                System.out.println("Max downloads/day: " + d.getMaxDownloadsPerDay());
            }
            System.out.println("-------------------------------------------");
        }
    }
}