package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nokio/Path\n+ 2 Path.kt\nokio/internal/-Path\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,132:1\n39#2,3:133\n47#2,28:136\n53#2,22:168\n106#2:190\n111#2:191\n116#2,6:192\n133#2,5:198\n143#2:203\n148#2,25:204\n188#2:229\n193#2,11:230\n198#2,6:241\n193#2,11:247\n198#2,6:258\n222#2,41:264\n267#2:305\n281#2:306\n286#2:307\n291#2:308\n296#2:309\n1563#3:164\n1634#3,3:165\n*S KotlinDebug\n*F\n+ 1 Path.kt\nokio/Path\n*L\n44#1:133,3\n47#1:136,28\n50#1:168,22\n53#1:190\n56#1:191\n60#1:192,6\n64#1:198,5\n68#1:203\n72#1:204,25\n75#1:229\n78#1:230,11\n81#1:241,6\n87#1:247,11\n90#1:258,6\n95#1:264,41\n97#1:305\n104#1:306\n106#1:307\n108#1:308\n110#1:309\n47#1:164\n47#1:165,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Path implements java.lang.Comparable<okio.Path> {

    @org.jetbrains.annotations.NotNull
    public static final okio.Path.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DIRECTORY_SEPARATOR = null;

    @org.jetbrains.annotations.NotNull
    private final okio.ByteString bytes;

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

        public static /* synthetic */ okio.Path get$default(okio.Path.Companion r0, java.io.File r1, boolean r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                okio.Path r0 = r0.get(r1, r2)
                return r0
        }

        public static /* synthetic */ okio.Path get$default(okio.Path.Companion r0, java.lang.String r1, boolean r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                okio.Path r0 = r0.get(r1, r2)
                return r0
        }

        public static /* synthetic */ okio.Path get$default(okio.Path.Companion r0, java.nio.file.Path r1, boolean r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                okio.Path r0 = r0.get(r1, r2)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "get")
        @org.jetbrains.annotations.NotNull
        @kotlin.jvm.JvmOverloads
        public final okio.Path get(@org.jetbrains.annotations.NotNull java.io.File r4) {
                r3 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r4, r0)
                r0 = 1
                r1 = 0
                r2 = 0
                okio.Path r4 = get$default(r3, r4, r2, r0, r1)
                return r4
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "get")
        @org.jetbrains.annotations.NotNull
        @kotlin.jvm.JvmOverloads
        public final okio.Path get(@org.jetbrains.annotations.NotNull java.io.File r2, boolean r3) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = r2.toString()
                java.lang.String r0 = "toString(...)"
                kotlin.jvm.internal.g0.o(r2, r0)
                okio.Path r2 = r1.get(r2, r3)
                return r2
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "get")
        @org.jetbrains.annotations.NotNull
        @kotlin.jvm.JvmOverloads
        public final okio.Path get(@org.jetbrains.annotations.NotNull java.lang.String r4) {
                r3 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r4, r0)
                r0 = 1
                r1 = 0
                r2 = 0
                okio.Path r4 = get$default(r3, r4, r2, r0, r1)
                return r4
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "get")
        @org.jetbrains.annotations.NotNull
        @kotlin.jvm.JvmOverloads
        public final okio.Path get(@org.jetbrains.annotations.NotNull java.lang.String r2, boolean r3) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r2, r0)
                okio.Path r2 = okio.internal.Path.commonToPath(r2, r3)
                return r2
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "get")
        @org.jetbrains.annotations.NotNull
        @kotlin.jvm.JvmOverloads
        public final okio.Path get(@org.jetbrains.annotations.NotNull java.nio.file.Path r4) {
                r3 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r4, r0)
                r0 = 1
                r1 = 0
                r2 = 0
                okio.Path r4 = get$default(r3, r4, r2, r0, r1)
                return r4
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "get")
        @org.jetbrains.annotations.NotNull
        @kotlin.jvm.JvmOverloads
        public final okio.Path get(@org.jetbrains.annotations.NotNull java.nio.file.Path r2, boolean r3) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = r2.toString()
                okio.Path r2 = r1.get(r2, r3)
                return r2
        }
    }

    static {
            okio.Path$Companion r0 = new okio.Path$Companion
            r1 = 0
            r0.<init>(r1)
            okio.Path.Companion = r0
            java.lang.String r0 = java.io.File.separator
            java.lang.String r1 = "separator"
            kotlin.jvm.internal.g0.o(r0, r1)
            okio.Path.DIRECTORY_SEPARATOR = r0
            return
    }

    public Path(@org.jetbrains.annotations.NotNull okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.bytes = r2
            return
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "get")
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmOverloads
    public static final okio.Path get(@org.jetbrains.annotations.NotNull java.io.File r1) {
            okio.Path$Companion r0 = okio.Path.Companion
            okio.Path r1 = r0.get(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "get")
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmOverloads
    public static final okio.Path get(@org.jetbrains.annotations.NotNull java.io.File r1, boolean r2) {
            okio.Path$Companion r0 = okio.Path.Companion
            okio.Path r1 = r0.get(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "get")
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmOverloads
    public static final okio.Path get(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            okio.Path$Companion r0 = okio.Path.Companion
            okio.Path r1 = r0.get(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "get")
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmOverloads
    public static final okio.Path get(@org.jetbrains.annotations.NotNull java.lang.String r1, boolean r2) {
            okio.Path$Companion r0 = okio.Path.Companion
            okio.Path r1 = r0.get(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "get")
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmOverloads
    public static final okio.Path get(@org.jetbrains.annotations.NotNull java.nio.file.Path r1) {
            okio.Path$Companion r0 = okio.Path.Companion
            okio.Path r1 = r0.get(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "get")
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmOverloads
    public static final okio.Path get(@org.jetbrains.annotations.NotNull java.nio.file.Path r1, boolean r2) {
            okio.Path$Companion r0 = okio.Path.Companion
            okio.Path r1 = r0.get(r1, r2)
            return r1
    }

    public static /* synthetic */ okio.Path resolve$default(okio.Path r0, java.lang.String r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            okio.Path r0 = r0.resolve(r1, r2)
            return r0
    }

    public static /* synthetic */ okio.Path resolve$default(okio.Path r0, okio.ByteString r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            okio.Path r0 = r0.resolve(r1, r2)
            return r0
    }

    public static /* synthetic */ okio.Path resolve$default(okio.Path r0, okio.Path r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            okio.Path r0 = r0.resolve(r1, r2)
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(okio.Path r1) {
            r0 = this;
            okio.Path r1 = (okio.Path) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(@org.jetbrains.annotations.NotNull okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.ByteString r0 = r1.getBytes$okio()
            okio.ByteString r2 = r2.getBytes$okio()
            int r2 = r0.compareTo2(r2)
            return r2
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okio.Path
            if (r0 == 0) goto L16
            okio.Path r2 = (okio.Path) r2
            okio.ByteString r2 = r2.getBytes$okio()
            okio.ByteString r0 = r1.getBytes$okio()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r2 == 0) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ByteString getBytes$okio() {
            r1 = this;
            okio.ByteString r0 = r1.bytes
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final okio.Path getRoot() {
            r4 = this;
            int r0 = okio.internal.Path.access$rootLength(r4)
            r1 = -1
            if (r0 != r1) goto L9
            r0 = 0
            return r0
        L9:
            okio.Path r1 = new okio.Path
            okio.ByteString r2 = r4.getBytes$okio()
            r3 = 0
            okio.ByteString r0 = r2.substring(r3, r0)
            r1.<init>(r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getSegments() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = okio.internal.Path.access$rootLength(r7)
            r2 = -1
            r3 = 92
            if (r1 != r2) goto L10
            r1 = 0
            goto L26
        L10:
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            if (r1 >= r2) goto L26
            okio.ByteString r2 = r7.getBytes$okio()
            byte r2 = r2.getByte(r1)
            if (r2 != r3) goto L26
            int r1 = r1 + 1
        L26:
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            r4 = r1
        L2f:
            if (r1 >= r2) goto L57
            okio.ByteString r5 = r7.getBytes$okio()
            byte r5 = r5.getByte(r1)
            r6 = 47
            if (r5 == r6) goto L47
            okio.ByteString r5 = r7.getBytes$okio()
            byte r5 = r5.getByte(r1)
            if (r5 != r3) goto L54
        L47:
            okio.ByteString r5 = r7.getBytes$okio()
            okio.ByteString r4 = r5.substring(r4, r1)
            r0.add(r4)
            int r4 = r1 + 1
        L54:
            int r1 = r1 + 1
            goto L2f
        L57:
            okio.ByteString r1 = r7.getBytes$okio()
            int r1 = r1.size()
            if (r4 >= r1) goto L74
            okio.ByteString r1 = r7.getBytes$okio()
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            okio.ByteString r1 = r1.substring(r4, r2)
            r0.add(r1)
        L74:
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L83:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L97
            java.lang.Object r2 = r0.next()
            okio.ByteString r2 = (okio.ByteString) r2
            java.lang.String r2 = r2.utf8()
            r1.add(r2)
            goto L83
        L97:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<okio.ByteString> getSegmentsBytes() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = okio.internal.Path.access$rootLength(r7)
            r2 = -1
            r3 = 92
            if (r1 != r2) goto L10
            r1 = 0
            goto L26
        L10:
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            if (r1 >= r2) goto L26
            okio.ByteString r2 = r7.getBytes$okio()
            byte r2 = r2.getByte(r1)
            if (r2 != r3) goto L26
            int r1 = r1 + 1
        L26:
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            r4 = r1
        L2f:
            if (r1 >= r2) goto L57
            okio.ByteString r5 = r7.getBytes$okio()
            byte r5 = r5.getByte(r1)
            r6 = 47
            if (r5 == r6) goto L47
            okio.ByteString r5 = r7.getBytes$okio()
            byte r5 = r5.getByte(r1)
            if (r5 != r3) goto L54
        L47:
            okio.ByteString r5 = r7.getBytes$okio()
            okio.ByteString r4 = r5.substring(r4, r1)
            r0.add(r4)
            int r4 = r1 + 1
        L54:
            int r1 = r1 + 1
            goto L2f
        L57:
            okio.ByteString r1 = r7.getBytes$okio()
            int r1 = r1.size()
            if (r4 >= r1) goto L74
            okio.ByteString r1 = r7.getBytes$okio()
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            okio.ByteString r1 = r1.substring(r4, r2)
            r0.add(r1)
        L74:
            return r0
    }

    public int hashCode() {
            r1 = this;
            okio.ByteString r0 = r1.getBytes$okio()
            int r0 = r0.hashCode()
            return r0
    }

    public final boolean isAbsolute() {
            r2 = this;
            int r0 = okio.internal.Path.access$rootLength(r2)
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final boolean isRelative() {
            r2 = this;
            int r0 = okio.internal.Path.access$rootLength(r2)
            r1 = -1
            if (r0 != r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final boolean isRoot() {
            r2 = this;
            int r0 = okio.internal.Path.access$rootLength(r2)
            okio.ByteString r1 = r2.getBytes$okio()
            int r1 = r1.size()
            if (r0 != r1) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    @kotlin.jvm.JvmName(name = "name")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String name() {
            r1 = this;
            okio.ByteString r0 = r1.nameBytes()
            java.lang.String r0 = r0.utf8()
            return r0
    }

    @kotlin.jvm.JvmName(name = "nameBytes")
    @org.jetbrains.annotations.NotNull
    public final okio.ByteString nameBytes() {
            r5 = this;
            int r0 = okio.internal.Path.access$getIndexOfLastSlash(r5)
            r1 = -1
            r2 = 2
            if (r0 == r1) goto L15
            okio.ByteString r1 = r5.getBytes$okio()
            int r0 = r0 + 1
            r3 = 0
            r4 = 0
            okio.ByteString r0 = okio.ByteString.substring$default(r1, r0, r3, r2, r4)
            return r0
        L15:
            java.lang.Character r0 = r5.volumeLetter()
            if (r0 == 0) goto L28
            okio.ByteString r0 = r5.getBytes$okio()
            int r0 = r0.size()
            if (r0 != r2) goto L28
            okio.ByteString r0 = okio.ByteString.EMPTY
            return r0
        L28:
            okio.ByteString r0 = r5.getBytes$okio()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Path normalized() {
            r3 = this;
            okio.Path$Companion r0 = okio.Path.Companion
            java.lang.String r1 = r3.toString()
            r2 = 1
            okio.Path r0 = r0.get(r1, r2)
            return r0
    }

    @kotlin.jvm.JvmName(name = "parent")
    @org.jetbrains.annotations.Nullable
    public final okio.Path parent() {
            r7 = this;
            okio.ByteString r0 = r7.getBytes$okio()
            okio.ByteString r1 = okio.internal.Path.access$getDOT$p()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            r1 = 0
            if (r0 != 0) goto Lb9
            okio.ByteString r0 = r7.getBytes$okio()
            okio.ByteString r2 = okio.internal.Path.access$getSLASH$p()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r0 != 0) goto Lb9
            okio.ByteString r0 = r7.getBytes$okio()
            okio.ByteString r2 = okio.internal.Path.access$getBACKSLASH$p()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r0 != 0) goto Lb9
            boolean r0 = okio.internal.Path.access$lastSegmentIsDotDot(r7)
            if (r0 == 0) goto L33
            goto Lb9
        L33:
            int r0 = okio.internal.Path.access$getIndexOfLastSlash(r7)
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 != r2) goto L5c
            java.lang.Character r5 = r7.volumeLetter()
            if (r5 == 0) goto L5c
            okio.ByteString r0 = r7.getBytes$okio()
            int r0 = r0.size()
            r2 = 3
            if (r0 != r2) goto L4e
            return r1
        L4e:
            okio.Path r0 = new okio.Path
            okio.ByteString r5 = r7.getBytes$okio()
            okio.ByteString r1 = okio.ByteString.substring$default(r5, r3, r2, r4, r1)
            r0.<init>(r1)
            return r0
        L5c:
            if (r0 != r4) goto L6d
            okio.ByteString r5 = r7.getBytes$okio()
            okio.ByteString r6 = okio.internal.Path.access$getBACKSLASH$p()
            boolean r5 = r5.startsWith(r6)
            if (r5 == 0) goto L6d
            return r1
        L6d:
            r5 = -1
            if (r0 != r5) goto L8f
            java.lang.Character r6 = r7.volumeLetter()
            if (r6 == 0) goto L8f
            okio.ByteString r0 = r7.getBytes$okio()
            int r0 = r0.size()
            if (r0 != r2) goto L81
            return r1
        L81:
            okio.Path r0 = new okio.Path
            okio.ByteString r5 = r7.getBytes$okio()
            okio.ByteString r1 = okio.ByteString.substring$default(r5, r3, r2, r4, r1)
            r0.<init>(r1)
            return r0
        L8f:
            if (r0 != r5) goto L9b
            okio.Path r0 = new okio.Path
            okio.ByteString r1 = okio.internal.Path.access$getDOT$p()
            r0.<init>(r1)
            return r0
        L9b:
            if (r0 != 0) goto Lab
            okio.Path r0 = new okio.Path
            okio.ByteString r2 = r7.getBytes$okio()
            okio.ByteString r1 = okio.ByteString.substring$default(r2, r3, r4, r4, r1)
            r0.<init>(r1)
            return r0
        Lab:
            okio.Path r2 = new okio.Path
            okio.ByteString r5 = r7.getBytes$okio()
            okio.ByteString r0 = okio.ByteString.substring$default(r5, r3, r0, r4, r1)
            r2.<init>(r0)
            return r2
        Lb9:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Path relativeTo(@org.jetbrains.annotations.NotNull okio.Path r9) {
            r8 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r9, r0)
            okio.Path r0 = r8.getRoot()
            okio.Path r1 = r9.getRoot()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            java.lang.String r1 = " and "
            if (r0 == 0) goto Le5
            java.util.List r0 = r8.getSegmentsBytes()
            java.util.List r2 = r9.getSegmentsBytes()
            int r3 = r0.size()
            int r4 = r2.size()
            int r3 = java.lang.Math.min(r3, r4)
            r4 = 0
            r5 = 0
        L2b:
            if (r5 >= r3) goto L3e
            java.lang.Object r6 = r0.get(r5)
            java.lang.Object r7 = r2.get(r5)
            boolean r6 = kotlin.jvm.internal.g0.g(r6, r7)
            if (r6 == 0) goto L3e
            int r5 = r5 + 1
            goto L2b
        L3e:
            if (r5 != r3) goto L5d
            okio.ByteString r3 = r8.getBytes$okio()
            int r3 = r3.size()
            okio.ByteString r6 = r9.getBytes$okio()
            int r6 = r6.size()
            if (r3 != r6) goto L5d
            okio.Path$Companion r9 = okio.Path.Companion
            java.lang.String r0 = "."
            r1 = 0
            r2 = 1
            okio.Path r9 = okio.Path.Companion.get$default(r9, r0, r4, r2, r1)
            return r9
        L5d:
            int r3 = r2.size()
            java.util.List r3 = r2.subList(r5, r3)
            okio.ByteString r6 = okio.internal.Path.access$getDOT_DOT$p()
            int r3 = r3.indexOf(r6)
            r6 = -1
            if (r3 != r6) goto Lc4
            okio.ByteString r1 = r9.getBytes$okio()
            okio.ByteString r3 = okio.internal.Path.access$getDOT$p()
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 == 0) goto L7f
            return r8
        L7f:
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            okio.ByteString r9 = okio.internal.Path.access$getSlash(r9)
            if (r9 != 0) goto L96
            okio.ByteString r9 = okio.internal.Path.access$getSlash(r8)
            if (r9 != 0) goto L96
            java.lang.String r9 = okio.Path.DIRECTORY_SEPARATOR
            okio.ByteString r9 = okio.internal.Path.access$toSlash(r9)
        L96:
            int r2 = r2.size()
            r3 = r5
        L9b:
            if (r3 >= r2) goto Laa
            okio.ByteString r6 = okio.internal.Path.access$getDOT_DOT$p()
            r1.write(r6)
            r1.write(r9)
            int r3 = r3 + 1
            goto L9b
        Laa:
            int r2 = r0.size()
        Lae:
            if (r5 >= r2) goto Lbf
            java.lang.Object r3 = r0.get(r5)
            okio.ByteString r3 = (okio.ByteString) r3
            r1.write(r3)
            r1.write(r9)
            int r5 = r5 + 1
            goto Lae
        Lbf:
            okio.Path r9 = okio.internal.Path.toPath(r1, r4)
            return r9
        Lc4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Impossible relative path to resolve: "
            r0.append(r2)
            r0.append(r8)
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        Le5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Paths of different roots cannot be relative to each other: "
            r0.append(r2)
            r0.append(r8)
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
    }

    @kotlin.jvm.JvmName(name = "resolve")
    @org.jetbrains.annotations.NotNull
    public final okio.Path resolve(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "child"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r2 = r0.writeUtf8(r2)
            r0 = 0
            okio.Path r2 = okio.internal.Path.toPath(r2, r0)
            okio.Path r2 = okio.internal.Path.commonResolve(r1, r2, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Path resolve(@org.jetbrains.annotations.NotNull java.lang.String r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "child"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r2 = r0.writeUtf8(r2)
            r0 = 0
            okio.Path r2 = okio.internal.Path.toPath(r2, r0)
            okio.Path r2 = okio.internal.Path.commonResolve(r1, r2, r3)
            return r2
    }

    @kotlin.jvm.JvmName(name = "resolve")
    @org.jetbrains.annotations.NotNull
    public final okio.Path resolve(@org.jetbrains.annotations.NotNull okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "child"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r2 = r0.write(r2)
            r0 = 0
            okio.Path r2 = okio.internal.Path.toPath(r2, r0)
            okio.Path r2 = okio.internal.Path.commonResolve(r1, r2, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Path resolve(@org.jetbrains.annotations.NotNull okio.ByteString r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "child"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r2 = r0.write(r2)
            r0 = 0
            okio.Path r2 = okio.internal.Path.toPath(r2, r0)
            okio.Path r2 = okio.internal.Path.commonResolve(r1, r2, r3)
            return r2
    }

    @kotlin.jvm.JvmName(name = "resolve")
    @org.jetbrains.annotations.NotNull
    public final okio.Path resolve(@org.jetbrains.annotations.NotNull okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "child"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            okio.Path r2 = okio.internal.Path.commonResolve(r1, r2, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Path resolve(@org.jetbrains.annotations.NotNull okio.Path r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "child"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.Path r2 = okio.internal.Path.commonResolve(r1, r2, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.io.File toFile() {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.nio.file.Path toNioPath() {
            r2 = this;
            java.lang.String r0 = r2.toString()
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.nio.file.Path r0 = com.huawei.secure.android.common.util.g0.a(r0, r1)
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            okio.ByteString r0 = r1.getBytes$okio()
            java.lang.String r0 = r0.utf8()
            return r0
    }

    @kotlin.jvm.JvmName(name = "volumeLetter")
    @org.jetbrains.annotations.Nullable
    public final java.lang.Character volumeLetter() {
            r5 = this;
            okio.ByteString r0 = r5.getBytes$okio()
            okio.ByteString r1 = okio.internal.Path.access$getSLASH$p()
            r2 = 0
            r3 = 2
            r4 = 0
            int r0 = okio.ByteString.indexOf$default(r0, r1, r2, r3, r4)
            r1 = -1
            if (r0 == r1) goto L13
            return r4
        L13:
            okio.ByteString r0 = r5.getBytes$okio()
            int r0 = r0.size()
            if (r0 >= r3) goto L1e
            return r4
        L1e:
            okio.ByteString r0 = r5.getBytes$okio()
            r1 = 1
            byte r0 = r0.getByte(r1)
            r1 = 58
            if (r0 == r1) goto L2c
            return r4
        L2c:
            okio.ByteString r0 = r5.getBytes$okio()
            byte r0 = r0.getByte(r2)
            char r0 = (char) r0
            r1 = 97
            if (r1 > r0) goto L3e
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 >= r1) goto L3e
            goto L46
        L3e:
            r1 = 65
            if (r1 > r0) goto L4b
            r1 = 91
            if (r0 >= r1) goto L4b
        L46:
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            return r0
        L4b:
            return r4
    }
}
