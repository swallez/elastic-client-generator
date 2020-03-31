
package org.elasticsearch.analysis.token_filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class TokenFilterBase  {
  
  private String _type;
  public String getType() { return this._type; }
  public TokenFilterBase setType(String val) { this._type = val; return this; }


  private String _version;
  public String getVersion() { return this._version; }
  public TokenFilterBase setVersion(String val) { this._version = val; return this; }

}
