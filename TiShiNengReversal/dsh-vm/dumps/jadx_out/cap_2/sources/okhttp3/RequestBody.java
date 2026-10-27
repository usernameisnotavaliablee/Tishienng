package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class RequestBody {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.RequestBody.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.RequestBody EMPTY = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion r0, java.io.File r1, okhttp3.MediaType r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                okhttp3.RequestBody r0 = r0.create(r1, r2)
                return r0
        }

        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion r0, java.io.FileDescriptor r1, okhttp3.MediaType r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                okhttp3.RequestBody r0 = r0.create(r1, r2)
                return r0
        }

        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion r0, java.lang.String r1, okhttp3.MediaType r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                okhttp3.RequestBody r0 = r0.create(r1, r2)
                return r0
        }

        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion r0, okhttp3.MediaType r1, byte[] r2, int r3, int r4, int r5, java.lang.Object r6) {
                r6 = r5 & 4
                if (r6 == 0) goto L5
                r3 = 0
            L5:
                r5 = r5 & 8
                if (r5 == 0) goto La
                int r4 = r2.length
            La:
                okhttp3.RequestBody r0 = r0.create(r1, r2, r3, r4)
                return r0
        }

        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion r0, okio.ByteString r1, okhttp3.MediaType r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                okhttp3.RequestBody r0 = r0.create(r1, r2)
                return r0
        }

        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion r0, okio.Path r1, okio.FileSystem r2, okhttp3.MediaType r3, int r4, java.lang.Object r5) {
                r4 = r4 & 2
                if (r4 == 0) goto L5
                r3 = 0
            L5:
                okhttp3.RequestBody r0 = r0.create(r1, r2, r3)
                return r0
        }

        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion r0, byte[] r1, okhttp3.MediaType r2, int r3, int r4, int r5, java.lang.Object r6) {
                r6 = r5 & 1
                if (r6 == 0) goto L5
                r2 = 0
            L5:
                r6 = r5 & 2
                if (r6 == 0) goto La
                r3 = 0
            La:
                r5 = r5 & 4
                if (r5 == 0) goto Lf
                int r4 = r1.length
            Lf:
                okhttp3.RequestBody r0 = r0.create(r1, r2, r3, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "create")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.RequestBody create(@org.jetbrains.annotations.NotNull java.io.File r2, @org.jetbrains.annotations.Nullable okhttp3.MediaType r3) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.RequestBody$Companion$asRequestBody$1 r0 = new okhttp3.RequestBody$Companion$asRequestBody$1
                r0.<init>(r3, r2)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "create")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.RequestBody create(@org.jetbrains.annotations.NotNull java.io.FileDescriptor r2, @org.jetbrains.annotations.Nullable okhttp3.MediaType r3) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.RequestBody$Companion$toRequestBody$2 r0 = new okhttp3.RequestBody$Companion$toRequestBody$2
                r0.<init>(r3, r2)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "create")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.RequestBody create(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.Nullable okhttp3.MediaType r4) {
                r2 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.Pair r4 = okhttp3.internal.Internal.chooseCharset(r4)
                java.lang.Object r0 = r4.component1()
                java.nio.charset.Charset r0 = (java.nio.charset.Charset) r0
                java.lang.Object r4 = r4.component2()
                okhttp3.MediaType r4 = (okhttp3.MediaType) r4
                byte[] r3 = r3.getBytes(r0)
                java.lang.String r0 = "getBytes(...)"
                kotlin.jvm.internal.g0.o(r3, r0)
                r0 = 0
                int r1 = r3.length
                okhttp3.RequestBody r3 = r2.create(r3, r4, r0, r1)
                return r3
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okhttp3.RequestBody create(@org.jetbrains.annotations.Nullable okhttp3.MediaType r2, @org.jetbrains.annotations.NotNull java.io.File r3) {
                r1 = this;
                java.lang.String r0 = "file"
                kotlin.jvm.internal.g0.p(r3, r0)
                okhttp3.RequestBody r2 = r1.create(r3, r2)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okhttp3.RequestBody create(@org.jetbrains.annotations.Nullable okhttp3.MediaType r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "content"
                kotlin.jvm.internal.g0.p(r3, r0)
                okhttp3.RequestBody r2 = r1.create(r3, r2)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okhttp3.RequestBody create(@org.jetbrains.annotations.Nullable okhttp3.MediaType r2, @org.jetbrains.annotations.NotNull okio.ByteString r3) {
                r1 = this;
                java.lang.String r0 = "content"
                kotlin.jvm.internal.g0.p(r3, r0)
                okhttp3.RequestBody r2 = r1.create(r3, r2)
                return r2
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @kotlin.jvm.JvmOverloads
        public final okhttp3.RequestBody create(@org.jetbrains.annotations.Nullable okhttp3.MediaType r9, @org.jetbrains.annotations.NotNull byte[] r10) {
                r8 = this;
                java.lang.String r0 = "content"
                kotlin.jvm.internal.g0.p(r10, r0)
                r6 = 12
                r7 = 0
                r4 = 0
                r5 = 0
                r1 = r8
                r2 = r9
                r3 = r10
                okhttp3.RequestBody r9 = create$default(r1, r2, r3, r4, r5, r6, r7)
                return r9
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @kotlin.jvm.JvmOverloads
        public final okhttp3.RequestBody create(@org.jetbrains.annotations.Nullable okhttp3.MediaType r9, @org.jetbrains.annotations.NotNull byte[] r10, int r11) {
                r8 = this;
                java.lang.String r0 = "content"
                kotlin.jvm.internal.g0.p(r10, r0)
                r6 = 8
                r7 = 0
                r5 = 0
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                okhttp3.RequestBody r9 = create$default(r1, r2, r3, r4, r5, r6, r7)
                return r9
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @kotlin.jvm.JvmOverloads
        public final okhttp3.RequestBody create(@org.jetbrains.annotations.Nullable okhttp3.MediaType r2, @org.jetbrains.annotations.NotNull byte[] r3, int r4, int r5) {
                r1 = this;
                java.lang.String r0 = "content"
                kotlin.jvm.internal.g0.p(r3, r0)
                okhttp3.RequestBody r2 = r1.create(r3, r2, r4, r5)
                return r2
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "create")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.RequestBody create(@org.jetbrains.annotations.NotNull okio.ByteString r2, @org.jetbrains.annotations.Nullable okhttp3.MediaType r3) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.RequestBody$Companion$toRequestBody$1 r0 = new okhttp3.RequestBody$Companion$toRequestBody$1
                r0.<init>(r3, r2)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "create")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.RequestBody create(@org.jetbrains.annotations.NotNull okio.Path r2, @org.jetbrains.annotations.NotNull okio.FileSystem r3, @org.jetbrains.annotations.Nullable okhttp3.MediaType r4) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "fileSystem"
                kotlin.jvm.internal.g0.p(r3, r0)
                okhttp3.RequestBody$Companion$asRequestBody$2 r0 = new okhttp3.RequestBody$Companion$asRequestBody$2
                r0.<init>(r4, r3, r2)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "create")
        @org.jetbrains.annotations.NotNull
        @kotlin.jvm.JvmOverloads
        public final okhttp3.RequestBody create(@org.jetbrains.annotations.NotNull byte[] r9) {
                r8 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r9, r0)
                r6 = 7
                r7 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r1 = r8
                r2 = r9
                okhttp3.RequestBody r9 = create$default(r1, r2, r3, r4, r5, r6, r7)
                return r9
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "create")
        @org.jetbrains.annotations.NotNull
        @kotlin.jvm.JvmOverloads
        public final okhttp3.RequestBody create(@org.jetbrains.annotations.NotNull byte[] r9, @org.jetbrains.annotations.Nullable okhttp3.MediaType r10) {
                r8 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r9, r0)
                r6 = 6
                r7 = 0
                r4 = 0
                r5 = 0
                r1 = r8
                r2 = r9
                r3 = r10
                okhttp3.RequestBody r9 = create$default(r1, r2, r3, r4, r5, r6, r7)
                return r9
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "create")
        @org.jetbrains.annotations.NotNull
        @kotlin.jvm.JvmOverloads
        public final okhttp3.RequestBody create(@org.jetbrains.annotations.NotNull byte[] r9, @org.jetbrains.annotations.Nullable okhttp3.MediaType r10, int r11) {
                r8 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r9, r0)
                r6 = 4
                r7 = 0
                r5 = 0
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                okhttp3.RequestBody r9 = create$default(r1, r2, r3, r4, r5, r6, r7)
                return r9
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "create")
        @org.jetbrains.annotations.NotNull
        @kotlin.jvm.JvmOverloads
        public final okhttp3.RequestBody create(@org.jetbrains.annotations.NotNull byte[] r8, @org.jetbrains.annotations.Nullable okhttp3.MediaType r9, int r10, int r11) {
                r7 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r8, r0)
                int r0 = r8.length
                long r1 = (long) r0
                long r3 = (long) r10
                long r5 = (long) r11
                okhttp3.internal._UtilCommonKt.checkOffsetAndCount(r1, r3, r5)
                okhttp3.RequestBody$Companion$toRequestBody$3 r0 = new okhttp3.RequestBody$Companion$toRequestBody$3
                r0.<init>(r9, r11, r8, r10)
                return r0
        }
    }

    static {
            okhttp3.RequestBody$Companion r0 = new okhttp3.RequestBody$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.RequestBody.Companion = r0
            okio.ByteString r2 = okio.ByteString.EMPTY
            r3 = 1
            okhttp3.RequestBody r0 = okhttp3.RequestBody.Companion.create$default(r0, r2, r1, r3, r1)
            okhttp3.RequestBody.EMPTY = r0
            return
    }

    public RequestBody() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "create")
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.RequestBody create(@org.jetbrains.annotations.NotNull java.io.File r1, @org.jetbrains.annotations.Nullable okhttp3.MediaType r2) {
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            okhttp3.RequestBody r1 = r0.create(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "create")
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.RequestBody create(@org.jetbrains.annotations.NotNull java.io.FileDescriptor r1, @org.jetbrains.annotations.Nullable okhttp3.MediaType r2) {
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            okhttp3.RequestBody r1 = r0.create(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "create")
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.RequestBody create(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.Nullable okhttp3.MediaType r2) {
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            okhttp3.RequestBody r1 = r0.create(r1, r2)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.RequestBody create(@org.jetbrains.annotations.Nullable okhttp3.MediaType r1, @org.jetbrains.annotations.NotNull java.io.File r2) {
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            okhttp3.RequestBody r1 = r0.create(r1, r2)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.RequestBody create(@org.jetbrains.annotations.Nullable okhttp3.MediaType r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            okhttp3.RequestBody r1 = r0.create(r1, r2)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.RequestBody create(@org.jetbrains.annotations.Nullable okhttp3.MediaType r1, @org.jetbrains.annotations.NotNull okio.ByteString r2) {
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            okhttp3.RequestBody r1 = r0.create(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @kotlin.jvm.JvmOverloads
    public static final okhttp3.RequestBody create(@org.jetbrains.annotations.Nullable okhttp3.MediaType r1, @org.jetbrains.annotations.NotNull byte[] r2) {
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            okhttp3.RequestBody r1 = r0.create(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @kotlin.jvm.JvmOverloads
    public static final okhttp3.RequestBody create(@org.jetbrains.annotations.Nullable okhttp3.MediaType r1, @org.jetbrains.annotations.NotNull byte[] r2, int r3) {
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            okhttp3.RequestBody r1 = r0.create(r1, r2, r3)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @kotlin.jvm.JvmOverloads
    public static final okhttp3.RequestBody create(@org.jetbrains.annotations.Nullable okhttp3.MediaType r1, @org.jetbrains.annotations.NotNull byte[] r2, int r3, int r4) {
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            okhttp3.RequestBody r1 = r0.create(r1, r2, r3, r4)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "create")
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.RequestBody create(@org.jetbrains.annotations.NotNull okio.ByteString r1, @org.jetbrains.annotations.Nullable okhttp3.MediaType r2) {
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            okhttp3.RequestBody r1 = r0.create(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "create")
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.RequestBody create(@org.jetbrains.annotations.NotNull okio.Path r1, @org.jetbrains.annotations.NotNull okio.FileSystem r2, @org.jetbrains.annotations.Nullable okhttp3.MediaType r3) {
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            okhttp3.RequestBody r1 = r0.create(r1, r2, r3)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "create")
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmOverloads
    public static final okhttp3.RequestBody create(@org.jetbrains.annotations.NotNull byte[] r1) {
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            okhttp3.RequestBody r1 = r0.create(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "create")
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmOverloads
    public static final okhttp3.RequestBody create(@org.jetbrains.annotations.NotNull byte[] r1, @org.jetbrains.annotations.Nullable okhttp3.MediaType r2) {
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            okhttp3.RequestBody r1 = r0.create(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "create")
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmOverloads
    public static final okhttp3.RequestBody create(@org.jetbrains.annotations.NotNull byte[] r1, @org.jetbrains.annotations.Nullable okhttp3.MediaType r2, int r3) {
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            okhttp3.RequestBody r1 = r0.create(r1, r2, r3)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "create")
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmOverloads
    public static final okhttp3.RequestBody create(@org.jetbrains.annotations.NotNull byte[] r1, @org.jetbrains.annotations.Nullable okhttp3.MediaType r2, int r3, int r4) {
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            okhttp3.RequestBody r1 = r0.create(r1, r2, r3, r4)
            return r1
    }

    public long contentLength() throws java.io.IOException {
            r2 = this;
            r0 = -1
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public abstract okhttp3.MediaType contentType();

    public boolean isDuplex() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isOneShot() {
            r1 = this;
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ByteString sha256() throws java.io.IOException {
            r3 = this;
            okio.HashingSink$Companion r0 = okio.HashingSink.Companion
            okio.Sink r1 = okio.Okio.blackhole()
            okio.HashingSink r0 = r0.sha256(r1)
            okio.BufferedSink r1 = okio.Okio.buffer(r0)
            r3.writeTo(r1)     // Catch: java.lang.Throwable -> L1c
            kotlin.n1 r2 = kotlin.n1.a     // Catch: java.lang.Throwable -> L1c
            r2 = 0
            kotlin.io.b.a(r1, r2)
            okio.ByteString r0 = r0.hash()
            return r0
        L1c:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L1e
        L1e:
            r2 = move-exception
            kotlin.io.b.a(r1, r0)
            throw r2
    }

    public abstract void writeTo(@org.jetbrains.annotations.NotNull okio.BufferedSink r1) throws java.io.IOException;
}
