@rest_spec_name("indices.close")
class CloseIndexRequest extends RequestBase {
  query_parameters: {
    allow_no_indices: boolean;
    expand_wildcards: ExpandWildcards;
    ignore_unavailable: boolean;
    master_timeout: Time;
    timeout: Time;
    wait_for_active_shards: string;
  }
  body: {
  }
}
