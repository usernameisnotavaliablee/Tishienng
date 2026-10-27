package xyz.adscope.common.network.download;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface Callback {
    void onCancel();

    void onEnd();

    void onException(java.lang.Exception r1);

    void onFinish(java.lang.String r1);

    void onStart();
}
