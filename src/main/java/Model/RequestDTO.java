package Model;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class RequestDTO {

    private String rquID;
    private String clientId;
    private String account;
    private String openDate;
    private String closeDate;
}