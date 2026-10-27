package com.danikula.videocache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class c implements com.danikula.videocache.q {
    private final byte[] a;
    private java.io.ByteArrayInputStream b;

    public c(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.danikula.videocache.q
    public void a(long r3) throws com.danikula.videocache.ProxyCacheException {
            r2 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            byte[] r1 = r2.a
            r0.<init>(r1)
            r2.b = r0
            r0.skip(r3)
            return
    }

    @Override // com.danikula.videocache.q
    public void close() throws com.danikula.videocache.ProxyCacheException {
            r0 = this;
            return
    }

    @Override // com.danikula.videocache.q
    public long length() throws com.danikula.videocache.ProxyCacheException {
            r2 = this;
            byte[] r0 = r2.a
            int r0 = r0.length
            long r0 = (long) r0
            return r0
    }

    @Override // com.danikula.videocache.q
    public int read(byte[] r4) throws com.danikula.videocache.ProxyCacheException {
            r3 = this;
            java.io.ByteArrayInputStream r0 = r3.b
            r1 = 0
            int r2 = r4.length
            int r4 = r0.read(r4, r1, r2)
            return r4
    }
}
