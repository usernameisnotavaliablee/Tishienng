package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
abstract class f0<T, V> extends com.amap.api.col.s.b4<T, V> {
    public f0(android.content.Context r1, T r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public T U() {
            r1 = this;
            T r0 = r1.n
            return r0
    }

    @Override // com.amap.api.col.s.dz
    public java.lang.String h() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.amap.api.col.s.i4.b()
            r0.append(r1)
            java.lang.String r1 = "/weather/weatherInfo?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
