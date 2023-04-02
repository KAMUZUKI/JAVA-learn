package com.mu.blog.meilisearch;

import com.meilisearch.sdk.SearchRequest;
import com.meilisearch.sdk.model.SearchResult;
import com.mu.blog.meilisearch.service.SearchService;
import com.mu.blog.meilisearch.service.SearchServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author : MUZUKI
 * @date : 2023-04-02 18:50
 **/

@RestController
@RequestMapping("/engine")
public class SearchController {
    @Autowired
    private SearchService searchService;

    @RequestMapping("/search")
    public SearchResult search(HttpServletRequest request) {

        return searchService.search("movies", "");
    }

    @RequestMapping("/pageSearch")
    public SearchResult search() {
        return searchService.search("movies",
                new SearchRequest("of")
                        .setShowMatchesPosition(true)
                        .setAttributesToHighlight(new String[]{"title"})
        );
    }
}
