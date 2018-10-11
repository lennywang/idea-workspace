package ch2.el;

import org.springframework.beans.factory.annotation.Value;

public class DemoService {

    @Value("其他类的属性")
    private String anthor;

    public String getAnthor() {
        return anthor;
    }

    public void setAnthor(String anthor) {
        this.anthor = anthor;
    }
}
