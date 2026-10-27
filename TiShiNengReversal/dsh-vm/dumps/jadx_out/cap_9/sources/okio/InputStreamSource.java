package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJvmOkio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmOkio.kt\nokio/InputStreamSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,234:1\n1#2:235\n85#3:236\n*S KotlinDebug\n*F\n+ 1 JvmOkio.kt\nokio/InputStreamSource\n*L\n93#1:236\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class InputStreamSource implements okio.Source {

    @org.jetbrains.annotations.NotNull
    private final java.io.InputStream input;

    @org.jetbrains.annotations.NotNull
    private final okio.Timeout timeout;

    public InputStreamSource(@org.jetbrains.annotations.NotNull java.io.InputStream r2, @org.jetbrains.annotations.NotNull okio.Timeout r3) {
            r1 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "timeout"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.input = r2
            r1.timeout = r3
            return
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            java.io.InputStream r0 = r1.input
            r0.close()
            return
    }

    @Override // okio.Source
    public long read(@org.jetbrains.annotations.NotNull okio.Buffer r4, long r5) {
            r3 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto Lc
            return r0
        Lc:
            if (r2 < 0) goto L60
            okio.Timeout r0 = r3.timeout     // Catch: java.lang.AssertionError -> L3f
            r0.throwIfReached()     // Catch: java.lang.AssertionError -> L3f
            r0 = 1
            okio.Segment r0 = r4.writableSegment$okio(r0)     // Catch: java.lang.AssertionError -> L3f
            int r1 = r0.limit     // Catch: java.lang.AssertionError -> L3f
            int r1 = 8192 - r1
            long r1 = (long) r1     // Catch: java.lang.AssertionError -> L3f
            long r5 = java.lang.Math.min(r5, r1)     // Catch: java.lang.AssertionError -> L3f
            int r6 = (int) r5     // Catch: java.lang.AssertionError -> L3f
            java.io.InputStream r5 = r3.input     // Catch: java.lang.AssertionError -> L3f
            byte[] r1 = r0.data     // Catch: java.lang.AssertionError -> L3f
            int r2 = r0.limit     // Catch: java.lang.AssertionError -> L3f
            int r5 = r5.read(r1, r2, r6)     // Catch: java.lang.AssertionError -> L3f
            r6 = -1
            if (r5 != r6) goto L44
            int r5 = r0.pos     // Catch: java.lang.AssertionError -> L3f
            int r6 = r0.limit     // Catch: java.lang.AssertionError -> L3f
            if (r5 != r6) goto L41
            okio.Segment r5 = r0.pop()     // Catch: java.lang.AssertionError -> L3f
            r4.head = r5     // Catch: java.lang.AssertionError -> L3f
            okio.SegmentPool.recycle(r0)     // Catch: java.lang.AssertionError -> L3f
            goto L41
        L3f:
            r4 = move-exception
            goto L53
        L41:
            r4 = -1
            return r4
        L44:
            int r6 = r0.limit     // Catch: java.lang.AssertionError -> L3f
            int r6 = r6 + r5
            r0.limit = r6     // Catch: java.lang.AssertionError -> L3f
            long r0 = r4.size()     // Catch: java.lang.AssertionError -> L3f
            long r5 = (long) r5     // Catch: java.lang.AssertionError -> L3f
            long r0 = r0 + r5
            r4.setSize$okio(r0)     // Catch: java.lang.AssertionError -> L3f
            return r5
        L53:
            boolean r5 = okio.internal._JavaIoKt.isAndroidGetsocknameError(r4)
            if (r5 == 0) goto L5f
            java.io.IOException r5 = new java.io.IOException
            r5.<init>(r4)
            throw r5
        L5f:
            throw r4
        L60:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    @Override // okio.Source
    @org.jetbrains.annotations.NotNull
    public okio.Timeout timeout() {
            r1 = this;
            okio.Timeout r0 = r1.timeout
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "source("
            r0.append(r1)
            java.io.InputStream r1 = r2.input
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
