package com.beizi.ad.internal.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e implements com.beizi.ad.internal.view.c {
    private android.view.View a;

    /* renamed from: b, reason: collision with root package name */
    private com.beizi.ad.internal.d.b f6699b;

    e(com.beizi.ad.internal.d.b r1) {
            r0 = this;
            r0.<init>()
            r0.f6699b = r1
            return
    }

    public com.beizi.ad.internal.d.b a() {
            r1 = this;
            com.beizi.ad.internal.d.b r0 = r1.f6699b
            return r0
    }

    void a(android.view.View r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // com.beizi.ad.internal.view.c
    public void destroy() {
            r1 = this;
            com.beizi.ad.internal.d.b r0 = r1.f6699b
            r0.b()
            android.view.View r0 = r1.a
            com.beizi.ad.internal.h.u.a(r0)
            return
    }

    @Override // com.beizi.ad.internal.view.c
    public boolean failed() {
            r1 = this;
            com.beizi.ad.internal.d.b r0 = r1.f6699b
            boolean r0 = r0.f6685g
            return r0
    }

    @Override // com.beizi.ad.internal.view.c
    public int getCreativeHeight() {
            r1 = this;
            android.view.View r0 = r1.a
            if (r0 == 0) goto L9
            int r0 = r0.getHeight()
            return r0
        L9:
            r0 = -1
            return r0
    }

    @Override // com.beizi.ad.internal.view.c
    public int getCreativeWidth() {
            r1 = this;
            android.view.View r0 = r1.a
            if (r0 == 0) goto L9
            int r0 = r0.getWidth()
            return r0
        L9:
            r0 = -1
            return r0
    }

    @Override // com.beizi.ad.internal.view.c
    public int getRefreshInterval() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.beizi.ad.internal.view.c
    public android.view.View getView() {
            r1 = this;
            android.view.View r0 = r1.a
            return r0
    }

    @Override // com.beizi.ad.internal.view.c
    public void onDestroy() {
            r1 = this;
            com.beizi.ad.internal.d.b r0 = r1.f6699b
            r0.i()
            r1.destroy()
            return
    }

    @Override // com.beizi.ad.internal.view.c
    public void onPause() {
            r1 = this;
            com.beizi.ad.internal.d.b r0 = r1.f6699b
            r0.j()
            return
    }

    @Override // com.beizi.ad.internal.view.c
    public void onResume() {
            r1 = this;
            com.beizi.ad.internal.d.b r0 = r1.f6699b
            r0.k()
            return
    }

    @Override // com.beizi.ad.internal.view.c
    public void visible() {
            r0 = this;
            return
    }
}
