package xyz.adscope.amps.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSLogUtil {
    private static final boolean isDebug = true;

    public AMPSLogUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void d(java.lang.String r0, java.lang.String r1) {
            return
    }

    public static void dd(java.lang.String r5, java.lang.String r6) {
            if (r5 == 0) goto L30
            int r5 = r5.length()
            if (r5 == 0) goto L30
            if (r6 == 0) goto L30
            int r5 = r6.length()
            if (r5 != 0) goto L11
            goto L30
        L11:
            int r5 = r6.length()
            long r0 = (long) r5
            r5 = 3072(0xc00, float:4.305E-42)
            long r2 = (long) r5
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L1e
            goto L30
        L1e:
            int r0 = r6.length()
            if (r0 <= r5) goto L30
            r0 = 0
            java.lang.String r0 = r6.substring(r0, r5)
            java.lang.String r1 = ""
            java.lang.String r6 = r6.replace(r0, r1)
            goto L1e
        L30:
            return
    }

    public static void e(java.lang.String r0, java.lang.String r1) {
            return
    }

    public static void i(java.lang.String r0, java.lang.String r1) {
            return
    }
}
