
package org.elasticsearch.x_pack.watcher.deactivate_watch;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.activate_watch.*;

public class DeactivateWatchResponse  {
  
  private ActivationStatus _status;
  public ActivationStatus getStatus() { return this._status; }
  public DeactivateWatchResponse setStatus(ActivationStatus val) { this._status = val; return this; }

}
