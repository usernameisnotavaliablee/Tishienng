package com.beizi.fusion;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SplashAd {
    private com.beizi.fusion.c.j a;

    /* renamed from: b, reason: collision with root package name */
    private android.view.ViewGroup f7555b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7556c;

    @androidx.annotation.RequiresPermission("android.permission.INTERNET")
    public SplashAd(android.content.Context r9, android.view.View r10, java.lang.String r11, com.beizi.fusion.AdListener r12, long r13) {
            r8 = this;
            r8.<init>()
            r0 = 0
            r8.f7556c = r0
            com.beizi.fusion.c.j r1 = new com.beizi.fusion.c.j
            r2 = r9
            r4 = r10
            r3 = r11
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            r8.a = r1
            android.widget.FrameLayout r9 = new android.widget.FrameLayout
            r9.<init>(r2)
            r8.f7555b = r9
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
            r11 = -1
            r10.<init>(r11, r11)
            r9.setLayoutParams(r10)
            return
    }

    public void cancel(android.content.Context r1) {
            r0 = this;
            com.beizi.fusion.c.j r1 = r0.a
            if (r1 == 0) goto L7
            r1.j()
        L7:
            return
    }

    public java.lang.String getCustomExtraData() {
            r1 = this;
            com.beizi.fusion.c.j r0 = r1.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r0.t()
            return r0
    }

    public java.lang.String getCustomExtraJsonData() {
            r1 = this;
            com.beizi.fusion.c.j r0 = r1.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r0.v()
            return r0
    }

    public int getECPM() {
            r1 = this;
            com.beizi.fusion.c.j r0 = r1.a
            if (r0 == 0) goto L9
            int r0 = r0.B()
            return r0
        L9:
            r0 = -1
            return r0
    }

    public java.util.Map getExtraData() {
            r1 = this;
            com.beizi.fusion.c.j r0 = r1.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.Map r0 = r0.D()
            return r0
    }

    @java.lang.Deprecated
    public void loadAd() {
            r2 = this;
            com.beizi.fusion.c.j r0 = r2.a
            if (r0 == 0) goto Lb
            android.view.ViewGroup r1 = r2.f7555b
            if (r1 == 0) goto Lb
            r0.a(r1)
        Lb:
            return
    }

    public void loadAd(int r3, int r4) {
            r2 = this;
            com.beizi.fusion.c.j r0 = r2.a
            if (r0 == 0) goto L17
            android.view.ViewGroup r1 = r2.f7555b
            if (r1 == 0) goto L17
            r0.b(r3)
            com.beizi.fusion.c.j r3 = r2.a
            r3.c(r4)
            com.beizi.fusion.c.j r3 = r2.a
            android.view.ViewGroup r4 = r2.f7555b
            r3.a(r4)
        L17:
            return
    }

    public void reportNotShow() {
            r1 = this;
            com.beizi.fusion.c.j r0 = r1.a
            if (r0 == 0) goto L7
            r0.C()
        L7:
            return
    }

    public void sendLossNotificationWithInfo(java.util.Map r2) {
            r1 = this;
            com.beizi.fusion.c.j r0 = r1.a
            if (r0 == 0) goto La
            if (r2 != 0) goto L7
            goto La
        L7:
            r0.b(r2)
        La:
            return
    }

    public void sendWinNotificationWithInfo(java.util.Map r2) {
            r1 = this;
            com.beizi.fusion.c.j r0 = r1.a
            if (r0 == 0) goto La
            if (r2 != 0) goto L7
            goto La
        L7:
            r0.a(r2)
        La:
            return
    }

    public void setBidResponse(java.lang.String r2) {
            r1 = this;
            com.beizi.fusion.c.j r0 = r1.a
            if (r0 != 0) goto L5
            return
        L5:
            r0.g(r2)
            return
    }

    public void setSpaceParam(java.util.Map<java.lang.String, java.lang.Object> r2) {
            r1 = this;
            com.beizi.fusion.c.j r0 = r1.a
            if (r0 != 0) goto L5
            return
        L5:
            r0.c(r2)
            return
    }

    public void setSupportRegionClick(boolean r2) {
            r1 = this;
            com.beizi.fusion.c.j r0 = r1.a
            if (r0 == 0) goto L7
            r0.a(r2)
        L7:
            return
    }

    public void show(android.view.ViewGroup r3) {
            r2 = this;
            boolean r0 = r2.f7556c
            if (r0 == 0) goto L5
            goto L2d
        L5:
            if (r3 == 0) goto L2d
            com.beizi.fusion.c.j r0 = r2.a
            if (r0 == 0) goto L2d
            android.view.ViewGroup r0 = r2.f7555b
            if (r0 == 0) goto L2d
            android.content.Context r0 = r0.getContext()     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L20
            com.beizi.fusion.c.j r0 = r2.a     // Catch: java.lang.Throwable -> L20
            android.content.Context r1 = r3.getContext()     // Catch: java.lang.Throwable -> L20
            r0.a(r1)     // Catch: java.lang.Throwable -> L20
        L20:
            android.view.ViewGroup r0 = r2.f7555b
            r3.addView(r0)
            com.beizi.fusion.c.j r3 = r2.a
            r3.A()
            r3 = 1
            r2.f7556c = r3
        L2d:
            return
    }
}
