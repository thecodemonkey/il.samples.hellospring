package il.samples.hellospring.controller.errors;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {
    private Date timestamp;
    private int status;
    private String message;
    private String error;
    private String path;
    private String version;
}
