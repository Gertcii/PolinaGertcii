package homework8.entities.dto;

import java.util.Arrays;
import java.util.Objects;

public class DataForTexts {
    private String[] text;
    private String lang;
    private String options;
    private String[] word;
    private String[] s;
    private String code;

    public String[] getText() {
        return text;
    }

    public void setText(String[] text) {
        this.text = text;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String[] getWord() {
        return word;
    }

    public void setWord(String[] word) {
        this.word = word;
    }

    public String[] getS() {
        return s;
    }

    public void setS(String[] s) {
        this.s = s;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataForTexts that = (DataForTexts) o;
        return Arrays.equals(text, that.text) && Objects.equals(lang, that.lang) && Objects.equals(options, that.options) && Arrays.equals(word, that.word) && Objects.equals(s, that.s) && Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(lang, options, s, code);
        result = 31 * result + Arrays.hashCode(text);
        result = 31 * result + Arrays.hashCode(word);
        return result;
    }

    @Override
    public String toString() {
        return "DataForTexts{" +
                "text=" + Arrays.toString(text) +
                ", lang='" + lang + '\'' +
                ", options='" + options + '\'' +
                ", word=" + Arrays.toString(word) +
                ", s='" + s + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
