package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.Deprecated(message = "changed in Okio 2.x")
/* renamed from: okio.-DeprecatedOkio, reason: invalid class name */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class DeprecatedOkio {

    @org.jetbrains.annotations.NotNull
    public static final okio.DeprecatedOkio INSTANCE = null;

    static {
            okio.-DeprecatedOkio r0 = new okio.-DeprecatedOkio
            r0.<init>()
            okio.DeprecatedOkio.INSTANCE = r0
            return
    }

    private DeprecatedOkio() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "file.appendingSink()", imports = {"okio.appendingSink"}))
    @org.jetbrains.annotations.NotNull
    public final okio.Sink appendingSink(@org.jetbrains.annotations.NotNull java.io.File r2) {
            r1 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.Sink r2 = okio.Okio.appendingSink(r2)
            return r2
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "blackholeSink()", imports = {"okio.blackholeSink"}))
    @org.jetbrains.annotations.NotNull
    public final okio.Sink blackhole() {
            r1 = this;
            okio.Sink r0 = okio.Okio.blackhole()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "sink.buffer()", imports = {"okio.buffer"}))
    @org.jetbrains.annotations.NotNull
    public final okio.BufferedSink buffer(@org.jetbrains.annotations.NotNull okio.Sink r2) {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.BufferedSink r2 = okio.Okio.buffer(r2)
            return r2
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "source.buffer()", imports = {"okio.buffer"}))
    @org.jetbrains.annotations.NotNull
    public final okio.BufferedSource buffer(@org.jetbrains.annotations.NotNull okio.Source r2) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.BufferedSource r2 = okio.Okio.buffer(r2)
            return r2
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "file.sink()", imports = {"okio.sink"}))
    @org.jetbrains.annotations.NotNull
    public final okio.Sink sink(@org.jetbrains.annotations.NotNull java.io.File r4) {
            r3 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 1
            r1 = 0
            r2 = 0
            okio.Sink r4 = okio.Okio.sink$default(r4, r2, r0, r1)
            return r4
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "outputStream.sink()", imports = {"okio.sink"}))
    @org.jetbrains.annotations.NotNull
    public final okio.Sink sink(@org.jetbrains.annotations.NotNull java.io.OutputStream r2) {
            r1 = this;
            java.lang.String r0 = "outputStream"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.Sink r2 = okio.Okio.sink(r2)
            return r2
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "socket.sink()", imports = {"okio.sink"}))
    @org.jetbrains.annotations.NotNull
    public final okio.Sink sink(@org.jetbrains.annotations.NotNull java.net.Socket r2) {
            r1 = this;
            java.lang.String r0 = "socket"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.Sink r2 = okio.Okio.sink(r2)
            return r2
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "path.sink(*options)", imports = {"okio.sink"}))
    @org.jetbrains.annotations.NotNull
    public final okio.Sink sink(@org.jetbrains.annotations.NotNull java.nio.file.Path r2, @org.jetbrains.annotations.NotNull java.nio.file.OpenOption... r3) {
            r1 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.OpenOption[] r3 = (java.nio.file.OpenOption[]) r3
            okio.Sink r2 = okio.Okio.sink(r2, r3)
            return r2
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "file.source()", imports = {"okio.source"}))
    @org.jetbrains.annotations.NotNull
    public final okio.Source source(@org.jetbrains.annotations.NotNull java.io.File r2) {
            r1 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.Source r2 = okio.Okio.source(r2)
            return r2
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "inputStream.source()", imports = {"okio.source"}))
    @org.jetbrains.annotations.NotNull
    public final okio.Source source(@org.jetbrains.annotations.NotNull java.io.InputStream r2) {
            r1 = this;
            java.lang.String r0 = "inputStream"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.Source r2 = okio.Okio.source(r2)
            return r2
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "socket.source()", imports = {"okio.source"}))
    @org.jetbrains.annotations.NotNull
    public final okio.Source source(@org.jetbrains.annotations.NotNull java.net.Socket r2) {
            r1 = this;
            java.lang.String r0 = "socket"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.Source r2 = okio.Okio.source(r2)
            return r2
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "path.source(*options)", imports = {"okio.source"}))
    @org.jetbrains.annotations.NotNull
    public final okio.Source source(@org.jetbrains.annotations.NotNull java.nio.file.Path r2, @org.jetbrains.annotations.NotNull java.nio.file.OpenOption... r3) {
            r1 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.OpenOption[] r3 = (java.nio.file.OpenOption[]) r3
            okio.Source r2 = okio.Okio.source(r2, r3)
            return r2
    }
}
