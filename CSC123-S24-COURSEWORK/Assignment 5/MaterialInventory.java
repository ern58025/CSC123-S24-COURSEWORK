import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaterialInventory {
    private Map<Integer, ReferenceMaterial> materials;

    public MaterialInventory() {
        materials = new HashMap<>();
    }

    public void addMaterial(ReferenceMaterial material) {
        materials.put(material.getItemReference(), material);
    }

    public ReferenceMaterial getMaterial(int itemReference) {
        return materials.get(itemReference);
    }
}