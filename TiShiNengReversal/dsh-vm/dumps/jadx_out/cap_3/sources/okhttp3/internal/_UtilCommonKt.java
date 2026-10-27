package okhttp3.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\n-UtilCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 -UtilCommon.kt\nokhttp3/internal/_UtilCommonKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,400:1\n37#2,2:401\n1772#3,6:403\n72#4:409\n58#4,22:410\n*S KotlinDebug\n*F\n+ 1 -UtilCommon.kt\nokhttp3/internal/_UtilCommonKt\n*L\n68#1:401,2\n97#1:403,6\n303#1:409\n303#1:410,22\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class _UtilCommonKt {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final byte[] EMPTY_BYTE_ARRAY = null;

    @org.jetbrains.annotations.NotNull
    private static final okio.Options UNICODE_BOMS = null;

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String USER_AGENT = "okhttp/5.3.0";

    static {
            r0 = 0
            byte[] r1 = new byte[r0]
            okhttp3.internal._UtilCommonKt.EMPTY_BYTE_ARRAY = r1
            okio.Options$Companion r1 = okio.Options.Companion
            okio.ByteString$Companion r2 = okio.ByteString.Companion
            java.lang.String r3 = "efbbbf"
            okio.ByteString r3 = r2.decodeHex(r3)
            java.lang.String r4 = "feff"
            okio.ByteString r4 = r2.decodeHex(r4)
            java.lang.String r5 = "fffe0000"
            okio.ByteString r5 = r2.decodeHex(r5)
            java.lang.String r6 = "fffe"
            okio.ByteString r6 = r2.decodeHex(r6)
            java.lang.String r7 = "0000feff"
            okio.ByteString r2 = r2.decodeHex(r7)
            r7 = 5
            okio.ByteString[] r7 = new okio.ByteString[r7]
            r7[r0] = r3
            r0 = 1
            r7[r0] = r4
            r0 = 2
            r7[r0] = r5
            r0 = 3
            r7[r0] = r6
            r0 = 4
            r7[r0] = r2
            okio.Options r0 = r1.of(r7)
            okhttp3.internal._UtilCommonKt.UNICODE_BOMS = r0
            return
    }

    public _UtilCommonKt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final <E> void addIfAbsent(@org.jetbrains.annotations.NotNull java.util.List<E> r1, E r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.contains(r2)
            if (r0 != 0) goto Le
            r1.add(r2)
        Le:
            return
    }

    public static final int and(byte r0, int r1) {
            r0 = r0 & r1
            return r0
    }

    public static final int and(short r0, int r1) {
            r0 = r0 & r1
            return r0
    }

    public static final long and(int r2, long r3) {
            long r0 = (long) r2
            long r3 = r3 & r0
            return r3
    }

    public static final void checkOffsetAndCount(long r5, long r7, long r9) {
            long r0 = r7 | r9
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L13
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 > 0) goto L13
            long r0 = r5 - r7
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 < 0) goto L13
            return
        L13:
            java.lang.ArrayIndexOutOfBoundsException r9 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "length="
            r10.append(r0)
            r10.append(r5)
            java.lang.String r5 = ", offset="
            r10.append(r5)
            r10.append(r7)
            java.lang.String r5 = ", count="
            r10.append(r5)
            r10.append(r7)
            java.lang.String r5 = r10.toString()
            r9.<init>(r5)
            throw r9
    }

    public static final void closeQuietly(@org.jetbrains.annotations.NotNull java.io.Closeable r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.close()     // Catch: java.lang.Exception -> L8 java.lang.RuntimeException -> L9
        L8:
            return
        L9:
            r1 = move-exception
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String[] concat(@org.jetbrains.annotations.NotNull java.lang.String[] r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1.length
            int r0 = r0 + 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r0 = kotlin.collections.n.Oe(r1)
            r1[r0] = r2
            return r1
    }

    public static final void deleteContents(@org.jetbrains.annotations.NotNull okio.FileSystem r3, @org.jetbrains.annotations.NotNull okio.Path r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "directory"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.List r4 = r3.list(r4)     // Catch: java.io.FileNotFoundException -> L3b
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L13:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r4.next()
            okio.Path r1 = (okio.Path) r1
            okio.FileMetadata r2 = r3.metadata(r1)     // Catch: java.io.IOException -> L2d
            boolean r2 = r2.isDirectory()     // Catch: java.io.IOException -> L2d
            if (r2 == 0) goto L2f
            deleteContents(r3, r1)     // Catch: java.io.IOException -> L2d
            goto L2f
        L2d:
            r1 = move-exception
            goto L33
        L2f:
            r3.delete(r1)     // Catch: java.io.IOException -> L2d
            goto L13
        L33:
            if (r0 != 0) goto L13
            r0 = r1
            goto L13
        L37:
            if (r0 != 0) goto L3a
            return
        L3a:
            throw r0
        L3b:
            return
    }

    public static final void deleteIfExists(@org.jetbrains.annotations.NotNull okio.FileSystem r1, @org.jetbrains.annotations.NotNull okio.Path r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.delete(r2)     // Catch: java.io.FileNotFoundException -> Ld
        Ld:
            return
    }

    public static final int delimiterOffset(@org.jetbrains.annotations.NotNull java.lang.String r1, char r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
        L5:
            if (r3 >= r4) goto L11
            char r0 = r1.charAt(r3)
            if (r0 != r2) goto Le
            return r3
        Le:
            int r3 = r3 + 1
            goto L5
        L11:
            return r4
    }

    public static final int delimiterOffset(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.String r5, int r6, int r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "delimiters"
            kotlin.jvm.internal.g0.p(r5, r0)
        La:
            if (r6 >= r7) goto L1d
            char r0 = r4.charAt(r6)
            r1 = 2
            r2 = 0
            r3 = 0
            boolean r0 = kotlin.text.u.k3(r5, r0, r3, r1, r2)
            if (r0 == 0) goto L1a
            return r6
        L1a:
            int r6 = r6 + 1
            goto La
        L1d:
            return r7
    }

    public static /* synthetic */ int delimiterOffset$default(java.lang.String r0, char r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            int r3 = r0.length()
        Ld:
            int r0 = delimiterOffset(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int delimiterOffset$default(java.lang.String r0, java.lang.String r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            int r3 = r0.length()
        Ld:
            int r0 = delimiterOffset(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> filterList(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.List r0 = kotlin.collections.f0.J()
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r3.next()
            java.lang.Object r2 = r4.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L12
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L33
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L33:
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal._UtilCommonKt.filterList>"
            kotlin.jvm.internal.g0.n(r0, r2)
            java.util.List r2 = kotlin.jvm.internal.u0.g(r0)
            r2.add(r1)
            goto L12
        L40:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Options getUNICODE_BOMS() {
            okio.Options r0 = okhttp3.internal._UtilCommonKt.UNICODE_BOMS
            return r0
    }

    public static final boolean hasIntersection(@org.jetbrains.annotations.NotNull java.lang.String[] r7, @org.jetbrains.annotations.Nullable java.lang.String[] r8, @org.jetbrains.annotations.NotNull java.util.Comparator<? super java.lang.String> r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r9, r0)
            int r0 = r7.length
            r1 = 0
            if (r0 != 0) goto Lf
            goto L2f
        Lf:
            if (r8 == 0) goto L2f
            int r0 = r8.length
            if (r0 != 0) goto L15
            goto L2f
        L15:
            int r0 = r7.length
            r2 = 0
        L17:
            if (r2 >= r0) goto L2f
            r3 = r7[r2]
            int r4 = r8.length
            r5 = 0
        L1d:
            if (r5 >= r4) goto L2c
            r6 = r8[r5]
            int r6 = r9.compare(r3, r6)
            if (r6 != 0) goto L29
            r7 = 1
            return r7
        L29:
            int r5 = r5 + 1
            goto L1d
        L2c:
            int r2 = r2 + 1
            goto L17
        L2f:
            return r1
    }

    public static final void ignoreIoExceptions(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r1) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.invoke()     // Catch: java.io.IOException -> L8
        L8:
            return
    }

    public static final int indexOf(@org.jetbrains.annotations.NotNull java.lang.String[] r3, @org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.util.Comparator<java.lang.String> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r3.length
            r1 = 0
        L11:
            if (r1 >= r0) goto L1f
            r2 = r3[r1]
            int r2 = r5.compare(r2, r4)
            if (r2 != 0) goto L1c
            return r1
        L1c:
            int r1 = r1 + 1
            goto L11
        L1f:
            r3 = -1
            return r3
    }

    public static final int indexOfControlOrNonAscii(@org.jetbrains.annotations.NotNull java.lang.String r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.length()
            r1 = 0
        La:
            if (r1 >= r0) goto L25
            char r2 = r4.charAt(r1)
            r3 = 31
            int r3 = kotlin.jvm.internal.g0.t(r2, r3)
            if (r3 <= 0) goto L24
            r3 = 127(0x7f, float:1.78E-43)
            int r2 = kotlin.jvm.internal.g0.t(r2, r3)
            if (r2 < 0) goto L21
            goto L24
        L21:
            int r1 = r1 + 1
            goto La
        L24:
            return r1
        L25:
            r4 = -1
            return r4
    }

    public static final int indexOfFirstNonAsciiWhitespace(@org.jetbrains.annotations.NotNull java.lang.String r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
        L5:
            if (r3 >= r4) goto L23
            char r0 = r2.charAt(r3)
            r1 = 9
            if (r0 == r1) goto L20
            r1 = 10
            if (r0 == r1) goto L20
            r1 = 12
            if (r0 == r1) goto L20
            r1 = 13
            if (r0 == r1) goto L20
            r1 = 32
            if (r0 == r1) goto L20
            return r3
        L20:
            int r3 = r3 + 1
            goto L5
        L23:
            return r4
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(java.lang.String r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            int r0 = indexOfFirstNonAsciiWhitespace(r0, r1, r2)
            return r0
    }

    public static final int indexOfLastNonAsciiWhitespace(@org.jetbrains.annotations.NotNull java.lang.String r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r4 = r4 + (-1)
            if (r3 > r4) goto L29
        L9:
            char r0 = r2.charAt(r4)
            r1 = 9
            if (r0 == r1) goto L24
            r1 = 10
            if (r0 == r1) goto L24
            r1 = 12
            if (r0 == r1) goto L24
            r1 = 13
            if (r0 == r1) goto L24
            r1 = 32
            if (r0 == r1) goto L24
            int r4 = r4 + 1
            return r4
        L24:
            if (r4 == r3) goto L29
            int r4 = r4 + (-1)
            goto L9
        L29:
            return r3
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(java.lang.String r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            int r0 = indexOfLastNonAsciiWhitespace(r0, r1, r2)
            return r0
    }

    public static final int indexOfNonWhitespace(@org.jetbrains.annotations.NotNull java.lang.String r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r3.length()
        L9:
            if (r4 >= r0) goto L1b
            char r1 = r3.charAt(r4)
            r2 = 32
            if (r1 == r2) goto L18
            r2 = 9
            if (r1 == r2) goto L18
            return r4
        L18:
            int r4 = r4 + 1
            goto L9
        L1b:
            int r3 = r3.length()
            return r3
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(java.lang.String r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            int r0 = indexOfNonWhitespace(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> interleave(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3) {
            java.lang.String r0 = "a"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "b"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
            java.util.Iterator r3 = r3.iterator()
            java.util.List r0 = kotlin.collections.f0.j()
        L16:
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L28
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L23
            goto L28
        L23:
            java.util.List r2 = kotlin.collections.f0.b(r0)
            return r2
        L28:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r2.next()
            r0.add(r1)
        L35:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r3.next()
            r0.add(r1)
            goto L16
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String[] intersect(@org.jetbrains.annotations.NotNull java.lang.String[] r8, @org.jetbrains.annotations.NotNull java.lang.String[] r9, @org.jetbrains.annotations.NotNull java.util.Comparator<? super java.lang.String> r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r8.length
            r2 = 0
            r3 = 0
        L17:
            if (r3 >= r1) goto L31
            r4 = r8[r3]
            int r5 = r9.length
            r6 = 0
        L1d:
            if (r6 >= r5) goto L2e
            r7 = r9[r6]
            int r7 = r10.compare(r4, r7)
            if (r7 != 0) goto L2b
            r0.add(r4)
            goto L2e
        L2b:
            int r6 = r6 + 1
            goto L1d
        L2e:
            int r3 = r3 + 1
            goto L17
        L31:
            java.lang.String[] r8 = new java.lang.String[r2]
            java.lang.Object[] r8 = r0.toArray(r8)
            java.lang.String[] r8 = (java.lang.String[]) r8
            return r8
    }

    public static final boolean isCivilized(@org.jetbrains.annotations.NotNull okio.FileSystem r2, @org.jetbrains.annotations.NotNull okio.Path r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r3, r0)
            okio.Sink r0 = r2.sink(r3)
            r2.delete(r3)     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1a
            r2 = 1
            if (r0 == 0) goto L17
            r0.close()     // Catch: java.lang.Throwable -> L17
        L17:
            return r2
        L18:
            r1 = move-exception
            goto L26
        L1a:
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L24
            r0.close()     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r0 = move-exception
            goto L31
        L24:
            r0 = 0
            goto L31
        L26:
            if (r0 == 0) goto L30
            r0.close()     // Catch: java.lang.Throwable -> L2c
            goto L30
        L2c:
            r0 = move-exception
            kotlin.l.a(r1, r0)
        L30:
            r0 = r1
        L31:
            if (r0 != 0) goto L38
            r2.delete(r3)
            r2 = 0
            return r2
        L38:
            throw r0
    }

    public static final boolean isSensitiveHeader(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "Authorization"
            r1 = 1
            boolean r0 = kotlin.text.u.a2(r2, r0, r1)
            if (r0 != 0) goto L29
            java.lang.String r0 = "Cookie"
            boolean r0 = kotlin.text.u.a2(r2, r0, r1)
            if (r0 != 0) goto L29
            java.lang.String r0 = "Proxy-Authorization"
            boolean r0 = kotlin.text.u.a2(r2, r0, r1)
            if (r0 != 0) goto L29
            java.lang.String r0 = "Set-Cookie"
            boolean r2 = kotlin.text.u.a2(r2, r0, r1)
            if (r2 == 0) goto L27
            goto L29
        L27:
            r2 = 0
            return r2
        L29:
            return r1
    }

    public static final int parseHexDigit(char r2) {
            r0 = 48
            if (r0 > r2) goto La
            r1 = 58
            if (r2 >= r1) goto La
            int r2 = r2 - r0
            return r2
        La:
            r0 = 97
            if (r0 > r2) goto L15
            r0 = 103(0x67, float:1.44E-43)
            if (r2 >= r0) goto L15
            int r2 = r2 + (-87)
            return r2
        L15:
            r0 = 65
            if (r0 > r2) goto L20
            r0 = 71
            if (r2 >= r0) goto L20
            int r2 = r2 + (-55)
            return r2
        L20:
            r2 = -1
            return r2
    }

    public static final int readMedium(@org.jetbrains.annotations.NotNull okio.BufferedSource r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            byte r0 = r3.readByte()
            r1 = 255(0xff, float:3.57E-43)
            int r0 = and(r0, r1)
            int r0 = r0 << 16
            byte r2 = r3.readByte()
            int r2 = and(r2, r1)
            int r2 = r2 << 8
            r0 = r0 | r2
            byte r3 = r3.readByte()
            int r3 = and(r3, r1)
            r3 = r3 | r0
            return r3
    }

    public static final int skipAll(@org.jetbrains.annotations.NotNull okio.Buffer r3, byte r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
        L6:
            boolean r1 = r3.exhausted()
            if (r1 != 0) goto L1a
            r1 = 0
            byte r1 = r3.getByte(r1)
            if (r1 != r4) goto L1a
            int r0 = r0 + 1
            r3.readByte()
            goto L6
        L1a:
            return r0
    }

    public static final long toLongOrDefault(@org.jetbrains.annotations.NotNull java.lang.String r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            long r1 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> La
            return r1
        La:
            return r2
    }

    public static final int toNonNegativeInt(@org.jetbrains.annotations.Nullable java.lang.String r3, int r4) {
            if (r3 == 0) goto L1a
            long r3 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L1a
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L11
            r3 = 2147483647(0x7fffffff, float:NaN)
            return r3
        L11:
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L19
            r3 = 0
            return r3
        L19:
            int r4 = (int) r3
        L1a:
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String trimSubstring(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r2 = indexOfFirstNonAsciiWhitespace(r1, r2, r3)
            int r3 = indexOfLastNonAsciiWhitespace(r1, r2, r3)
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.String r2 = "substring(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    public static /* synthetic */ java.lang.String trimSubstring$default(java.lang.String r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            java.lang.String r0 = trimSubstring(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Throwable withSuppressed(@org.jetbrains.annotations.NotNull java.lang.Exception r1, @org.jetbrains.annotations.NotNull java.util.List<? extends java.lang.Exception> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "suppressed"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
        Le:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r2.next()
            java.lang.Exception r0 = (java.lang.Exception) r0
            kotlin.l.a(r1, r0)
            goto Le
        L1e:
            return r1
    }

    public static final void writeMedium(@org.jetbrains.annotations.NotNull okio.BufferedSink r1, int r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = r2 >>> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.writeByte(r0)
            int r0 = r2 >>> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.writeByte(r0)
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1.writeByte(r2)
            return
    }
}
