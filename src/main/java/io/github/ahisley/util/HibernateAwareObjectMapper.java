package io.github.ahisley.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;

public class HibernateAwareObjectMapper extends ObjectMapper{

	//Used to bootstrap better hibernate interactions for Jackson object mapper
	public HibernateAwareObjectMapper() {
		Hibernate4Module module = new Hibernate4Module();		
		module.enable(Hibernate4Module.Feature.SERIALIZE_IDENTIFIER_FOR_LAZY_NOT_LOADED_OBJECTS);
		
		//For reference, disables the new feature which prevents marshaling of fields using the @Transient annotation
		//module.disable(Feature.USE_TRANSIENT_ANNOTATION);
		
		registerModule(module);
	}
}
