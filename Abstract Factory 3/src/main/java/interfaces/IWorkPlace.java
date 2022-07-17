package interfaces;

/**
 * interface for workplace.
 */
public interface IWorkPlace {
  /**
   * @param chair workplace chair.
   */
  void setChair(IChair chair);

  /**
   * @param computer workplace computer.
   */
  void setComputer(IComputer computer);

  /**
   * @param phone workplace phone.
   */
  void setPhone(IPhone phone);

  /**
   * @param table workplace table.
   */
  void setTable(ITable table);
}
