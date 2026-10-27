package okhttp3.internal.platform.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class AndroidLogHandler extends java.util.logging.Handler {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.platform.android.AndroidLogHandler INSTANCE = null;

    static {
            okhttp3.internal.platform.android.AndroidLogHandler r0 = new okhttp3.internal.platform.android.AndroidLogHandler
            r0.<init>()
            okhttp3.internal.platform.android.AndroidLogHandler.INSTANCE = r0
            return
    }

    private AndroidLogHandler() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.logging.Handler
    public void close() {
            r0 = this;
            return
    }

    @Override // java.util.logging.Handler
    public void flush() {
            r0 = this;
            return
    }

    @Override // java.util.logging.Handler
    public void publish(@org.jetbrains.annotations.NotNull java.util.logging.LogRecord r6) {
            r5 = this;
            java.lang.String r0 = "record"
            kotlin.jvm.internal.g0.p(r6, r0)
            okhttp3.internal.platform.android.AndroidLog r0 = okhttp3.internal.platform.android.AndroidLog.INSTANCE
            java.lang.String r1 = r6.getLoggerName()
            java.lang.String r2 = "getLoggerName(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            int r2 = okhttp3.internal.platform.android.AndroidLogKt.access$getAndroidLevel(r6)
            java.lang.String r3 = r6.getMessage()
            java.lang.String r4 = "getMessage(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            java.lang.Throwable r6 = r6.getThrown()
            r0.androidLog$okhttp(r1, r2, r3, r6)
            return
    }
}
