package y3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class a extends kotlin.reflect.jvm.internal.impl.metadata.deserialization.a {

    @org.jetbrains.annotations.NotNull
    public static final y3.a.C0073a g = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final y3.a h = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final y3.a i = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBuiltInsBinaryVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInsBinaryVersion.kt\norg/jetbrains/kotlin/metadata/builtins/BuiltInsBinaryVersion$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n1563#2:41\n1634#2,3:42\n*S KotlinDebug\n*F\n+ 1 BuiltInsBinaryVersion.kt\norg/jetbrains/kotlin/metadata/builtins/BuiltInsBinaryVersion$Companion\n*L\n36#1:41\n36#1:42,3\n*E\n"})
    /* renamed from: y3.a$a, reason: collision with other inner class name */
    public static final class C0073a {
        private C0073a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C0073a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final y3.a a(@org.jetbrains.annotations.NotNull java.io.InputStream r4) {
                r3 = this;
                java.lang.String r0 = "stream"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.io.DataInputStream r0 = new java.io.DataInputStream
                r0.<init>(r4)
                kotlin.ranges.m r4 = new kotlin.ranges.m
                r1 = 1
                int r2 = r0.readInt()
                r4.<init>(r1, r2)
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r2 = kotlin.collections.f0.d0(r4, r2)
                r1.<init>(r2)
                java.util.Iterator r4 = r4.iterator()
            L23:
                boolean r2 = r4.hasNext()
                if (r2 == 0) goto L3b
                r2 = r4
                kotlin.collections.d1 r2 = (kotlin.collections.d1) r2
                r2.nextInt()
                int r2 = r0.readInt()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.add(r2)
                goto L23
            L3b:
                int[] r4 = kotlin.collections.f0.Z5(r1)
                int r0 = r4.length
                int[] r4 = java.util.Arrays.copyOf(r4, r0)
                y3.a r0 = new y3.a
                r0.<init>(r4)
                return r0
        }
    }

    static {
            y3.a$a r0 = new y3.a$a
            r1 = 0
            r0.<init>(r1)
            y3.a.g = r0
            y3.a r0 = new y3.a
            r1 = 7
            r2 = 1
            r3 = 0
            int[] r1 = new int[]{r2, r3, r1}
            r0.<init>(r1)
            y3.a.h = r0
            y3.a r0 = new y3.a
            int[] r1 = new int[r3]
            r0.<init>(r1)
            y3.a.i = r0
            return
    }

    public a(@org.jetbrains.annotations.NotNull int... r2) {
            r1 = this;
            java.lang.String r0 = "numbers"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            int[] r2 = java.util.Arrays.copyOf(r2, r0)
            r1.<init>(r2)
            return
    }

    public boolean h() {
            r1 = this;
            y3.a r0 = y3.a.h
            boolean r0 = r1.f(r0)
            return r0
    }
}
