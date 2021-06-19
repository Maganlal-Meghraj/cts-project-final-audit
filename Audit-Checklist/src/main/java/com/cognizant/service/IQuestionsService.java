package com.cognizant.service;

import java.util.List;

import com.cognizant.model.QuestionsEntity;

public interface IQuestionsService {
	public List<QuestionsEntity> getQuestions(String auditType);
	public List<QuestionsEntity> saveResponses(List<QuestionsEntity> questionsResponse);
}
