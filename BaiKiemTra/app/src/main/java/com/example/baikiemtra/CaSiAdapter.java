package com.example.baikiemtra;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CaSiAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<CaSi> arrayList;

    public CaSiAdapter(Context context, int layout, List<CaSi> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }


    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(layout, null);

        CaSi csi = arrayList.get(i);

        TextView tvName = view.findViewById(R.id.tv_name);
        TextView tv_nickname = view.findViewById(R.id.tv_nickname);
        TextView tv_ctryside = view.findViewById(R.id.tv_countryside);
        TextView tv_star = view.findViewById(R.id.tv_star);
        ImageView imageV = view.findViewById(R.id.imgHinh);

        tvName.setText(csi.getTenCS());
        tv_nickname.setText(csi.getNgheDanh());
        tv_ctryside.setText(csi.getQuocGia());
        tv_star.setText(csi.getSoSao());
        imageV.setImageResource(csi.getHinh());
        return view;
    }
}
