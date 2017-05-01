package statistics;

import statistics.matcher.*;
import java.util.*;

public class QueryBuilder {
    private List<Matcher> matchers;

    public QueryBuilder() {
        matchers = new ArrayList();
    }

    public QueryBuilder playsIn(String team) {
        matchers.add(new PlaysIn(team));
        return this;
    }
    
    public QueryBuilder hasAtLeast(int value, String category) {
        matchers.add(new HasAtLeast(value, category));
        return this;
    }

    public QueryBuilder hasFewerThan(int value, String category) {
        matchers.add(new HasFewerThan(value, category));
        return this;
    }

    public QueryBuilder oneOf(Matcher... matcherList) {
        matchers.add(new Or(matcherList));
        return this;
    }

    public Matcher build() {
        Matcher m = new And(matchers.toArray(new Matcher[matchers.size()]));
        matchers = new ArrayList();
        return m;
    }
}