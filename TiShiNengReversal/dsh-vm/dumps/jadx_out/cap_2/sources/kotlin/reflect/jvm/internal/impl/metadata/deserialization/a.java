package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBinaryVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,101:1\n5343#2,7:102\n*S KotlinDebug\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion\n*L\n73#1:102,7\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class a {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a.C0054a f = null;

    @org.jetbrains.annotations.NotNull
    private final int[] a;
    private final int b;
    private final int c;
    private final int d;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Integer> e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBinaryVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,101:1\n1563#2:102\n1634#2,3:103\n37#3:106\n36#3,3:107\n*S KotlinDebug\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion$Companion\n*L\n97#1:102\n97#1:103,3\n98#1:106\n98#1:107,3\n*E\n"})
    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.deserialization.a$a, reason: collision with other inner class name */
    public static final class C0054a {
        private C0054a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C0054a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.a$a r0 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.a$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.a.f = r0
            return
    }

    public a(@org.jetbrains.annotations.NotNull int... r4) {
            r3 = this;
            java.lang.String r0 = "numbers"
            kotlin.jvm.internal.g0.p(r4, r0)
            r3.<init>()
            r3.a = r4
            r0 = 0
            java.lang.Integer r0 = kotlin.collections.n.ff(r4, r0)
            r1 = -1
            if (r0 == 0) goto L17
            int r0 = r0.intValue()
            goto L18
        L17:
            r0 = -1
        L18:
            r3.b = r0
            r0 = 1
            java.lang.Integer r0 = kotlin.collections.n.ff(r4, r0)
            if (r0 == 0) goto L26
            int r0 = r0.intValue()
            goto L27
        L26:
            r0 = -1
        L27:
            r3.c = r0
            r0 = 2
            java.lang.Integer r0 = kotlin.collections.n.ff(r4, r0)
            if (r0 == 0) goto L34
            int r1 = r0.intValue()
        L34:
            r3.d = r1
            int r0 = r4.length
            r1 = 3
            if (r0 <= r1) goto L6c
            int r0 = r4.length
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 > r2) goto L4f
            java.util.List r0 = kotlin.collections.n.r(r4)
            int r4 = r4.length
            java.util.List r4 = r0.subList(r1, r4)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r4 = kotlin.collections.f0.a6(r4)
            goto L70
        L4f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "BinaryVersion with length more than 1024 are not supported. Provided length "
            r1.append(r2)
            int r4 = r4.length
            r1.append(r4)
            r4 = 46
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L6c:
            java.util.List r4 = kotlin.collections.f0.J()
        L70:
            r3.e = r4
            return
    }

    public final int a() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public final int b() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    public final boolean c(int r4, int r5, int r6) {
            r3 = this;
            int r0 = r3.b
            r1 = 1
            if (r0 <= r4) goto L6
            return r1
        L6:
            r2 = 0
            if (r0 >= r4) goto La
            return r2
        La:
            int r4 = r3.c
            if (r4 <= r5) goto Lf
            return r1
        Lf:
            if (r4 >= r5) goto L12
            return r2
        L12:
            int r4 = r3.d
            if (r4 < r6) goto L17
            return r1
        L17:
            return r2
    }

    public final boolean d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r3) {
            r2 = this;
            java.lang.String r0 = "version"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r3.b
            int r1 = r3.c
            int r3 = r3.d
            boolean r3 = r2.c(r0, r1, r3)
            return r3
    }

    public final boolean e(int r4, int r5, int r6) {
            r3 = this;
            int r0 = r3.b
            r1 = 1
            if (r0 >= r4) goto L6
            return r1
        L6:
            r2 = 0
            if (r0 <= r4) goto La
            return r2
        La:
            int r4 = r3.c
            if (r4 >= r5) goto Lf
            return r1
        Lf:
            if (r4 <= r5) goto L12
            return r2
        L12:
            int r4 = r3.d
            if (r4 > r6) goto L17
            return r1
        L17:
            return r2
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            if (r3 == 0) goto L30
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L30
            int r0 = r2.b
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r3 = (kotlin.reflect.jvm.internal.impl.metadata.deserialization.a) r3
            int r1 = r3.b
            if (r0 != r1) goto L30
            int r0 = r2.c
            int r1 = r3.c
            if (r0 != r1) goto L30
            int r0 = r2.d
            int r1 = r3.d
            if (r0 != r1) goto L30
            java.util.List<java.lang.Integer> r0 = r2.e
            java.util.List<java.lang.Integer> r3 = r3.e
            boolean r3 = kotlin.jvm.internal.g0.g(r0, r3)
            if (r3 == 0) goto L30
            r3 = 1
            return r3
        L30:
            r3 = 0
            return r3
    }

    protected final boolean f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r5) {
            r4 = this;
            java.lang.String r0 = "ourVersion"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r4.b
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L17
            int r0 = r5.b
            if (r0 != 0) goto L16
            int r0 = r4.c
            int r5 = r5.c
            if (r0 != r5) goto L16
            return r2
        L16:
            return r1
        L17:
            int r3 = r5.b
            if (r0 != r3) goto L22
            int r0 = r4.c
            int r5 = r5.c
            if (r0 > r5) goto L22
            return r2
        L22:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final int[] g() {
            r1 = this;
            int[] r0 = r1.a
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.b
            int r1 = r0 * 31
            int r2 = r3.c
            int r1 = r1 + r2
            int r0 = r0 + r1
            int r1 = r0 * 31
            int r2 = r3.d
            int r1 = r1 + r2
            int r0 = r0 + r1
            int r1 = r0 * 31
            java.util.List<java.lang.Integer> r2 = r3.e
            int r2 = r2.hashCode()
            int r1 = r1 + r2
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r10 = this;
            int[] r0 = r10.g()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.length
            r3 = 0
        Lb:
            if (r3 >= r2) goto L1c
            r4 = r0[r3]
            r5 = -1
            if (r4 == r5) goto L1c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.add(r4)
            int r3 = r3 + 1
            goto Lb
        L1c:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L25
            java.lang.String r0 = "unknown"
            return r0
        L25:
            r8 = 62
            r9 = 0
            java.lang.String r2 = "."
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r0 = kotlin.collections.f0.r3(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }
}
