package com.bxkj.student.run.app.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class k implements java.lang.Comparable<com.bxkj.student.run.app.utils.k> {
    public int a;
    public com.amap.api.maps.model.LatLng b;

    public k(int r1, com.amap.api.maps.model.LatLng r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public int a(@androidx.annotation.NonNull com.bxkj.student.run.app.utils.k r2) {
            r1 = this;
            int r0 = r1.a
            int r2 = r2.a
            if (r0 >= r2) goto L8
            r2 = -1
            return r2
        L8:
            if (r0 <= r2) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(@androidx.annotation.NonNull com.bxkj.student.run.app.utils.k r1) {
            r0 = this;
            com.bxkj.student.run.app.utils.k r1 = (com.bxkj.student.run.app.utils.k) r1
            int r1 = r0.a(r1)
            return r1
    }
}
