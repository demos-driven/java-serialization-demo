import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.google.common.io.Resources;

/**
 * Copyright (C) 2022 Urban Compass, Inc.
 */

public class DefaultSerialization {

  static class Employee implements Serializable {
    private static final long serialVersionUID = -4432835278431659535L;
    private int id;
    private String name;

    public Employee(int id, String name) {
      this.id = id;
      this.name = name;
    }

    @Override
    public String toString() {
      return "Employee{" +
          "id=" + id +
          ", name='" + name + '\'' +
          '}';
    }
  }

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
  }

  private static void deserializeFrom(String fileName) throws IOException, ClassNotFoundException {
    FileInputStream file = new FileInputStream(fileName);
    try (ObjectInputStream input = new ObjectInputStream(file)) {
      int num = input.readInt();
      String str = input.readUTF();
      Employee employee = (Employee)input.readObject();
      System.out.println(String.format("Read: %d %s %s", num, str, employee));
    }
  }

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    String fileName = Resources.getResource("").getPath() + "/simple";
    serializeTo(fileName);
    // deserializeFrom(fileName);
  }
}
