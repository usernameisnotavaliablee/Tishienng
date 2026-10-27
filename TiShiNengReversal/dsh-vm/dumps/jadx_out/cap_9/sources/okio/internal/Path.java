package okio.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "-Path")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nokio/internal/-Path\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,405:1\n53#1,22:406\n203#1:432\n203#1:433\n1563#2:428\n1634#2,3:429\n*S KotlinDebug\n*F\n+ 1 Path.kt\nokio/internal/-Path\n*L\n47#1:406,22\n193#1:432\n198#1:433\n47#1:428\n47#1:429,3\n*E\n"})
/* renamed from: okio.internal.-Path, reason: invalid class name */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Path {

    @org.jetbrains.annotations.NotNull
    private static final okio.ByteString ANY_SLASH = null;

    @org.jetbrains.annotations.NotNull
    private static final okio.ByteString BACKSLASH = null;

    @org.jetbrains.annotations.NotNull
    private static final okio.ByteString DOT = null;

    @org.jetbrains.annotations.NotNull
    private static final okio.ByteString DOT_DOT = null;

    @org.jetbrains.annotations.NotNull
    private static final okio.ByteString SLASH = null;

    static {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "/"
            okio.ByteString r1 = r0.encodeUtf8(r1)
            okio.internal.Path.SLASH = r1
            java.lang.String r1 = "\\"
            okio.ByteString r1 = r0.encodeUtf8(r1)
            okio.internal.Path.BACKSLASH = r1
            java.lang.String r1 = "/\\"
            okio.ByteString r1 = r0.encodeUtf8(r1)
            okio.internal.Path.ANY_SLASH = r1
            java.lang.String r1 = "."
            okio.ByteString r1 = r0.encodeUtf8(r1)
            okio.internal.Path.DOT = r1
            java.lang.String r1 = ".."
            okio.ByteString r0 = r0.encodeUtf8(r1)
            okio.internal.Path.DOT_DOT = r0
            return
    }

    public Path() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final /* synthetic */ okio.ByteString access$getBACKSLASH$p() {
            okio.ByteString r0 = okio.internal.Path.BACKSLASH
            return r0
    }

    public static final /* synthetic */ okio.ByteString access$getDOT$p() {
            okio.ByteString r0 = okio.internal.Path.DOT
            return r0
    }

    public static final /* synthetic */ okio.ByteString access$getDOT_DOT$p() {
            okio.ByteString r0 = okio.internal.Path.DOT_DOT
            return r0
    }

    public static final /* synthetic */ int access$getIndexOfLastSlash(okio.Path r0) {
            int r0 = getIndexOfLastSlash(r0)
            return r0
    }

    public static final /* synthetic */ okio.ByteString access$getSLASH$p() {
            okio.ByteString r0 = okio.internal.Path.SLASH
            return r0
    }

    public static final /* synthetic */ okio.ByteString access$getSlash(okio.Path r0) {
            okio.ByteString r0 = getSlash(r0)
            return r0
    }

    public static final /* synthetic */ boolean access$lastSegmentIsDotDot(okio.Path r0) {
            boolean r0 = lastSegmentIsDotDot(r0)
            return r0
    }

    public static final /* synthetic */ int access$rootLength(okio.Path r0) {
            int r0 = rootLength(r0)
            return r0
    }

    public static final /* synthetic */ okio.ByteString access$toSlash(java.lang.String r0) {
            okio.ByteString r0 = toSlash(r0)
            return r0
    }

    public static final int commonCompareTo(@org.jetbrains.annotations.NotNull okio.Path r1, @org.jetbrains.annotations.NotNull okio.Path r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.ByteString r1 = r1.getBytes$okio()
            okio.ByteString r2 = r2.getBytes$okio()
            int r1 = r1.compareTo2(r2)
            return r1
    }

    public static final boolean commonEquals(@org.jetbrains.annotations.NotNull okio.Path r1, @org.jetbrains.annotations.Nullable java.lang.Object r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r2 instanceof okio.Path
            if (r0 == 0) goto L1b
            okio.Path r2 = (okio.Path) r2
            okio.ByteString r2 = r2.getBytes$okio()
            okio.ByteString r1 = r1.getBytes$okio()
            boolean r1 = kotlin.jvm.internal.g0.g(r2, r1)
            if (r1 == 0) goto L1b
            r1 = 1
            return r1
        L1b:
            r1 = 0
            return r1
    }

    public static final int commonHashCode(@org.jetbrains.annotations.NotNull okio.Path r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            okio.ByteString r1 = r1.getBytes$okio()
            int r1 = r1.hashCode()
            return r1
    }

    public static final boolean commonIsAbsolute(@org.jetbrains.annotations.NotNull okio.Path r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = access$rootLength(r1)
            r0 = -1
            if (r1 == r0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static final boolean commonIsRelative(@org.jetbrains.annotations.NotNull okio.Path r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = access$rootLength(r1)
            r0 = -1
            if (r1 != r0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static final boolean commonIsRoot(@org.jetbrains.annotations.NotNull okio.Path r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = access$rootLength(r1)
            okio.ByteString r1 = r1.getBytes$okio()
            int r1 = r1.size()
            if (r0 != r1) goto L15
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonName(@org.jetbrains.annotations.NotNull okio.Path r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            okio.ByteString r1 = r1.nameBytes()
            java.lang.String r1 = r1.utf8()
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString commonNameBytes(@org.jetbrains.annotations.NotNull okio.Path r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = access$getIndexOfLastSlash(r4)
            r1 = -1
            r2 = 2
            if (r0 == r1) goto L1a
            okio.ByteString r4 = r4.getBytes$okio()
            int r0 = r0 + 1
            r1 = 0
            r3 = 0
            okio.ByteString r4 = okio.ByteString.substring$default(r4, r0, r1, r2, r3)
            return r4
        L1a:
            java.lang.Character r0 = r4.volumeLetter()
            if (r0 == 0) goto L2d
            okio.ByteString r0 = r4.getBytes$okio()
            int r0 = r0.size()
            if (r0 != r2) goto L2d
            okio.ByteString r4 = okio.ByteString.EMPTY
            return r4
        L2d:
            okio.ByteString r4 = r4.getBytes$okio()
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Path commonNormalized(@org.jetbrains.annotations.NotNull okio.Path r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.Path$Companion r0 = okio.Path.Companion
            java.lang.String r2 = r2.toString()
            r1 = 1
            okio.Path r2 = r0.get(r2, r1)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static final okio.Path commonParent(@org.jetbrains.annotations.NotNull okio.Path r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            okio.ByteString r0 = r7.getBytes$okio()
            okio.ByteString r1 = access$getDOT$p()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            r1 = 0
            if (r0 != 0) goto Lbe
            okio.ByteString r0 = r7.getBytes$okio()
            okio.ByteString r2 = access$getSLASH$p()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r0 != 0) goto Lbe
            okio.ByteString r0 = r7.getBytes$okio()
            okio.ByteString r2 = access$getBACKSLASH$p()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r0 != 0) goto Lbe
            boolean r0 = access$lastSegmentIsDotDot(r7)
            if (r0 == 0) goto L38
            goto Lbe
        L38:
            int r0 = access$getIndexOfLastSlash(r7)
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 != r2) goto L61
            java.lang.Character r5 = r7.volumeLetter()
            if (r5 == 0) goto L61
            okio.ByteString r0 = r7.getBytes$okio()
            int r0 = r0.size()
            r2 = 3
            if (r0 != r2) goto L53
            return r1
        L53:
            okio.Path r0 = new okio.Path
            okio.ByteString r7 = r7.getBytes$okio()
            okio.ByteString r7 = okio.ByteString.substring$default(r7, r3, r2, r4, r1)
            r0.<init>(r7)
            return r0
        L61:
            if (r0 != r4) goto L72
            okio.ByteString r5 = r7.getBytes$okio()
            okio.ByteString r6 = access$getBACKSLASH$p()
            boolean r5 = r5.startsWith(r6)
            if (r5 == 0) goto L72
            return r1
        L72:
            r5 = -1
            if (r0 != r5) goto L94
            java.lang.Character r6 = r7.volumeLetter()
            if (r6 == 0) goto L94
            okio.ByteString r0 = r7.getBytes$okio()
            int r0 = r0.size()
            if (r0 != r2) goto L86
            return r1
        L86:
            okio.Path r0 = new okio.Path
            okio.ByteString r7 = r7.getBytes$okio()
            okio.ByteString r7 = okio.ByteString.substring$default(r7, r3, r2, r4, r1)
            r0.<init>(r7)
            return r0
        L94:
            if (r0 != r5) goto La0
            okio.Path r7 = new okio.Path
            okio.ByteString r0 = access$getDOT$p()
            r7.<init>(r0)
            return r7
        La0:
            if (r0 != 0) goto Lb0
            okio.Path r0 = new okio.Path
            okio.ByteString r7 = r7.getBytes$okio()
            okio.ByteString r7 = okio.ByteString.substring$default(r7, r3, r4, r4, r1)
            r0.<init>(r7)
            return r0
        Lb0:
            okio.Path r2 = new okio.Path
            okio.ByteString r7 = r7.getBytes$okio()
            okio.ByteString r7 = okio.ByteString.substring$default(r7, r3, r0, r4, r1)
            r2.<init>(r7)
            return r2
        Lbe:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Path commonRelativeTo(@org.jetbrains.annotations.NotNull okio.Path r8, @org.jetbrains.annotations.NotNull okio.Path r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r9, r0)
            okio.Path r0 = r8.getRoot()
            okio.Path r1 = r9.getRoot()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            java.lang.String r1 = " and "
            if (r0 == 0) goto Lea
            java.util.List r0 = r8.getSegmentsBytes()
            java.util.List r2 = r9.getSegmentsBytes()
            int r3 = r0.size()
            int r4 = r2.size()
            int r3 = java.lang.Math.min(r3, r4)
            r4 = 0
            r5 = 0
        L30:
            if (r5 >= r3) goto L43
            java.lang.Object r6 = r0.get(r5)
            java.lang.Object r7 = r2.get(r5)
            boolean r6 = kotlin.jvm.internal.g0.g(r6, r7)
            if (r6 == 0) goto L43
            int r5 = r5 + 1
            goto L30
        L43:
            if (r5 != r3) goto L62
            okio.ByteString r3 = r8.getBytes$okio()
            int r3 = r3.size()
            okio.ByteString r6 = r9.getBytes$okio()
            int r6 = r6.size()
            if (r3 != r6) goto L62
            okio.Path$Companion r8 = okio.Path.Companion
            java.lang.String r9 = "."
            r0 = 0
            r1 = 1
            okio.Path r8 = okio.Path.Companion.get$default(r8, r9, r4, r1, r0)
            return r8
        L62:
            int r3 = r2.size()
            java.util.List r3 = r2.subList(r5, r3)
            okio.ByteString r6 = access$getDOT_DOT$p()
            int r3 = r3.indexOf(r6)
            r6 = -1
            if (r3 != r6) goto Lc9
            okio.ByteString r1 = r9.getBytes$okio()
            okio.ByteString r3 = access$getDOT$p()
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 == 0) goto L84
            return r8
        L84:
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            okio.ByteString r9 = access$getSlash(r9)
            if (r9 != 0) goto L9b
            okio.ByteString r9 = access$getSlash(r8)
            if (r9 != 0) goto L9b
            java.lang.String r8 = okio.Path.DIRECTORY_SEPARATOR
            okio.ByteString r9 = access$toSlash(r8)
        L9b:
            int r8 = r2.size()
            r2 = r5
        La0:
            if (r2 >= r8) goto Laf
            okio.ByteString r3 = access$getDOT_DOT$p()
            r1.write(r3)
            r1.write(r9)
            int r2 = r2 + 1
            goto La0
        Laf:
            int r8 = r0.size()
        Lb3:
            if (r5 >= r8) goto Lc4
            java.lang.Object r2 = r0.get(r5)
            okio.ByteString r2 = (okio.ByteString) r2
            r1.write(r2)
            r1.write(r9)
            int r5 = r5 + 1
            goto Lb3
        Lc4:
            okio.Path r8 = toPath(r1, r4)
            return r8
        Lc9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Impossible relative path to resolve: "
            r0.append(r2)
            r0.append(r8)
            r0.append(r1)
            r0.append(r9)
            java.lang.String r8 = r0.toString()
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        Lea:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Paths of different roots cannot be relative to each other: "
            r0.append(r2)
            r0.append(r8)
            r0.append(r1)
            r0.append(r9)
            java.lang.String r8 = r0.toString()
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Path commonResolve(@org.jetbrains.annotations.NotNull okio.Path r1, @org.jetbrains.annotations.NotNull java.lang.String r2, boolean r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "child"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r2 = r0.writeUtf8(r2)
            r0 = 0
            okio.Path r2 = toPath(r2, r0)
            okio.Path r1 = commonResolve(r1, r2, r3)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Path commonResolve(@org.jetbrains.annotations.NotNull okio.Path r1, @org.jetbrains.annotations.NotNull okio.Buffer r2, boolean r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "child"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            okio.Path r2 = toPath(r2, r0)
            okio.Path r1 = commonResolve(r1, r2, r3)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Path commonResolve(@org.jetbrains.annotations.NotNull okio.Path r1, @org.jetbrains.annotations.NotNull okio.ByteString r2, boolean r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "child"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r2 = r0.write(r2)
            r0 = 0
            okio.Path r2 = toPath(r2, r0)
            okio.Path r1 = commonResolve(r1, r2, r3)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Path commonResolve(@org.jetbrains.annotations.NotNull okio.Path r6, @org.jetbrains.annotations.NotNull okio.Path r7, boolean r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "child"
            kotlin.jvm.internal.g0.p(r7, r0)
            boolean r0 = r7.isAbsolute()
            if (r0 != 0) goto L4e
            java.lang.Character r0 = r7.volumeLetter()
            if (r0 == 0) goto L17
            goto L4e
        L17:
            okio.ByteString r0 = getSlash(r6)
            if (r0 != 0) goto L29
            okio.ByteString r0 = getSlash(r7)
            if (r0 != 0) goto L29
            java.lang.String r0 = okio.Path.DIRECTORY_SEPARATOR
            okio.ByteString r0 = toSlash(r0)
        L29:
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            okio.ByteString r6 = r6.getBytes$okio()
            r1.write(r6)
            long r2 = r1.size()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L42
            r1.write(r0)
        L42:
            okio.ByteString r6 = r7.getBytes$okio()
            r1.write(r6)
            okio.Path r6 = toPath(r1, r8)
            return r6
        L4e:
            return r7
    }

    @org.jetbrains.annotations.Nullable
    public static final okio.Path commonRoot(@org.jetbrains.annotations.NotNull okio.Path r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = access$rootLength(r3)
            r1 = -1
            if (r0 != r1) goto Le
            r3 = 0
            return r3
        Le:
            okio.Path r1 = new okio.Path
            okio.ByteString r3 = r3.getBytes$okio()
            r2 = 0
            okio.ByteString r3 = r3.substring(r2, r0)
            r1.<init>(r3)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.String> commonSegments(@org.jetbrains.annotations.NotNull okio.Path r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = access$rootLength(r7)
            r2 = -1
            r3 = 92
            if (r1 != r2) goto L15
            r1 = 0
            goto L2b
        L15:
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            if (r1 >= r2) goto L2b
            okio.ByteString r2 = r7.getBytes$okio()
            byte r2 = r2.getByte(r1)
            if (r2 != r3) goto L2b
            int r1 = r1 + 1
        L2b:
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            r4 = r1
        L34:
            if (r1 >= r2) goto L5c
            okio.ByteString r5 = r7.getBytes$okio()
            byte r5 = r5.getByte(r1)
            r6 = 47
            if (r5 == r6) goto L4c
            okio.ByteString r5 = r7.getBytes$okio()
            byte r5 = r5.getByte(r1)
            if (r5 != r3) goto L59
        L4c:
            okio.ByteString r5 = r7.getBytes$okio()
            okio.ByteString r4 = r5.substring(r4, r1)
            r0.add(r4)
            int r4 = r1 + 1
        L59:
            int r1 = r1 + 1
            goto L34
        L5c:
            okio.ByteString r1 = r7.getBytes$okio()
            int r1 = r1.size()
            if (r4 >= r1) goto L79
            okio.ByteString r1 = r7.getBytes$okio()
            okio.ByteString r7 = r7.getBytes$okio()
            int r7 = r7.size()
            okio.ByteString r7 = r1.substring(r4, r7)
            r0.add(r7)
        L79:
            java.util.ArrayList r7 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r0, r1)
            r7.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L88:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L9c
            java.lang.Object r1 = r0.next()
            okio.ByteString r1 = (okio.ByteString) r1
            java.lang.String r1 = r1.utf8()
            r7.add(r1)
            goto L88
        L9c:
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<okio.ByteString> commonSegmentsBytes(@org.jetbrains.annotations.NotNull okio.Path r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = access$rootLength(r7)
            r2 = -1
            r3 = 92
            if (r1 != r2) goto L15
            r1 = 0
            goto L2b
        L15:
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            if (r1 >= r2) goto L2b
            okio.ByteString r2 = r7.getBytes$okio()
            byte r2 = r2.getByte(r1)
            if (r2 != r3) goto L2b
            int r1 = r1 + 1
        L2b:
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            r4 = r1
        L34:
            if (r1 >= r2) goto L5c
            okio.ByteString r5 = r7.getBytes$okio()
            byte r5 = r5.getByte(r1)
            r6 = 47
            if (r5 == r6) goto L4c
            okio.ByteString r5 = r7.getBytes$okio()
            byte r5 = r5.getByte(r1)
            if (r5 != r3) goto L59
        L4c:
            okio.ByteString r5 = r7.getBytes$okio()
            okio.ByteString r4 = r5.substring(r4, r1)
            r0.add(r4)
            int r4 = r1 + 1
        L59:
            int r1 = r1 + 1
            goto L34
        L5c:
            okio.ByteString r1 = r7.getBytes$okio()
            int r1 = r1.size()
            if (r4 >= r1) goto L79
            okio.ByteString r1 = r7.getBytes$okio()
            okio.ByteString r7 = r7.getBytes$okio()
            int r7 = r7.size()
            okio.ByteString r7 = r1.substring(r4, r7)
            r0.add(r7)
        L79:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Path commonToPath(@org.jetbrains.annotations.NotNull java.lang.String r1, boolean r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r1 = r0.writeUtf8(r1)
            okio.Path r1 = toPath(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonToString(@org.jetbrains.annotations.NotNull okio.Path r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            okio.ByteString r1 = r1.getBytes$okio()
            java.lang.String r1 = r1.utf8()
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Character commonVolumeLetter(@org.jetbrains.annotations.NotNull okio.Path r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            okio.ByteString r0 = r5.getBytes$okio()
            okio.ByteString r1 = access$getSLASH$p()
            r2 = 0
            r3 = 2
            r4 = 0
            int r0 = okio.ByteString.indexOf$default(r0, r1, r2, r3, r4)
            r1 = -1
            if (r0 == r1) goto L18
            return r4
        L18:
            okio.ByteString r0 = r5.getBytes$okio()
            int r0 = r0.size()
            if (r0 >= r3) goto L23
            return r4
        L23:
            okio.ByteString r0 = r5.getBytes$okio()
            r1 = 1
            byte r0 = r0.getByte(r1)
            r1 = 58
            if (r0 == r1) goto L31
            return r4
        L31:
            okio.ByteString r5 = r5.getBytes$okio()
            byte r5 = r5.getByte(r2)
            char r5 = (char) r5
            r0 = 97
            if (r0 > r5) goto L43
            r0 = 123(0x7b, float:1.72E-43)
            if (r5 >= r0) goto L43
            goto L4b
        L43:
            r0 = 65
            if (r0 > r5) goto L50
            r0 = 91
            if (r5 >= r0) goto L50
        L4b:
            java.lang.Character r5 = java.lang.Character.valueOf(r5)
            return r5
        L50:
            return r4
    }

    private static final int getIndexOfLastSlash(okio.Path r5) {
            okio.ByteString r0 = r5.getBytes$okio()
            okio.ByteString r1 = okio.internal.Path.SLASH
            r2 = 0
            r3 = 2
            r4 = 0
            int r0 = okio.ByteString.lastIndexOf$default(r0, r1, r2, r3, r4)
            r1 = -1
            if (r0 == r1) goto L11
            return r0
        L11:
            okio.ByteString r5 = r5.getBytes$okio()
            okio.ByteString r0 = okio.internal.Path.BACKSLASH
            int r5 = okio.ByteString.lastIndexOf$default(r5, r0, r2, r3, r4)
            return r5
    }

    private static final okio.ByteString getSlash(okio.Path r6) {
            okio.ByteString r0 = r6.getBytes$okio()
            okio.ByteString r1 = okio.internal.Path.SLASH
            r2 = 0
            r3 = 2
            r4 = 0
            int r0 = okio.ByteString.indexOf$default(r0, r1, r2, r3, r4)
            r5 = -1
            if (r0 == r5) goto L11
            return r1
        L11:
            okio.ByteString r6 = r6.getBytes$okio()
            okio.ByteString r0 = okio.internal.Path.BACKSLASH
            int r6 = okio.ByteString.indexOf$default(r6, r0, r2, r3, r4)
            if (r6 == r5) goto L1e
            return r0
        L1e:
            return r4
    }

    private static final boolean lastSegmentIsDotDot(okio.Path r5) {
            okio.ByteString r0 = r5.getBytes$okio()
            okio.ByteString r1 = okio.internal.Path.DOT_DOT
            boolean r0 = r0.endsWith(r1)
            r1 = 0
            if (r0 == 0) goto L48
            okio.ByteString r0 = r5.getBytes$okio()
            int r0 = r0.size()
            r2 = 2
            r3 = 1
            if (r0 != r2) goto L1a
            return r3
        L1a:
            okio.ByteString r0 = r5.getBytes$okio()
            okio.ByteString r2 = r5.getBytes$okio()
            int r2 = r2.size()
            int r2 = r2 + (-3)
            okio.ByteString r4 = okio.internal.Path.SLASH
            boolean r0 = r0.rangeEquals(r2, r4, r1, r3)
            if (r0 == 0) goto L31
            return r3
        L31:
            okio.ByteString r0 = r5.getBytes$okio()
            okio.ByteString r5 = r5.getBytes$okio()
            int r5 = r5.size()
            int r5 = r5 + (-3)
            okio.ByteString r2 = okio.internal.Path.BACKSLASH
            boolean r5 = r0.rangeEquals(r5, r2, r1, r3)
            if (r5 == 0) goto L48
            return r3
        L48:
            return r1
    }

    private static final int rootLength(okio.Path r6) {
            okio.ByteString r0 = r6.getBytes$okio()
            int r0 = r0.size()
            r1 = -1
            if (r0 != 0) goto Lc
            return r1
        Lc:
            okio.ByteString r0 = r6.getBytes$okio()
            r2 = 0
            byte r0 = r0.getByte(r2)
            r3 = 47
            r4 = 1
            if (r0 != r3) goto L1b
            return r4
        L1b:
            okio.ByteString r0 = r6.getBytes$okio()
            byte r0 = r0.getByte(r2)
            r3 = 92
            r5 = 2
            if (r0 != r3) goto L53
            okio.ByteString r0 = r6.getBytes$okio()
            int r0 = r0.size()
            if (r0 <= r5) goto L52
            okio.ByteString r0 = r6.getBytes$okio()
            byte r0 = r0.getByte(r4)
            if (r0 != r3) goto L52
            okio.ByteString r0 = r6.getBytes$okio()
            okio.ByteString r2 = okio.internal.Path.BACKSLASH
            int r0 = r0.indexOf(r2, r5)
            if (r0 != r1) goto L51
            okio.ByteString r6 = r6.getBytes$okio()
            int r6 = r6.size()
            return r6
        L51:
            return r0
        L52:
            return r4
        L53:
            okio.ByteString r0 = r6.getBytes$okio()
            int r0 = r0.size()
            if (r0 <= r5) goto L8f
            okio.ByteString r0 = r6.getBytes$okio()
            byte r0 = r0.getByte(r4)
            r4 = 58
            if (r0 != r4) goto L8f
            okio.ByteString r0 = r6.getBytes$okio()
            byte r0 = r0.getByte(r5)
            if (r0 != r3) goto L8f
            okio.ByteString r6 = r6.getBytes$okio()
            byte r6 = r6.getByte(r2)
            char r6 = (char) r6
            r0 = 97
            if (r0 > r6) goto L85
            r0 = 123(0x7b, float:1.72E-43)
            if (r6 >= r0) goto L85
            goto L8d
        L85:
            r0 = 65
            if (r0 > r6) goto L8f
            r0 = 91
            if (r6 >= r0) goto L8f
        L8d:
            r6 = 3
            return r6
        L8f:
            return r1
    }

    private static final boolean startsWithVolumeLetterAndColon(okio.Buffer r5, okio.ByteString r6) {
            okio.ByteString r0 = okio.internal.Path.BACKSLASH
            boolean r6 = kotlin.jvm.internal.g0.g(r6, r0)
            r0 = 0
            if (r6 != 0) goto La
            return r0
        La:
            long r1 = r5.size()
            r3 = 2
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 >= 0) goto L15
            return r0
        L15:
            r1 = 1
            byte r6 = r5.getByte(r1)
            r1 = 58
            if (r6 == r1) goto L20
            return r0
        L20:
            r1 = 0
            byte r5 = r5.getByte(r1)
            char r5 = (char) r5
            r6 = 97
            if (r6 > r5) goto L30
            r6 = 123(0x7b, float:1.72E-43)
            if (r5 >= r6) goto L30
            goto L38
        L30:
            r6 = 65
            if (r6 > r5) goto L3a
            r6 = 91
            if (r5 >= r6) goto L3a
        L38:
            r5 = 1
            return r5
        L3a:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Path toPath(@org.jetbrains.annotations.NotNull okio.Buffer r16, boolean r17) {
            r0 = r16
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r1)
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            r2 = 0
            r3 = 0
            r4 = 0
        Lf:
            okio.ByteString r5 = okio.internal.Path.SLASH
            r6 = 0
            boolean r5 = r0.rangeEquals(r6, r5)
            if (r5 != 0) goto L11c
            okio.ByteString r5 = okio.internal.Path.BACKSLASH
            boolean r8 = r0.rangeEquals(r6, r5)
            if (r8 == 0) goto L23
            goto L11c
        L23:
            r8 = 2
            r9 = 1
            if (r4 < r8) goto L2f
            boolean r5 = kotlin.jvm.internal.g0.g(r2, r5)
            if (r5 == 0) goto L2f
            r5 = 1
            goto L30
        L2f:
            r5 = 0
        L30:
            r10 = -1
            if (r5 == 0) goto L3e
            kotlin.jvm.internal.g0.m(r2)
            r1.write(r2)
            r1.write(r2)
            goto L79
        L3e:
            if (r4 <= 0) goto L47
            kotlin.jvm.internal.g0.m(r2)
            r1.write(r2)
            goto L79
        L47:
            okio.ByteString r4 = okio.internal.Path.ANY_SLASH
            long r12 = r0.indexOfElement(r4)
            if (r2 != 0) goto L62
            int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r2 != 0) goto L5a
            java.lang.String r2 = okio.Path.DIRECTORY_SEPARATOR
            okio.ByteString r2 = toSlash(r2)
            goto L62
        L5a:
            byte r2 = r0.getByte(r12)
            okio.ByteString r2 = toSlash(r2)
        L62:
            boolean r4 = startsWithVolumeLetterAndColon(r0, r2)
            if (r4 == 0) goto L77
            r14 = 2
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 != 0) goto L74
            r12 = 3
            r1.write(r0, r12)
            goto L77
        L74:
            r1.write(r0, r14)
        L77:
            kotlin.n1 r4 = kotlin.n1.a
        L79:
            long r12 = r1.size()
            int r4 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r4 <= 0) goto L83
            r4 = 1
            goto L84
        L83:
            r4 = 0
        L84:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L89:
            boolean r12 = r0.exhausted()
            if (r12 != 0) goto Lee
            okio.ByteString r12 = okio.internal.Path.ANY_SLASH
            long r12 = r0.indexOfElement(r12)
            int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r14 != 0) goto L9e
            okio.ByteString r12 = r0.readByteString()
            goto La5
        L9e:
            okio.ByteString r12 = r0.readByteString(r12)
            r0.readByte()
        La5:
            okio.ByteString r13 = okio.internal.Path.DOT_DOT
            boolean r14 = kotlin.jvm.internal.g0.g(r12, r13)
            if (r14 == 0) goto Lda
            if (r4 == 0) goto Lb5
            boolean r14 = r8.isEmpty()
            if (r14 != 0) goto L89
        Lb5:
            if (r17 == 0) goto Ld6
            if (r4 != 0) goto Lca
            boolean r14 = r8.isEmpty()
            if (r14 != 0) goto Ld6
            java.lang.Object r14 = kotlin.collections.f0.u3(r8)
            boolean r13 = kotlin.jvm.internal.g0.g(r14, r13)
            if (r13 == 0) goto Lca
            goto Ld6
        Lca:
            if (r5 == 0) goto Ld2
            int r12 = r8.size()
            if (r12 == r9) goto L89
        Ld2:
            kotlin.collections.f0.R0(r8)
            goto L89
        Ld6:
            r8.add(r12)
            goto L89
        Lda:
            okio.ByteString r13 = okio.internal.Path.DOT
            boolean r13 = kotlin.jvm.internal.g0.g(r12, r13)
            if (r13 != 0) goto L89
            okio.ByteString r13 = okio.ByteString.EMPTY
            boolean r13 = kotlin.jvm.internal.g0.g(r12, r13)
            if (r13 != 0) goto L89
            r8.add(r12)
            goto L89
        Lee:
            int r0 = r8.size()
        Lf2:
            if (r3 >= r0) goto L105
            if (r3 <= 0) goto Lf9
            r1.write(r2)
        Lf9:
            java.lang.Object r4 = r8.get(r3)
            okio.ByteString r4 = (okio.ByteString) r4
            r1.write(r4)
            int r3 = r3 + 1
            goto Lf2
        L105:
            long r2 = r1.size()
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L112
            okio.ByteString r0 = okio.internal.Path.DOT
            r1.write(r0)
        L112:
            okio.Path r0 = new okio.Path
            okio.ByteString r1 = r1.readByteString()
            r0.<init>(r1)
            return r0
        L11c:
            byte r5 = r0.readByte()
            if (r2 != 0) goto L126
            okio.ByteString r2 = toSlash(r5)
        L126:
            int r4 = r4 + 1
            goto Lf
    }

    private static final okio.ByteString toSlash(byte r3) {
            r0 = 47
            if (r3 == r0) goto L22
            r0 = 92
            if (r3 != r0) goto Lb
            okio.ByteString r3 = okio.internal.Path.BACKSLASH
            return r3
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "not a directory separator: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L22:
            okio.ByteString r3 = okio.internal.Path.SLASH
            return r3
    }

    private static final okio.ByteString toSlash(java.lang.String r3) {
            java.lang.String r0 = "/"
            boolean r0 = kotlin.jvm.internal.g0.g(r3, r0)
            if (r0 == 0) goto Lb
            okio.ByteString r3 = okio.internal.Path.SLASH
            return r3
        Lb:
            java.lang.String r0 = "\\"
            boolean r0 = kotlin.jvm.internal.g0.g(r3, r0)
            if (r0 == 0) goto L16
            okio.ByteString r3 = okio.internal.Path.BACKSLASH
            return r3
        L16:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "not a directory separator: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }
}
