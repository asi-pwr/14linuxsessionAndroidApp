package tk.julianjurec.linuxsession14.Speakers;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import tk.julianjurec.linuxsession14.R;

/**
 * Created by sp0rk on 30.04.17.
 */

class SpeakersAdapter extends RecyclerView.Adapter<SpeakersAdapter.Holder> {
    private Context context;

    SpeakersAdapter(Context context) {
        this.context = context;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_speakers, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        Picasso.with(context)
                .load("https://julianjurec.interc.co.uk/wp-content/uploads/2017/02/rsz_1jurec.png")
                .placeholder(R.drawable.unknown)
                .into(holder.speakerPicture);
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class Holder extends RecyclerView.ViewHolder {

        @BindView(R.id.speaker_item_picture) ImageView speakerPicture;

        Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}