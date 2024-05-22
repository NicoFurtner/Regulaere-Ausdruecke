import java.util.ArrayList;
import java.util.List;

/**
 * REgex KLasse von Furtner Nico
 * @author Nico Furtner
 * @version 2024-05-22
 */
public class Regex {
    private List<String> strings;
    private String regex;
    public Regex() {
        strings = new ArrayList<>();
        regex = "^(?!-)(?!.*--)([a-zA-Z0-9-]+\\.)*[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}(?<!-)$|^(?:(?:25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\.){3}(?:25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])$";
    }
}