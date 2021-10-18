package com.example.narsinghjan.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.narsinghjan.API_DATA.ApiInterface;
import com.example.narsinghjan.API_DATA.PostPojo;
import com.example.narsinghjan.API_DATA.RetrofitInstance;
import com.example.narsinghjan.Adapters.HomePageAdapter;
import com.example.narsinghjan.R;
import com.example.narsinghjan.databinding.FragmentMemberListBinding;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class NewsArtFragment extends Fragment {

    //ApiInterface apiInterface;
    ViewPager MainViewPager;

    private Integer[] MainPager={R.drawable.eighteen,R.drawable.eight,R.drawable.eighteen,R.drawable.eight,R.drawable.eighteen};
    private String[] Articles={"Navjot Singh Sidhu reiterates demand for removal of Punjab DGP, AG",
            "PM Modi's mother casts her vote in Gandhinagar civic polls",
            "Let's have a race: Kamal Nath throws fitness challenge at MP CM Shivraj Singh Chouhan",
            "EC asks Bengal chief secretary to ensure no celebration over poll results",
            "BJP announces candidates for assembly bypolls of three states"};

    private FragmentMemberListBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_news_art,container,false);

        binding = FragmentMemberListBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        //api work
//        apiInterface = RetrofitInstance.getRetrofit().create(ApiInterface.class);
//        apiInterface.getposts().enqueue(new Callback<List<PostPojo>>() {
//            @Override
//            public void onResponse(Call<List<PostPojo>> call, Response<List<PostPojo>> response) {
//                if(response.body().size()>0){
//                    Toast.makeText(getActivity(), "list is not empty", Toast.LENGTH_SHORT).show();
//                }
//                else{
//                    Toast.makeText(getActivity(), "list is empty", Toast.LENGTH_SHORT).show();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<PostPojo>> call, Throwable t) {
//                Toast.makeText(getActivity(), t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
//            }
//        });

        MainViewPager=view.findViewById(R.id.MainViewPager);

        HomePageAdapter homePageAdapter=new HomePageAdapter(getContext(),MainPager,Articles);
        MainViewPager.setAdapter(homePageAdapter);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}