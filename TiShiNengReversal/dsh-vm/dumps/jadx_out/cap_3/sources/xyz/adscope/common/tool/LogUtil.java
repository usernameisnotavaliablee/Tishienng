package xyz.adscope.common.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class LogUtil {
    public LogUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void d(java.lang.String r0, java.lang.String r1) {
            return
    }

    public static void dd(java.lang.String r0, java.lang.String r1) {
            return
    }

    public static void e(java.lang.String r0, java.lang.String r1) {
            return
    }

    public static java.lang.String generateTag(java.lang.StackTraceElement r7) {
            java.lang.String r0 = r7.getClassName()
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L37
            java.lang.String r2 = "%s.%s(Line:%d)"
            if (r1 != 0) goto L36
            java.lang.String r1 = "."
            int r1 = r0.lastIndexOf(r1)     // Catch: java.lang.Exception -> L37
            r3 = 1
            int r1 = r1 + r3
            java.lang.String r0 = r0.substring(r1)     // Catch: java.lang.Exception -> L37
            java.util.Locale r1 = java.util.Locale.ENGLISH     // Catch: java.lang.Exception -> L37
            java.lang.String r4 = r7.getMethodName()     // Catch: java.lang.Exception -> L37
            int r7 = r7.getLineNumber()     // Catch: java.lang.Exception -> L37
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L37
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L37
            r6 = 0
            r5[r6] = r0     // Catch: java.lang.Exception -> L37
            r5[r3] = r4     // Catch: java.lang.Exception -> L37
            r0 = 2
            r5[r0] = r7     // Catch: java.lang.Exception -> L37
            java.lang.String r7 = java.lang.String.format(r1, r2, r5)     // Catch: java.lang.Exception -> L37
            return r7
        L36:
            return r2
        L37:
            java.lang.String r7 = "LogUtil"
            return r7
    }

    public static java.lang.StackTraceElement getStackTraceElement() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 4
            r0 = r0[r1]
            return r0
    }

    public static void i(java.lang.String r0, java.lang.String r1) {
            return
    }
}
