package com.graphql.spring.boot.test.assertions;

import com.graphql.spring.boot.test.GraphQLResponse;
import org.assertj.core.api.AbstractStringAssert;

public class GraphQLStringAssert extends AbstractStringAssert<GraphQLStringAssert>
    implements GraphQLResponseAssertion {

    private final GraphQLResponse graphQlResponse;

    public GraphQLStringAssert(final GraphQLResponse graphQLResponse, final String actual) {
        super(actual, GraphQLStringAssert.class);
        this.graphQlResponse = graphQLResponse;
    }

    @Override
    public GraphQLResponse and() {
        return graphQlResponse;
    }
}
