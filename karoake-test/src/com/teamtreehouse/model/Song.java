package com.teamtreehouse.model;

import java.util.Objects;

public class Song {
  protected String mArtist;
  protected String mTitle;
  protected String mVideoUrl;
  
  public Song(String artist, String title, String videoUrl) {
    mArtist = artist;
    mTitle = title;
    mVideoUrl = videoUrl;
  }
  
  public String getTitle() {
    return mTitle;
  }
  
  public String getArtist() {
    return mArtist;
  }
  
  public String getVideoUrl() {
    return mVideoUrl;
  }

  public boolean equals(Object object) {
    if (this == object) return true;
    if (object == null || getClass() != object.getClass()) return false;
    if (!super.equals(object)) return false;
    Song song = (Song) object;
    return java.util.Objects.equals(mArtist, song.mArtist) &&
            java.util.Objects.equals(mTitle, song.mTitle) &&
            java.util.Objects.equals(mVideoUrl, song.mVideoUrl);
  }

  public int hashCode() {
    return Objects.hash(super.hashCode(), mArtist, mTitle, mVideoUrl);
  }

  @Override
  public String toString() {
    return String.format("Song:  %s by %s", mTitle, mArtist);
  }
}