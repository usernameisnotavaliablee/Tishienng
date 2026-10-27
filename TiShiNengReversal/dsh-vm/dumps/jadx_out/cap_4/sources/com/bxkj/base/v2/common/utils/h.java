package com.bxkj.base.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDecimalFormatUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DecimalFormatUtils.kt\ncom/bxkj/base/v2/common/utils/DecimalFormatUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n1#2:19\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class h {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.base.v2.common.utils.h a = null;

    static {
            com.bxkj.base.v2.common.utils.h r0 = new com.bxkj.base.v2.common.utils.h
            r0.<init>()
            com.bxkj.base.v2.common.utils.h.a = r0
            return
    }

    private h() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String a(double r3) {
            r2 = this;
            java.text.DecimalFormat r0 = new java.text.DecimalFormat
            java.lang.String r1 = "0.00"
            r0.<init>(r1)
            java.math.RoundingMode r1 = java.math.RoundingMode.FLOOR
            r0.setRoundingMode(r1)
            java.lang.String r3 = r0.format(r3)
            java.lang.String r4 = "format(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String b(double r3) {
            r2 = this;
            java.text.DecimalFormat r0 = new java.text.DecimalFormat
            java.lang.String r1 = "0.000"
            r0.<init>(r1)
            java.math.RoundingMode r1 = java.math.RoundingMode.FLOOR
            r0.setRoundingMode(r1)
            java.lang.String r3 = r0.format(r3)
            java.lang.String r4 = "format(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            return r3
    }
}
