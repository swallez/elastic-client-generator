@class_serializer("QueryContainerInterfaceFormatter")
class QueryContainer {
	bool: BoolQuery;
	boosting: BoostingQuery;
	common: CommonTermsQuery;
	constant_score: ConstantScoreQuery;
	dis_max: DisMaxQuery;
	distance_feature: DistanceFeatureQuery;
	exists: ExistsQuery;
	function_score: FunctionScoreQuery;
	fuzzy: FuzzyQuery;
	geo_bounding_box: GeoBoundingBoxQuery;
	geo_distance: GeoDistanceQuery;
	geo_polygon: GeoPolygonQuery;
	geo_shape: GeoShapeQuery;
	has_child: HasChildQuery;
	has_parent: HasParentQuery;
	ids: IdsQuery;
	intervals: IntervalsQuery;
	is_conditionless: boolean;
	is_strict: boolean;
	is_verbatim: boolean;
	is_writable: boolean;
	match: MatchQuery;
	match_all: MatchAllQuery;
	match_bool_prefix: MatchBoolPrefixQuery;
	match_none: MatchNoneQuery;
	match_phrase: MatchPhraseQuery;
	match_phrase_prefix: MatchPhrasePrefixQuery;
	more_like_this: MoreLikeThisQuery;
	multi_match: MultiMatchQuery;
	nested: NestedQuery;
	parent_id: ParentIdQuery;
	percolate: PercolateQuery;
	pinned: PinnedQuery;
	prefix: PrefixQuery;
	query_string: QueryStringQuery;
	range: RangeQuery;
	rank_feature: RankFeatureQuery;
	raw_query: RawQuery;
	regexp: RegexpQuery;
	script: ScriptQuery;
	script_score: ScriptScoreQuery;
	shape: ShapeQuery;
	simple_query_string: SimpleQueryStringQuery;
	span_containing: SpanContainingQuery;
	field_masking_span: SpanFieldMaskingQuery;
	span_first: SpanFirstQuery;
	span_multi: SpanMultiTermQuery;
	span_near: SpanNearQuery;
	span_not: SpanNotQuery;
	span_or: SpanOrQuery;
	span_term: SpanTermQuery;
	span_within: SpanWithinQuery;
	term: TermQuery;
	terms: TermsQuery;
	terms_set: TermsSetQuery;
	wildcard: WildcardQuery;
}
