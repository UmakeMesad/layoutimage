package com.example.layoutappne;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import book.Book;
import category.Category;
import category.CategoryAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvCategory;
    private CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvCategory = findViewById(R.id.rcv_category);
        categoryAdapter = new CategoryAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcvCategory.setLayoutManager(linearLayoutManager);

        categoryAdapter.setData(getListCategory());
        rcvCategory.setAdapter(categoryAdapter);
    }
    private List<Category> getListCategory(){
        List<Category> listCategory = new ArrayList<>();
        List<Book> listBook =  new ArrayList<>();
        listBook.add(new Book(R.drawable.image1,"Book 1"));
        listBook.add(new Book(R.drawable.image2,"Book 2"));
        listBook.add(new Book(R.drawable.image3,"Book 3"));

        listBook.add(new Book(R.drawable.image1,"Book 1"));
        listBook.add(new Book(R.drawable.image2,"Book 2"));
        listBook.add(new Book(R.drawable.image3,"Book 3"));

        listCategory.add(new Category("Category 1",listBook));
        listCategory.add(new Category("Category 2",listBook));
        listCategory.add(new Category("Category 3",listBook));
        return listCategory;

    }
}