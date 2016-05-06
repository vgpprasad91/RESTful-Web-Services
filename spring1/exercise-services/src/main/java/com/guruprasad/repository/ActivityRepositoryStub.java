package com.guruprasad.repository;

import java.util.ArrayList;
import java.util.List;

import com.guruprasad.model.Activity;
import com.guruprasad.model.User;

public class ActivityRepositoryStub implements ActivityRepository {
	
	@Override
	public void create(Activity activity) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete (String activityId) {
		
		
	}
	
	@Override
	public Activity update(Activity activity) {
		// Search the database to see if we have an activity with that id already 
		// select * from Activity where id = ?
		
		return activity;
	}
	
	/* (non-Javadoc)
	 * @see com.guruprasad.repository.ActivityRepository#findAllActivities()
	 */
	public List findAllActivities() {
		
		List<Activity> activities= new ArrayList<Activity>();
		
		Activity activity1 = new Activity();
		
		activity1.setDescription("Swimming");
		activity1.setDuration(55);
		
		activities.add(activity1);
		
		Activity activity2 = new Activity();
		
		activity2.setDescription("Cycling");
		activity2.setDuration(120);
		
		activities.add(activity2);
		
		return activities;
			
	}
	
	@Override
	public Activity findActivity(String activityId) {
		
		if(activityId.equals("1001")) {
			return null;
		}
		
		Activity activity1 = new Activity();
		
		activity1.setId("1234");
		activity1.setDescription("Swimming");
		activity1.setDuration(55);
		
		User user = new User();
		user.setId("1");
		user.setName("Guruprasad");
		
		activity1.setUser(user);
		
		return activity1;
	}

}
