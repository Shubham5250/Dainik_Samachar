package com.example.dainik_samachar;

import com.example.dainik_samachar.Models.NewsHeadlines;

import java.util.List;

public interface OnDataFetchListener<NewsApiResponse> {
    void onFetchData(List<NewsHeadlines> list, String message);
    void onError(String message);
}
