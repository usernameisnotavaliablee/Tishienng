package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class w3 extends com.amap.api.col.s.v3 {

    /* renamed from: b, reason: collision with root package name */
    private android.content.Context f4784b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4785c;

    public w3(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.f4784b = r1
            r1 = 0
            r0.f4785c = r1
            return
    }

    @Override // com.amap.api.col.s.v3
    protected final boolean c() {
            r2 = this;
            android.content.Context r0 = r2.f4784b
            int r0 = com.amap.api.col.s.c1.D(r0)
            r1 = 1
            if (r0 == r1) goto L10
            boolean r0 = r2.f4785c
            if (r0 == 0) goto Le
            goto L10
        Le:
            r0 = 0
            return r0
        L10:
            return r1
    }
}
