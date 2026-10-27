package com.bxkj.base.v2.common.ext;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class g {
    public g() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String a(long r10) {
            r0 = 1024(0x400, float:1.435E-42)
            long r0 = (long) r0
            r2 = 1024(0x400, double:5.06E-321)
            long r4 = r0 * r2
            long r0 = r0 * r4
            r6 = 0
            java.lang.String r7 = "format(...)"
            r8 = 1
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 < 0) goto L2c
            kotlin.jvm.internal.t0 r2 = kotlin.jvm.internal.t0.a
            float r10 = (float) r10
            float r11 = (float) r0
            float r10 = r10 / r11
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r6] = r10
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r11, r8)
            java.lang.String r11 = "%.1f GB"
            java.lang.String r10 = java.lang.String.format(r11, r10)
            kotlin.jvm.internal.g0.o(r10, r7)
            return r10
        L2c:
            r0 = 1120403456(0x42c80000, float:100.0)
            int r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r1 < 0) goto L54
            float r10 = (float) r10
            float r11 = (float) r4
            float r10 = r10 / r11
            kotlin.jvm.internal.t0 r11 = kotlin.jvm.internal.t0.a
            int r11 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r11 <= 0) goto L3e
            java.lang.String r11 = "%.0f MB"
            goto L40
        L3e:
            java.lang.String r11 = "%.1f MB"
        L40:
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r6] = r10
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r0, r8)
            java.lang.String r10 = java.lang.String.format(r11, r10)
            kotlin.jvm.internal.g0.o(r10, r7)
            return r10
        L54:
            int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r1 < 0) goto L7a
            float r10 = (float) r10
            float r11 = (float) r2
            float r10 = r10 / r11
            kotlin.jvm.internal.t0 r11 = kotlin.jvm.internal.t0.a
            int r11 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r11 <= 0) goto L64
            java.lang.String r11 = "%.0f KB"
            goto L66
        L64:
            java.lang.String r11 = "%.1f KB"
        L66:
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r6] = r10
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r0, r8)
            java.lang.String r10 = java.lang.String.format(r11, r10)
            kotlin.jvm.internal.g0.o(r10, r7)
            return r10
        L7a:
            kotlin.jvm.internal.t0 r0 = kotlin.jvm.internal.t0.a
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r6] = r10
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r11, r8)
            java.lang.String r11 = "%d B"
            java.lang.String r10 = java.lang.String.format(r11, r10)
            kotlin.jvm.internal.g0.o(r10, r7)
            return r10
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String b(long r3) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r2 = java.util.Locale.CHINA
            r0.<init>(r1, r2)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = r0.format(r3)
            java.lang.String r4 = "format(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String c(long r4) {
            r0 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L18
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = "ms"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
        L18:
            r0 = 60000(0xea60, double:2.9644E-319)
            r2 = 60000(0xea60, float:8.4078E-41)
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 >= 0) goto L3a
            long r0 = (long) r2
            long r4 = r4 % r0
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r4 = r4 / r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = "s"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
        L3a:
            r0 = 3600000(0x36ee80, float:5.044674E-39)
            long r0 = (long) r0
            long r4 = r4 % r0
            long r0 = (long) r2
            long r4 = r4 / r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = "min"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String d(long r3) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r2 = java.util.Locale.CHINA
            r0.<init>(r1, r2)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = r0.format(r3)
            java.lang.String r4 = "format(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            return r3
    }

    public static final boolean e(long r3) {
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r3
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto Le
            r3 = 1
            return r3
        Le:
            r3 = 0
            return r3
    }

    public static final boolean f(long r3) {
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r0.setTimeInMillis(r3)
            java.util.Calendar r3 = java.util.Calendar.getInstance()
            r4 = 1
            int r1 = r0.get(r4)
            int r2 = r3.get(r4)
            if (r1 != r2) goto L22
            r1 = 6
            int r0 = r0.get(r1)
            int r3 = r3.get(r1)
            if (r0 != r3) goto L22
            return r4
        L22:
            r3 = 0
            return r3
    }
}
