package com.mu.meilisearch.service;

import com.meilisearch.sdk.SearchRequest;
import com.meilisearch.sdk.model.SearchResult;

/**
 * @author : MUZUKI
 * @date : 2023-04-02 18:41
 **/

public interface SearchService {
    /**
     * 搜索
     * @param index
     * @param q
     * @return
     */
    SearchResult search(String index , String q);

    SearchResult search(String index, SearchRequest searchRequest);
}
