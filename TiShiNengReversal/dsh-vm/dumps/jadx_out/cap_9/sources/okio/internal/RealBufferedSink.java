package okio.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "-RealBufferedSink")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n1#1,219:1\n1#2:220\n51#3:221\n51#3:222\n51#3:223\n51#3:224\n51#3:225\n51#3:226\n51#3:227\n51#3:228\n51#3:229\n51#3:230\n51#3:231\n51#3:232\n51#3:233\n51#3:234\n51#3:235\n51#3:236\n51#3:237\n51#3:238\n51#3:239\n51#3:240\n51#3:241\n51#3:242\n51#3:243\n51#3:244\n51#3:245\n51#3:246\n51#3:247\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n*L\n35#1:221\n41#1:222\n51#1:223\n57#1:224\n67#1:225\n73#1:226\n79#1:227\n89#1:228\n96#1:229\n107#1:230\n117#1:231\n123#1:232\n129#1:233\n135#1:234\n141#1:235\n147#1:236\n153#1:237\n159#1:238\n165#1:239\n171#1:240\n172#1:241\n178#1:242\n179#1:243\n185#1:244\n186#1:245\n198#1:246\n199#1:247\n*E\n"})
/* renamed from: okio.internal.-RealBufferedSink, reason: invalid class name */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class RealBufferedSink {
    public RealBufferedSink() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final void commonClose(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = r5.closed
            if (r0 == 0) goto La
            goto L34
        La:
            okio.Buffer r0 = r5.bufferField     // Catch: java.lang.Throwable -> L22
            long r0 = r0.size()     // Catch: java.lang.Throwable -> L22
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L24
            okio.Sink r0 = r5.sink     // Catch: java.lang.Throwable -> L22
            okio.Buffer r1 = r5.bufferField     // Catch: java.lang.Throwable -> L22
            long r2 = r1.size()     // Catch: java.lang.Throwable -> L22
            r0.write(r1, r2)     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r0 = move-exception
            goto L25
        L24:
            r0 = 0
        L25:
            okio.Sink r1 = r5.sink     // Catch: java.lang.Throwable -> L2b
            r1.close()     // Catch: java.lang.Throwable -> L2b
            goto L2f
        L2b:
            r1 = move-exception
            if (r0 != 0) goto L2f
            r0 = r1
        L2f:
            r1 = 1
            r5.closed = r1
            if (r0 != 0) goto L35
        L34:
            return
        L35:
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonEmit(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = r5.closed
            if (r0 != 0) goto L1d
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1c
            okio.Sink r2 = r5.sink
            okio.Buffer r3 = r5.bufferField
            r2.write(r3, r0)
        L1c:
            return r5
        L1d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            r5.<init>(r0)
            throw r5
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonEmitCompleteSegments(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = r5.closed
            if (r0 != 0) goto L1d
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.completeSegmentByteCount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1c
            okio.Sink r2 = r5.sink
            okio.Buffer r3 = r5.bufferField
            r2.write(r3, r0)
        L1c:
            return r5
        L1d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            r5.<init>(r0)
            throw r5
    }

    public static final void commonFlush(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = r5.closed
            if (r0 != 0) goto L26
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L20
            okio.Sink r0 = r5.sink
            okio.Buffer r1 = r5.bufferField
            long r2 = r1.size()
            r0.write(r1, r2)
        L20:
            okio.Sink r5 = r5.sink
            r5.flush()
            return
        L26:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            r5.<init>(r0)
            throw r5
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Timeout commonTimeout(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            okio.Sink r1 = r1.sink
            okio.Timeout r1 = r1.timeout()
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonToString(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "buffer("
            r0.append(r1)
            okio.Sink r2 = r2.sink
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWrite(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, @org.jetbrains.annotations.NotNull okio.ByteString r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "byteString"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.closed
            if (r0 != 0) goto L18
            okio.Buffer r0 = r1.bufferField
            r0.write(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWrite(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, @org.jetbrains.annotations.NotNull okio.ByteString r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "byteString"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.closed
            if (r0 != 0) goto L18
            okio.Buffer r0 = r1.bufferField
            r0.write(r2, r3, r4)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWrite(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r5, @org.jetbrains.annotations.NotNull okio.Source r6, long r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r6, r0)
        La:
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L27
            okio.Buffer r0 = r5.bufferField
            long r0 = r6.read(r0, r7)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L21
            long r7 = r7 - r0
            r5.emitCompleteSegments()
            goto La
        L21:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>()
            throw r5
        L27:
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWrite(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, @org.jetbrains.annotations.NotNull byte[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.closed
            if (r0 != 0) goto L18
            okio.Buffer r0 = r1.bufferField
            r0.write(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWrite(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, @org.jetbrains.annotations.NotNull byte[] r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.closed
            if (r0 != 0) goto L18
            okio.Buffer r0 = r1.bufferField
            r0.write(r2, r3, r4)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            r1.<init>(r2)
            throw r1
    }

    public static final void commonWrite(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, @org.jetbrains.annotations.NotNull okio.Buffer r2, long r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.closed
            if (r0 != 0) goto L17
            okio.Buffer r0 = r1.bufferField
            r0.write(r2, r3)
            r1.emitCompleteSegments()
            return
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            r1.<init>(r2)
            throw r1
    }

    public static final long commonWriteAll(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r7, @org.jetbrains.annotations.NotNull okio.Source r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r8, r0)
            r0 = 0
        Lc:
            okio.Buffer r2 = r7.bufferField
            r3 = 8192(0x2000, double:4.0474E-320)
            long r2 = r8.read(r2, r3)
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L1f
            long r0 = r0 + r2
            r7.emitCompleteSegments()
            goto Lc
        L1f:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWriteByte(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.closed
            if (r0 != 0) goto L13
            okio.Buffer r0 = r1.bufferField
            r0.writeByte(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L13:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWriteDecimalLong(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.closed
            if (r0 != 0) goto L13
            okio.Buffer r0 = r1.bufferField
            r0.writeDecimalLong(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L13:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWriteHexadecimalUnsignedLong(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.closed
            if (r0 != 0) goto L13
            okio.Buffer r0 = r1.bufferField
            r0.writeHexadecimalUnsignedLong(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L13:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWriteInt(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.closed
            if (r0 != 0) goto L13
            okio.Buffer r0 = r1.bufferField
            r0.writeInt(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L13:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWriteIntLe(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.closed
            if (r0 != 0) goto L13
            okio.Buffer r0 = r1.bufferField
            r0.writeIntLe(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L13:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWriteLong(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.closed
            if (r0 != 0) goto L13
            okio.Buffer r0 = r1.bufferField
            r0.writeLong(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L13:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWriteLongLe(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.closed
            if (r0 != 0) goto L13
            okio.Buffer r0 = r1.bufferField
            r0.writeLongLe(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L13:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWriteShort(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.closed
            if (r0 != 0) goto L13
            okio.Buffer r0 = r1.bufferField
            r0.writeShort(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L13:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWriteShortLe(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.closed
            if (r0 != 0) goto L13
            okio.Buffer r0 = r1.bufferField
            r0.writeShortLe(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L13:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWriteUtf8(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "string"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.closed
            if (r0 != 0) goto L18
            okio.Buffer r0 = r1.bufferField
            r0.writeUtf8(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWriteUtf8(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, @org.jetbrains.annotations.NotNull java.lang.String r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "string"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.closed
            if (r0 != 0) goto L18
            okio.Buffer r0 = r1.bufferField
            r0.writeUtf8(r2, r3, r4)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWriteUtf8CodePoint(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.closed
            if (r0 != 0) goto L13
            okio.Buffer r0 = r1.bufferField
            r0.writeUtf8CodePoint(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L13:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            r1.<init>(r2)
            throw r1
    }
}
