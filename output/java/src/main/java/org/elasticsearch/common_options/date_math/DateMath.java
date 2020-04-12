
package org.elasticsearch.common_options.date_math;

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


public class DateMath  implements XContentable<DateMath> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    
    builder.endObject();
    return builder;
  }

  @Override
  public DateMath fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DateMath.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DateMath, Void> PARSER =
    new ConstructingObjectParser<>(DateMath.class.getName(), false, args -> new DateMath());

  static {
    
  }

}
