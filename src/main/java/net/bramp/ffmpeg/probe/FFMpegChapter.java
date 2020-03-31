
package net.bramp.ffmpeg.probe;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FFMpegChapter {

  @SerializedName("id")
  @Expose
  public int id;

  @SerializedName("time_base")
  @Expose
  public String timeBase;

  @SerializedName("start")
  @Expose
  public int start;

  @SerializedName("start_time")
  @Expose
  public String startTime;

  @SerializedName("end")
  @Expose
  public int end;

  @SerializedName("end_time")
  @Expose
  public String endTime;

  @SerializedName("tags")
  @Expose
  public FFMpegChapterTag tags;
}
