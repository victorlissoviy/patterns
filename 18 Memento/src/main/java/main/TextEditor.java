package main;

import lombok.Getter;

import java.util.Arrays;

@Getter
public class TextEditor {
  private String text;
  private int[] cursorPosition;
  private int positionScroll;

  public TextEditor() {
  }

  public Snapshot save(){
    return new Snapshot(
            getText(),
            getCursorPosition(),
            getPositionScroll()
    );
  }

  public void load(Snapshot snapshot) {
    setText(snapshot.text());
    setCursorPosition(snapshot.cursorPosition());
    setPositionScroll(snapshot.positionScroll());
  }

  @Override
  public String toString() {
    return "TextEditor{" +
            "text='" + text + '\'' +
            ", cursorPosition=" + Arrays.toString(cursorPosition) +
            ", positionScroll=" + positionScroll +
            '}';
  }

  public void setText(String text) {
    this.text = text;
  }

  public void setCursorPosition(int[] cursorPosition) {
    this.cursorPosition = cursorPosition;
  }

  public void setPositionScroll(int positionScroll) {
    this.positionScroll = positionScroll;
  }
}
