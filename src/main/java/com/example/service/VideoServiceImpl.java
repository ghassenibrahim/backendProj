package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Video;
import com.example.repository.VideoRepository;

@Service
public class VideoServiceImpl implements VideoService {
	@Autowired
	private VideoRepository videoRepository;

	@Override
	public List<Video> getAllVideos() {
		
		return videoRepository.findAll();
	}

	@Override
	public Video findById(Integer id) {
		Optional<Video>video=videoRepository.findById(id);
		return video.isPresent()? video.get() : null;
		}

	@Override
	public Video update(Video video) {
		
		return videoRepository.save(video);
	}

	@Override
	public Video add(Video video) {
		return videoRepository.save(video);
	}

	@Override
	public void delete(Integer id) {
		 videoRepository.deleteById(id);
	}
	
}
