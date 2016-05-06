package com.guru.client;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import com.guruprasad.model.Activity;

public class ActivityClientTest {

	@Test
	public void testDelete() {
		ActivityClient client = new ActivityClient();
		
		client.delete("1234");
		
		
	}
	
	@Test
	public void testput(){
		
		Activity activity = new Activity();
		
		activity.setId("3456");
		activity.setDescription("Bikram Yoga");
		activity.setDuration(90);
		
		ActivityClient client = new ActivityClient();
		
		activity = client.update(activity);
	}
	
	@Test
	public void testCreate(){
		ActivityClient client = new ActivityClient();
		
		Activity activity = new Activity();
		activity.setDescription("Swimming");
		activity.setDuration(90);
		
		activity = client.create(activity);
		
		assertNotNull(activity);
		
	}
	
	@Test
	public void testGet() {
		ActivityClient client = new ActivityClient();
		
		Activity activity = client.get("1234");
		
		System.out.println(activity);
		
		assertNotNull(activity);
	}
	
	@Test
	public void testGetList() {
		ActivityClient client = new ActivityClient();
		
		List<Activity> activities = client.get();
		
		System.out.println(activities);
		
		assertNotNull(activities);
		
		
	}
	
	@Test(expected=RuntimeException.class)
	public void testGetWithBadRequest() {
		
		ActivityClient client = new ActivityClient();
		
		client.get("123");
	}
	
	@Test(expected=RuntimeException.class)
	public void testGetWithNotFound() {
		
		ActivityClient client = new ActivityClient();
		
		client.get("1001");
		
	}

}
