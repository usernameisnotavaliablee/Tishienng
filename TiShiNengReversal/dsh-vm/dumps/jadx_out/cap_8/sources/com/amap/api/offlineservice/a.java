package com.amap.api.offlineservice;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class a {
    protected com.amap.api.maps.offlinemap.OfflineMapActivity a;

    public a() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            return
    }

    public final int a(float r3) {
            r2 = this;
            com.amap.api.maps.offlinemap.OfflineMapActivity r0 = r2.a
            if (r0 == 0) goto L19
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.densityDpi
            float r0 = (float) r0
            r1 = 1126170624(0x43200000, float:160.0)
            float r0 = r0 / r1
            float r3 = r3 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r0
            int r3 = (int) r3
            return r3
        L19:
            int r3 = (int) r3
            return r3
    }

    public final void b() {
            r1 = this;
            com.amap.api.maps.offlinemap.OfflineMapActivity r0 = r1.a
            r0.showScr()
            return
    }

    public abstract void c(android.view.View r1);

    public final void d(com.amap.api.maps.offlinemap.OfflineMapActivity r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public abstract void e();

    public boolean f() {
            r1 = this;
            r0 = 1
            return r0
    }

    public abstract android.widget.RelativeLayout g();

    public abstract void h();
}
