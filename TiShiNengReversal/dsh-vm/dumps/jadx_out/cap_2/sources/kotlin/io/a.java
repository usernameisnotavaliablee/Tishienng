package kotlin.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "ByteStreamsKt")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: kotlin.io.a$a, reason: collision with other inner class name */
    public static final class C0018a extends kotlin.collections.d0 {
        private int a;
        private boolean b;
        private boolean c;
        final /* synthetic */ java.io.BufferedInputStream d;

        C0018a(java.io.BufferedInputStream r1) {
                r0 = this;
                r0.d = r1
                r0.<init>()
                r1 = -1
                r0.a = r1
                return
        }

        private final void g() {
                r3 = this;
                boolean r0 = r3.b
                if (r0 != 0) goto L1a
                boolean r0 = r3.c
                if (r0 != 0) goto L1a
                java.io.BufferedInputStream r0 = r3.d
                int r0 = r0.read()
                r3.a = r0
                r1 = 1
                r3.b = r1
                r2 = -1
                if (r0 != r2) goto L17
                goto L18
            L17:
                r1 = 0
            L18:
                r3.c = r1
            L1a:
                return
        }

        public final boolean c() {
                r1 = this;
                boolean r0 = r1.c
                return r0
        }

        @Override // kotlin.collections.d0
        public byte d() {
                r2 = this;
                r2.g()
                boolean r0 = r2.c
                if (r0 != 0) goto Le
                int r0 = r2.a
                byte r0 = (byte) r0
                r1 = 0
                r2.b = r1
                return r0
            Le:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                java.lang.String r1 = "Input stream is over."
                r0.<init>(r1)
                throw r0
        }

        public final int e() {
                r1 = this;
                int r0 = r1.a
                return r0
        }

        public final boolean f() {
                r1 = this;
                boolean r0 = r1.b
                return r0
        }

        public final void h(boolean r1) {
                r0 = this;
                r0.c = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                r1.g()
                boolean r0 = r1.c
                r0 = r0 ^ 1
                return r0
        }

        public final void i(int r1) {
                r0 = this;
                r0.a = r1
                return
        }

        public final void j(boolean r1) {
                r0 = this;
                r0.b = r1
                return
        }
    }

    @kotlin.internal.InlineOnly
    private static final java.io.BufferedInputStream a(java.io.InputStream r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof java.io.BufferedInputStream
            if (r0 == 0) goto Lc
            java.io.BufferedInputStream r1 = (java.io.BufferedInputStream) r1
            return r1
        Lc:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.io.BufferedOutputStream b(java.io.OutputStream r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof java.io.BufferedOutputStream
            if (r0 == 0) goto Lc
            java.io.BufferedOutputStream r1 = (java.io.BufferedOutputStream) r1
            return r1
        Lc:
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            r0.<init>(r1, r2)
            return r0
    }

    static /* synthetic */ java.io.BufferedInputStream c(java.io.InputStream r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 8192(0x2000, float:1.148E-41)
        L6:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r2)
            boolean r2 = r0 instanceof java.io.BufferedInputStream
            if (r2 == 0) goto L12
            java.io.BufferedInputStream r0 = (java.io.BufferedInputStream) r0
            return r0
        L12:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream
            r2.<init>(r0, r1)
            return r2
    }

    static /* synthetic */ java.io.BufferedOutputStream d(java.io.OutputStream r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 8192(0x2000, float:1.148E-41)
        L6:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r2)
            boolean r2 = r0 instanceof java.io.BufferedOutputStream
            if (r2 == 0) goto L12
            java.io.BufferedOutputStream r0 = (java.io.BufferedOutputStream) r0
            return r0
        L12:
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream
            r2.<init>(r0, r1)
            return r2
    }

    @kotlin.internal.InlineOnly
    private static final java.io.BufferedReader e(java.io.InputStream r1, java.nio.charset.Charset r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r1, r2)
            java.io.BufferedReader r1 = new java.io.BufferedReader
            r2 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r0, r2)
            return r1
    }

    static /* synthetic */ java.io.BufferedReader f(java.io.InputStream r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.e.b
        L6:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r2)
            java.lang.String r2 = "charset"
            kotlin.jvm.internal.g0.p(r1, r2)
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            r2.<init>(r0, r1)
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r1 = 8192(0x2000, float:1.148E-41)
            r0.<init>(r2, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.io.BufferedWriter g(java.io.OutputStream r1, java.nio.charset.Charset r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            r0.<init>(r1, r2)
            java.io.BufferedWriter r1 = new java.io.BufferedWriter
            r2 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r0, r2)
            return r1
    }

    static /* synthetic */ java.io.BufferedWriter h(java.io.OutputStream r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.e.b
        L6:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r2)
            java.lang.String r2 = "charset"
            kotlin.jvm.internal.g0.p(r1, r2)
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter
            r2.<init>(r0, r1)
            java.io.BufferedWriter r0 = new java.io.BufferedWriter
            r1 = 8192(0x2000, float:1.148E-41)
            r0.<init>(r2, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.io.ByteArrayInputStream i(java.lang.String r1, java.nio.charset.Charset r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            byte[] r1 = r1.getBytes(r2)
            java.lang.String r2 = "getBytes(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            r0.<init>(r1)
            return r0
    }

    static /* synthetic */ java.io.ByteArrayInputStream j(java.lang.String r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.e.b
        L6:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r2)
            java.lang.String r2 = "charset"
            kotlin.jvm.internal.g0.p(r1, r2)
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            byte[] r0 = r0.getBytes(r1)
            java.lang.String r1 = "getBytes(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            r2.<init>(r0)
            return r2
    }

    public static final long k(@org.jetbrains.annotations.NotNull java.io.InputStream r5, @org.jetbrains.annotations.NotNull java.io.OutputStream r6, int r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "out"
            kotlin.jvm.internal.g0.p(r6, r0)
            byte[] r7 = new byte[r7]
            int r0 = r5.read(r7)
            r1 = 0
        L12:
            if (r0 < 0) goto L1f
            r3 = 0
            r6.write(r7, r3, r0)
            long r3 = (long) r0
            long r1 = r1 + r3
            int r0 = r5.read(r7)
            goto L12
        L1f:
            return r1
    }

    public static /* synthetic */ long l(java.io.InputStream r0, java.io.OutputStream r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            r2 = 8192(0x2000, float:1.148E-41)
        L6:
            long r0 = k(r0, r1, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.io.ByteArrayInputStream m(byte[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.io.ByteArrayInputStream n(byte[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.collections.d0 o(@org.jetbrains.annotations.NotNull java.io.BufferedInputStream r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.io.a$a r0 = new kotlin.io.a$a
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static final byte[] p(@org.jetbrains.annotations.NotNull java.io.InputStream r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 8192(0x2000, float:1.148E-41)
            int r2 = r4.available()
            int r1 = java.lang.Math.max(r1, r2)
            r0.<init>(r1)
            r1 = 2
            r2 = 0
            r3 = 0
            l(r4, r0, r3, r1, r2)
            byte[] r4 = r0.toByteArray()
            java.lang.String r0 = "toByteArray(...)"
            kotlin.jvm.internal.g0.o(r4, r0)
            return r4
    }

    @kotlin.Deprecated(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @kotlin.ReplaceWith(expression = "readBytes()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", warningSince = "1.3")
    @org.jetbrains.annotations.NotNull
    public static final byte[] q(@org.jetbrains.annotations.NotNull java.io.InputStream r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            int r1 = r3.available()
            int r4 = java.lang.Math.max(r4, r1)
            r0.<init>(r4)
            r4 = 2
            r1 = 0
            r2 = 0
            l(r3, r0, r2, r4, r1)
            byte[] r3 = r0.toByteArray()
            java.lang.String r4 = "toByteArray(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            return r3
    }

    public static /* synthetic */ byte[] r(java.io.InputStream r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 8192(0x2000, float:1.148E-41)
        L6:
            byte[] r0 = q(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.io.InputStreamReader s(java.io.InputStream r1, java.nio.charset.Charset r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r1, r2)
            return r0
    }

    static /* synthetic */ java.io.InputStreamReader t(java.io.InputStream r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.e.b
        L6:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r2)
            java.lang.String r2 = "charset"
            kotlin.jvm.internal.g0.p(r1, r2)
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            r2.<init>(r0, r1)
            return r2
    }

    @kotlin.internal.InlineOnly
    private static final java.io.OutputStreamWriter u(java.io.OutputStream r1, java.nio.charset.Charset r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            r0.<init>(r1, r2)
            return r0
    }

    static /* synthetic */ java.io.OutputStreamWriter v(java.io.OutputStream r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.e.b
        L6:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r2)
            java.lang.String r2 = "charset"
            kotlin.jvm.internal.g0.p(r1, r2)
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter
            r2.<init>(r0, r1)
            return r2
    }
}
