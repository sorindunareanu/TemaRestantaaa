package mta.observer.pattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class LuxuryCarObserverTest {

	Subject subject = new Subject();

	@Test
	public final void testUpdate() {
		assertFalse(subject.getState() < 0);
	}

	@Test
	public final void testLuxuryCarObserver() {

	}

}
