package xyz.romakononovich.firebase;

/**
 * Created by romank on 13.06.17.
 */

public class Message {
    private String time;
    private String message;
    private String title;
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return "Message{" +
                "time='" + time + '\'' +
                ", message='" + message + '\'' +
                ", title='" + title + '\'' +
                ", id=" + id +
                '}';
    }
}
