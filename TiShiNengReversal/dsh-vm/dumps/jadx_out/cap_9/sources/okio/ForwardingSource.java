package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ForwardingSource implements okio.Source {

    @org.jetbrains.annotations.NotNull
    private final okio.Source delegate;

    public ForwardingSource(@org.jetbrains.annotations.NotNull okio.Source r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.delegate = r2
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "delegate", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_delegate")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final okio.Source m58deprecated_delegate() {
            r1 = this;
            okio.Source r0 = r1.delegate
            return r0
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            okio.Source r0 = r1.delegate
            r0.close()
            return
    }

    @kotlin.jvm.JvmName(name = "delegate")
    @org.jetbrains.annotations.NotNull
    public final okio.Source delegate() {
            r1 = this;
            okio.Source r0 = r1.delegate
            return r0
    }

    @Override // okio.Source
    public long read(@org.jetbrains.annotations.NotNull okio.Buffer r2, long r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.Source r0 = r1.delegate
            long r2 = r0.read(r2, r3)
            return r2
    }

    @Override // okio.Source
    @org.jetbrains.annotations.NotNull
    public okio.Timeout timeout() {
            r1 = this;
            okio.Source r0 = r1.delegate
            okio.Timeout r0 = r0.timeout()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            okio.Source r1 = r2.delegate
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
