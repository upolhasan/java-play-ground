package upol.json;

import java.io.File;
    import com.fasterxml.jackson.databind.JsonNode;
    import com.fasterxml.jackson.databind.ObjectMapper;
    import com.fasterxml.jackson.databind.node.ArrayNode;
    import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonTraverser {
    public static void main(String[] args) throws Exception {
        File inputJsonFile = new File("acronyms.txt");
        File outputJsonFile = new File("output.json");
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(inputJsonFile);
        if (rootNode.isArray()) {
            ArrayNode arrayNode = (ArrayNode) rootNode;
            for (JsonNode node : arrayNode) {
                if (node.isObject()) {
                    ObjectNode objectNode = (ObjectNode) node;
                    objectNode.remove("authors");
                }
            }
        }
        mapper.writeValue(outputJsonFile, rootNode);
    }
}

