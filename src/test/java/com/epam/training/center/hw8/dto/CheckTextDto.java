package com.epam.training.center.hw8.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private String response;


    public String getCode() {
        return code;
    }

    public String getWord() {
        return word;
    }

    public String[] getS() {
        return s;
    }

    public String getPos() {
        return pos;
    }

    public String getRow() {
        return row;
    }

    public String getCol() {
        return col;
    }

    public String getLen() {
        return len;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setS(String[] s) {
        this.s = s;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public void setLen(String len) {
        this.len = len;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }
        if (!(o instanceof CheckTextDto)) {
            return false;
        }
        CheckTextDto ctd = (CheckTextDto) o;

        return Objects.equals(word, ctd.word) &&
                Objects.equals(s, ctd.s) &&
                Objects.equals(code, ctd.code) &&
                Objects.equals(pos, ctd.pos) &&
                Objects.equals(row, ctd.row) &&
                Objects.equals(col, ctd.col) &&
                Objects.equals(len, ctd.len);
    }
    @Override
    public int hashCode() {
        return Objects.hash(code, word, s, pos, row, col, len, response);
    }
}
