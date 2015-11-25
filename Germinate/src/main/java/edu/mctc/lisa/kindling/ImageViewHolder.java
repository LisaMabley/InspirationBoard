package edu.mctc.lisa.kindling;

import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by lisa on 11/25/15.
 */

public class ImageViewHolder extends RecyclerView.ViewHolder {

    private ImageView mPreviewImage;

    public ImageViewHolder(View itemView) {
        super(itemView);
        mPreviewImage = (ImageView) itemView.findViewById(R.id.grid_preview_image);
    }

    public void setPreviewImage(Bitmap image) {
        mPreviewImage.setImageBitmap(image);
    }
}
