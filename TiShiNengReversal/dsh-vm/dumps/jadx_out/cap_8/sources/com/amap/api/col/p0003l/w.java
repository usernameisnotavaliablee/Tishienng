package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class w extends com.amap.api.col.p0003l.v {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class a implements com.amap.api.col.3l.v.a {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.amap.api.col.3l.v.a
        public final void a(com.amap.api.col.p0003l.v r1) {
                r0 = this;
                com.amap.api.col.3l.w r1 = (com.amap.api.col.p0003l.w) r1
                r0.f(r1)
                return
        }

        @Override // com.amap.api.col.3l.v.a
        public final boolean b(com.amap.api.col.p0003l.v r1) {
                r0 = this;
                com.amap.api.col.3l.w r1 = (com.amap.api.col.p0003l.w) r1
                boolean r1 = r0.d(r1)
                return r1
        }

        @Override // com.amap.api.col.3l.v.a
        public final boolean c(com.amap.api.col.p0003l.v r1) {
                r0 = this;
                com.amap.api.col.3l.w r1 = (com.amap.api.col.p0003l.w) r1
                boolean r1 = r0.e(r1)
                return r1
        }

        public abstract boolean d(com.amap.api.col.p0003l.w r1);

        public abstract boolean e(com.amap.api.col.p0003l.w r1);

        public abstract void f(com.amap.api.col.p0003l.w r1);
    }

    public w(android.content.Context r1, com.amap.api.col.3l.w.a r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public final float s() {
            r6 = this;
            float r0 = r6.m()
            double r0 = (double) r0
            float r2 = r6.l()
            double r2 = (double) r2
            double r0 = java.lang.Math.atan2(r0, r2)
            float r2 = r6.k()
            double r2 = (double) r2
            float r4 = r6.j()
            double r4 = (double) r4
            double r2 = java.lang.Math.atan2(r2, r4)
            double r0 = r0 - r2
            r2 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r0 = r0 * r2
            r2 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r0 = r0 / r2
            float r0 = (float) r0
            return r0
    }
}
