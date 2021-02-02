package homework8.entities.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CheckTextDto {

    private String code;
    private String word;
    private String[] s;
    private String pos;
    private String row;
    private String col;
    private String len;

}
