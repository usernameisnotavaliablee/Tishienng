package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class f8 {
    com.amap.api.col.p0003l.h8 a;

    /* renamed from: b, reason: collision with root package name */
    private java.nio.ByteBuffer f3296b;

    f8(int r2) {
            r1 = this;
            r1.<init>()
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            r1.f3296b = r2
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.order(r0)
            com.amap.api.col.3l.h8 r2 = new com.amap.api.col.3l.h8
            java.nio.ByteBuffer r0 = r1.f3296b
            r2.<init>(r0)
            r1.a = r2
            return
    }

    public final com.amap.api.col.p0003l.f8 a() {
            r2 = this;
            com.amap.api.col.3l.h8 r0 = r2.a
            java.nio.ByteBuffer r1 = r2.f3296b
            r0.c(r1)
            return r2
    }
}
