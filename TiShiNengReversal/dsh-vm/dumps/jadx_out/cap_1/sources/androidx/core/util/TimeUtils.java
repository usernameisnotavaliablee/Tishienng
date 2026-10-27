package androidx.core.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class TimeUtils {

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int HUNDRED_DAY_FIELD_LEN = 19;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static char[] sFormatStr;
    private static final java.lang.Object sFormatSync = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.util.TimeUtils.sFormatSync = r0
            r0 = 24
            char[] r0 = new char[r0]
            androidx.core.util.TimeUtils.sFormatStr = r0
            return
    }

    private TimeUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int accumField(int r2, int r3, boolean r4, int r5) {
            r0 = 99
            r1 = 3
            if (r2 > r0) goto L20
            if (r4 == 0) goto La
            if (r5 < r1) goto La
            goto L20
        La:
            r0 = 9
            r1 = 2
            if (r2 > r0) goto L1e
            if (r4 == 0) goto L14
            if (r5 < r1) goto L14
            goto L1e
        L14:
            if (r4 != 0) goto L1b
            if (r2 <= 0) goto L19
            goto L1b
        L19:
            r2 = 0
            return r2
        L1b:
            int r3 = r3 + 1
            return r3
        L1e:
            int r3 = r3 + r1
            return r3
        L20:
            int r3 = r3 + r1
            return r3
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long r3, long r5, java.io.PrintWriter r7) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto Lc
            java.lang.String r3 = "--"
            r7.print(r3)
            return
        Lc:
            long r3 = r3 - r5
            r5 = 0
            formatDuration(r3, r7, r5)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long r1, java.io.PrintWriter r3) {
            r0 = 0
            formatDuration(r1, r3, r0)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long r2, java.io.PrintWriter r4, int r5) {
            java.lang.Object r0 = androidx.core.util.TimeUtils.sFormatSync
            monitor-enter(r0)
            int r2 = formatDurationLocked(r2, r5)     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L14
            char[] r5 = androidx.core.util.TimeUtils.sFormatStr     // Catch: java.lang.Throwable -> L14
            r1 = 0
            r3.<init>(r5, r1, r2)     // Catch: java.lang.Throwable -> L14
            r4.print(r3)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r2
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long r2, java.lang.StringBuilder r4) {
            java.lang.Object r0 = androidx.core.util.TimeUtils.sFormatSync
            monitor-enter(r0)
            r1 = 0
            int r2 = formatDurationLocked(r2, r1)     // Catch: java.lang.Throwable -> Lf
            char[] r3 = androidx.core.util.TimeUtils.sFormatStr     // Catch: java.lang.Throwable -> Lf
            r4.append(r3, r1, r2)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    private static int formatDurationLocked(long r16, int r18) {
            r0 = r16
            r2 = r18
            char[] r3 = androidx.core.util.TimeUtils.sFormatStr
            int r3 = r3.length
            if (r3 >= r2) goto Ld
            char[] r3 = new char[r2]
            androidx.core.util.TimeUtils.sFormatStr = r3
        Ld:
            char[] r4 = androidx.core.util.TimeUtils.sFormatStr
            r5 = 0
            r3 = 32
            r10 = 1
            r11 = 0
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 != 0) goto L25
            int r0 = r2 + (-1)
        L1b:
            if (r0 <= 0) goto L20
            r4[r11] = r3
            goto L1b
        L20:
            r0 = 48
            r4[r11] = r0
            return r10
        L25:
            if (r7 <= 0) goto L2a
            r5 = 43
            goto L2d
        L2a:
            long r0 = -r0
            r5 = 45
        L2d:
            r6 = 1000(0x3e8, double:4.94E-321)
            long r8 = r0 % r6
            int r12 = (int) r8
            long r0 = r0 / r6
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            int r0 = (int) r0
            r1 = 86400(0x15180, float:1.21072E-40)
            if (r0 <= r1) goto L44
            int r6 = r0 / r1
            int r1 = r1 * r6
            int r0 = r0 - r1
            goto L45
        L44:
            r6 = 0
        L45:
            r1 = 3600(0xe10, float:5.045E-42)
            if (r0 <= r1) goto L4f
            int r1 = r0 / 3600
            int r7 = r1 * 3600
            int r0 = r0 - r7
            goto L50
        L4f:
            r1 = 0
        L50:
            r7 = 60
            if (r0 <= r7) goto L5b
            int r7 = r0 / 60
            int r8 = r7 * 60
            int r0 = r0 - r8
            r13 = r7
            goto L5c
        L5b:
            r13 = 0
        L5c:
            r14 = 3
            r15 = 2
            if (r2 == 0) goto L97
            int r7 = accumField(r6, r10, r11, r11)
            if (r7 <= 0) goto L68
            r8 = 1
            goto L69
        L68:
            r8 = 0
        L69:
            int r8 = accumField(r1, r10, r8, r15)
            int r7 = r7 + r8
            if (r7 <= 0) goto L72
            r8 = 1
            goto L73
        L72:
            r8 = 0
        L73:
            int r8 = accumField(r13, r10, r8, r15)
            int r7 = r7 + r8
            if (r7 <= 0) goto L7c
            r8 = 1
            goto L7d
        L7c:
            r8 = 0
        L7d:
            int r8 = accumField(r0, r10, r8, r15)
            int r7 = r7 + r8
            if (r7 <= 0) goto L86
            r8 = 3
            goto L87
        L86:
            r8 = 0
        L87:
            int r8 = accumField(r12, r15, r10, r8)
            int r8 = r8 + r10
            int r7 = r7 + r8
            r8 = 0
        L8e:
            if (r7 >= r2) goto L98
            r4[r8] = r3
            int r8 = r8 + 1
            int r7 = r7 + 1
            goto L8e
        L97:
            r8 = 0
        L98:
            r4[r8] = r5
            int r7 = r8 + 1
            if (r2 == 0) goto La0
            r2 = 1
            goto La1
        La0:
            r2 = 0
        La1:
            r8 = 0
            r9 = 0
            r5 = r6
            r6 = 100
            int r3 = printField(r4, r5, r6, r7, r8, r9)
            r5 = r7
            if (r3 == r5) goto Laf
            r8 = 1
            goto Lb0
        Laf:
            r8 = 0
        Lb0:
            if (r2 == 0) goto Lb4
            r9 = 2
            goto Lb5
        Lb4:
            r9 = 0
        Lb5:
            r6 = 104(0x68, float:1.46E-43)
            r7 = r5
            r5 = r1
            r1 = r7
            r7 = r3
            int r7 = printField(r4, r5, r6, r7, r8, r9)
            if (r7 == r1) goto Lc3
            r8 = 1
            goto Lc4
        Lc3:
            r8 = 0
        Lc4:
            if (r2 == 0) goto Lc8
            r9 = 2
            goto Lc9
        Lc8:
            r9 = 0
        Lc9:
            r6 = 109(0x6d, float:1.53E-43)
            r5 = r13
            int r7 = printField(r4, r5, r6, r7, r8, r9)
            if (r7 == r1) goto Ld4
            r8 = 1
            goto Ld5
        Ld4:
            r8 = 0
        Ld5:
            if (r2 == 0) goto Ld9
            r9 = 2
            goto Lda
        Ld9:
            r9 = 0
        Lda:
            r6 = 115(0x73, float:1.61E-43)
            r5 = r0
            int r7 = printField(r4, r5, r6, r7, r8, r9)
            if (r2 == 0) goto Le7
            if (r7 == r1) goto Le7
            r9 = 3
            goto Le8
        Le7:
            r9 = 0
        Le8:
            r6 = 109(0x6d, float:1.53E-43)
            r8 = 1
            r5 = r12
            int r0 = printField(r4, r5, r6, r7, r8, r9)
            r1 = 115(0x73, float:1.61E-43)
            r4[r0] = r1
            int r0 = r0 + r10
            return r0
    }

    private static int printField(char[] r2, int r3, char r4, int r5, boolean r6, int r7) {
            if (r6 != 0) goto L6
            if (r3 <= 0) goto L5
            goto L6
        L5:
            return r5
        L6:
            if (r6 == 0) goto Lb
            r0 = 3
            if (r7 >= r0) goto Lf
        Lb:
            r0 = 99
            if (r3 <= r0) goto L1c
        Lf:
            int r0 = r3 / 100
            int r1 = r0 + 48
            char r1 = (char) r1
            r2[r5] = r1
            int r1 = r5 + 1
            int r0 = r0 * 100
            int r3 = r3 - r0
            goto L1d
        L1c:
            r1 = r5
        L1d:
            r0 = 2
            if (r6 == 0) goto L22
            if (r7 >= r0) goto L28
        L22:
            r6 = 9
            if (r3 > r6) goto L28
            if (r5 == r1) goto L34
        L28:
            int r5 = r3 / 10
            int r6 = r5 + 48
            char r6 = (char) r6
            r2[r1] = r6
            int r1 = r1 + 1
            int r5 = r5 * 10
            int r3 = r3 - r5
        L34:
            int r3 = r3 + 48
            char r3 = (char) r3
            r2[r1] = r3
            int r3 = r1 + 1
            r2[r3] = r4
            int r1 = r1 + r0
            return r1
    }
}
