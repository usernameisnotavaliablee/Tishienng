package com.google.android.datatransport;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface TransportFactory {
    <T> com.google.android.datatransport.Transport<T> getTransport(java.lang.String r1, java.lang.Class<T> r2, com.google.android.datatransport.Encoding r3, com.google.android.datatransport.Transformer<T, byte[]> r4);

    @java.lang.Deprecated
    <T> com.google.android.datatransport.Transport<T> getTransport(java.lang.String r1, java.lang.Class<T> r2, com.google.android.datatransport.Transformer<T, byte[]> r3);
}
