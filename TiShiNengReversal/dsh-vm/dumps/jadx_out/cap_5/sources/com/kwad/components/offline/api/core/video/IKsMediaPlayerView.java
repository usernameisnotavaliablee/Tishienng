package com.kwad.components.offline.api.core.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface IKsMediaPlayerView {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface VideoViewClickListener {
        void onClickRootView();

        void onClickVideoView();
    }

    void adaptVideoSize(int r1, int r2);

    void fixWidth(boolean r1);

    int getTextureViewGravity();

    void setAd(boolean r1);

    void setClickListener(com.kwad.components.offline.api.core.video.IKsMediaPlayerView.VideoViewClickListener r1);

    void setForce(boolean r1);

    void setHorizontalVideo(boolean r1);

    void setMediaPlayer(com.kwad.components.offline.api.core.video.IKsMediaPlayer r1);

    void setRadius(float r1);

    void updateTextureViewGravity(int r1);
}
