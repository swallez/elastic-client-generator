using Nest.CommonAbstractions;
using System;
using System.Collections.Generic;
using System.Runtime.Serialization;
namespace Nest.XPack {

	public class DeleteRoleMappingResponse : IResponse {
		
		[DataMember(Name="found")]
		public bool Found { get; set; }

	}
}
