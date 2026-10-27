package okio;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Okio {
    public Okio() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Sink appendingSink(@org.jetbrains.annotations.NotNull java.io.File r0) throws java.io.FileNotFoundException {
            okio.Sink r0 = okio.Okio__JvmOkioKt.appendingSink(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.FileSystem asResourceFileSystem(@org.jetbrains.annotations.NotNull java.lang.ClassLoader r0) {
            okio.FileSystem r0 = okio.Okio__JvmOkioKt.asResourceFileSystem(r0)
            return r0
    }

    @kotlin.jvm.JvmName(name = "blackhole")
    @org.jetbrains.annotations.NotNull
    public static final okio.Sink blackhole() {
            okio.Sink r0 = okio.Okio__OkioKt.blackhole()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink buffer(@org.jetbrains.annotations.NotNull okio.Sink r0) {
            okio.BufferedSink r0 = okio.Okio__OkioKt.buffer(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSource buffer(@org.jetbrains.annotations.NotNull okio.Source r0) {
            okio.BufferedSource r0 = okio.Okio__OkioKt.buffer(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.CipherSink cipherSink(@org.jetbrains.annotations.NotNull okio.Sink r0, @org.jetbrains.annotations.NotNull javax.crypto.Cipher r1) {
            okio.CipherSink r0 = okio.Okio__JvmOkioKt.cipherSink(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.CipherSource cipherSource(@org.jetbrains.annotations.NotNull okio.Source r0, @org.jetbrains.annotations.NotNull javax.crypto.Cipher r1) {
            okio.CipherSource r0 = okio.Okio__JvmOkioKt.cipherSource(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSink hashingSink(@org.jetbrains.annotations.NotNull okio.Sink r0, @org.jetbrains.annotations.NotNull java.security.MessageDigest r1) {
            okio.HashingSink r0 = okio.Okio__JvmOkioKt.hashingSink(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSink hashingSink(@org.jetbrains.annotations.NotNull okio.Sink r0, @org.jetbrains.annotations.NotNull javax.crypto.Mac r1) {
            okio.HashingSink r0 = okio.Okio__JvmOkioKt.hashingSink(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSource hashingSource(@org.jetbrains.annotations.NotNull okio.Source r0, @org.jetbrains.annotations.NotNull java.security.MessageDigest r1) {
            okio.HashingSource r0 = okio.Okio__JvmOkioKt.hashingSource(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSource hashingSource(@org.jetbrains.annotations.NotNull okio.Source r0, @org.jetbrains.annotations.NotNull javax.crypto.Mac r1) {
            okio.HashingSource r0 = okio.Okio__JvmOkioKt.hashingSource(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Socket[] inMemorySocketPair(long r0) {
            okio.Socket[] r0 = okio.Okio__JvmOkioKt.inMemorySocketPair(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.FileSystem openZip(@org.jetbrains.annotations.NotNull okio.FileSystem r0, @org.jetbrains.annotations.NotNull okio.Path r1) throws java.io.IOException {
            okio.FileSystem r0 = okio.Okio__ZlibOkioKt.openZip(r0, r1)
            return r0
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public static final okio.Sink sink(@org.jetbrains.annotations.NotNull java.io.File r0) throws java.io.FileNotFoundException {
            okio.Sink r0 = okio.Okio__JvmOkioKt.sink(r0)
            return r0
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public static final okio.Sink sink(@org.jetbrains.annotations.NotNull java.io.File r0, boolean r1) throws java.io.FileNotFoundException {
            okio.Sink r0 = okio.Okio__JvmOkioKt.sink(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Sink sink(@org.jetbrains.annotations.NotNull java.io.OutputStream r0) {
            okio.Sink r0 = okio.Okio__JvmOkioKt.sink(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Sink sink(@org.jetbrains.annotations.NotNull java.net.Socket r0) throws java.io.IOException {
            okio.Sink r0 = okio.Okio__JvmOkioKt.sink(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Sink sink(@org.jetbrains.annotations.NotNull java.nio.file.Path r0, @org.jetbrains.annotations.NotNull java.nio.file.OpenOption... r1) throws java.io.IOException {
            okio.Sink r0 = okio.Okio__JvmOkioKt.sink(r0, r1)
            return r0
    }

    public static /* synthetic */ okio.Sink sink$default(java.io.File r0, boolean r1, int r2, java.lang.Object r3) throws java.io.FileNotFoundException {
            okio.Sink r0 = okio.Okio__JvmOkioKt.sink$default(r0, r1, r2, r3)
            return r0
    }

    @kotlin.jvm.JvmName(name = "socket")
    @org.jetbrains.annotations.NotNull
    public static final okio.Socket socket(@org.jetbrains.annotations.NotNull java.net.Socket r0) {
            okio.Socket r0 = okio.Okio__JvmOkioKt.socket(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Source source(@org.jetbrains.annotations.NotNull java.io.File r0) throws java.io.FileNotFoundException {
            okio.Source r0 = okio.Okio__JvmOkioKt.source(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Source source(@org.jetbrains.annotations.NotNull java.io.InputStream r0) {
            okio.Source r0 = okio.Okio__JvmOkioKt.source(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Source source(@org.jetbrains.annotations.NotNull java.net.Socket r0) throws java.io.IOException {
            okio.Source r0 = okio.Okio__JvmOkioKt.source(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Source source(@org.jetbrains.annotations.NotNull java.nio.file.Path r0, @org.jetbrains.annotations.NotNull java.nio.file.OpenOption... r1) throws java.io.IOException {
            okio.Source r0 = okio.Okio__JvmOkioKt.source(r0, r1)
            return r0
    }

    public static final <T extends java.io.Closeable, R> R use(T r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends R> r1) {
            java.lang.Object r0 = okio.Okio__OkioKt.use(r0, r1)
            return r0
    }
}
