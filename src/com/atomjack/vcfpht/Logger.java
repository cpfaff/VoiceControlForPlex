package com.atomjack.vcfpht;

import android.util.Log;

/**
 * Created by chris on 1/28/14.
 */
public class Logger
{
  public static void i(String format, Object ... args)
  {
    String msg = String.format(format, args);
    Log.i("VoiceControlForPlexHomeTheater", msg);
  }

  public static void d(String format, Object ... args)
  {
    String msg = String.format(format, args);
    Log.d("VoiceControlForPlexHomeTheater", msg);
  }

  public static void w(String format, Object ... args)
  {
    String msg = String.format(format, args);
    Log.w("VoiceControlForPlexHomeTheater", msg);
  }

  public static void e(String format, Object ... args)
  {
    String msg = String.format(format, args);
    Log.e("VoiceControlForPlexHomeTheater", msg);
  }
}
