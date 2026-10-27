package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class y7 {
    com.amap.api.col.p0003l.y7 a;

    public y7() {
            r0 = this;
            r0.<init>()
            return
    }

    public y7(com.amap.api.col.p0003l.y7 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public int a() {
            r2 = this;
            com.amap.api.col.3l.y7 r0 = r2.a
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == 0) goto Lc
            int r0 = r0.a()
            goto Lf
        Lc:
            r0 = 2147483647(0x7fffffff, float:NaN)
        Lf:
            int r0 = java.lang.Math.min(r1, r0)
            return r0
    }

    public void b(int r2) {
            r1 = this;
            com.amap.api.col.3l.y7 r0 = r1.a
            if (r0 == 0) goto L7
            r0.b(r2)
        L7:
            return
    }

    public void c(boolean r2) {
            r1 = this;
            com.amap.api.col.3l.y7 r0 = r1.a
            if (r0 == 0) goto L7
            r0.c(r2)
        L7:
            return
    }

    protected abstract boolean d();

    public final boolean e() {
            r1 = this;
            com.amap.api.col.3l.y7 r0 = r1.a
            if (r0 == 0) goto L9
            boolean r0 = r0.e()
            goto La
        L9:
            r0 = 1
        La:
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            boolean r0 = r1.d()
            return r0
    }
}
