package kotlin.reflect.jvm.internal.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSpecialJvmAnnotations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialJvmAnnotations.kt\norg/jetbrains/kotlin/SpecialJvmAnnotations\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1634#2,3:43\n*S KotlinDebug\n*F\n+ 1 SpecialJvmAnnotations.kt\norg/jetbrains/kotlin/SpecialJvmAnnotations\n*L\n22#1:43,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.a a = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.b> b = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.name.b c = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: kotlin.reflect.jvm.internal.impl.a$a, reason: collision with other inner class name */
    public static final class C0026a implements kotlin.reflect.jvm.internal.impl.load.kotlin.x.c {
        final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef a;

        C0026a(kotlin.jvm.internal.Ref.BooleanRef r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.c
        public kotlin.reflect.jvm.internal.impl.load.kotlin.x.a b(kotlin.reflect.jvm.internal.impl.name.b r2, kotlin.reflect.jvm.internal.impl.descriptors.e1 r3) {
                r1 = this;
                java.lang.String r0 = "classId"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "source"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.reflect.jvm.internal.impl.load.java.h0 r3 = kotlin.reflect.jvm.internal.impl.load.java.h0.a
                kotlin.reflect.jvm.internal.impl.name.b r3 = r3.a()
                boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
                if (r2 == 0) goto L1b
                kotlin.jvm.internal.Ref$BooleanRef r2 = r1.a
                r3 = 1
                r2.element = r3
            L1b:
                r2 = 0
                return r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.c
        public void visitEnd() {
                r0 = this;
                return
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.a r0 = new kotlin.reflect.jvm.internal.impl.a
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.a.a = r0
            r0 = 6
            kotlin.reflect.jvm.internal.impl.name.c[] r0 = new kotlin.reflect.jvm.internal.impl.name.c[r0]
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.load.java.i0.a
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.load.java.i0.l
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.load.java.i0.m
            r2 = 2
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.load.java.i0.d
            r2 = 3
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.load.java.i0.f
            r2 = 4
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.load.java.i0.i
            r2 = 5
            r0[r2] = r1
            java.util.List r0 = kotlin.collections.f0.Q(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            kotlin.reflect.jvm.internal.impl.name.b$a r2 = kotlin.reflect.jvm.internal.impl.name.b.d
            java.util.Iterator r0 = r0.iterator()
        L39:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L4d
            java.lang.Object r3 = r0.next()
            kotlin.reflect.jvm.internal.impl.name.c r3 = (kotlin.reflect.jvm.internal.impl.name.c) r3
            kotlin.reflect.jvm.internal.impl.name.b r3 = r2.c(r3)
            r1.add(r3)
            goto L39
        L4d:
            kotlin.reflect.jvm.internal.impl.a.b = r1
            kotlin.reflect.jvm.internal.impl.name.b$a r0 = kotlin.reflect.jvm.internal.impl.name.b.d
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.load.java.i0.j
            java.lang.String r2 = "REPEATABLE_ANNOTATION"
            kotlin.jvm.internal.g0.o(r1, r2)
            kotlin.reflect.jvm.internal.impl.name.b r0 = r0.c(r1)
            kotlin.reflect.jvm.internal.impl.a.c = r0
            return
    }

    private a() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.b a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.b r0 = kotlin.reflect.jvm.internal.impl.a.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.b> b() {
            r1 = this;
            java.util.Set<kotlin.reflect.jvm.internal.impl.name.b> r0 = kotlin.reflect.jvm.internal.impl.a.b
            return r0
    }

    public final boolean c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.x r4) {
            r3 = this;
            java.lang.String r0 = "klass"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.jvm.internal.Ref$BooleanRef r0 = new kotlin.jvm.internal.Ref$BooleanRef
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.a$a r1 = new kotlin.reflect.jvm.internal.impl.a$a
            r1.<init>(r0)
            r2 = 0
            r4.f(r1, r2)
            boolean r4 = r0.element
            return r4
    }
}
