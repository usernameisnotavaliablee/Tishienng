package com.umeng.socialize;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface UMAuthListener {
    public static final int ACTION_AUTHORIZE = 0;
    public static final int ACTION_DELETE = 1;
    public static final int ACTION_GET_PROFILE = 2;

    void onCancel(com.umeng.socialize.bean.SHARE_MEDIA r1, int r2);

    void onComplete(com.umeng.socialize.bean.SHARE_MEDIA r1, int r2, java.util.Map<java.lang.String, java.lang.String> r3);

    void onError(com.umeng.socialize.bean.SHARE_MEDIA r1, int r2, java.lang.Throwable r3);

    void onStart(com.umeng.socialize.bean.SHARE_MEDIA r1);
}
