package app.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import app.Timeline;

public class TimelineTest {

	private Timeline timeline;

	@Before
	public void setUp() {
		timeline = new Timeline();
	}

	@Test
	public void setFetchCount() {
		int expected = 5;

		timeline.setFetchCount(expected);
		int actual = timeline.getFetchCount();

		assertEquals(expected, actual);
	}

	@Test(expected = IllegalArgumentException.class)
	public void setFetchCountWithNonPositiveValue() {
		timeline.setFetchCount(0);
	}

	//Adding this test method is required in order to succeed Mutation Test
	@Test @Ignore
	public void initialState() {
		assertEquals(Timeline.DEFAULT_FETCH_COUNT, timeline.getFetchCount());
	}

}