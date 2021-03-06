using Nest.Internal;
using Nest.Mapping;
using System;
using System.Collections.Generic;
using System.Runtime.Serialization;
namespace Nest.Mapping {

	public class RangePropertyBase : DocValuesPropertyBase {
		
		[DataMember(Name="boost")]
		public double Boost { get; set; }


		[DataMember(Name="coerce")]
		public bool Coerce { get; set; }


		[DataMember(Name="index")]
		public bool Index { get; set; }

	}
}
