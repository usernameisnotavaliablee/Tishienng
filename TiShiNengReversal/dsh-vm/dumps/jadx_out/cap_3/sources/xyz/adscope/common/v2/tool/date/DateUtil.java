package xyz.adscope.common.v2.tool.date;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class DateUtil {
    private static final long DAY_1_MILLISECOND = 86400000;

    public DateUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long getTimeMillisBeforeDay(int r2) {
            java.util.Calendar r0 = java.util.Calendar.getInstance()     // Catch: java.lang.Exception -> Le
            int r2 = -r2
            r1 = 5
            r0.add(r1, r2)     // Catch: java.lang.Exception -> Le
            long r0 = r0.getTimeInMillis()     // Catch: java.lang.Exception -> Le
            return r0
        Le:
            r2 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r2)
            r0 = 0
            return r0
    }

    public static boolean timestampIsInDay(long r4, int r6) {
            long r0 = (long) r6
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 * r2
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r4
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L11
            r4 = 1
            return r4
        L11:
            r4 = 0
            return r4
    }
}
