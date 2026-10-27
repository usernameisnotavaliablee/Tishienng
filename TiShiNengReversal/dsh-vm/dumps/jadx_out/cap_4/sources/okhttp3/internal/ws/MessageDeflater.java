package okhttp3.internal.ws;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class MessageDeflater implements java.io.Closeable {

    @org.jetbrains.annotations.NotNull
    private final okio.Buffer deflatedBytes;

    @org.jetbrains.annotations.NotNull
    private final java.util.zip.Deflater deflater;

    @org.jetbrains.annotations.NotNull
    private final okio.DeflaterSink deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean r4) {
            r3 = this;
            r3.<init>()
            r3.noContextTakeover = r4
            okio.Buffer r4 = new okio.Buffer
            r4.<init>()
            r3.deflatedBytes = r4
            java.util.zip.Deflater r0 = new java.util.zip.Deflater
            r1 = -1
            r2 = 1
            r0.<init>(r1, r2)
            r3.deflater = r0
            okio.DeflaterSink r1 = new okio.DeflaterSink
            r1.<init>(r4, r0)
            r3.deflaterSink = r1
            return
    }

    private final boolean endsWith(okio.Buffer r5, okio.ByteString r6) {
            r4 = this;
            long r0 = r5.size()
            int r2 = r6.size()
            long r2 = (long) r2
            long r0 = r0 - r2
            boolean r5 = r5.rangeEquals(r0, r6)
            return r5
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            okio.DeflaterSink r0 = r1.deflaterSink
            r0.close()
            return
    }

    public final void deflate(@org.jetbrains.annotations.NotNull okio.Buffer r6) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.g0.p(r6, r0)
            okio.Buffer r0 = r5.deflatedBytes
            long r0 = r0.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L63
            boolean r0 = r5.noContextTakeover
            if (r0 == 0) goto L1a
            java.util.zip.Deflater r0 = r5.deflater
            r0.reset()
        L1a:
            okio.DeflaterSink r0 = r5.deflaterSink
            long r1 = r6.size()
            r0.write(r6, r1)
            okio.DeflaterSink r0 = r5.deflaterSink
            r0.flush()
            okio.Buffer r0 = r5.deflatedBytes
            okio.ByteString r1 = okhttp3.internal.ws.MessageDeflaterKt.access$getEMPTY_DEFLATE_BLOCK$p()
            boolean r0 = r5.endsWith(r0, r1)
            if (r0 == 0) goto L53
            okio.Buffer r0 = r5.deflatedBytes
            long r0 = r0.size()
            r2 = 4
            long r2 = (long) r2
            long r0 = r0 - r2
            okio.Buffer r2 = r5.deflatedBytes
            r3 = 1
            r4 = 0
            okio.Buffer$UnsafeCursor r2 = okio.Buffer.readAndWriteUnsafe$default(r2, r4, r3, r4)
            r2.resizeBuffer(r0)     // Catch: java.lang.Throwable -> L4c
            kotlin.io.b.a(r2, r4)
            goto L59
        L4c:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L4e
        L4e:
            r0 = move-exception
            kotlin.io.b.a(r2, r6)
            throw r0
        L53:
            okio.Buffer r0 = r5.deflatedBytes
            r1 = 0
            r0.writeByte(r1)
        L59:
            okio.Buffer r0 = r5.deflatedBytes
            long r1 = r0.size()
            r6.write(r0, r1)
            return
        L63:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            r6.<init>(r0)
            throw r6
    }
}
