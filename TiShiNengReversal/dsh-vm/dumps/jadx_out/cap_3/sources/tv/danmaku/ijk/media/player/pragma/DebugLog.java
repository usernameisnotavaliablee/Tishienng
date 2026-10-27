package tv.danmaku.ijk.media.player.pragma;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class DebugLog {
    public static final boolean ENABLE_DEBUG = true;
    public static final boolean ENABLE_ERROR = true;
    public static final boolean ENABLE_INFO = true;
    public static final boolean ENABLE_VERBOSE = true;
    public static final boolean ENABLE_WARN = true;

    public DebugLog() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void d(java.lang.String r0, java.lang.String r1) {
            return
    }

    public static void d(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2) {
            return
    }

    public static void dfmt(java.lang.String r0, java.lang.String r1, java.lang.Object... r2) {
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String.format(r0, r1, r2)
            return
    }

    public static void e(java.lang.String r0, java.lang.String r1) {
            return
    }

    public static void e(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2) {
            return
    }

    public static void efmt(java.lang.String r0, java.lang.String r1, java.lang.Object... r2) {
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String.format(r0, r1, r2)
            return
    }

    public static void i(java.lang.String r0, java.lang.String r1) {
            return
    }

    public static void i(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2) {
            return
    }

    public static void ifmt(java.lang.String r0, java.lang.String r1, java.lang.Object... r2) {
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String.format(r0, r1, r2)
            return
    }

    public static void printCause(java.lang.Throwable r1) {
            java.lang.Throwable r0 = r1.getCause()
            if (r0 == 0) goto L7
            r1 = r0
        L7:
            printStackTrace(r1)
            return
    }

    public static void printStackTrace(java.lang.Throwable r0) {
            r0.getClass()
            return
    }

    public static void v(java.lang.String r0, java.lang.String r1) {
            return
    }

    public static void v(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2) {
            return
    }

    public static void vfmt(java.lang.String r0, java.lang.String r1, java.lang.Object... r2) {
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String.format(r0, r1, r2)
            return
    }

    public static void w(java.lang.String r0, java.lang.String r1) {
            return
    }

    public static void w(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2) {
            return
    }

    public static void wfmt(java.lang.String r0, java.lang.String r1, java.lang.Object... r2) {
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String.format(r0, r1, r2)
            return
    }
}
