package com.example.hidetzu.camerasample;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;

/**
 * Created by kawashima on 2018/02/06.
 */

public interface CameraInterface {
    SurfaceTexture getSurfaceTextureFromTextureView();
    Size getPreviewSize();
    Handler getBackgroundHandler();
    Surface getImageRenderSurface();
    int getRotation();
}
