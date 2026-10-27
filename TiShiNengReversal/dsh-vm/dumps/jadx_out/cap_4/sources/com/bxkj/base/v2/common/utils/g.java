package com.bxkj.base.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDataFormatUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataFormatUtils.kt\ncom/bxkj/base/v2/common/utils/DataFormatUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class g {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.base.v2.common.utils.g a = null;

    @org.jetbrains.annotations.NotNull
    private static java.text.SimpleDateFormat b;

    static {
            com.bxkj.base.v2.common.utils.g r0 = new com.bxkj.base.v2.common.utils.g
            r0.<init>()
            com.bxkj.base.v2.common.utils.g.a = r0
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            r0.<init>(r1)
            com.bxkj.base.v2.common.utils.g.b = r0
            return
    }

    private g() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String a(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
            java.text.SimpleDateFormat r0 = com.bxkj.base.v2.common.utils.g.b     // Catch: java.lang.Exception -> L17
            java.util.Date r1 = new java.util.Date     // Catch: java.lang.Exception -> L17
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> L17
            long r2 = java.lang.Long.parseLong(r4)     // Catch: java.lang.Exception -> L17
            r1.<init>(r2)     // Catch: java.lang.Exception -> L17
            java.lang.String r4 = r0.format(r1)     // Catch: java.lang.Exception -> L17
            kotlin.jvm.internal.g0.m(r4)     // Catch: java.lang.Exception -> L17
            return r4
        L17:
            java.lang.String r4 = ""
            return r4
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String b(long r4) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "HH:mm:ss"
            java.util.Locale r2 = java.util.Locale.CHINA
            r0.<init>(r1, r2)
            java.lang.String r1 = "UTC"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            r0.setTimeZone(r1)
            java.util.Date r1 = new java.util.Date
            r2 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r2
            long r4 = r4 * r2
            r1.<init>(r4)
            java.lang.String r4 = r0.format(r1)
            java.lang.String r5 = "format(...)"
            kotlin.jvm.internal.g0.o(r4, r5)
            return r4
    }
}
