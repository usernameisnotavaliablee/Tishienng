package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nPeekSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeekSource.kt\nokio/PeekSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class PeekSource implements okio.Source {

    @org.jetbrains.annotations.NotNull
    private final okio.Buffer buffer;
    private boolean closed;
    private int expectedPos;

    @org.jetbrains.annotations.Nullable
    private okio.Segment expectedSegment;
    private long pos;

    @org.jetbrains.annotations.NotNull
    private final okio.BufferedSource upstream;

    public PeekSource(@org.jetbrains.annotations.NotNull okio.BufferedSource r2) {
            r1 = this;
            java.lang.String r0 = "upstream"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.upstream = r2
            okio.Buffer r2 = r2.getBuffer()
            r1.buffer = r2
            okio.Segment r2 = r2.head
            r1.expectedSegment = r2
            if (r2 == 0) goto L19
            int r2 = r2.pos
            goto L1a
        L19:
            r2 = -1
        L1a:
            r1.expectedPos = r2
            return
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            r0 = 1
            r1.closed = r0
            return
    }

    @Override // okio.Source
    public long read(@org.jetbrains.annotations.NotNull okio.Buffer r9, long r10) {
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L74
            boolean r3 = r8.closed
            if (r3 != 0) goto L6c
            okio.Segment r3 = r8.expectedSegment
            if (r3 == 0) goto L2b
            okio.Buffer r4 = r8.buffer
            okio.Segment r4 = r4.head
            if (r3 != r4) goto L23
            int r3 = r8.expectedPos
            kotlin.jvm.internal.g0.m(r4)
            int r4 = r4.pos
            if (r3 != r4) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            okio.BufferedSource r0 = r8.upstream
            long r1 = r8.pos
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.request(r1)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            okio.Segment r0 = r8.expectedSegment
            if (r0 != 0) goto L51
            okio.Buffer r0 = r8.buffer
            okio.Segment r0 = r0.head
            if (r0 == 0) goto L51
            r8.expectedSegment = r0
            kotlin.jvm.internal.g0.m(r0)
            int r0 = r0.pos
            r8.expectedPos = r0
        L51:
            okio.Buffer r0 = r8.buffer
            long r0 = r0.size()
            long r2 = r8.pos
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            okio.Buffer r2 = r8.buffer
            long r4 = r8.pos
            r3 = r9
            r2.copyTo(r3, r4, r6)
            long r9 = r8.pos
            long r9 = r9 + r6
            r8.pos = r9
            return r6
        L6c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L74:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    @Override // okio.Source
    @org.jetbrains.annotations.NotNull
    public okio.Timeout timeout() {
            r1 = this;
            okio.BufferedSource r0 = r1.upstream
            okio.Timeout r0 = r0.timeout()
            return r0
    }
}
