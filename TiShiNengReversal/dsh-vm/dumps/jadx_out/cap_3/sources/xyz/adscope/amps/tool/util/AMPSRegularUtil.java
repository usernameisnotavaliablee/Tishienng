package xyz.adscope.amps.tool.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSRegularUtil {
    public AMPSRegularUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isInteger(java.lang.String r2) {
            r0 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L1a
            if (r1 == 0) goto L8
            return r0
        L8:
            java.lang.String r1 = "-?\\d+"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)     // Catch: java.lang.Exception -> L1a
            java.util.regex.Matcher r2 = r1.matcher(r2)     // Catch: java.lang.Exception -> L1a
            boolean r2 = r2.matches()     // Catch: java.lang.Exception -> L1a
            if (r2 == 0) goto L1a
            r2 = 1
            return r2
        L1a:
            return r0
    }
}
