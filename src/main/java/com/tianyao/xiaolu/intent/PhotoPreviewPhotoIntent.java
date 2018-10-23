package com.tianyao.xiaolu.intent;

import android.content.Context;
import android.content.Intent;

import com.tianyao.xiaolu.PhotoPreviewPhotoActivity;

import java.util.ArrayList;

/**
 * 预览照片
 * Created by foamtrace on 2015/8/25.
 */
public class PhotoPreviewPhotoIntent extends Intent {

    public PhotoPreviewPhotoIntent(Context packageContext) {
        super(packageContext, PhotoPreviewPhotoActivity.class);
    }

    /**
     * 照片地址
     *
     * @param paths
     */
    public void setPhotoPaths(ArrayList<String> paths) {
        this.putStringArrayListExtra(PhotoPreviewPhotoActivity.EXTRA_PHOTOS, paths);
    }

    /**
     * 当前照片的下标
     *
     * @param currentItem
     */
    public void setCurrentItem(int currentItem) {
        this.putExtra(PhotoPreviewPhotoActivity.EXTRA_CURRENT_ITEM, currentItem);
    }

}
