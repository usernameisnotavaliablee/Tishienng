package com.bykv.vk.component.ttvideo;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class PreloaderURLItem {
    private java.lang.String a;
    private java.lang.String b;
    private final java.lang.String c;
    private final long d;
    private java.lang.String[] e;
    private com.bykv.vk.component.ttvideo.IPreLoaderItemCallBackListener f;

    public PreloaderURLItem(java.lang.String r2, java.lang.String r3, long r4, java.lang.String[] r6) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.b = r0
            r1.f = r0
            r1.a = r2
            r1.c = r3
            r1.d = r4
            r1.e = r6
            return
    }

    public PreloaderURLItem(java.lang.String r2, java.lang.String r3, long r4, java.lang.String[] r6, java.lang.String r7) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f = r0
            r1.a = r2
            r1.b = r7
            r1.c = r3
            r1.d = r4
            r1.e = r6
            return
    }

    public com.bykv.vk.component.ttvideo.IPreLoaderItemCallBackListener getCallBackListener() {
            r1 = this;
            com.bykv.vk.component.ttvideo.IPreLoaderItemCallBackListener r0 = r1.f
            return r0
    }

    public java.lang.String getFilePath() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public long getPreloadSize() {
            r2 = this;
            long r0 = r2.d
            return r0
    }

    public java.lang.String[] getUrls() {
            r1 = this;
            java.lang.String[] r0 = r1.e
            return r0
    }

    public java.lang.String getVideoId() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public void setCallBackListener(com.bykv.vk.component.ttvideo.IPreLoaderItemCallBackListener r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public void setKey(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }
}
