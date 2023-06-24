package com.esprit.projet.enums;

import java.util.LinkedHashMap;
import java.util.Map;


public enum InvitationType{

	RejoindrePlateform {
		public String getValue() {
			return "RejoindrePlateform";
		}
	},
	Voyage {
		public String getValue() {
			return "Voyage";
		}
	};

	public static Map<String, InvitationType> getValues() {
		Map<String, InvitationType> values = new LinkedHashMap<>();
		values.put("RejoindrePlateform", RejoindrePlateform);
		values.put("Voyage", Voyage);

		return values;
	}
}// end enum

