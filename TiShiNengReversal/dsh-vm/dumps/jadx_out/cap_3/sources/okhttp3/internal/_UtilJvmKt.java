package okhttp3.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\n-UtilJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 -UtilJvm.kt\nokhttp3/internal/_UtilJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,355:1\n242#1:361\n242#1:362\n1#2:356\n1563#3:357\n1634#3,3:358\n*S KotlinDebug\n*F\n+ 1 -UtilJvm.kt\nokhttp3/internal/_UtilJvmKt\n*L\n260#1:361\n272#1:362\n131#1:357\n131#1:358,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class _UtilJvmKt {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.util.TimeZone UTC = null;

    @kotlin.jvm.JvmField
    public static final boolean assertionsEnabled = false;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String okHttpName = null;

    static {
            java.lang.String r0 = "GMT"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            kotlin.jvm.internal.g0.m(r0)
            okhttp3.internal._UtilJvmKt.UTC = r0
            r0 = 0
            okhttp3.internal._UtilJvmKt.assertionsEnabled = r0
            java.lang.Class<okhttp3.OkHttpClient> r0 = okhttp3.OkHttpClient.class
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "getName(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.String r1 = "okhttp3."
            java.lang.String r0 = kotlin.text.u.v4(r0, r1)
            java.lang.String r1 = "Client"
            java.lang.String r0 = kotlin.text.u.B4(r0, r1)
            okhttp3.internal._UtilJvmKt.okHttpName = r0
            return
    }

    public _UtilJvmKt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static /* synthetic */ java.lang.Thread a(java.lang.String r0, boolean r1, java.lang.Runnable r2) {
            java.lang.Thread r0 = threadFactory$lambda$0(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.EventListener.Factory asFactory(@org.jetbrains.annotations.NotNull okhttp3.EventListener r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            okhttp3.internal.c r0 = new okhttp3.internal.c
            r0.<init>(r1)
            return r0
    }

    private static final okhttp3.EventListener asFactory$lambda$0(okhttp3.EventListener r1, okhttp3.Call r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            return r1
    }

    public static final void assertLockNotHeld(@org.jetbrains.annotations.NotNull okhttp3.Dispatcher r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = okhttp3.internal._UtilJvmKt.assertionsEnabled
            if (r0 == 0) goto L37
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto L10
            goto L37
        L10:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Thread "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST NOT hold lock on "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L37:
            return
    }

    public static /* synthetic */ okhttp3.EventListener b(okhttp3.EventListener r0, okhttp3.Call r1) {
            okhttp3.EventListener r0 = asFactory$lambda$0(r0, r1)
            return r0
    }

    public static final boolean canReuseConnectionFor(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r2, @org.jetbrains.annotations.NotNull okhttp3.HttpUrl r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = r2.host()
            java.lang.String r1 = r3.host()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L32
            int r0 = r2.port()
            int r1 = r3.port()
            if (r0 != r1) goto L32
            java.lang.String r2 = r2.scheme()
            java.lang.String r3 = r3.scheme()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r2 == 0) goto L32
            r2 = 1
            return r2
        L32:
            r2 = 0
            return r2
    }

    public static final int checkDuration(@org.jetbrains.annotations.NotNull java.lang.String r5, long r6, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r8) {
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.g0.p(r8, r0)
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L5a
            long r6 = r8.toMillis(r6)
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 > 0) goto L3f
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 != 0) goto L3d
            if (r2 > 0) goto L22
            goto L3d
        L22:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = " too small"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L3d:
            int r5 = (int) r6
            return r5
        L3f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = " too large"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L5a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = " < 0"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    /* renamed from: checkDuration-HG0u8IE, reason: not valid java name */
    public static final int m0checkDurationHG0u8IE(@org.jetbrains.annotations.NotNull java.lang.String r5, long r6) {
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = kotlin.time.h.V(r6)
            if (r0 != 0) goto L5b
            long r0 = kotlin.time.h.x(r6)
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L40
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L3e
            boolean r6 = kotlin.time.h.W(r6)
            if (r6 != 0) goto L23
            goto L3e
        L23:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = " too small"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L3e:
            int r5 = (int) r0
            return r5
        L40:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = " too large"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L5b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = " < 0"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    public static final void closeQuietly(@org.jetbrains.annotations.NotNull java.net.ServerSocket r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.close()     // Catch: java.lang.Exception -> L8 java.lang.RuntimeException -> L9
        L8:
            return
        L9:
            r1 = move-exception
            throw r1
    }

    public static final void closeQuietly(@org.jetbrains.annotations.NotNull java.net.Socket r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2.close()     // Catch: java.lang.Exception -> L8 java.lang.RuntimeException -> L9 java.lang.AssertionError -> L18
        L8:
            return
        L9:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            java.lang.String r1 = "bio == null"
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L17
            return
        L17:
            throw r2
        L18:
            r2 = move-exception
            throw r2
    }

    public static final boolean discard(@org.jetbrains.annotations.NotNull okio.Source r1, int r2, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "timeUnit"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r1 = skipAll(r1, r2, r3)     // Catch: java.io.IOException -> Lf
            return r1
        Lf:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String format(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.Object... r3) {
            java.lang.String r0 = "format"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "args"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.jvm.internal.t0 r0 = kotlin.jvm.internal.t0.a
            java.util.Locale r0 = java.util.Locale.US
            int r1 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            int r1 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            java.lang.String r2 = java.lang.String.format(r0, r2, r3)
            java.lang.String r3 = "format(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            return r2
    }

    public static final long headersContentLength(@org.jetbrains.annotations.NotNull okhttp3.Response r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            okhttp3.Headers r2 = r2.headers()
            java.lang.String r0 = "Content-Length"
            java.lang.String r2 = r2.get(r0)
            r0 = -1
            if (r2 == 0) goto L17
            long r0 = okhttp3.internal._UtilCommonKt.toLongOrDefault(r2, r0)
        L17:
            return r0
    }

    @java.lang.SafeVarargs
    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> immutableListOf(@org.jetbrains.annotations.NotNull T... r1) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.List r1 = toImmutableList(r1)
            return r1
    }

    public static final boolean isHealthy(@org.jetbrains.annotations.NotNull java.net.Socket r2, @org.jetbrains.annotations.NotNull okio.BufferedSource r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 1
            int r1 = r2.getSoTimeout()     // Catch: java.io.IOException -> L20 java.net.SocketTimeoutException -> L21
            r2.setSoTimeout(r0)     // Catch: java.lang.Throwable -> L1b
            boolean r3 = r3.exhausted()     // Catch: java.lang.Throwable -> L1b
            r3 = r3 ^ r0
            r2.setSoTimeout(r1)     // Catch: java.io.IOException -> L20 java.net.SocketTimeoutException -> L21
            return r3
        L1b:
            r3 = move-exception
            r2.setSoTimeout(r1)     // Catch: java.io.IOException -> L20 java.net.SocketTimeoutException -> L21
            throw r3     // Catch: java.io.IOException -> L20 java.net.SocketTimeoutException -> L21
        L20:
            r0 = 0
        L21:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.nio.charset.Charset readBomAsCharset(@org.jetbrains.annotations.NotNull okio.BufferedSource r1, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "default"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.Options r0 = okhttp3.internal._UtilCommonKt.getUNICODE_BOMS()
            int r1 = r1.select(r0)
            r0 = -1
            if (r1 == r0) goto L40
            if (r1 == 0) goto L3d
            r2 = 1
            if (r1 == r2) goto L3a
            r2 = 2
            if (r1 == r2) goto L33
            r2 = 3
            if (r1 == r2) goto L30
            r2 = 4
            if (r1 != r2) goto L2a
            kotlin.text.e r1 = kotlin.text.e.a
            java.nio.charset.Charset r1 = r1.b()
            return r1
        L2a:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L30:
            java.nio.charset.Charset r1 = kotlin.text.e.e
            return r1
        L33:
            kotlin.text.e r1 = kotlin.text.e.a
            java.nio.charset.Charset r1 = r1.c()
            return r1
        L3a:
            java.nio.charset.Charset r1 = kotlin.text.e.d
            return r1
        L3d:
            java.nio.charset.Charset r1 = kotlin.text.e.b
            return r1
        L40:
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> T readFieldOrNull(@org.jetbrains.annotations.NotNull java.lang.Object r4, @org.jetbrains.annotations.NotNull java.lang.Class<T> r5, @org.jetbrains.annotations.NotNull java.lang.String r6) {
            java.lang.String r0 = "instance"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "fieldType"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "fieldName"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.Class r0 = r4.getClass()
        L13:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r2 = kotlin.jvm.internal.g0.g(r0, r1)
            r3 = 0
            if (r2 != 0) goto L3e
            java.lang.reflect.Field r1 = r0.getDeclaredField(r6)     // Catch: java.lang.NoSuchFieldException -> L34
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> L34
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.NoSuchFieldException -> L34
            boolean r2 = r5.isInstance(r1)     // Catch: java.lang.NoSuchFieldException -> L34
            if (r2 != 0) goto L2f
            goto L33
        L2f:
            java.lang.Object r3 = r5.cast(r1)     // Catch: java.lang.NoSuchFieldException -> L34
        L33:
            return r3
        L34:
            java.lang.Class r0 = r0.getSuperclass()
            java.lang.String r1 = "getSuperclass(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            goto L13
        L3e:
            java.lang.String r0 = "delegate"
            boolean r2 = kotlin.jvm.internal.g0.g(r6, r0)
            if (r2 != 0) goto L51
            java.lang.Object r4 = readFieldOrNull(r4, r1, r0)
            if (r4 == 0) goto L51
            java.lang.Object r4 = readFieldOrNull(r4, r5, r6)
            return r4
        L51:
            return r3
    }

    public static final void skipAll(@org.jetbrains.annotations.NotNull okio.BufferedSource r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
        L5:
            boolean r0 = r2.exhausted()
            if (r0 != 0) goto L17
            okio.Buffer r0 = r2.getBuffer()
            long r0 = r0.size()
            r2.skip(r0)
            goto L5
        L17:
            return
    }

    public static final boolean skipAll(@org.jetbrains.annotations.NotNull okio.Source r11, int r12, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r13) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "timeUnit"
            kotlin.jvm.internal.g0.p(r13, r0)
            long r0 = java.lang.System.nanoTime()
            okio.Timeout r2 = r11.timeout()
            boolean r2 = r2.hasDeadline()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L27
            okio.Timeout r2 = r11.timeout()
            long r5 = r2.deadlineNanoTime()
            long r5 = r5 - r0
            goto L28
        L27:
            r5 = r3
        L28:
            okio.Timeout r2 = r11.timeout()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.deadlineNanoTime(r12)
            okio.Buffer r12 = new okio.Buffer     // Catch: java.lang.Throwable -> L4e java.io.InterruptedIOException -> L50
            r12.<init>()     // Catch: java.lang.Throwable -> L4e java.io.InterruptedIOException -> L50
        L3e:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.read(r12, r7)     // Catch: java.lang.Throwable -> L4e java.io.InterruptedIOException -> L50
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L52
            r12.clear()     // Catch: java.lang.Throwable -> L4e java.io.InterruptedIOException -> L50
            goto L3e
        L4e:
            r12 = move-exception
            goto L68
        L50:
            goto L7d
        L52:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L5f
            okio.Timeout r11 = r11.timeout()
            r11.clearDeadline()
            return r12
        L5f:
            okio.Timeout r11 = r11.timeout()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
            return r12
        L68:
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L74
            okio.Timeout r11 = r11.timeout()
            r11.clearDeadline()
            goto L7c
        L74:
            okio.Timeout r11 = r11.timeout()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
        L7c:
            throw r12
        L7d:
            int r12 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r12 != 0) goto L89
            okio.Timeout r11 = r11.timeout()
            r11.clearDeadline()
            goto L91
        L89:
            okio.Timeout r11 = r11.timeout()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
        L91:
            r11 = 0
            return r11
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.concurrent.ThreadFactory threadFactory(@org.jetbrains.annotations.NotNull java.lang.String r1, boolean r2) {
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r1, r0)
            okhttp3.internal.d r0 = new okhttp3.internal.d
            r0.<init>(r1, r2)
            return r0
    }

    private static final java.lang.Thread threadFactory$lambda$0(java.lang.String r1, boolean r2, java.lang.Runnable r3) {
            java.lang.Thread r0 = new java.lang.Thread
            r0.<init>(r3, r1)
            r0.setDaemon(r2)
            return r0
    }

    public static final void threadName(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r3) {
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = r0.getName()
            r0.setName(r2)
            r2 = 1
            r3.invoke()     // Catch: java.lang.Throwable -> L23
            kotlin.jvm.internal.d0.d(r2)
            r0.setName(r1)
            kotlin.jvm.internal.d0.c(r2)
            return
        L23:
            r3 = move-exception
            kotlin.jvm.internal.d0.d(r2)
            r0.setName(r1)
            kotlin.jvm.internal.d0.c(r2)
            throw r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<okhttp3.internal.http2.Header> toHeaderList(@org.jetbrains.annotations.NotNull okhttp3.Headers r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
            int r1 = r5.size()
            kotlin.ranges.m r0 = kotlin.ranges.t.W1(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3b
            r2 = r0
            kotlin.collections.d1 r2 = (kotlin.collections.d1) r2
            int r2 = r2.nextInt()
            okhttp3.internal.http2.Header r3 = new okhttp3.internal.http2.Header
            java.lang.String r4 = r5.name(r2)
            java.lang.String r2 = r5.value(r2)
            r3.<init>(r4, r2)
            r1.add(r3)
            goto L1d
        L3b:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Headers toHeaders(@org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        Le:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r3.next()
            okhttp3.internal.http2.Header r1 = (okhttp3.internal.http2.Header) r1
            okio.ByteString r2 = r1.component1()
            okio.ByteString r1 = r1.component2()
            java.lang.String r2 = r2.utf8()
            java.lang.String r1 = r1.utf8()
            r0.addLenient$okhttp(r2, r1)
            goto Le
        L2e:
            okhttp3.Headers r3 = r0.build()
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String toHexString(int r1) {
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            java.lang.String r0 = "toHexString(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String toHexString(long r0) {
            java.lang.String r0 = java.lang.Long.toHexString(r0)
            java.lang.String r1 = "toHexString(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String toHostHeader(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r5, boolean r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = r5.host()
            r1 = 2
            r2 = 0
            java.lang.String r3 = ":"
            r4 = 0
            boolean r0 = kotlin.text.u.l3(r0, r3, r4, r1, r2)
            if (r0 == 0) goto L2f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = r5.host()
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L33
        L2f:
            java.lang.String r0 = r5.host()
        L33:
            if (r6 != 0) goto L47
            int r6 = r5.port()
            okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
            java.lang.String r2 = r5.scheme()
            int r1 = r1.defaultPort(r2)
            if (r6 == r1) goto L46
            goto L47
        L46:
            return r0
        L47:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r0 = 58
            r6.append(r0)
            int r5 = r5.port()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            return r5
    }

    public static /* synthetic */ java.lang.String toHostHeader$default(okhttp3.HttpUrl r0, boolean r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            java.lang.String r0 = toHostHeader(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> toImmutableList(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L10
            java.util.List r2 = kotlin.collections.f0.J()
            return r2
        L10:
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L26
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            java.lang.String r0 = "singletonList(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            return r2
        L26:
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object[] r2 = r2.toArray()
            java.lang.String r0 = "toArray(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            java.util.List r2 = kotlin.collections.n.t(r2)
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            java.lang.String r0 = "unmodifiableList(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<T of okhttp3.internal._UtilJvmKt.toImmutableList>"
            kotlin.jvm.internal.g0.n(r2, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> toImmutableList(@org.jetbrains.annotations.Nullable T[] r2) {
            if (r2 == 0) goto L2b
            int r0 = r2.length
            if (r0 != 0) goto L6
            goto L2b
        L6:
            int r0 = r2.length
            r1 = 1
            if (r0 != r1) goto L17
            r0 = 0
            r2 = r2[r0]
            java.util.List r2 = java.util.Collections.singletonList(r2)
            java.lang.String r0 = "singletonList(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            return r2
        L17:
            java.lang.Object r2 = r2.clone()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.util.List r2 = kotlin.collections.n.t(r2)
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            java.lang.String r0 = "unmodifiableList(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            return r2
        L2b:
            java.util.List r2 = kotlin.collections.f0.J()
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> unmodifiable(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            java.lang.String r0 = "unmodifiableList(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V> java.util.Map<K, V> unmodifiable(@org.jetbrains.annotations.NotNull java.util.Map<K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            java.lang.String r0 = "unmodifiableMap(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Set<T> unmodifiable(@org.jetbrains.annotations.NotNull java.util.Set<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)
            java.lang.String r0 = "unmodifiableSet(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }
}
