package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class z7 extends com.amap.api.col.p0003l.y7 {

    /* renamed from: b, reason: collision with root package name */
    private android.content.Context f4298b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4299c;

    public z7(android.content.Context r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f4298b = r1
            r0.f4299c = r2
            return
    }

    @Override // com.amap.api.col.p0003l.y7
    protected final boolean d() {
            r2 = this;
            android.content.Context r0 = r2.f4298b
            int r0 = com.amap.api.col.p0003l.i4.M(r0)
            r1 = 1
            if (r0 == r1) goto L10
            boolean r0 = r2.f4299c
            if (r0 == 0) goto Le
            goto L10
        Le:
            r0 = 0
            return r0
        L10:
            return r1
    }
}
