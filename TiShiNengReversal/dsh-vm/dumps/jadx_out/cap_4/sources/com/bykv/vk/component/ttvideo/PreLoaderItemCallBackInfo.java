package com.bykv.vk.component.ttvideo;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class PreLoaderItemCallBackInfo {
    public static final int KEY_IS_PRELOAD_END_CANCEL = 5;
    public static final int KEY_IS_PRELOAD_END_FAIL = 3;
    public static final int KEY_IS_PRELOAD_END_SUCCEED = 2;
    public static final int KEY_IS_PRELOAD_INFO = 6;
    public static final int PRELOAD_TYPE_SIZE = 0;
    private int a;
    public long audioPreloadSize;
    public com.bykv.vk.component.ttvideo.DataLoaderHelper.c loadProgress;
    public com.bykv.vk.component.ttvideo.DataLoaderHelper.DataLoaderTaskProgressInfo preloadDataInfo;
    public com.bykv.vk.component.ttvideo.utils.Error preloadError;
    public int preloadType;
    public long videoPreloadSize;

    public PreLoaderItemCallBackInfo(int r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.preloadDataInfo = r0
            r2.loadProgress = r0
            r2.preloadError = r0
            r0 = 0
            r2.preloadType = r0
            r0 = 0
            r2.audioPreloadSize = r0
            r2.videoPreloadSize = r0
            r2.a = r3
            return
    }

    public int getKey() {
            r1 = this;
            int r0 = r1.a
            return r0
    }
}
