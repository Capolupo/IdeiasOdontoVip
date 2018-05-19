package com.company.hiro.sandbox.customclass;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.company.hiro.sandbox.R;

public class GriwViewAdapter extends BaseAdapter {

    itemGridView [] result;
    Context context;
    private static LayoutInflater inflater=null;
    public GriwViewAdapter(FragmentActivity mainActivity, itemGridView[] osNameList) {
        // TODO Auto-generated constructor stub
        result=osNameList;
        context=mainActivity;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView os_text;
        ImageView os_img;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder = null;
        if(convertView == null) {

            convertView = inflater.inflate(R.layout.view_grid, null);

            holder = new Holder();

            holder.os_text = (TextView) convertView.findViewById(R.id.grid_text);
            holder.os_img = (ImageView) convertView.findViewById(R.id.grid_image);
            convertView.setTag(holder);
        }
        else{
            holder = (Holder) convertView.getTag();
        }

        holder.os_text.setText(result[position].texto);
        holder.os_img.setImageResource(result[position].resDrawable);

        convertView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                StaticClass.toast(context, "You Clicked " + result[position].toString(), false);
            }
        });
        return convertView;
    }

}
