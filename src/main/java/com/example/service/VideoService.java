package com.example.service;

import java.util.List;

import com.example.model.Video;

public interface VideoService {
	
	public List<Video> getAllVideos();
	public Video findById(Integer id);
	public Video update(Video video);
	public Video add(Video video);
	public void delete(Integer id);
}
