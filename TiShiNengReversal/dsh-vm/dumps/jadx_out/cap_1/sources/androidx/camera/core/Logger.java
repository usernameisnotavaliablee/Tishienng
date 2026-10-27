package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Logger {
    static final int DEFAULT_MIN_LOG_LEVEL = 3;
    private static final int MAX_TAG_LENGTH = 23;
    private static int sMinLogLevel = 3;

    static {
            return
    }

    private Logger() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void d(@androidx.annotation.NonNull java.lang.String r0, @androidx.annotation.NonNull java.lang.String r1) {
            java.lang.String r0 = truncateTag(r0)
            r1 = 3
            isLogLevelEnabled(r0, r1)
            return
    }

    public static void d(@androidx.annotation.NonNull java.lang.String r0, @androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.Throwable r2) {
            java.lang.String r0 = truncateTag(r0)
            r1 = 3
            isLogLevelEnabled(r0, r1)
            return
    }

    public static void e(@androidx.annotation.NonNull java.lang.String r0, @androidx.annotation.NonNull java.lang.String r1) {
            java.lang.String r0 = truncateTag(r0)
            r1 = 6
            isLogLevelEnabled(r0, r1)
            return
    }

    public static void e(@androidx.annotation.NonNull java.lang.String r0, @androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.Throwable r2) {
            java.lang.String r0 = truncateTag(r0)
            r1 = 6
            isLogLevelEnabled(r0, r1)
            return
    }

    static int getMinLogLevel() {
            int r0 = androidx.camera.core.Logger.sMinLogLevel
            return r0
    }

    public static void i(@androidx.annotation.NonNull java.lang.String r0, @androidx.annotation.NonNull java.lang.String r1) {
            java.lang.String r0 = truncateTag(r0)
            r1 = 4
            isLogLevelEnabled(r0, r1)
            return
    }

    public static void i(@androidx.annotation.NonNull java.lang.String r0, @androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.Throwable r2) {
            java.lang.String r0 = truncateTag(r0)
            r1 = 4
            isLogLevelEnabled(r0, r1)
            return
    }

    public static boolean isDebugEnabled(@androidx.annotation.NonNull java.lang.String r1) {
            java.lang.String r1 = truncateTag(r1)
            r0 = 3
            boolean r1 = isLogLevelEnabled(r1, r0)
            return r1
    }

    public static boolean isErrorEnabled(@androidx.annotation.NonNull java.lang.String r1) {
            java.lang.String r1 = truncateTag(r1)
            r0 = 6
            boolean r1 = isLogLevelEnabled(r1, r0)
            return r1
    }

    public static boolean isInfoEnabled(@androidx.annotation.NonNull java.lang.String r1) {
            java.lang.String r1 = truncateTag(r1)
            r0 = 4
            boolean r1 = isLogLevelEnabled(r1, r0)
            return r1
    }

    private static boolean isLogLevelEnabled(@androidx.annotation.NonNull java.lang.String r1, int r2) {
            int r0 = androidx.camera.core.Logger.sMinLogLevel
            if (r0 <= r2) goto Ld
            boolean r1 = android.util.Log.isLoggable(r1, r2)
            if (r1 == 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            r1 = 1
            return r1
    }

    public static boolean isWarnEnabled(@androidx.annotation.NonNull java.lang.String r1) {
            java.lang.String r1 = truncateTag(r1)
            r0 = 5
            boolean r1 = isLogLevelEnabled(r1, r0)
            return r1
    }

    static void resetMinLogLevel() {
            r0 = 3
            androidx.camera.core.Logger.sMinLogLevel = r0
            return
    }

    static void setMinLogLevel(@androidx.annotation.IntRange(from = 3, to = 6) int r0) {
            androidx.camera.core.Logger.sMinLogLevel = r0
            return
    }

    @androidx.annotation.NonNull
    private static java.lang.String truncateTag(@androidx.annotation.NonNull java.lang.String r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 > r1) goto L13
            int r0 = r2.length()
            r1 = 23
            if (r1 >= r0) goto L13
            r0 = 0
            java.lang.String r2 = r2.substring(r0, r1)
        L13:
            return r2
    }

    public static void w(@androidx.annotation.NonNull java.lang.String r0, @androidx.annotation.NonNull java.lang.String r1) {
            java.lang.String r0 = truncateTag(r0)
            r1 = 5
            isLogLevelEnabled(r0, r1)
            return
    }

    public static void w(@androidx.annotation.NonNull java.lang.String r0, @androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.Throwable r2) {
            java.lang.String r0 = truncateTag(r0)
            r1 = 5
            isLogLevelEnabled(r0, r1)
            return
    }
}
