package xyz.adscope.amps.tool.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSDateUtil {
    public AMPSDateUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long getTimeMillisBeforeDay(int r2) {
            java.util.Calendar r0 = java.util.Calendar.getInstance()     // Catch: java.lang.Exception -> Le
            r1 = 5
            int r2 = -r2
            r0.add(r1, r2)     // Catch: java.lang.Exception -> Le
            long r0 = r0.getTimeInMillis()     // Catch: java.lang.Exception -> Le
            return r0
        Le:
            r0 = 0
            return r0
    }
}
