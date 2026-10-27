package com.bykv.vk.component.ttvideo;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface VideoEngineCallback {
    public static final int AFTER_FIRST_FRAME = 1;
    public static final int BEFORE_FIRST_FRAME = 0;
    public static final int BUFFERING_TYPE_DECODER = 1;
    public static final int BUFFERING_TYPE_NET = 0;

    void onBufferEnd(int r1);

    void onBufferStart(int r1, int r2, int r3);

    void onBufferingUpdate(com.bykv.vk.component.ttvideo.TTVideoEngine r1, int r2);

    void onCompletion(com.bykv.vk.component.ttvideo.TTVideoEngine r1);

    void onError(com.bykv.vk.component.ttvideo.utils.Error r1);

    void onLoadStateChanged(com.bykv.vk.component.ttvideo.TTVideoEngine r1, int r2);

    void onMDLHitCache(java.lang.String r1, long r2);

    void onPlaybackStateChanged(com.bykv.vk.component.ttvideo.TTVideoEngine r1, int r2);

    void onPrepare(com.bykv.vk.component.ttvideo.TTVideoEngine r1);

    void onPrepared(com.bykv.vk.component.ttvideo.TTVideoEngine r1);

    void onRenderSeekComplete(int r1);

    void onRenderStart(com.bykv.vk.component.ttvideo.TTVideoEngine r1);

    void onRetry(int r1);

    void onUseMDLCacheEnd();

    void onVideoSizeChanged(com.bykv.vk.component.ttvideo.TTVideoEngine r1, int r2, int r3);
}
