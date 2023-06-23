package com.esprit.projet.voyageaffaire.enums;

import java.util.LinkedHashMap;
import java.util.Map;

public enum ActionType {

	Ajout {
		public String getValue() {
			return "Ajout";
		}
	},
	Modification {
		public String getValue() {
			return "Modification";
		}
	},
	Suppression {
		public String getValue() {
			return "Suppression";
		}
	},
	
	Accept {
		public String getValue() {
			return "Accept";
		}
	},
	
	Cancel {
		public String getValue() {
			return "Cancel";
		}
	},
	
	Consultation {
		public String getValue() {
			return "Consultation";
		}
	};

	
	public static Map<String, ActionType> getValues() {
		Map<String, ActionType> values = new LinkedHashMap<>();
		values.put("Ajout", Ajout);
		values.put("Modification", Modification);
		values.put("Suppression", Suppression);
		values.put("Accept", Accept);
		values.put("Cancel", Cancel);
		values.put("Consultation", Consultation);
		return values;
	}
	
	
}
