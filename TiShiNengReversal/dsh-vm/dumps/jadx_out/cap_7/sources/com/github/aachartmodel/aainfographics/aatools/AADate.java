package com.github.aachartmodel.aainfographics.aatools;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class AADate {
    public static final com.github.aachartmodel.aainfographics.aatools.AADate INSTANCE = null;

    static {
            com.github.aachartmodel.aainfographics.aatools.AADate r0 = new com.github.aachartmodel.aainfographics.aatools.AADate
            r0.<init>()
            com.github.aachartmodel.aainfographics.aatools.AADate.INSTANCE = r0
            return
    }

    private AADate() {
            r0 = this;
            r0.<init>()
            return
    }

    public final long AADateUTC(int r3, int r4, int r5) {
            r2 = this;
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd"
            r0.<init>(r1)
            java.lang.String r1 = "UTC"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            r0.setTimeZone(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.text.ParseException -> L2f
            r1.<init>()     // Catch: java.text.ParseException -> L2f
            r1.append(r3)     // Catch: java.text.ParseException -> L2f
            r3 = 45
            r1.append(r3)     // Catch: java.text.ParseException -> L2f
            r1.append(r4)     // Catch: java.text.ParseException -> L2f
            r1.append(r3)     // Catch: java.text.ParseException -> L2f
            r1.append(r5)     // Catch: java.text.ParseException -> L2f
            java.lang.String r3 = r1.toString()     // Catch: java.text.ParseException -> L2f
            java.util.Date r3 = r0.parse(r3)     // Catch: java.text.ParseException -> L2f
            goto L30
        L2f:
            r3 = 0
        L30:
            kotlin.jvm.internal.g0.m(r3)
            long r3 = r3.getTime()
            return r3
    }
}
