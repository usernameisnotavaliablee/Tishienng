package com.tencent.mmkv;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface MMKVHandler {
    void mmkvLog(com.tencent.mmkv.MMKVLogLevel r1, java.lang.String r2, int r3, java.lang.String r4, java.lang.String r5);

    com.tencent.mmkv.MMKVRecoverStrategic onMMKVCRCCheckFail(java.lang.String r1);

    com.tencent.mmkv.MMKVRecoverStrategic onMMKVFileLengthError(java.lang.String r1);

    boolean wantLogRedirecting();
}
