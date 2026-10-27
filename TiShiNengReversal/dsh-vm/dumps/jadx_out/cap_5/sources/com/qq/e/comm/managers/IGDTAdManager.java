package com.qq.e.comm.managers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface IGDTAdManager {
    java.lang.String getBuyerId(java.util.Map<java.lang.String, java.lang.Object> r1);

    com.qq.e.comm.managers.devtool.DevTools getDevTools();

    java.lang.String getSDKInfo(java.lang.String r1);

    int showOpenOrInstallAppDialog(com.qq.e.ads.dfa.GDTAppDialogClickListener r1);
}
