import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.google.common.io.Resources;

/**
 * Copyright (C) 2022 Urban Compass, Inc.
 */

public class FastjsonSerialization {

  private static void serializeTo(String fileName) throws IOException {
    Employee employee = new Employee(3, "Bob");
    FileOutputStream outputStream = new FileOutputStream(fileName);
    JSON.writeJSONString(outputStream, employee, SerializerFeature.EMPTY);
    outputStream.close();
    System.out.println("Serialize Done.");
  }

  private static void deserializeFrom(String fileName) throws IOException {
    String content = Files.readString(Paths.get(fileName));
    System.out.println("Read: " + content);

    Employee employee = JSON.parseObject(content, Employee.class);
    System.out.println("Read: " + employee);

    System.out.println("Deserialize Done.");
  }

  public static void main(String[] args) throws IOException {
    String fileName = Resources.getResource("").getPath() + "/fastjson";
    // serializeTo(fileName);
    deserializeFrom(fileName);
  }
}
