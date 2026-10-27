package com.bytedance.android.livehostapi.platform;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface IHostTokenInjectionAuth {
    com.bytedance.android.livehostapi.platform.TokenInfo getTokenInfo();

    boolean isLogin();

    void onTokenInvalid(com.bytedance.android.livehostapi.platform.TokenInfo r1, com.bytedance.android.livehostapi.platform.TokenRefreshCallback r2, android.app.Activity r3, java.util.Map<java.lang.String, java.lang.String> r4);
}
