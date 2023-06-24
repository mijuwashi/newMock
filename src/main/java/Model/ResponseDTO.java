package Model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class ResponseDTO {

    private String rquID;
    private String clientId;
    private String account;
    private String currency;
    private String balance;
    private String maxLimit;
}
