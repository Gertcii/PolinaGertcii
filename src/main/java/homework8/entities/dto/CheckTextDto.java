package homework8.entities.dto;

import java.util.Arrays;
import java.util.Objects;

public class CheckTextDto {
    private String code;
    private String word;
    private String[] s;
    private String pos;
    private String row;
    private String col;
    private String len;

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
        return Objects.hash(code, word, s, pos, row, col, len);
    }

    @Override
    public String toString() {
        return "CheckTextDto{" +
                "code='" + code + '\'' +
                ", word='" + word + '\'' +
                ", s=" + Arrays.toString(s) +
                ", pos='" + pos + '\'' +
                ", row='" + row + '\'' +
                ", col='" + col + '\'' +
                ", len='" + len + '\'' +
                '}';
    }
}
