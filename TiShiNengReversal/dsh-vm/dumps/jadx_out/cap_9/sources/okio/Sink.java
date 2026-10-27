package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface Sink extends java.io.Closeable, java.io.Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws java.io.IOException;

    void flush() throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.Timeout timeout();

    void write(@org.jetbrains.annotations.NotNull okio.Buffer r1, long r2) throws java.io.IOException;
}
