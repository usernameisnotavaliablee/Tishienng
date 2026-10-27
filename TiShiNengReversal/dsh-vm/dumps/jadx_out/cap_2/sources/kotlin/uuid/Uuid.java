package kotlin.uuid;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "2.0")
@kotlin.uuid.ExperimentalUuidApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class Uuid implements java.lang.Comparable<kotlin.uuid.Uuid>, java.io.Serializable {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.uuid.Uuid.a Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.uuid.Uuid NIL = null;
    public static final int SIZE_BITS = 128;
    public static final int SIZE_BYTES = 16;
    private final long leastSignificantBits;
    private final long mostSignificantBits;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.Deprecated(message = "Use naturalOrder<Uuid>() instead", replaceWith = @kotlin.ReplaceWith(expression = "naturalOrder<Uuid>()", imports = {"kotlin.comparisons.naturalOrder"}))
        @kotlin.DeprecatedSinceKotlin(warningSince = "2.1")
        public static /* synthetic */ void f() {
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.uuid.Uuid a(@org.jetbrains.annotations.NotNull byte[] r5) {
                r4 = this;
                java.lang.String r0 = "byteArray"
                kotlin.jvm.internal.g0.p(r5, r0)
                int r0 = r5.length
                r1 = 16
                if (r0 != r1) goto L1a
                r0 = 0
                long r0 = kotlin.uuid.c.b(r5, r0)
                r2 = 8
                long r2 = kotlin.uuid.c.b(r5, r2)
                kotlin.uuid.Uuid r5 = r4.b(r0, r2)
                return r5
            L1a:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Expected exactly 16 bytes, but was "
                r0.append(r1)
                r1 = 32
                java.lang.String r1 = kotlin.uuid.d.p(r5, r1)
                r0.append(r1)
                java.lang.String r1 = " of size "
                r0.append(r1)
                int r5 = r5.length
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r5 = r5.toString()
                r0.<init>(r5)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.uuid.Uuid b(long r7, long r9) {
                r6 = this;
                r0 = 0
                int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r2 != 0) goto Lf
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 != 0) goto Lf
                kotlin.uuid.Uuid r7 = r6.g()
                return r7
            Lf:
                kotlin.uuid.Uuid r0 = new kotlin.uuid.Uuid
                r5 = 0
                r1 = r7
                r3 = r9
                r0.<init>(r1, r3, r5)
                return r0
        }

        @kotlin.SinceKotlin(version = "2.1")
        @kotlin.ExperimentalUnsignedTypes
        @org.jetbrains.annotations.NotNull
        public final kotlin.uuid.Uuid c(@org.jetbrains.annotations.NotNull byte[] r2) {
                r1 = this;
                java.lang.String r0 = "$v$c$kotlin-UByteArray$-ubyteArray$0"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.uuid.Uuid r2 = r1.a(r2)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.uuid.Uuid d(long r1, long r3) {
                r0 = this;
                kotlin.uuid.Uuid r1 = r0.b(r1, r3)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.Comparator<kotlin.uuid.Uuid> e() {
                r1 = this;
                java.util.Comparator r0 = kotlin.comparisons.a.q()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.uuid.Uuid g() {
                r1 = this;
                kotlin.uuid.Uuid r0 = kotlin.uuid.Uuid.access$getNIL$cp()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.uuid.Uuid h(@org.jetbrains.annotations.NotNull java.lang.String r4) {
                r3 = this;
                java.lang.String r0 = "uuidString"
                kotlin.jvm.internal.g0.p(r4, r0)
                int r0 = r4.length()
                r1 = 32
                if (r0 == r1) goto L3f
                r1 = 36
                if (r0 != r1) goto L16
                kotlin.uuid.Uuid r4 = kotlin.uuid.c.n(r4)
                return r4
            L16:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \""
                r1.append(r2)
                r2 = 64
                java.lang.String r2 = kotlin.uuid.d.o(r4, r2)
                r1.append(r2)
                java.lang.String r2 = "\" of length "
                r1.append(r2)
                int r4 = r4.length()
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
            L3f:
                kotlin.uuid.Uuid r4 = kotlin.uuid.c.m(r4)
                return r4
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.uuid.Uuid i(@org.jetbrains.annotations.NotNull java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "hexString"
                kotlin.jvm.internal.g0.p(r3, r0)
                int r0 = r3.length()
                r1 = 32
                if (r0 != r1) goto L12
                kotlin.uuid.Uuid r3 = kotlin.uuid.c.m(r3)
                return r3
            L12:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Expected a 32-char hexadecimal string, but was \""
                r0.append(r1)
                r1 = 64
                java.lang.String r1 = kotlin.uuid.d.o(r3, r1)
                r0.append(r1)
                java.lang.String r1 = "\" of length "
                r0.append(r1)
                int r3 = r3.length()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r0.<init>(r3)
                throw r0
        }

        @kotlin.SinceKotlin(version = "2.1")
        @org.jetbrains.annotations.NotNull
        public final kotlin.uuid.Uuid j(@org.jetbrains.annotations.NotNull java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "hexDashString"
                kotlin.jvm.internal.g0.p(r3, r0)
                int r0 = r3.length()
                r1 = 36
                if (r0 != r1) goto L12
                kotlin.uuid.Uuid r3 = kotlin.uuid.c.n(r3)
                return r3
            L12:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Expected a 36-char string in the standard hex-and-dash UUID format, but was \""
                r0.append(r1)
                r1 = 64
                java.lang.String r1 = kotlin.uuid.d.o(r3, r1)
                r0.append(r1)
                java.lang.String r1 = "\" of length "
                r0.append(r1)
                int r3 = r3.length()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r0.<init>(r3)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.uuid.Uuid k() {
                r1 = this;
                kotlin.uuid.Uuid r0 = kotlin.uuid.c.h()
                return r0
        }
    }

    static {
            kotlin.uuid.Uuid$a r0 = new kotlin.uuid.Uuid$a
            r1 = 0
            r0.<init>(r1)
            kotlin.uuid.Uuid.Companion = r0
            kotlin.uuid.Uuid r0 = new kotlin.uuid.Uuid
            r1 = 0
            r0.<init>(r1, r1)
            kotlin.uuid.Uuid.NIL = r0
            return
    }

    private Uuid(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.mostSignificantBits = r1
            r0.leastSignificantBits = r3
            return
    }

    public /* synthetic */ Uuid(long r1, long r3, kotlin.jvm.internal.v r5) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    public static final /* synthetic */ kotlin.uuid.Uuid access$getNIL$cp() {
            kotlin.uuid.Uuid r0 = kotlin.uuid.Uuid.NIL
            return r0
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void getLeastSignificantBits$annotations() {
            return
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void getMostSignificantBits$annotations() {
            return
    }

    private final void readObject(java.io.ObjectInputStream r2) {
            r1 = this;
            java.io.InvalidObjectException r2 = new java.io.InvalidObjectException
            java.lang.String r0 = "Deserialization is supported via proxy only"
            r2.<init>(r0)
            throw r2
    }

    @kotlin.internal.InlineOnly
    private final <T> T toLongs(kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, ? extends T> r4) {
            r3 = this;
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r4, r0)
            long r0 = r3.getMostSignificantBits()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r1 = r3.getLeastSignificantBits()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r4 = r4.invoke(r0, r1)
            return r4
    }

    @kotlin.internal.InlineOnly
    private final <T> T toULongs(kotlin.jvm.functions.Function2<? super kotlin.d1, ? super kotlin.d1, ? extends T> r4) {
            r3 = this;
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r4, r0)
            long r0 = r3.getMostSignificantBits()
            long r0 = kotlin.d1.k(r0)
            kotlin.d1 r0 = kotlin.d1.b(r0)
            long r1 = r3.getLeastSignificantBits()
            long r1 = kotlin.d1.k(r1)
            kotlin.d1 r1 = kotlin.d1.b(r1)
            java.lang.Object r4 = r4.invoke(r0, r1)
            return r4
    }

    private final java.lang.Object writeReplace() {
            r1 = this;
            java.lang.Object r0 = kotlin.uuid.c.i(r1)
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(kotlin.uuid.Uuid r1) {
            r0 = this;
            kotlin.uuid.Uuid r1 = (kotlin.uuid.Uuid) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "2.1")
    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(@org.jetbrains.annotations.NotNull kotlin.uuid.Uuid r6) {
            r5 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r6, r0)
            long r0 = r5.mostSignificantBits
            long r2 = r6.mostSignificantBits
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1c
            long r0 = kotlin.d1.k(r0)
            long r2 = r6.mostSignificantBits
            long r2 = kotlin.d1.k(r2)
            int r6 = androidx.collection.a.a(r0, r2)
            return r6
        L1c:
            long r0 = r5.leastSignificantBits
            long r0 = kotlin.d1.k(r0)
            long r2 = r6.leastSignificantBits
            long r2 = kotlin.d1.k(r2)
            int r6 = androidx.collection.a.a(r0, r2)
            return r6
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof kotlin.uuid.Uuid
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            long r3 = r7.mostSignificantBits
            kotlin.uuid.Uuid r8 = (kotlin.uuid.Uuid) r8
            long r5 = r8.mostSignificantBits
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L1d
            long r3 = r7.leastSignificantBits
            long r5 = r8.leastSignificantBits
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L1d
            return r0
        L1d:
            return r2
    }

    public final long getLeastSignificantBits() {
            r2 = this;
            long r0 = r2.leastSignificantBits
            return r0
    }

    public final long getMostSignificantBits() {
            r2 = this;
            long r0 = r2.mostSignificantBits
            return r0
    }

    public int hashCode() {
            r4 = this;
            long r0 = r4.mostSignificantBits
            long r2 = r4.leastSignificantBits
            long r0 = r0 ^ r2
            int r0 = androidx.camera.camera2.internal.compat.params.e.a(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final byte[] toByteArray() {
            r4 = this;
            r0 = 16
            byte[] r0 = new byte[r0]
            r1 = 0
            long r2 = r4.mostSignificantBits
            kotlin.uuid.c.j(r0, r1, r2)
            r1 = 8
            long r2 = r4.leastSignificantBits
            kotlin.uuid.c.j(r0, r1, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "2.1")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String toHexDashString() {
            r8 = this;
            r0 = 36
            byte[] r3 = new byte[r0]
            long r1 = r8.mostSignificantBits
            r5 = 0
            r6 = 4
            r4 = 0
            kotlin.uuid.c.a(r1, r3, r4, r5, r6)
            r0 = 8
            r7 = 45
            r3[r0] = r7
            long r1 = r8.mostSignificantBits
            r5 = 4
            r6 = 6
            r4 = 9
            kotlin.uuid.c.a(r1, r3, r4, r5, r6)
            r0 = 13
            r3[r0] = r7
            long r1 = r8.mostSignificantBits
            r5 = 6
            r6 = 8
            r4 = 14
            kotlin.uuid.c.a(r1, r3, r4, r5, r6)
            r0 = 18
            r3[r0] = r7
            long r1 = r8.leastSignificantBits
            r5 = 0
            r6 = 2
            r4 = 19
            kotlin.uuid.c.a(r1, r3, r4, r5, r6)
            r0 = 23
            r3[r0] = r7
            long r1 = r8.leastSignificantBits
            r5 = 2
            r6 = 8
            r4 = 24
            kotlin.uuid.c.a(r1, r3, r4, r5, r6)
            java.lang.String r0 = kotlin.text.u.S1(r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String toHexString() {
            r7 = this;
            r0 = 32
            byte[] r3 = new byte[r0]
            long r1 = r7.mostSignificantBits
            r5 = 0
            r6 = 8
            r4 = 0
            kotlin.uuid.c.a(r1, r3, r4, r5, r6)
            long r1 = r7.leastSignificantBits
            r4 = 16
            kotlin.uuid.c.a(r1, r3, r4, r5, r6)
            java.lang.String r0 = kotlin.text.u.S1(r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.toHexDashString()
            return r0
    }

    @kotlin.SinceKotlin(version = "2.1")
    @kotlin.ExperimentalUnsignedTypes
    @org.jetbrains.annotations.NotNull
    /* renamed from: toUByteArray-TcUX1vc, reason: not valid java name */
    public final byte[] m38toUByteArrayTcUX1vc() {
            r1 = this;
            byte[] r0 = r1.toByteArray()
            byte[] r0 = kotlin.w0.f(r0)
            return r0
    }
}
