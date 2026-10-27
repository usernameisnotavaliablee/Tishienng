package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final /* synthetic */ class Okio__JvmOkioKt {
    public Okio__JvmOkioKt() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Sink appendingSink(@org.jetbrains.annotations.NotNull java.io.File r2) throws java.io.FileNotFoundException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r1 = 1
            r0.<init>(r2, r1)
            okio.Sink r2 = okio.Okio.sink(r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.FileSystem asResourceFileSystem(@org.jetbrains.annotations.NotNull java.lang.ClassLoader r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            okio.internal.ResourceFileSystem r1 = new okio.internal.ResourceFileSystem
            r5 = 4
            r6 = 0
            r3 = 1
            r4 = 0
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.CipherSink cipherSink(@org.jetbrains.annotations.NotNull okio.Sink r1, @org.jetbrains.annotations.NotNull javax.crypto.Cipher r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "cipher"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.CipherSink r0 = new okio.CipherSink
            okio.BufferedSink r1 = okio.Okio.buffer(r1)
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.CipherSource cipherSource(@org.jetbrains.annotations.NotNull okio.Source r1, @org.jetbrains.annotations.NotNull javax.crypto.Cipher r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "cipher"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.CipherSource r0 = new okio.CipherSource
            okio.BufferedSource r1 = okio.Okio.buffer(r1)
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSink hashingSink(@org.jetbrains.annotations.NotNull okio.Sink r1, @org.jetbrains.annotations.NotNull java.security.MessageDigest r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "digest"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.HashingSink r0 = new okio.HashingSink
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSink hashingSink(@org.jetbrains.annotations.NotNull okio.Sink r1, @org.jetbrains.annotations.NotNull javax.crypto.Mac r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "mac"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.HashingSink r0 = new okio.HashingSink
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSource hashingSource(@org.jetbrains.annotations.NotNull okio.Source r1, @org.jetbrains.annotations.NotNull java.security.MessageDigest r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "digest"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.HashingSource r0 = new okio.HashingSource
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSource hashingSource(@org.jetbrains.annotations.NotNull okio.Source r1, @org.jetbrains.annotations.NotNull javax.crypto.Mac r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "mac"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.HashingSource r0 = new okio.HashingSource
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Socket[] inMemorySocketPair(long r2) {
            okio.Pipe r0 = new okio.Pipe
            r0.<init>(r2)
            okio.Pipe r1 = new okio.Pipe
            r1.<init>(r2)
            okio.internal.PipeSocket r2 = new okio.internal.PipeSocket
            r2.<init>(r0, r1)
            okio.internal.PipeSocket r3 = new okio.internal.PipeSocket
            r3.<init>(r1, r0)
            r0 = 2
            okio.Socket[] r0 = new okio.Socket[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            return r0
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public static final okio.Sink sink(@org.jetbrains.annotations.NotNull java.io.File r3) throws java.io.FileNotFoundException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 1
            r1 = 0
            r2 = 0
            okio.Sink r3 = okio.Okio.sink$default(r3, r2, r0, r1)
            return r3
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public static final okio.Sink sink(@org.jetbrains.annotations.NotNull java.io.File r1, boolean r2) throws java.io.FileNotFoundException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1, r2)
            okio.Sink r1 = okio.Okio.sink(r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Sink sink(@org.jetbrains.annotations.NotNull java.io.OutputStream r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.OutputStreamSink r0 = new okio.OutputStreamSink
            okio.Timeout r1 = new okio.Timeout
            r1.<init>()
            r0.<init>(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Sink sink(@org.jetbrains.annotations.NotNull java.net.Socket r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            okio.internal.SocketAsyncTimeout r0 = new okio.internal.SocketAsyncTimeout
            r0.<init>(r3)
            okio.OutputStreamSink r1 = new okio.OutputStreamSink
            java.io.OutputStream r3 = r3.getOutputStream()
            java.lang.String r2 = "getOutputStream(...)"
            kotlin.jvm.internal.g0.o(r3, r2)
            r1.<init>(r3, r0)
            okio.Sink r3 = r0.sink(r1)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Sink sink(@org.jetbrains.annotations.NotNull java.nio.file.Path r1, @org.jetbrains.annotations.NotNull java.nio.file.OpenOption... r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.OpenOption[] r2 = (java.nio.file.OpenOption[]) r2
            java.io.OutputStream r1 = kotlin.io.path.p0.a(r1, r2)
            java.lang.String r2 = "newOutputStream(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            okio.Sink r1 = okio.Okio.sink(r1)
            return r1
    }

    public static /* synthetic */ okio.Sink sink$default(java.io.File r0, boolean r1, int r2, java.lang.Object r3) throws java.io.FileNotFoundException {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            okio.Sink r0 = okio.Okio.sink(r0, r1)
            return r0
    }

    @kotlin.jvm.JvmName(name = "socket")
    @org.jetbrains.annotations.NotNull
    public static final okio.Socket socket(@org.jetbrains.annotations.NotNull java.net.Socket r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            okio.internal.DefaultSocket r0 = new okio.internal.DefaultSocket
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Source source(@org.jetbrains.annotations.NotNull java.io.File r2) throws java.io.FileNotFoundException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.InputStreamSource r0 = new okio.InputStreamSource
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            okio.Timeout r2 = okio.Timeout.NONE
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Source source(@org.jetbrains.annotations.NotNull java.io.InputStream r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.InputStreamSource r0 = new okio.InputStreamSource
            okio.Timeout r1 = new okio.Timeout
            r1.<init>()
            r0.<init>(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Source source(@org.jetbrains.annotations.NotNull java.net.Socket r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            okio.internal.SocketAsyncTimeout r0 = new okio.internal.SocketAsyncTimeout
            r0.<init>(r3)
            okio.InputStreamSource r1 = new okio.InputStreamSource
            java.io.InputStream r3 = r3.getInputStream()
            java.lang.String r2 = "getInputStream(...)"
            kotlin.jvm.internal.g0.o(r3, r2)
            r1.<init>(r3, r0)
            okio.Source r3 = r0.source(r1)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Source source(@org.jetbrains.annotations.NotNull java.nio.file.Path r1, @org.jetbrains.annotations.NotNull java.nio.file.OpenOption... r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.OpenOption[] r2 = (java.nio.file.OpenOption[]) r2
            java.io.InputStream r1 = kotlin.io.path.r0.a(r1, r2)
            java.lang.String r2 = "newInputStream(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            okio.Source r1 = okio.Okio.source(r1)
            return r1
    }
}
