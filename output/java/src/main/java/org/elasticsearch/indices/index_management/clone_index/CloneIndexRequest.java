
package org.elasticsearch.indices.index_management.clone_index;

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
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.indices.alias_management.*;
import org.elasticsearch.common_options.time_unit.*;

public class CloneIndexRequest  implements XContentable<CloneIndexRequest> {
  
  static final ParseField ALIASES = new ParseField("aliases");
  private NamedContainer<IndexName, Alias> _aliases;
  public NamedContainer<IndexName, Alias> getAliases() { return this._aliases; }
  public CloneIndexRequest setAliases(NamedContainer<IndexName, Alias> val) { this._aliases = val; return this; }


  static final ParseField SETTINGS = new ParseField("settings");
  private NamedContainer<String, Object> _settings;
  public NamedContainer<String, Object> getSettings() { return this._settings; }
  public CloneIndexRequest setSettings(NamedContainer<String, Object> val) { this._settings = val; return this; }


  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public CloneIndexRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  static final ParseField TIMEOUT = new ParseField("timeout");
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public CloneIndexRequest setTimeout(Time val) { this._timeout = val; return this; }


  static final ParseField WAIT_FOR_ACTIVE_SHARDS = new ParseField("wait_for_active_shards");
  private String _waitForActiveShards;
  public String getWaitForActiveShards() { return this._waitForActiveShards; }
  public CloneIndexRequest setWaitForActiveShards(String val) { this._waitForActiveShards = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    if (_aliases != null) {
      builder.field(ALIASES.getPreferredName());
      _aliases.toXContent(builder, params);
    }
    if (_settings != null) {
      builder.field(SETTINGS.getPreferredName());
      _settings.toXContent(builder, params);
    }
    if (_masterTimeout != null) {
      builder.field(MASTER_TIMEOUT.getPreferredName());
      _masterTimeout.toXContent(builder, params);
    }
    if (_timeout != null) {
      builder.field(TIMEOUT.getPreferredName());
      _timeout.toXContent(builder, params);
    }
    builder.field(WAIT_FOR_ACTIVE_SHARDS.getPreferredName(), _waitForActiveShards);
    builder.endObject();
    return builder;
  }

  @Override
  public CloneIndexRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CloneIndexRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CloneIndexRequest, Void> PARSER =
    new ConstructingObjectParser<>(CloneIndexRequest.class.getName(), false, args -> new CloneIndexRequest());

  static {
    PARSER.declareObject(CloneIndexRequest::setAliases, (p, t) -> new NamedContainer<>(n -> () -> new IndexName(n),pp -> Alias.PARSER.apply(pp, null)), ALIASES);
    PARSER.declareObject(CloneIndexRequest::setSettings, (p, t) -> new NamedContainer<>(n -> () -> n,XContentParser::binaryValue), SETTINGS);
    PARSER.declareObject(CloneIndexRequest::setMasterTimeout, (p, t) -> Time.PARSER.apply(p, t), MASTER_TIMEOUT);
    PARSER.declareObject(CloneIndexRequest::setTimeout, (p, t) -> Time.PARSER.apply(p, t), TIMEOUT);
    PARSER.declareString(CloneIndexRequest::setWaitForActiveShards, WAIT_FOR_ACTIVE_SHARDS);
  }

}
