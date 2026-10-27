package com.umeng.socialize.shareboard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class SnsPlatform {
    public java.lang.String mGrayIcon;
    public java.lang.String mIcon;
    public int mIndex;
    public java.lang.String mKeyword;
    public com.umeng.socialize.bean.SHARE_MEDIA mPlatform;
    public java.lang.String mShowWord;

    public SnsPlatform() {
            r0 = this;
            r0.<init>()
            return
    }

    public SnsPlatform(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.mKeyword = r1
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.convertToEmun(r1)
            r0.mPlatform = r1
            return
    }
}
