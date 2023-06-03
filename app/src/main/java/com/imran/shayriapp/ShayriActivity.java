package com.imran.shayriapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.imran.shayriapp.adapter.ShayriAdapter;
import com.imran.shayriapp.model.ShayriModel;

import java.util.ArrayList;

public class ShayriActivity extends AppCompatActivity {
    ShayriAdapter adapter;
    ArrayList<ShayriModel>list;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shayri);

        list = new ArrayList<>();
        recyclerView = findViewById(R.id.Shayrirecycler);

        String name = getIntent().getStringExtra("name");

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new ShayriAdapter(this,list);
        recyclerView.setAdapter(adapter);

        if (name.equals("Motivational Shayri")){
            list.add(new ShayriModel("Her Waqat Mri Khoj Mein Rehti Hai Teri Yaad… Tu Nay Mery Vajood Ki Tanhai Bhi Cheen Li…."));
            list.add(new ShayriModel("Her Waqat Mri Khoj Mein Rehti Hai Teri Yaad… Tu Nay Mery Vajood Ki Tanhai Bhi Cheen Li…."));
            list.add(new ShayriModel("Her Waqat Mri Khoj Mein Rehti Hai Teri Yaad… Tu Nay Mery Vajood Ki Tanhai Bhi Cheen Li…."));
            list.add(new ShayriModel("Her Waqat Mri Khoj Mein Rehti Hai Teri Yaad… Tu Nay Mery Vajood Ki Tanhai Bhi Cheen Li…."));
            list.add(new ShayriModel("Her Waqat Mri Khoj Mein Rehti Hai Teri Yaad… Tu Nay Mery Vajood Ki Tanhai Bhi Cheen Li…."));
            list.add(new ShayriModel("Her Waqat Mri Khoj Mein Rehti Hai Teri Yaad… Tu Nay Mery Vajood Ki Tanhai Bhi Cheen Li…."));
            list.add(new ShayriModel("Her Waqat Mri Khoj Mein Rehti Hai Teri Yaad… Tu Nay Mery Vajood Ki Tanhai Bhi Cheen Li…."));

        }else if (name.equals("Sad Shayri")){

            list.add(new ShayriModel("Her Waqat Mri Khoj Mein Rehti Hai Teri Yaad… Tu Nay Mery Vajood Ki Tanhai Bhi Cheen Li…."));
            list.add(new ShayriModel("Her Waqat Mri Khoj Mein Rehti Hai Teri Yaad… Tu Nay Mery Vajood Ki Tanhai Bhi Cheen Li…."));
            list.add(new ShayriModel("Her Waqat Mri Khoj Mein Rehti Hai Teri Yaad… Tu Nay Mery Vajood Ki Tanhai Bhi Cheen Li…."));
            list.add(new ShayriModel("Her Waqat Mri Khoj Mein Rehti Hai Teri Yaad… Tu Nay Mery Vajood Ki Tanhai Bhi Cheen Li…."));
            list.add(new ShayriModel("Her Waqat Mri Khoj Mein Rehti Hai Teri Yaad… Tu Nay Mery Vajood Ki Tanhai Bhi Cheen Li…."));
            list.add(new ShayriModel("Her Waqat Mri Khoj Mein Rehti Hai Teri Yaad… Tu Nay Mery Vajood Ki Tanhai Bhi Cheen Li…."));

        }else if (name.equals("Love Shayri")){
            list.add(new ShayriModel(" Hamari be khudi ka haal agr wo puchen, To itna keh dena k bs, tum ko yaad krte hen"));
            list.add(new ShayriModel(" Hamari be khudi ka haal agr wo puchen, To itna keh dena k bs, tum ko yaad krte hen"));
            list.add(new ShayriModel(" Hamari be khudi ka haal agr wo puchen, To itna keh dena k bs, tum ko yaad krte hen"));
            list.add(new ShayriModel(" Hamari be khudi ka haal agr wo puchen, To itna keh dena k bs, tum ko yaad krte hen"));
            list.add(new ShayriModel(" Hamari be khudi ka haal agr wo puchen, To itna keh dena k bs, tum ko yaad krte hen"));
            list.add(new ShayriModel(" Hamari be khudi ka haal agr wo puchen, To itna keh dena k bs, tum ko yaad krte hen"));
        }else if (name.equals("Freindship Shayri")){
            list.add(new ShayriModel(" Dost Hokar Bhi Maheeno Nahi Milta Mujhse,\n" +
                    "Uss Se Kehna Ki Kabhi Zakhm Lagaane Aaye."));
            list.add(new ShayriModel("Dost Hokar Bhi Maheeno Nahi Milta Mujhse,\n" +
                    "Uss Se Kehna Ki Kabhi Zakhm Lagaane Aaye."));
            list.add(new ShayriModel(" Dost Hokar Bhi Maheeno Nahi Milta Mujhse,\n" +
                    "Uss Se Kehna Ki Kabhi Zakhm Lagaane Aaye."));
            list.add(new ShayriModel(" Dost Hokar Bhi Maheeno Nahi Milta Mujhse,\n" +
                    "Uss Se Kehna Ki Kabhi Zakhm Lagaane Aaye."));
            list.add(new ShayriModel(" Dost Hokar Bhi Maheeno Nahi Milta Mujhse,\n" +
                    "Uss Se Kehna Ki Kabhi Zakhm Lagaane Aaye."));
            list.add(new ShayriModel(" Dost Hokar Bhi Maheeno Nahi Milta Mujhse,\n" +
                    "Uss Se Kehna Ki Kabhi Zakhm Lagaane Aaye."));
        }else if (name.equals("Family Shayri")){
            list.add(new ShayriModel("ye dasht vo hai jahāñ rāsta nahīñ miltā \n" +
                    "\n" +
                    "abhī se lauT chalo ghar abhī ujālā hai "));list.add(new ShayriModel("ye dasht vo hai jahāñ rāsta nahīñ miltā \n" +
                    "\n" +
                    "abhī se lauT chalo ghar abhī ujālā hai "));list.add(new ShayriModel("ye dasht vo hai jahāñ rāsta nahīñ miltā \n" +
                    "\n" +
                    "abhī se lauT chalo ghar abhī ujālā hai "));list.add(new ShayriModel("ye dasht vo hai jahāñ rāsta nahīñ miltā \n" +
                    "\n" +
                    "abhī se lauT chalo ghar abhī ujālā hai "));list.add(new ShayriModel("ye dasht vo hai jahāñ rāsta nahīñ miltā \n" +
                    "\n" +
                    "abhī se lauT chalo ghar abhī ujālā hai "));list.add(new ShayriModel("ye dasht vo hai jahāñ rāsta nahīñ miltā \n" +
                    "\n" +
                    "abhī se lauT chalo ghar abhī ujālā hai "));
        }else{
            list.add(new ShayriModel("Jalney Ko Aag Kehtain HeinBujhay Ko Raakh Kehtein HeinGarden Ko Bhaag Kehte HeinJo Ap Ke Pas Nahi Ose Dimag Kehte Hein"));
            list.add(new ShayriModel("Jalney Ko Aag Kehtain HeinBujhay Ko Raakh Kehtein HeinGarden Ko Bhaag Kehte HeinJo Ap Ke Pas Nahi Ose Dimag Kehte Hein"));
            list.add(new ShayriModel("Jalney Ko Aag Kehtain HeinBujhay Ko Raakh Kehtein HeinGarden Ko Bhaag Kehte HeinJo Ap Ke Pas Nahi Ose Dimag Kehte Hein"));
            list.add(new ShayriModel("Jalney Ko Aag Kehtain HeinBujhay Ko Raakh Kehtein HeinGarden Ko Bhaag Kehte HeinJo Ap Ke Pas Nahi Ose Dimag Kehte Hein"));
            list.add(new ShayriModel("Jalney Ko Aag Kehtain HeinBujhay Ko Raakh Kehtein HeinGarden Ko Bhaag Kehte HeinJo Ap Ke Pas Nahi Ose Dimag Kehte Hein"));
        }

    }
}