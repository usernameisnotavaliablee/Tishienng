package com.tencent.mm.opensdk.diffdev;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface IDiffDevOAuth {
    void addListener(com.tencent.mm.opensdk.diffdev.OAuthListener r1);

    boolean auth(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, com.tencent.mm.opensdk.diffdev.OAuthListener r6);

    void detach();

    void removeAllListeners();

    void removeListener(com.tencent.mm.opensdk.diffdev.OAuthListener r1);

    boolean stopAuth();
}
