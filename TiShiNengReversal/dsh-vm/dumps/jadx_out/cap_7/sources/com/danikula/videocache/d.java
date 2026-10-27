package com.danikula.videocache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public interface d {
    void a(byte[] r1, int r2) throws com.danikula.videocache.ProxyCacheException;

    long available() throws com.danikula.videocache.ProxyCacheException;

    int b(byte[] r1, long r2, int r4) throws com.danikula.videocache.ProxyCacheException;

    void close() throws com.danikula.videocache.ProxyCacheException;

    void complete() throws com.danikula.videocache.ProxyCacheException;

    boolean isCompleted();
}
