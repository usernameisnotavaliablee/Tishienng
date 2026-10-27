package com.beizi.ad.internal.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d implements com.beizi.ad.internal.view.e {
    private long a;

    /* renamed from: b, reason: collision with root package name */
    private com.beizi.ad.internal.view.c f7201b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7202c;

    /* renamed from: d, reason: collision with root package name */
    private com.beizi.ad.internal.d.b f7203d;

    d(com.beizi.ad.internal.view.c r3, java.lang.Long r4, boolean r5, com.beizi.ad.internal.d.b r6) {
            r2 = this;
            r2.<init>()
            long r0 = r4.longValue()
            r2.a = r0
            r2.f7201b = r3
            r2.f7202c = r5
            r2.f7203d = r6
            return
    }

    @Override // com.beizi.ad.internal.view.e
    public long a() {
            r2 = this;
            long r0 = r2.a
            return r0
    }

    @Override // com.beizi.ad.internal.view.e
    public boolean b() {
            r1 = this;
            boolean r0 = r1.f7202c
            return r0
    }

    @Override // com.beizi.ad.internal.view.e
    public com.beizi.ad.internal.d.b c() {
            r1 = this;
            com.beizi.ad.internal.d.b r0 = r1.f7203d
            return r0
    }

    @Override // com.beizi.ad.internal.view.e
    public android.view.View d() {
            r1 = this;
            com.beizi.ad.internal.view.c r0 = r1.f7201b
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.view.View r0 = r0.getView()
            return r0
    }
}
