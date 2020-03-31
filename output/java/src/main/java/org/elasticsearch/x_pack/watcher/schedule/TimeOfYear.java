
package org.elasticsearch.x_pack.watcher.schedule;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.schedule.*;
import org.elasticsearch.internal.*;

public class TimeOfYear  {
  
  private String[] _at;
  public String[] getAt() { return this._at; }
  public TimeOfYear setAt(String[] val) { this._at = val; return this; }


  private Month[] _int;
  public Month[] getInt() { return this._int; }
  public TimeOfYear setInt(Month[] val) { this._int = val; return this; }


  private Integer[] _on;
  public Integer[] getOn() { return this._on; }
  public TimeOfYear setOn(Integer[] val) { this._on = val; return this; }

}
