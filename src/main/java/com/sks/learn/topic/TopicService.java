package com.sks.learn.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<Topic>();
	{
		topics.add(new Topic("111", "HTML1"));
		topics.add(new Topic("222", "CSS2"));
		topics.add(new Topic("333", "JavaScript"));
		topics.add(new Topic("444", "Java"));
		topics.add(new Topic("555", "J2EE"));
	}

	public List<Topic> getTopicList() {
		return topics;
	}

	public Topic getTopicById(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
}
