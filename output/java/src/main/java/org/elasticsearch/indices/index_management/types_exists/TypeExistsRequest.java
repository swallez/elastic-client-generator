
package org.elasticsearch.indices.index_management.types_exists;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.common.*;

public class TypeExistsRequest  implements XContentable<TypeExistsRequest> {
  
  static final ParseField ALLOW_NO_INDICES = new ParseField("allow_no_indices");
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public TypeExistsRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  static final ParseField EXPAND_WILDCARDS = new ParseField("expand_wildcards");
  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public TypeExistsRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  static final ParseField IGNORE_UNAVAILABLE = new ParseField("ignore_unavailable");
  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public TypeExistsRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  static final ParseField LOCAL = new ParseField("local");
  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public TypeExistsRequest setLocal(Boolean val) { this._local = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    builder.field(ALLOW_NO_INDICES.getPreferredName(), _allowNoIndices);
    if (_expandWildcards != null) {
      builder.field(EXPAND_WILDCARDS.getPreferredName());
      _expandWildcards.toXContent(builder, params);
    }
    builder.field(IGNORE_UNAVAILABLE.getPreferredName(), _ignoreUnavailable);
    builder.field(LOCAL.getPreferredName(), _local);
    builder.endObject();
    return builder;
  }

  @Override
  public TypeExistsRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return TypeExistsRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<TypeExistsRequest, Void> PARSER =
    new ConstructingObjectParser<>(TypeExistsRequest.class.getName(), false, args -> new TypeExistsRequest());

  static {
    PARSER.declareBoolean(TypeExistsRequest::setAllowNoIndices, ALLOW_NO_INDICES);
    PARSER.declareObject(TypeExistsRequest::setExpandWildcards, (p, t) -> ExpandWildcards.PARSER.apply(p), EXPAND_WILDCARDS);
    PARSER.declareBoolean(TypeExistsRequest::setIgnoreUnavailable, IGNORE_UNAVAILABLE);
    PARSER.declareBoolean(TypeExistsRequest::setLocal, LOCAL);
  }

}
