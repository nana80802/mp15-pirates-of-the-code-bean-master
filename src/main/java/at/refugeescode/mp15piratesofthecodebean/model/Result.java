package at.refugeescode.mp15piratesofthecodebean.model;

import org.springframework.stereotype.Service;

@Service
public class Result {
    private String message;
    private boolean enable1;
    private boolean enable2;
    private boolean enable3;

    public Result() {
    }

    public Result(String message, Boolean enable1, Boolean enable2, Boolean enable3) {
        this.message = message;
        this.enable1 = enable1;
        this.enable2 = enable2;
        this.enable3 = enable3;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getEnable1() {
        return enable1;
    }

    public void setEnable1(Boolean enable1) {
        this.enable1 = enable1;
    }

    public Boolean getEnable2() {
        return enable2;
    }

    public void setEnable2(Boolean enable2) {
        this.enable2 = enable2;
    }

    public Boolean getEnable3() {
        return enable3;
    }

    public void setEnable3(Boolean enable3) {
        this.enable3 = enable3;
    }
}
