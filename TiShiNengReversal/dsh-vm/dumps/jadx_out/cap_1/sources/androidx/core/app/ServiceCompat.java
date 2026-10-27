package androidx.core.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ServiceCompat {
    private static final int FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_Q = 255;
    private static final int FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_U = 1073745919;
    public static final int START_STICKY = 1;
    public static final int STOP_FOREGROUND_DETACH = 2;
    public static final int STOP_FOREGROUND_REMOVE = 1;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(24)
    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static void stopForeground(android.app.Service r0, int r1) {
                r0.stopForeground(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(29)
    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static void startForeground(android.app.Service r1, int r2, android.app.Notification r3, int r4) {
                if (r4 == 0) goto Lc
                r0 = -1
                if (r4 != r0) goto L6
                goto Lc
            L6:
                r4 = r4 & 255(0xff, float:3.57E-43)
                r1.startForeground(r2, r3, r4)
                return
            Lc:
                r1.startForeground(r2, r3, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(34)
    static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static void startForeground(android.app.Service r1, int r2, android.app.Notification r3, int r4) {
                if (r4 == 0) goto Le
                r0 = -1
                if (r4 != r0) goto L6
                goto Le
            L6:
                r0 = 1073745919(0x40000fff, float:2.0009763)
                r4 = r4 & r0
                r1.startForeground(r2, r3, r4)
                return
            Le:
                r1.startForeground(r2, r3, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface StopForegroundFlags {
    }

    private ServiceCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void startForeground(@androidx.annotation.NonNull android.app.Service r2, int r3, @androidx.annotation.NonNull android.app.Notification r4, int r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            androidx.core.app.ServiceCompat.Api34Impl.startForeground(r2, r3, r4, r5)
            return
        La:
            r1 = 29
            if (r0 < r1) goto L12
            androidx.core.app.ServiceCompat.Api29Impl.startForeground(r2, r3, r4, r5)
            return
        L12:
            r2.startForeground(r3, r4)
            return
    }

    public static void stopForeground(@androidx.annotation.NonNull android.app.Service r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto La
            androidx.core.app.ServiceCompat.Api24Impl.stopForeground(r2, r3)
            return
        La:
            r0 = 1
            r3 = r3 & r0
            if (r3 == 0) goto Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            r2.stopForeground(r0)
            return
    }
}
