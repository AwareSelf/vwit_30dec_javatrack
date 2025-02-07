package nama.springboot.usingprofiledemo;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
//@PropertySource("classpath:global.properties") //needed if properties file name is anything other than application.properties
@ConfigurationProperties
@Validated
public class GlobalProperties {

  @NotEmpty
  private String email;

  @Max(15)
  @Min(0)
  private int threadPool;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getThreadPool() {
        return threadPool;
    }

    public void setThreadPool(int threadPool) {
        this.threadPool = threadPool;
    }
}
