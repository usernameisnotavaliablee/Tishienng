package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCipherSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CipherSource.kt\nokio/CipherSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class CipherSource implements okio.Source {
    private final int blockSize;

    @org.jetbrains.annotations.NotNull
    private final okio.Buffer buffer;

    @org.jetbrains.annotations.NotNull
    private final javax.crypto.Cipher cipher;
    private boolean closed;

    /* renamed from: final, reason: not valid java name */
    private boolean f0final;

    @org.jetbrains.annotations.NotNull
    private final okio.BufferedSource source;

    public CipherSource(@org.jetbrains.annotations.NotNull okio.BufferedSource r2, @org.jetbrains.annotations.NotNull javax.crypto.Cipher r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "cipher"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.source = r2
            r1.cipher = r3
            int r2 = r3.getBlockSize()
            r1.blockSize = r2
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r1.buffer = r0
            if (r2 <= 0) goto L21
            return
        L21:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Block cipher required "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    private final void doFinal() {
            r7 = this;
            javax.crypto.Cipher r0 = r7.cipher
            r1 = 0
            int r0 = r0.getOutputSize(r1)
            if (r0 != 0) goto La
            goto L3b
        La:
            okio.Buffer r1 = r7.buffer
            okio.Segment r0 = r1.writableSegment$okio(r0)
            javax.crypto.Cipher r1 = r7.cipher
            byte[] r2 = r0.data
            int r3 = r0.pos
            int r1 = r1.doFinal(r2, r3)
            int r2 = r0.limit
            int r2 = r2 + r1
            r0.limit = r2
            okio.Buffer r2 = r7.buffer
            long r3 = r2.size()
            long r5 = (long) r1
            long r3 = r3 + r5
            r2.setSize$okio(r3)
            int r1 = r0.pos
            int r2 = r0.limit
            if (r1 != r2) goto L3b
            okio.Buffer r1 = r7.buffer
            okio.Segment r2 = r0.pop()
            r1.head = r2
            okio.SegmentPool.recycle(r0)
        L3b:
            return
    }

    private final void refill() {
            r5 = this;
        L0:
            okio.Buffer r0 = r5.buffer
            long r0 = r0.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L23
            boolean r0 = r5.f0final
            if (r0 != 0) goto L23
            okio.BufferedSource r0 = r5.source
            boolean r0 = r0.exhausted()
            if (r0 == 0) goto L1f
            r0 = 1
            r5.f0final = r0
            r5.doFinal()
            return
        L1f:
            r5.update()
            goto L0
        L23:
            return
    }

    private final void update() {
            r9 = this;
            okio.BufferedSource r0 = r9.source
            okio.Buffer r0 = r0.getBuffer()
            okio.Segment r0 = r0.head
            kotlin.jvm.internal.g0.m(r0)
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            javax.crypto.Cipher r2 = r9.cipher
            int r2 = r2.getOutputSize(r1)
            r6 = r1
        L17:
            r1 = 8192(0x2000, float:1.148E-41)
            if (r2 <= r1) goto L41
            int r1 = r9.blockSize
            if (r6 > r1) goto L39
            r0 = 1
            r9.f0final = r0
            okio.Buffer r0 = r9.buffer
            javax.crypto.Cipher r1 = r9.cipher
            okio.BufferedSource r2 = r9.source
            byte[] r2 = r2.readByteArray()
            byte[] r1 = r1.doFinal(r2)
            java.lang.String r2 = "doFinal(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            r0.write(r1)
            return
        L39:
            int r6 = r6 - r1
            javax.crypto.Cipher r1 = r9.cipher
            int r2 = r1.getOutputSize(r6)
            goto L17
        L41:
            okio.Buffer r1 = r9.buffer
            okio.Segment r1 = r1.writableSegment$okio(r2)
            javax.crypto.Cipher r3 = r9.cipher
            byte[] r4 = r0.data
            int r5 = r0.pos
            byte[] r7 = r1.data
            int r8 = r1.pos
            int r0 = r3.update(r4, r5, r6, r7, r8)
            okio.BufferedSource r2 = r9.source
            long r3 = (long) r6
            r2.skip(r3)
            int r2 = r1.limit
            int r2 = r2 + r0
            r1.limit = r2
            okio.Buffer r2 = r9.buffer
            long r3 = r2.size()
            long r5 = (long) r0
            long r3 = r3 + r5
            r2.setSize$okio(r3)
            int r0 = r1.pos
            int r2 = r1.limit
            if (r0 != r2) goto L7c
            okio.Buffer r0 = r9.buffer
            okio.Segment r2 = r1.pop()
            r0.head = r2
            okio.SegmentPool.recycle(r1)
        L7c:
            return
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.closed = r0
            okio.BufferedSource r0 = r1.source
            r0.close()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final javax.crypto.Cipher getCipher() {
            r1 = this;
            javax.crypto.Cipher r0 = r1.cipher
            return r0
    }

    @Override // okio.Source
    public long read(@org.jetbrains.annotations.NotNull okio.Buffer r5, long r6) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L24
            boolean r3 = r4.closed
            if (r3 != 0) goto L1c
            if (r2 != 0) goto L12
            return r0
        L12:
            r4.refill()
            okio.Buffer r0 = r4.buffer
            long r5 = r0.read(r5, r6)
            return r5
        L1c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "closed"
            r5.<init>(r6)
            throw r5
        L24:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r5.append(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    @Override // okio.Source
    @org.jetbrains.annotations.NotNull
    public okio.Timeout timeout() {
            r1 = this;
            okio.BufferedSource r0 = r1.source
            okio.Timeout r0 = r0.timeout()
            return r0
    }
}
