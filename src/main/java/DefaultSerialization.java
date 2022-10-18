import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.google.common.io.Resources;

/**
 * Copyright (C) 2022 Urban Compass, Inc.
 */

public class DefaultSerialization {

  private static void show_serialized_bytes(byte[] bytes) {
    System.out.print("byte[]: ");
    for (byte byteVal : bytes) {
      System.out.print(String.format("%-8d ", byteVal));
    }
    System.out.print("\nbinary: ");
    for (byte byteValue : bytes) {
      System.out.print(Integer.toBinaryString((byteValue & 0xFF) + 256).substring(1) + " ");
    }
    System.out.println();
  }

  private static void serializeTo(String fileName) throws IOException {
    ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    try (ObjectOutputStream output = new ObjectOutputStream(buffer)) {
      output.writeInt(10086);
      output.writeUTF("Hello Compass!");
      output.writeObject(new Employee(1, "Litong Deng"));
    }

    show_serialized_bytes(buffer.toByteArray());

    FileOutputStream file = new FileOutputStream(fileName);
    buffer.writeTo(file);
    buffer.close();
    System.out.println("Serialize Done.");
  }

  private static void deserializeFrom(String fileName) throws IOException, ClassNotFoundException {
    FileInputStream file = new FileInputStream(fileName);
    try (ObjectInputStream input = new ObjectInputStream(file)) {
      int num = input.readInt();
      String str = input.readUTF();
      Employee employee = (Employee)input.readObject();
      System.out.println(String.format("Read: %d %s %s", num, str, employee));
    }
    System.out.println("Deserialize Done.");
  }

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    String fileName = Resources.getResource("").getPath() + "/default";
    serializeTo(fileName);
    // deserializeFrom(fileName);
  }
}
