package org.lavid.hogares;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;


public class chaptersAdapter extends RecyclerView.Adapter<chaptersAdapter.ViewHolder> {
    private String[] mDataset;
    private int midLibro;


    public chaptersAdapter(String[] myDataset,int idLibro) {
        mDataset = myDataset;
        midLibro= idLibro;
    }

    @Override
    public chaptersAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.chapters_lista, parent, false);

        return new chaptersAdapter.ViewHolder(v, mDataset, midLibro);
    }


    @Override
    public void onBindViewHolder(chaptersAdapter.ViewHolder holder, int position) {
        TextView txtCapitulo = holder.itemView.findViewById(R.id.txtCap);
        CardView card = holder.itemView.findViewById(R.id.card_view);

        String cap = mDataset[position].split("/")[0];
        txtCapitulo.setText(cap);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }



    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        String[] mData;
        int midLibro;

        private ViewHolder (View v, String[] data,int IdLibro) {
            super(v);
            mData = data;
            midLibro = IdLibro;
            v.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int pos = getLayoutPosition();
            int cap = Integer.parseInt(mData[pos].split("/")[0]);

            Context context = v.getContext();

            Intent mainIntent = new Intent(context, bibleActivity.class);
            mainIntent.putExtra("IDLIBRO", midLibro);
            mainIntent.putExtra("CAPITULO", cap);
            ((Activity) context).startActivityForResult(mainIntent,1002);

        }




    }

}



