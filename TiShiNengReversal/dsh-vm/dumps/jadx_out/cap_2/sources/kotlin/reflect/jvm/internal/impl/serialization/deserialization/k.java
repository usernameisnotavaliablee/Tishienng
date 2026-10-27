package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nClassDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/ClassDeserializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,91:1\n1#2:92\n295#3,2:93\n*S KotlinDebug\n*F\n+ 1 ClassDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/ClassDeserializer\n*L\n57#1:93,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class k {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.k.b c = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.b> d = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.m a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.serialization.deserialization.k.a, kotlin.reflect.jvm.internal.impl.descriptors.d> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a {

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.name.b a;

        @org.jetbrains.annotations.Nullable
        private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.h b;

        public a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r2, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.serialization.deserialization.h r3) {
                r1 = this;
                java.lang.String r0 = "classId"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.a = r2
                r1.b = r3
                return
        }

        @org.jetbrains.annotations.Nullable
        public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.h a() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.h r0 = r1.b
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.name.b b() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.name.b r0 = r1.a
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.k.a
                if (r0 == 0) goto L12
                kotlin.reflect.jvm.internal.impl.name.b r0 = r1.a
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.k$a r2 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.k.a) r2
                kotlin.reflect.jvm.internal.impl.name.b r2 = r2.a
                boolean r2 = kotlin.jvm.internal.g0.g(r0, r2)
                if (r2 == 0) goto L12
                r2 = 1
                return r2
            L12:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.name.b r0 = r1.a
                int r0 = r0.hashCode()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b {
        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ b(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.b> a() {
                r1 = this;
                java.util.Set r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k.a()
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.k$b r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.k$b
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.k.c = r0
            kotlin.reflect.jvm.internal.impl.name.b$a r0 = kotlin.reflect.jvm.internal.impl.name.b.d
            kotlin.reflect.jvm.internal.impl.name.d r1 = kotlin.reflect.jvm.internal.impl.builtins.o.a.d
            kotlin.reflect.jvm.internal.impl.name.c r1 = r1.m()
            kotlin.reflect.jvm.internal.impl.name.b r0 = r0.c(r1)
            java.util.Set r0 = kotlin.collections.u1.f(r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.k.d = r0
            return
    }

    public k(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r2) {
            r1 = this;
            java.lang.String r0 = "components"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            kotlin.reflect.jvm.internal.impl.storage.n r2 = r2.u()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.j r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.j
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.storage.h r2 = r2.c(r0)
            r1.b = r2
            return
    }

    public static final /* synthetic */ java.util.Set a() {
            java.util.Set<kotlin.reflect.jvm.internal.impl.name.b> r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k.d
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.d b(kotlin.reflect.jvm.internal.impl.serialization.deserialization.k r0, kotlin.reflect.jvm.internal.impl.serialization.deserialization.k.a r1) {
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = c(r0, r1)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.d c(kotlin.reflect.jvm.internal.impl.serialization.deserialization.k r1, kotlin.reflect.jvm.internal.impl.serialization.deserialization.k.a r2) {
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r1.d(r2)
            return r1
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.d d(kotlin.reflect.jvm.internal.impl.serialization.deserialization.k.a r11) {
            r10 = this;
            kotlin.reflect.jvm.internal.impl.name.b r0 = r11.b()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r1 = r10.a
            java.lang.Iterable r1 = r1.l()
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            q3.b r2 = (q3.b) r2
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = r2.b(r0)
            if (r2 == 0) goto Le
            return r2
        L21:
            java.util.Set<kotlin.reflect.jvm.internal.impl.name.b> r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k.d
            boolean r1 = r1.contains(r0)
            r2 = 0
            if (r1 == 0) goto L2b
            return r2
        L2b:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.h r11 = r11.a()
            if (r11 != 0) goto L3e
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r11 = r10.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.i r11 = r11.e()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.h r11 = r11.a(r0)
            if (r11 != 0) goto L3e
            return r2
        L3e:
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r5 = r11.a()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r1 = r11.b()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r7 = r11.c()
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r11 = r11.d()
            kotlin.reflect.jvm.internal.impl.name.b r3 = r0.e()
            if (r3 == 0) goto L75
            r4 = 2
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = f(r10, r3, r2, r4, r2)
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n
            if (r4 == 0) goto L60
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r3 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n) r3
            goto L61
        L60:
            r3 = r2
        L61:
            if (r3 != 0) goto L64
            return r2
        L64:
            kotlin.reflect.jvm.internal.impl.name.f r0 = r0.h()
            boolean r0 = r3.f1(r0)
            if (r0 != 0) goto L6f
            return r2
        L6f:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r3.Y0()
        L73:
            r4 = r0
            goto Ld5
        L75:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r3 = r10.a
            kotlin.reflect.jvm.internal.impl.descriptors.m0 r3 = r3.s()
            kotlin.reflect.jvm.internal.impl.name.c r4 = r0.f()
            java.util.List r3 = kotlin.reflect.jvm.internal.impl.descriptors.q0.c(r3, r4)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L89:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto La7
            java.lang.Object r4 = r3.next()
            r6 = r4
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r6 = (kotlin.reflect.jvm.internal.impl.descriptors.l0) r6
            boolean r8 = r6 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.q
            if (r8 == 0) goto La8
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.q r6 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.q) r6
            kotlin.reflect.jvm.internal.impl.name.f r8 = r0.h()
            boolean r6 = r6.F0(r8)
            if (r6 == 0) goto L89
            goto La8
        La7:
            r4 = r2
        La8:
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.l0) r4
            if (r4 != 0) goto Lad
            return r2
        Lad:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r3 = r10.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r6 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.h
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r0 = r1.getTypeTable()
            java.lang.String r2 = "getTypeTable(...)"
            kotlin.jvm.internal.g0.o(r0, r2)
            r6.<init>(r0)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.j$a r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.j.b
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r2 = r1.getVersionRequirementTable()
            java.lang.String r8 = "getVersionRequirementTable(...)"
            kotlin.jvm.internal.g0.o(r2, r8)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r0 = r0.a(r2)
            r9 = 0
            r8 = r7
            r7 = r0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r3.a(r4, r5, r6, r7, r8, r9)
            r7 = r8
            goto L73
        Ld5:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r3 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n
            r8 = r11
            r6 = r5
            r5 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.d f(kotlin.reflect.jvm.internal.impl.serialization.deserialization.k r0, kotlin.reflect.jvm.internal.impl.name.b r1, kotlin.reflect.jvm.internal.impl.serialization.deserialization.h r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r0.e(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.descriptors.d e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r3, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.serialization.deserialization.h r4) {
            r2 = this;
            java.lang.String r0 = "classId"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.serialization.deserialization.k$a, kotlin.reflect.jvm.internal.impl.descriptors.d> r0 = r2.b
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.k$a r1 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.k$a
            r1.<init>(r3, r4)
            java.lang.Object r3 = r0.invoke(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r3
            return r3
    }
}
