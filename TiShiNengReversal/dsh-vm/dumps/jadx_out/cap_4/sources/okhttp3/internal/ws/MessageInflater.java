package okhttp3.internal.ws;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMessageInflater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageInflater.kt\nokhttp3/internal/ws/MessageInflater\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class MessageInflater implements java.io.Closeable {

    @org.jetbrains.annotations.NotNull
    private final okio.Buffer deflatedBytes;

    @org.jetbrains.annotations.Nullable
    private java.util.zip.Inflater inflater;

    @org.jetbrains.annotations.Nullable
    private okio.InflaterSource inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.noContextTakeover = r1
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            r0.deflatedBytes = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            okio.InflaterSource r0 = r1.inflaterSource
            if (r0 == 0) goto L7
            r0.close()
        L7:
            r0 = 0
            r1.inflaterSource = r0
            r1.inflater = r0
            return
    }

    public final void inflate(@org.jetbrains.annotations.NotNull okio.Buffer r8) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.g0.p(r8, r0)
            okio.Buffer r0 = r7.deflatedBytes
            long r0 = r0.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L75
            java.util.zip.Inflater r0 = r7.inflater
            if (r0 != 0) goto L1d
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r1 = 1
            r0.<init>(r1)
            r7.inflater = r0
        L1d:
            okio.InflaterSource r1 = r7.inflaterSource
            if (r1 != 0) goto L2a
            okio.InflaterSource r1 = new okio.InflaterSource
            okio.Buffer r2 = r7.deflatedBytes
            r1.<init>(r2, r0)
            r7.inflaterSource = r1
        L2a:
            boolean r2 = r7.noContextTakeover
            if (r2 == 0) goto L31
            r0.reset()
        L31:
            okio.Buffer r2 = r7.deflatedBytes
            r2.writeAll(r8)
            okio.Buffer r2 = r7.deflatedBytes
            r3 = 65535(0xffff, float:9.1834E-41)
            r2.writeInt(r3)
            long r2 = r0.getBytesRead()
            okio.Buffer r4 = r7.deflatedBytes
            long r4 = r4.size()
            long r2 = r2 + r4
        L49:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1.readOrInflate(r8, r4)
            long r4 = r0.getBytesRead()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 >= 0) goto L5f
            boolean r4 = r0.finished()
            if (r4 == 0) goto L49
        L5f:
            long r4 = r0.getBytesRead()
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 >= 0) goto L74
            okio.Buffer r8 = r7.deflatedBytes
            r8.clear()
            r1.close()
            r8 = 0
            r7.inflaterSource = r8
            r7.inflater = r8
        L74:
            return
        L75:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            r8.<init>(r0)
            throw r8
    }
}
