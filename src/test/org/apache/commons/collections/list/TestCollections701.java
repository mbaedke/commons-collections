package org.apache.commons.collections.list;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Tests for COLLECTIONS-701.
 */
public class TestCollections701 extends TestCase {

    public static Test suite() {
        return new TestSuite(TestCollections701.class);
    }

    public void testArrayList() {
        final List list = new ArrayList();
        list.add(list);
        Assert.assertEquals(1, list.size());
        Assert.assertEquals(list, list.get(0));
    }

    public void testHashSet() {
        final Set set = new HashSet();
        set.add(set);
        Assert.assertEquals(1, set.size());
        Assert.assertEquals(set, set.iterator().next());
    }

    public void testSetUniqueList() {
        final List source = new ArrayList();
        final List list = new SetUniqueList(source, new HashSet());
        list.add(list);
        Assert.assertEquals(1, list.size());
        Assert.assertEquals(list, list.get(0));
    }
}
