package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface BufferedSource extends okio.Source, java.nio.channels.ReadableByteChannel {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @kotlin.ReplaceWith(expression = "buffer", imports = {}))
    @org.jetbrains.annotations.NotNull
    okio.Buffer buffer();

    boolean exhausted() throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.Buffer getBuffer();

    long indexOf(byte r1) throws java.io.IOException;

    long indexOf(byte r1, long r2) throws java.io.IOException;

    long indexOf(byte r1, long r2, long r4) throws java.io.IOException;

    long indexOf(@org.jetbrains.annotations.NotNull okio.ByteString r1) throws java.io.IOException;

    long indexOf(@org.jetbrains.annotations.NotNull okio.ByteString r1, long r2) throws java.io.IOException;

    long indexOf(@org.jetbrains.annotations.NotNull okio.ByteString r1, long r2, long r4) throws java.io.IOException;

    long indexOfElement(@org.jetbrains.annotations.NotNull okio.ByteString r1) throws java.io.IOException;

    long indexOfElement(@org.jetbrains.annotations.NotNull okio.ByteString r1, long r2) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    java.io.InputStream inputStream();

    @org.jetbrains.annotations.NotNull
    okio.BufferedSource peek();

    boolean rangeEquals(long r1, @org.jetbrains.annotations.NotNull okio.ByteString r3) throws java.io.IOException;

    boolean rangeEquals(long r1, @org.jetbrains.annotations.NotNull okio.ByteString r3, int r4, int r5) throws java.io.IOException;

    int read(@org.jetbrains.annotations.NotNull byte[] r1) throws java.io.IOException;

    int read(@org.jetbrains.annotations.NotNull byte[] r1, int r2, int r3) throws java.io.IOException;

    long readAll(@org.jetbrains.annotations.NotNull okio.Sink r1) throws java.io.IOException;

    byte readByte() throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    byte[] readByteArray() throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    byte[] readByteArray(long r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.ByteString readByteString() throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.ByteString readByteString(long r1) throws java.io.IOException;

    long readDecimalLong() throws java.io.IOException;

    void readFully(@org.jetbrains.annotations.NotNull okio.Buffer r1, long r2) throws java.io.IOException;

    void readFully(@org.jetbrains.annotations.NotNull byte[] r1) throws java.io.IOException;

    long readHexadecimalUnsignedLong() throws java.io.IOException;

    int readInt() throws java.io.IOException;

    int readIntLe() throws java.io.IOException;

    long readLong() throws java.io.IOException;

    long readLongLe() throws java.io.IOException;

    short readShort() throws java.io.IOException;

    short readShortLe() throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    java.lang.String readString(long r1, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r3) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    java.lang.String readString(@org.jetbrains.annotations.NotNull java.nio.charset.Charset r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    java.lang.String readUtf8() throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    java.lang.String readUtf8(long r1) throws java.io.IOException;

    int readUtf8CodePoint() throws java.io.IOException;

    @org.jetbrains.annotations.Nullable
    java.lang.String readUtf8Line() throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    java.lang.String readUtf8LineStrict() throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    java.lang.String readUtf8LineStrict(long r1) throws java.io.IOException;

    boolean request(long r1) throws java.io.IOException;

    void require(long r1) throws java.io.IOException;

    int select(@org.jetbrains.annotations.NotNull okio.Options r1) throws java.io.IOException;

    @org.jetbrains.annotations.Nullable
    <T> T select(@org.jetbrains.annotations.NotNull okio.TypedOptions<T> r1) throws java.io.IOException;

    void skip(long r1) throws java.io.IOException;
}
