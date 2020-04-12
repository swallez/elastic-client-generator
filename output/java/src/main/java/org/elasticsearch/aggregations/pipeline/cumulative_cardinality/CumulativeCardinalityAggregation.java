
package org.elasticsearch.aggregations.pipeline.cumulative_cardinality;

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


public class CumulativeCardinalityAggregation  implements XContentable<CumulativeCardinalityAggregation> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    
    builder.endObject();
    return builder;
  }

  @Override
  public CumulativeCardinalityAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CumulativeCardinalityAggregation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CumulativeCardinalityAggregation, Void> PARSER =
    new ConstructingObjectParser<>(CumulativeCardinalityAggregation.class.getName(), false, args -> new CumulativeCardinalityAggregation());

  static {
    
  }

}
