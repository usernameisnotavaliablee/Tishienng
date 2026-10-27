package androidx.emoji2.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ConcurrencyHelpers {
    private static final int FONT_LOAD_TIMEOUT_SECONDS = 15;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(28)
    static class Handler28Impl {
        private Handler28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.os.Handler createAsync(android.os.Looper r0) {
                android.os.Handler r0 = androidx.emoji2.text.c.a(r0)
                return r0
        }
    }

    private ConcurrencyHelpers() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.Thread a(java.lang.String r1, java.lang.Runnable r2) {
            java.lang.Thread r0 = new java.lang.Thread
            r0.<init>(r2, r1)
            r1 = 10
            r0.setPriority(r1)
            return r0
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    static java.util.concurrent.Executor convertHandlerToExecutor(@androidx.annotation.NonNull android.os.Handler r1) {
            java.util.Objects.requireNonNull(r1)
            androidx.emoji2.text.a r0 = new androidx.emoji2.text.a
            r0.<init>(r1)
            return r0
    }

    static java.util.concurrent.ThreadPoolExecutor createBackgroundPriorityExecutor(@androidx.annotation.NonNull java.lang.String r8) {
            androidx.emoji2.text.b r7 = new androidx.emoji2.text.b
            r7.<init>(r8)
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingDeque r6 = new java.util.concurrent.LinkedBlockingDeque
            r6.<init>()
            r1 = 0
            r2 = 1
            r3 = 15
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r8 = 1
            r0.allowCoreThreadTimeOut(r8)
            return r0
    }

    static android.os.Handler mainHandlerAsync() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lf
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = androidx.emoji2.text.ConcurrencyHelpers.Handler28Impl.createAsync(r0)
            return r0
        Lf:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            return r0
    }
}
