package com.spring.action.chapter1;

public class DamselRescuingKnight implements Knight{

	private RescueDamselQuest quest;
	
	public DamselRescuingKnight() {
		this.quest = new RescueDamselQuest();
	}
	
	public void embarkOnQuest() {
		quest.embark();
	}
}
