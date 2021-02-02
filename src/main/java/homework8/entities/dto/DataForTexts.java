package homework8.entities.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataForTexts {

    private String[] text;
    private String lang;
    private String options;
    private String[] word;
    private String[] s;
    private String code;

}
