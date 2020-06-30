
package org.elasticsearch.aggregations.metric.percentiles.methods;

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


public class PercentilesMethod  implements XContentable<PercentilesMethod> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    
    builder.endObject();
    return builder;
  }

  @Override
  public PercentilesMethod fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PercentilesMethod.PARSER.apply(parser, null);
  }

  public static final ObjectParser<PercentilesMethod, Void> PARSER =
    new ObjectParser<>(PercentilesMethod.class.getName(), false, PercentilesMethod::new);

  static {
    
  }

}
