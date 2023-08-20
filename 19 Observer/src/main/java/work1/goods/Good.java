package work1.goods;

import lombok.Getter;

@Getter
public class Good {
  private String name;

  private int count;

  public Good(String name) {
    this.setName(name);
    this.setCount(1);
  }

  public Good(String name, int count) {
    this.setName(name);
    this.setCount(count);
  }

  public void setCount(int count) {
    this.count = count;
  }

  void setName(String name) {
    this.name = name;
  }

  @Override
  public int hashCode() {
    return getName().hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (obj instanceof Good o) {
      return this.getName().equals(o.getName());
    }
    return false;
  }

  @Override
  public String toString() {
    return "Good{" +
            "name='" + name + '\'' +
            ", count=" + count +
            '}';
  }
}
