package com.example.dainik_samachar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dainik_samachar.Models.NewsHeadlines;
import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {

    TextView txtTitle, txtAuthor,txtTime,txtDetail,txtContent;
    ImageView imageNews;
    NewsHeadlines headlines;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        txtTitle = findViewById(R.id.textDetail_Title);
        txtAuthor = findViewById(R.id.textDetail_author);
        txtTime = findViewById(R.id.textDetail_time);
        txtContent = findViewById(R.id.textDetail_content);
        txtDetail = findViewById(R.id.textDetail_detail);
        imageNews = findViewById(R.id.imageDetails_News);

        headlines = (NewsHeadlines) getIntent().getSerializableExtra("data");

        txtTitle.setText(headlines.getTitle());
        txtAuthor.setText(headlines.getAuthor());
        txtDetail.setText(headlines.getDescription());
        txtContent.setText(headlines.getContent());
        txtTime.setText(headlines.getPublishedAt());

        Picasso.get().load(headlines.getUrlToImage()).into(imageNews);
    }
}