package com.team341.daisycv;

/**
 * Created by joshs on 5/16/2017.
 */

public class ImageProcessor {
  // Used to load the 'native-lib' library on application startup.
  static {
    System.loadLibrary("native-lib");
  }

  public static native void processImage(int texIn, int texOut, int width, int height);
}
