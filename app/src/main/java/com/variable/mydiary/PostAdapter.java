package com.variable.mydiary;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

class PostAdapter  extends RecyclerView.Adapter<PostAdapter.ViewHolder> {

    Context context;
    List<String> list;

    public PostAdapter(Context context, List<String> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.post_row,parent,false);
        return new  ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        SliderAdapterExample adapter = new SliderAdapterExample(context);
        List<SliderItem> slider=new ArrayList<>();

                slider.add(new SliderItem(R.drawable.dummy));
                slider.add(new SliderItem(R.drawable.dummy2 ));
                slider.add(new SliderItem(R.drawable.dummy3 ));
        adapter.renewItems(slider);

        holder.sliderView.setSliderAdapter(adapter);

      //  holder.sliderView.setIndicatorAnimation(IndicatorAnimationType.THIN_WORM); //set indicator animation by using IndicatorAnimationType. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        holder.sliderView.setSliderTransformAnimation(SliderAnimations.CUBEOUTDEPTHTRANSFORMATION);
      //  holder.sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
    //    holder.sliderView.setIndicatorSelectedColor(Color.WHITE);
    //    holder.sliderView.setIndicatorUnselectedColor(Color.GRAY);
       holder. sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
      //  holder. sliderView.startAutoCycle();



        holder.more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 Bottomsheet_menu bottomsheet_menu=new Bottomsheet_menu();
                 bottomsheet_menu.show(((AppCompatActivity) context).getSupportFragmentManager(),"tag");


            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
              SliderView sliderView ;
        ImageView more;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            sliderView   = itemView.findViewById(R.id.imageSlider);

             more=itemView.findViewById(R.id.imageView4);
        }
    }
}
