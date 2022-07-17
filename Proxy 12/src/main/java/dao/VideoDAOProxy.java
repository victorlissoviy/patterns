package dao;

import videos.TypeVideo;
import videos.Video;

/**
 * Class proxy for Video DAO.
 */
public class VideoDAOProxy extends VideoDAO {
  /**
   * Get video by name and checking availability by age.
   *
   * @param name Video name.
   * @param type type of user to access.
   * @return video.
   */
  public Video getVideoByName(final String name, final TypeVideo type) {
    Video video = super.getVideoByName(name);
    if (video == null) {
      return null;
    }
    if (video.getTypeVideo().equals(type)) {
      return video;
    }
    return null;
  }
}
