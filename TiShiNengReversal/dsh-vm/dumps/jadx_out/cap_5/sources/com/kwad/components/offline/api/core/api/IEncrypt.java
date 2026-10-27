package com.kwad.components.offline.api.core.api;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface IEncrypt {
    java.lang.String getFileMD5(java.io.File r1);

    byte[] getFileMD5Digest(java.io.File r1);

    java.lang.String getFileSha256(java.io.File r1);

    java.lang.String getMD5(java.lang.String r1);

    java.lang.String getResponseData(java.lang.String r1);

    java.lang.String getSha256(java.lang.String r1);
}
