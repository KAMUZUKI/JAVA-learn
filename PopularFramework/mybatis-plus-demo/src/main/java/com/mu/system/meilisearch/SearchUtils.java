package com.mu.system.meilisearch;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.file.FileReader;
import com.meilisearch.sdk.Client;
import com.meilisearch.sdk.Config;
import com.meilisearch.sdk.Index;
import com.meilisearch.sdk.exceptions.MeilisearchException;
import com.meilisearch.sdk.model.SearchResult;
import org.springframework.boot.autoconfigure.quartz.QuartzDataSourceInitializer;

import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author MUZUKI
 * @Classname SearchUtils
 * @Description TODO
 * @Date 2023/4/2 13:01
 */

public class SearchUtils {

    private Client client;
    private static SearchUtils searchUtils = new SearchUtils();
    private SearchUtils(){
        init();
    }

    public static SearchUtils getInstance(){
        if (searchUtils == null){
            searchUtils = new SearchUtils();
        }
        return searchUtils;
    }

    /**
     * 初始化
     */
    void init(){
        FileReader fileReader = new FileReader("static/movies.json");
        String moviesJson = fileReader.readString();
        this.client = new Client(new Config("http://localhost:7700", "Y6XHohRgzRRtCJipJpQm8XH8yDNVXEhGxxIFuOQ8AQ0"));
        Index index = null;
        try {
            index = client.index("movies");
            index.addDocuments(moviesJson);
        } catch (MeilisearchException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 搜索
     */
    public SearchResult search(String name) throws MeilisearchException {
        return client.index("movies").search(name);
    }
}
