package videos;

/**
 * Class of video.
 */
public class Video {
  /**
   * Age limit video.
   */
  private TypeVideo typeVideo;

  /**
   * Video name.
   */
  private String name;

  /**
   * get video name.
   *
   * @return name.
   */
  public String getName() {
    return name;
  }

  /**
   * Set new video name.
   *
   * @param nameVideo video name.
   */
  public void setName(final String nameVideo) {
    this.name = nameVideo;
  }

  /**
   * Get age limit video.
   *
   * @return age limit.
   */
  public TypeVideo getTypeVideo() {
    return typeVideo;
  }

  /**
   * Set limit of video.
   *
   * @param type age video.
   */
  public void setTypeVideo(final TypeVideo type) {
    this.typeVideo = type;
  }

  /**
   * Constructor of video.
   *
   * @param videoName Video name.
   * @param type      age video.
   */
  public Video(final String videoName, final TypeVideo type) {
    setName(videoName);
    setTypeVideo(type);
  }

  /**
   * Get String from video.
   *
   * @return String line.
   */
  @Override
  public String toString() {
    return "Video{" + "typeVideo=" + typeVideo
            + ", name='" + name + '\'' + '}';
  }
}
