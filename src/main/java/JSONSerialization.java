import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.io.Resources;

/**
 * Copyright (C) 2022 Urban Compass, Inc.
 */

public class JSONSerialization {

  private static void serializeTo(String fileName) throws IOException {
    ObjectMapper objectMapper = new ObjectMapper();
    Employee employee = new Employee(2, "Jack");
    objectMapper.writeValue(new File(fileName), employee);
    System.out.println("Serialize Done.");
  }

  private static void deserializeFrom(String fileName) throws IOException, ClassNotFoundException {
    String content = Files.readString(Paths.get(fileName));
    System.out.println("Read: " + content);

    ObjectMapper objectMapper = new ObjectMapper();
    Employee employee = objectMapper.readValue(content, Employee.class);
    System.out.println("Read: " + employee);

    System.out.println("Deserialize Done.");
  }

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    String fileName = Resources.getResource("").getPath() + "/json";
    // serializeTo(fileName);
    deserializeFrom(fileName);
  }
}
