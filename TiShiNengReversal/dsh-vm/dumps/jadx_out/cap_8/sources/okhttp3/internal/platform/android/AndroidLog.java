package okhttp3.internal.platform.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@okhttp3.internal.SuppressSignatureCheck
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class AndroidLog {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.platform.android.AndroidLog INSTANCE = null;
    private static final int MAX_LOG_LENGTH = 4000;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.CopyOnWriteArraySet<java.util.logging.Logger> configuredLoggers = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<java.lang.String, java.lang.String> knownLoggers = null;

    static {
            okhttp3.internal.platform.android.AndroidLog r0 = new okhttp3.internal.platform.android.AndroidLog
            r0.<init>()
            okhttp3.internal.platform.android.AndroidLog.INSTANCE = r0
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            okhttp3.internal.platform.android.AndroidLog.configuredLoggers = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.Class<okhttp3.OkHttpClient> r1 = okhttp3.OkHttpClient.class
            java.lang.Package r2 = r1.getPackage()
            if (r2 == 0) goto L20
            java.lang.String r2 = r2.getName()
            goto L21
        L20:
            r2 = 0
        L21:
            if (r2 == 0) goto L28
            java.lang.String r3 = "OkHttp"
            r0.put(r2, r3)
        L28:
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "okhttp.OkHttpClient"
            r0.put(r1, r2)
            java.lang.Class<okhttp3.internal.http2.Http2> r1 = okhttp3.internal.http2.Http2.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "okhttp.Http2"
            r0.put(r1, r2)
            java.lang.Class<okhttp3.internal.concurrent.TaskRunner> r1 = okhttp3.internal.concurrent.TaskRunner.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "okhttp.TaskRunner"
            r0.put(r1, r2)
            java.lang.String r1 = "okhttp3.mockwebserver.MockWebServer"
            java.lang.String r2 = "okhttp.MockWebServer"
            r0.put(r1, r2)
            java.util.Map r0 = kotlin.collections.i1.D0(r0)
            okhttp3.internal.platform.android.AndroidLog.knownLoggers = r0
            return
    }

    private AndroidLog() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void androidLog$okhttp$default(okhttp3.internal.platform.android.AndroidLog r0, java.lang.String r1, int r2, java.lang.String r3, java.lang.Throwable r4, int r5, java.lang.Object r6) {
            r5 = r5 & 8
            if (r5 == 0) goto L5
            r4 = 0
        L5:
            r0.androidLog$okhttp(r1, r2, r3, r4)
            return
    }

    private final void enableLogging(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.util.logging.Logger r2 = java.util.logging.Logger.getLogger(r2)
            java.util.concurrent.CopyOnWriteArraySet<java.util.logging.Logger> r0 = okhttp3.internal.platform.android.AndroidLog.configuredLoggers
            boolean r0 = r0.add(r2)
            if (r0 == 0) goto L2e
            r0 = 0
            r2.setUseParentHandlers(r0)
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 == 0) goto L1a
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            goto L26
        L1a:
            r0 = 4
            boolean r3 = android.util.Log.isLoggable(r3, r0)
            if (r3 == 0) goto L24
            java.util.logging.Level r3 = java.util.logging.Level.INFO
            goto L26
        L24:
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
        L26:
            r2.setLevel(r3)
            okhttp3.internal.platform.android.AndroidLogHandler r3 = okhttp3.internal.platform.android.AndroidLogHandler.INSTANCE
            r2.addHandler(r3)
        L2e:
            return
    }

    private final java.lang.String loggerTag(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = okhttp3.internal.platform.android.AndroidLog.knownLoggers
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L11
            r0 = 23
            java.lang.String r2 = kotlin.text.u.y9(r2, r0)
            return r2
        L11:
            return r0
    }

    public final void androidLog$okhttp(@org.jetbrains.annotations.NotNull java.lang.String r7, int r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.Nullable java.lang.Throwable r10) {
            r6 = this;
            java.lang.String r0 = "loggerName"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "message"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r7 = r6.loggerTag(r7)
            boolean r0 = android.util.Log.isLoggable(r7, r8)
            if (r0 == 0) goto L5e
            if (r10 == 0) goto L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            r9 = 10
            r0.append(r9)
            java.lang.String r9 = android.util.Log.getStackTraceString(r10)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
        L2e:
            r0 = r9
            int r9 = r0.length()
            r10 = 0
            r2 = 0
        L35:
            if (r2 >= r9) goto L5e
            r4 = 4
            r5 = 0
            r1 = 10
            r3 = 0
            int r10 = kotlin.text.u.G3(r0, r1, r2, r3, r4, r5)
            r1 = -1
            if (r10 == r1) goto L44
            goto L45
        L44:
            r10 = r9
        L45:
            int r1 = r2 + 4000
            int r1 = java.lang.Math.min(r10, r1)
            java.lang.String r2 = r0.substring(r2, r1)
            java.lang.String r3 = "substring(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            android.util.Log.println(r8, r7, r2)
            if (r1 < r10) goto L5c
            int r2 = r1 + 1
            goto L35
        L5c:
            r2 = r1
            goto L45
        L5e:
            return
    }

    public final void enable() {
            r3 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = okhttp3.internal.platform.android.AndroidLog.knownLoggers     // Catch: java.lang.UnsatisfiedLinkError -> L26 java.lang.RuntimeException -> L2c
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.UnsatisfiedLinkError -> L26 java.lang.RuntimeException -> L2c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.UnsatisfiedLinkError -> L26 java.lang.RuntimeException -> L2c
        La:
            boolean r1 = r0.hasNext()     // Catch: java.lang.UnsatisfiedLinkError -> L26 java.lang.RuntimeException -> L2c
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()     // Catch: java.lang.UnsatisfiedLinkError -> L26 java.lang.RuntimeException -> L2c
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.UnsatisfiedLinkError -> L26 java.lang.RuntimeException -> L2c
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.UnsatisfiedLinkError -> L26 java.lang.RuntimeException -> L2c
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.UnsatisfiedLinkError -> L26 java.lang.RuntimeException -> L2c
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.UnsatisfiedLinkError -> L26 java.lang.RuntimeException -> L2c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.UnsatisfiedLinkError -> L26 java.lang.RuntimeException -> L2c
            r3.enableLogging(r2, r1)     // Catch: java.lang.UnsatisfiedLinkError -> L26 java.lang.RuntimeException -> L2c
            goto La
        L26:
            java.io.PrintStream r0 = java.lang.System.err
            r0.getClass()
            goto L31
        L2c:
            java.io.PrintStream r0 = java.lang.System.err
            r0.getClass()
        L31:
            return
    }
}
