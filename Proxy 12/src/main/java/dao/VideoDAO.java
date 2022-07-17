package dao;

import videos.Video;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to control access to videos.
 */
public class VideoDAO {
  /**
   * List of videos in memory.
   */
  private final List<Video> listVideo;

  /**
   * constructor to create a simple VideoDAO.
   */
  public VideoDAO() {
    this.listVideo = new ArrayList<>();
  }

  /**
   * Add new video in memory.
   *
   * @param video Video.
   */
  public void addVideo(final Video video) {
    listVideo.add(video);
  }

  /**
   * get video by name.
   *
   * @param name Video name.
   * @return finded video or null if not.
   */
  public Video getVideoByName(final String name) {
    for (Video video : listVideo) {
      if (video.getName().equals(name)) {
        return video;
      }
    }
    return null;
  }

  /**
   * get List video.
   *
   * @return list video.
   */
  public List<Video> getListVideo() {
    return listVideo;
  }
}
