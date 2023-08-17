package main;

import java.util.ArrayList;
import java.util.List;

public class History<T> {
  private final List<T> list = new ArrayList<>();
  private int index = -1;

  public History() {
  }

  public void addSnapshot(T snapshot) {

    if (index != list.size() - 1) {
      int n = index + 1;

      while (list.size() >= n) {
        list.remove(n);
      }
    }

    list.add(snapshot);

    index++;
  }

  public T undo() {
    index--;

    if (index == -1) {
      return null;
    }

    return list.get(index);
  }

  public T redo() {
    if (index != list.size() - 1) {
      index++;
    }

    return list.get(index);
  }
}
