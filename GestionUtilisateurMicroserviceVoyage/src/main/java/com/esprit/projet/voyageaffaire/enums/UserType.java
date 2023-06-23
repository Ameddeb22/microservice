package com.esprit.projet.voyageaffaire.enums;

import java.util.LinkedHashMap;
import java.util.Map;

public enum UserType {

	Personne_morale {
		public String getValue() {
			return "Personne_morale";
		}
	},
	Personne_physique {
		public String getValue() {
			return "Personne_physique";
		}
	};

	public static Map<String, UserType> getValues() {
		Map<String, UserType> values = new LinkedHashMap<>();
		values.put("Personne_morale", Personne_morale);
		values.put("Personne_physique", Personne_physique);

		return values;
	}
	
	
}
