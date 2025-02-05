package com.microsoft.graph.functional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.microsoft.graph.models.Calendar;
import com.microsoft.graph.models.Event;
import com.microsoft.graph.requests.CalendarCollectionPage;
import com.microsoft.graph.requests.EventCollectionPage;
import com.microsoft.graph.requests.GraphServiceClient;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

@Disabled
public class CalendarTests {
	GraphServiceClient graphServiceClient = null;

	@BeforeEach
	public void setUp() {
		TestBase testBase = new TestBase();
		graphServiceClient = testBase.graphClient;
	}

	@Test
	public void getMeCalendars() {
		//GET me/calendars
		CalendarCollectionPage calendarCollectionPage = graphServiceClient.me().calendars().buildRequest().get();
		assertNotNull(calendarCollectionPage);
	}

	@Test
	public void getMeCalendarsview() {
		//GET me/calendarview
		QueryOption q1 = new QueryOption("startDateTime", "2015-11-08T19:00:00.0000000");
		QueryOption q2 = new QueryOption("endDateTime", "2018-12-25T20:00:00.0000000");
		List<Option> list = new ArrayList<>();
		list.add(q1);
		list.add(q2);
		EventCollectionPage collectionPage = graphServiceClient.me().calendarView().buildRequest(list).get();
		assertNotNull(collectionPage);
	}

	@Test
	public void meCalendarKeyCalendarviewTest() {
		//GET me/calendars('<key>')/calendarview
		QueryOption q1 = new QueryOption("startDateTime", "2015-11-08T19:00:00.0000000");
		QueryOption q2 = new QueryOption("endDateTime", "2018-12-25T20:00:00.0000000");
		List<Option> list = new ArrayList<>();
		list.add(q1);
		list.add(q2);
		CalendarCollectionPage calendarCollectionPage = graphServiceClient.me().calendars().buildRequest().get();
		assertNotNull(calendarCollectionPage);
		if(calendarCollectionPage.getCurrentPage().size() > 0)
			graphServiceClient.me().calendars(calendarCollectionPage.getCurrentPage().get(0).id).calendarView().buildRequest(list).get();
	}

	@Test
	public void meCalendartest() {
		//GET me/calendar
		Calendar calendar = graphServiceClient.me().calendar().buildRequest().get();
		assertNotNull(calendar);
	}
}
