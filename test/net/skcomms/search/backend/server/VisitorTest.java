/**
 * 
 */
package net.skcomms.search.backend.server;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author pelcious@sk.com
 *
 */
public class VisitorTest {

	@Test
	public void test() {
		Person person = new Visitor("visitor");
		assertEquals("visitor", person.getName());
	}

}
