package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Video;
import com.example.service.VideoService;

@CrossOrigin
@RestController
@RequestMapping("api/videos")
public class VideoController {
	@Autowired 
	private VideoService videoService;
	@GetMapping("")
	public List<Video> getAllVideos()
	{
	return videoService.getAllVideos();	
	}
	
	@GetMapping("/{id}")
	public Video getVideoById( @PathVariable Integer id) {
		return videoService.findById(id);
	}
	
	@PostMapping("")
	public Video addVideo(@RequestBody Video video) {
		return  videoService.add(video);
	}
	
	@PutMapping("/{id}")
	public Video updateVideo(@PathVariable Integer id, @RequestBody Video video) {
	  return videoService.update(video);
}
	@DeleteMapping("/{id}")
	public void deleteVideo(@PathVariable Integer id) {
		videoService.delete(id);
	}

	
}
