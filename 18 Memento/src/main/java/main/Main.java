package main;
public class Main {
  public static void main(String[] args) {
    final History history = new History();
    TextEditor textEditor = new TextEditor();

    textEditor.setText("Text");
    textEditor.setCursorPosition(new int[]{1, 2});
    textEditor.setPositionScroll(0);

    history.addSnapshot(textEditor.save());

    textEditor.setText("Text text");
    textEditor.setCursorPosition(new int[]{2, 2});
    textEditor.setPositionScroll(2);

    history.addSnapshot(textEditor.save());

    textEditor.setText("et");
    textEditor.setCursorPosition(new int[]{-1, -2});
    textEditor.setPositionScroll(4);

    System.out.println(textEditor);

    textEditor.load(history.getPrev());
    System.out.println(textEditor);

    textEditor.load(history.getPrev());
    System.out.println(textEditor);
  }
}
