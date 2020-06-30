
package org.elasticsearch.common_options.shape;

import org.elasticsearch.XContentable;
import org.elasticsearch.common.CheckedFunction;
import org.elasticsearch.common.xcontent.*;
import java.io.IOException;

public enum ShapeRelation implements XContentable<ShapeRelation> {
  Intersects("intersects"),
    Disjoint("disjoint"),
    Within("within");
  private final String textRepresentation;

  private ShapeRelation(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return builder.value(this.textRepresentation);
  }

  @Override
  public ShapeRelation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PARSER.apply(parser);
  }

  public static final CheckedFunction<XContentParser, ShapeRelation, IOException> PARSER = (parser) -> {
    String text = parser.text();
    switch (text) {
      case "intersects": return ShapeRelation.Intersects;
      case "disjoint": return ShapeRelation.Disjoint;
      case "within": return ShapeRelation.Within;
      default:
        String message = java.lang.String.format("'%s' not a valid value for enum '%s'", text, ShapeRelation.class.getName());
        throw new XContentParseException(parser.getTokenLocation(), message);
    }
  };
}
