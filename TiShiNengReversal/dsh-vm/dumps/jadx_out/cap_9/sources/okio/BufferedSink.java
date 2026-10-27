package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface BufferedSink extends okio.Sink, java.nio.channels.WritableByteChannel {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @kotlin.ReplaceWith(expression = "buffer", imports = {}))
    @org.jetbrains.annotations.NotNull
    okio.Buffer buffer();

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink emit() throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink emitCompleteSegments() throws java.io.IOException;

    @Override // okio.Sink, java.io.Flushable
    void flush() throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.Buffer getBuffer();

    @org.jetbrains.annotations.NotNull
    java.io.OutputStream outputStream();

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink write(@org.jetbrains.annotations.NotNull okio.ByteString r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink write(@org.jetbrains.annotations.NotNull okio.ByteString r1, int r2, int r3) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink write(@org.jetbrains.annotations.NotNull okio.Source r1, long r2) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink write(@org.jetbrains.annotations.NotNull byte[] r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink write(@org.jetbrains.annotations.NotNull byte[] r1, int r2, int r3) throws java.io.IOException;

    long writeAll(@org.jetbrains.annotations.NotNull okio.Source r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink writeByte(int r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink writeDecimalLong(long r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink writeHexadecimalUnsignedLong(long r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink writeInt(int r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink writeIntLe(int r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink writeLong(long r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink writeLongLe(long r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink writeShort(int r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink writeShortLe(int r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink writeString(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2, int r3, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r4) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink writeString(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r2) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink writeUtf8(@org.jetbrains.annotations.NotNull java.lang.String r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink writeUtf8(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2, int r3) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink writeUtf8CodePoint(int r1) throws java.io.IOException;
}
