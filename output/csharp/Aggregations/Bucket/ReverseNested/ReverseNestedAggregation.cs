using Nest.CommonAbstractions;
using Nest.Internal;
using System;
using System.Collections.Generic;
using System.Runtime.Serialization;
namespace Nest.Aggregations {

	public class ReverseNestedAggregation  {
		
		[DataMember(Name="path")]
		public Field Path { get; set; }

	}
}
