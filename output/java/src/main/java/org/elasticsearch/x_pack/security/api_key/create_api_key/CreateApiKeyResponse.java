
package org.elasticsearch.x_pack.security.api_key.create_api_key;

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
import org.elasticsearch.internal.*;

public class CreateApiKeyResponse  implements XContentable<CreateApiKeyResponse> {
  
  static final ParseField ID = new ParseField("id");
  private String _id;
  public String getId() { return this._id; }
  public CreateApiKeyResponse setId(String val) { this._id = val; return this; }


  static final ParseField NAME = new ParseField("name");
  private String _name;
  public String getName() { return this._name; }
  public CreateApiKeyResponse setName(String val) { this._name = val; return this; }


  static final ParseField EXPIRATION = new ParseField("expiration");
  private Date _expiration;
  public Date getExpiration() { return this._expiration; }
  public CreateApiKeyResponse setExpiration(Date val) { this._expiration = val; return this; }


  static final ParseField API_KEY = new ParseField("api_key");
  private String _apiKey;
  public String getApiKey() { return this._apiKey; }
  public CreateApiKeyResponse setApiKey(String val) { this._apiKey = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    builder.field(ID.getPreferredName(), _id);
    builder.field(NAME.getPreferredName(), _name);
    builder.field(EXPIRATION.getPreferredName(),
      DateTimeFormatter.ISO_DATE.format(_expiration.toInstant()));
    builder.field(API_KEY.getPreferredName(), _apiKey);
    builder.endObject();
    return builder;
  }

  @Override
  public CreateApiKeyResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CreateApiKeyResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CreateApiKeyResponse, Void> PARSER =
    new ConstructingObjectParser<>(CreateApiKeyResponse.class.getName(), false, args -> new CreateApiKeyResponse());

  static {
    PARSER.declareString(CreateApiKeyResponse::setId, ID);
    PARSER.declareString(CreateApiKeyResponse::setName, NAME);
    PARSER.declareObject(CreateApiKeyResponse::setExpiration, (p, t) -> Date.from(Instant.from(DateTimeFormatter.ISO_DATE.parse(p.text()))), EXPIRATION);
    PARSER.declareString(CreateApiKeyResponse::setApiKey, API_KEY);
  }

}
