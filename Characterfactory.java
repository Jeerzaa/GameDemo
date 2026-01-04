import java.util.Hashmap;
import java.util.Map;
import java.util.function.Supplier;

public class Characterfactory {
    private static final Map<String, Supplier<character>> characterMap = new HashMap<>();

    static {
        characterMap.put("warrior", warrior::new);
        characterMap.put("mage", mage::new);
        characterMap.put("archer", archer::new);
    }

    public static character createCharacter(String type) {
        Supplier<character> characterSupplier = characterMap.get(type.toLowerCase());
        if (characterSupplier != null) {
            return characterSupplier.get();
        }
        throw new IllegalArgumentException("Unknown character type: " + type);
    }
}