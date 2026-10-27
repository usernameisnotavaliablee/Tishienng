package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 2 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n51#1:146\n51#1:152\n51#1:157\n51#1:162\n51#1:167\n51#1:172\n51#1:175\n51#1:176\n51#1:180\n51#1:185\n51#1:188\n51#1:192\n51#1:201\n51#1:210\n51#1:215\n51#1:220\n51#1:225\n51#1:230\n51#1:235\n51#1:240\n51#1:245\n51#1:250\n51#1:255\n51#1:261\n51#1:267\n51#1:279\n34#2:143\n35#2:145\n36#2,2:147\n40#2:149\n41#2:151\n42#2:153\n50#2:154\n51#2:156\n52#2:158\n56#2:159\n57#2:161\n58#2:163\n66#2:164\n67#2:166\n68#2:168\n72#2:169\n73#2:171\n74#2:173\n78#2:177\n79#2:179\n80#2:181\n88#2:182\n89#2:184\n90#2:186\n94#2,3:189\n97#2,5:193\n105#2,3:198\n108#2,5:202\n116#2:207\n117#2:209\n118#2:211\n122#2:212\n123#2:214\n124#2:216\n128#2:217\n129#2:219\n130#2:221\n134#2:222\n135#2:224\n136#2:226\n140#2:227\n141#2:229\n142#2:231\n146#2:232\n147#2:234\n148#2:236\n152#2:237\n153#2:239\n154#2:241\n158#2:242\n159#2:244\n160#2:246\n164#2:247\n165#2:249\n166#2:251\n170#2:252\n171#2:254\n172#2,2:256\n177#2:258\n178#2:260\n179#2,2:262\n184#2:264\n185#2:266\n186#2,4:268\n192#2,7:272\n199#2,16:280\n216#2:296\n218#2:297\n1#3:144\n1#3:150\n1#3:155\n1#3:160\n1#3:165\n1#3:170\n1#3:174\n1#3:178\n1#3:183\n1#3:187\n1#3:208\n1#3:213\n1#3:218\n1#3:223\n1#3:228\n1#3:233\n1#3:238\n1#3:243\n1#3:248\n1#3:253\n1#3:259\n1#3:265\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n55#1:146\n56#1:152\n58#1:157\n59#1:162\n61#1:167\n63#1:172\n67#1:175\n78#1:176\n82#1:180\n84#1:185\n88#1:188\n93#1:192\n94#1:201\n95#1:210\n96#1:215\n97#1:220\n98#1:225\n99#1:230\n100#1:235\n101#1:240\n102#1:245\n103#1:250\n104#1:255\n105#1:261\n134#1:267\n138#1:279\n55#1:143\n55#1:145\n55#1:147,2\n56#1:149\n56#1:151\n56#1:153\n58#1:154\n58#1:156\n58#1:158\n59#1:159\n59#1:161\n59#1:163\n61#1:164\n61#1:166\n61#1:168\n63#1:169\n63#1:171\n63#1:173\n82#1:177\n82#1:179\n82#1:181\n84#1:182\n84#1:184\n84#1:186\n93#1:189,3\n93#1:193,5\n94#1:198,3\n94#1:202,5\n95#1:207\n95#1:209\n95#1:211\n96#1:212\n96#1:214\n96#1:216\n97#1:217\n97#1:219\n97#1:221\n98#1:222\n98#1:224\n98#1:226\n99#1:227\n99#1:229\n99#1:231\n100#1:232\n100#1:234\n100#1:236\n101#1:237\n101#1:239\n101#1:241\n102#1:242\n102#1:244\n102#1:246\n103#1:247\n103#1:249\n103#1:251\n104#1:252\n104#1:254\n104#1:256,2\n105#1:258\n105#1:260\n105#1:262,2\n134#1:264\n134#1:266\n134#1:268,4\n138#1:272,7\n138#1:280,16\n139#1:296\n140#1:297\n55#1:144\n56#1:150\n58#1:155\n59#1:160\n61#1:165\n63#1:170\n82#1:178\n84#1:183\n95#1:208\n96#1:213\n97#1:218\n98#1:223\n99#1:228\n100#1:233\n101#1:238\n102#1:243\n103#1:248\n104#1:253\n105#1:259\n134#1:265\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class RealBufferedSink implements okio.BufferedSink {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final okio.Buffer bufferField;

    @kotlin.jvm.JvmField
    public boolean closed;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final okio.Sink sink;

    public RealBufferedSink(@org.jetbrains.annotations.NotNull okio.Sink r2) {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.sink = r2
            okio.Buffer r2 = new okio.Buffer
            r2.<init>()
            r1.bufferField = r2
            return
    }

    public static /* synthetic */ void getBuffer$annotations() {
            return
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.Buffer buffer() {
            r1 = this;
            okio.Buffer r0 = r1.bufferField
            return r0
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r5 = this;
            boolean r0 = r5.closed
            if (r0 != 0) goto L30
            okio.Buffer r0 = r5.bufferField     // Catch: java.lang.Throwable -> L1c
            long r0 = r0.size()     // Catch: java.lang.Throwable -> L1c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1e
            okio.Sink r0 = r5.sink     // Catch: java.lang.Throwable -> L1c
            okio.Buffer r1 = r5.bufferField     // Catch: java.lang.Throwable -> L1c
            long r2 = r1.size()     // Catch: java.lang.Throwable -> L1c
            r0.write(r1, r2)     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r0 = move-exception
            goto L1f
        L1e:
            r0 = 0
        L1f:
            okio.Sink r1 = r5.sink     // Catch: java.lang.Throwable -> L25
            r1.close()     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r1 = move-exception
            if (r0 != 0) goto L29
            r0 = r1
        L29:
            r1 = 1
            r5.closed = r1
            if (r0 != 0) goto L2f
            goto L30
        L2f:
            throw r0
        L30:
            return
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink emit() {
            r5 = this;
            boolean r0 = r5.closed
            if (r0 != 0) goto L18
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L17
            okio.Sink r2 = r5.sink
            okio.Buffer r3 = r5.bufferField
            r2.write(r3, r0)
        L17:
            return r5
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "closed"
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink emitCompleteSegments() {
            r5 = this;
            boolean r0 = r5.closed
            if (r0 != 0) goto L18
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.completeSegmentByteCount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L17
            okio.Sink r2 = r5.sink
            okio.Buffer r3 = r5.bufferField
            r2.write(r3, r0)
        L17:
            return r5
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "closed"
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
            r5 = this;
            boolean r0 = r5.closed
            if (r0 != 0) goto L21
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1b
            okio.Sink r0 = r5.sink
            okio.Buffer r1 = r5.bufferField
            long r2 = r1.size()
            r0.write(r1, r2)
        L1b:
            okio.Sink r0 = r5.sink
            r0.flush()
            return
        L21:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "closed"
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.Buffer getBuffer() {
            r1 = this;
            okio.Buffer r0 = r1.bufferField
            return r0
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
            r1 = this;
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            return r0
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public java.io.OutputStream outputStream() {
            r1 = this;
            okio.RealBufferedSink$outputStream$1 r0 = new okio.RealBufferedSink$outputStream$1
            r0.<init>(r1)
            return r0
    }

    @Override // okio.Sink
    @org.jetbrains.annotations.NotNull
    public okio.Timeout timeout() {
            r1 = this;
            okio.Sink r0 = r1.sink
            okio.Timeout r0 = r0.timeout()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "buffer("
            r0.append(r1)
            okio.Sink r1 = r2.sink
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@org.jetbrains.annotations.NotNull java.nio.ByteBuffer r2) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.closed
            if (r0 != 0) goto L13
            okio.Buffer r0 = r1.bufferField
            int r2 = r0.write(r2)
            r1.emitCompleteSegments()
            return r2
        L13:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            r2.<init>(r0)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink write(@org.jetbrains.annotations.NotNull okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "byteString"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.closed
            if (r0 != 0) goto L13
            okio.Buffer r0 = r1.bufferField
            r0.write(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L13:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            r2.<init>(r0)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink write(@org.jetbrains.annotations.NotNull okio.ByteString r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = "byteString"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.closed
            if (r0 != 0) goto L13
            okio.Buffer r0 = r1.bufferField
            r0.write(r2, r3, r4)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L13:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink write(@org.jetbrains.annotations.NotNull okio.Source r6, long r7) {
            r5 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r6, r0)
        L5:
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L22
            okio.Buffer r0 = r5.bufferField
            long r0 = r6.read(r0, r7)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1c
            long r7 = r7 - r0
            r5.emitCompleteSegments()
            goto L5
        L1c:
            java.io.EOFException r6 = new java.io.EOFException
            r6.<init>()
            throw r6
        L22:
            return r5
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink write(@org.jetbrains.annotations.NotNull byte[] r2) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.closed
            if (r0 != 0) goto L13
            okio.Buffer r0 = r1.bufferField
            r0.write(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L13:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            r2.<init>(r0)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink write(@org.jetbrains.annotations.NotNull byte[] r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.closed
            if (r0 != 0) goto L13
            okio.Buffer r0 = r1.bufferField
            r0.write(r2, r3, r4)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L13:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.Sink
    public void write(@org.jetbrains.annotations.NotNull okio.Buffer r2, long r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.closed
            if (r0 != 0) goto L12
            okio.Buffer r0 = r1.bufferField
            r0.write(r2, r3)
            r1.emitCompleteSegments()
            return
        L12:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    public long writeAll(@org.jetbrains.annotations.NotNull okio.Source r8) {
            r7 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r8, r0)
            r0 = 0
        L7:
            okio.Buffer r2 = r7.bufferField
            r3 = 8192(0x2000, double:4.0474E-320)
            long r2 = r8.read(r2, r3)
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L1a
            long r0 = r0 + r2
            r7.emitCompleteSegments()
            goto L7
        L1a:
            return r0
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink writeByte(int r2) {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 != 0) goto Le
            okio.Buffer r0 = r1.bufferField
            r0.writeByte(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        Le:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            r2.<init>(r0)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink writeDecimalLong(long r2) {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 != 0) goto Le
            okio.Buffer r0 = r1.bufferField
            r0.writeDecimalLong(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        Le:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink writeHexadecimalUnsignedLong(long r2) {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 != 0) goto Le
            okio.Buffer r0 = r1.bufferField
            r0.writeHexadecimalUnsignedLong(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        Le:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink writeInt(int r2) {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 != 0) goto Le
            okio.Buffer r0 = r1.bufferField
            r0.writeInt(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        Le:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            r2.<init>(r0)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink writeIntLe(int r2) {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 != 0) goto Le
            okio.Buffer r0 = r1.bufferField
            r0.writeIntLe(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        Le:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            r2.<init>(r0)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink writeLong(long r2) {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 != 0) goto Le
            okio.Buffer r0 = r1.bufferField
            r0.writeLong(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        Le:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink writeLongLe(long r2) {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 != 0) goto Le
            okio.Buffer r0 = r1.bufferField
            r0.writeLongLe(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        Le:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink writeShort(int r2) {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 != 0) goto Le
            okio.Buffer r0 = r1.bufferField
            r0.writeShort(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        Le:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            r2.<init>(r0)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink writeShortLe(int r2) {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 != 0) goto Le
            okio.Buffer r0 = r1.bufferField
            r0.writeShortLe(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        Le:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            r2.<init>(r0)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink writeString(@org.jetbrains.annotations.NotNull java.lang.String r2, int r3, int r4, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r5) {
            r1 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = r1.closed
            if (r0 != 0) goto L18
            okio.Buffer r0 = r1.bufferField
            r0.writeString(r2, r3, r4, r5)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L18:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink writeString(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r3) {
            r1 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r1.closed
            if (r0 != 0) goto L18
            okio.Buffer r0 = r1.bufferField
            r0.writeString(r2, r3)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L18:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink writeUtf8(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.closed
            if (r0 != 0) goto L13
            okio.Buffer r0 = r1.bufferField
            r0.writeUtf8(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L13:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            r2.<init>(r0)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink writeUtf8(@org.jetbrains.annotations.NotNull java.lang.String r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.closed
            if (r0 != 0) goto L13
            okio.Buffer r0 = r1.bufferField
            r0.writeUtf8(r2, r3, r4)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L13:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink writeUtf8CodePoint(int r2) {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 != 0) goto Le
            okio.Buffer r0 = r1.bufferField
            r0.writeUtf8CodePoint(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        Le:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            r2.<init>(r0)
            throw r2
    }
}
