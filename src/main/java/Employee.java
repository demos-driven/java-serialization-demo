import java.io.Serializable;

/**
 * Copyright (C) ${YEAR} Urban Compass, Inc.
 */
public class Employee implements Serializable {
  private static final long serialVersionUID = -4432835278431659535L;
  private int id;
  private String name;

  // Required for Jackson ObjectMapper
  public Employee() {
  }

  public Employee(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
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