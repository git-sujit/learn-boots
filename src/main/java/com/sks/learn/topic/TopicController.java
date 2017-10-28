package com.sks.learn.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;

	@RequestMapping("/topics")
	public List<Topic> getTopicList() {
		System.out.println("List of Topics");
		return topicService.getTopicList();
	}

	@RequestMapping("/topics/{id}")
	public Topic getTopicById(@PathVariable String id) {
		System.out.println("Topic By id");
		return topicService.getTopicById(id);
	}
}
