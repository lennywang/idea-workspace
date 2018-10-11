package ch2.springel;

import org.springframework.beans.factory.annotation.Value;

public class DemoService {
    @Value("其他类的属性")
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
