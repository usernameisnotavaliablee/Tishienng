package com.bxkj.student.v2.common.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class b {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.common.data.b a = null;
    private static double b;

    static {
            com.bxkj.student.v2.common.data.b r0 = new com.bxkj.student.v2.common.data.b
            r0.<init>()
            com.bxkj.student.v2.common.data.b.a = r0
            r0 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            com.bxkj.student.v2.common.data.b.b = r0
            return
    }

    private b() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.bxkj.student.v2.common.data.PointData a(@org.jetbrains.annotations.NotNull com.bxkj.student.v2.common.data.PointData r9, @org.jetbrains.annotations.NotNull com.bxkj.student.v2.common.data.PointData r10) {
            r8 = this;
            java.lang.String r0 = "lastPoint"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "newPoint"
            kotlin.jvm.internal.g0.p(r10, r0)
            double r0 = com.bxkj.student.v2.common.data.b.b
            double r2 = r10.getA()
            double r0 = r0 * r2
            r2 = 1
            double r2 = (double) r2
            double r4 = com.bxkj.student.v2.common.data.b.b
            double r4 = r2 - r4
            double r6 = r9.getA()
            double r4 = r4 * r6
            double r0 = r0 + r4
            r10.setA(r0)
            double r0 = com.bxkj.student.v2.common.data.b.b
            double r4 = r10.getO()
            double r0 = r0 * r4
            double r4 = com.bxkj.student.v2.common.data.b.b
            double r2 = r2 - r4
            double r4 = r9.getO()
            double r2 = r2 * r4
            double r0 = r0 + r2
            r10.setO(r0)
            return r10
    }
}
