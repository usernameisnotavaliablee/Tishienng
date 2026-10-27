package com.bxkj.base.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class z {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.base.v2.common.utils.z a = null;

    static {
            com.bxkj.base.v2.common.utils.z r0 = new com.bxkj.base.v2.common.utils.z
            r0.<init>()
            com.bxkj.base.v2.common.utils.z.a = r0
            return
    }

    private z() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String a(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            if (r3 != 0) goto L5
            java.lang.String r3 = ""
            return r3
        L5:
            boolean r0 = r3 instanceof java.lang.Double
            if (r0 == 0) goto L20
            java.text.NumberFormat r0 = java.text.NumberFormat.getIntegerInstance()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Double"
            kotlin.jvm.internal.g0.n(r3, r1)
            java.lang.Double r3 = (java.lang.Double) r3
            double r1 = r3.doubleValue()
            java.lang.String r3 = r0.format(r1)
            kotlin.jvm.internal.g0.m(r3)
            return r3
        L20:
            java.lang.String r3 = r3.toString()
            return r3
    }
}
