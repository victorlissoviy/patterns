package main;

import dao.VideoDAOProxy;
import videos.TypeVideo;
import videos.Video;

/**
 * Main class.
 */
public final class Main {
  /**
   * private constructor.
   */
  private Main() {
  }

  /**
   * Main method.
   *
   * @param args console args.
   */
  public static void main(final String[] args) {
    VideoDAOProxy videoDAOProxy = new VideoDAOProxy();
    videoDAOProxy.addVideo(new Video("Pavlo", TypeVideo.UP18));
    videoDAOProxy.addVideo(new Video("Як приборкати дракона", TypeVideo.ALL));
    videoDAOProxy.addVideo(new Video("Розсміши коміка", TypeVideo.UP12));

    System.out.println(videoDAOProxy
            .getVideoByName("Pavlo", TypeVideo.UP18));
    System.out.println(videoDAOProxy
            .getVideoByName("Pavlo", TypeVideo.UP16));
    System.out.println(videoDAOProxy
            .getVideoByName("Як приборкати дракона", TypeVideo.ALL));
  }
}
