package com.mu.system.MeiliSearch;

import com.meilisearch.sdk.exceptions.MeilisearchException;
import com.mu.system.meilisearch.SearchUtils;
import org.junit.jupiter.api.Test;

/**
 * @author MUZUKI
 * @Classname MeiliSearchTest
 * @Description TODO
 * @Date 2023/4/2 13:13
 */

public class MeiliSearchTest {
    @Test
    public void test() throws MeilisearchException {
        SearchUtils searchUtils = SearchUtils.getInstance();
        System.out.println(searchUtils.search("Batman"));
    }
}
