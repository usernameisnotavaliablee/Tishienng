package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface g extends java.lang.Iterable<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>, l3.a {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.a q0 = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        static final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.a a = null;

        @org.jetbrains.annotations.NotNull
        private static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b = null;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a$a, reason: collision with other inner class name */
        public static final class C0030a implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.g {
            C0030a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public java.lang.Void a(kotlin.reflect.jvm.internal.impl.name.c r2) {
                    r1 = this;
                    java.lang.String r0 = "fqName"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    r2 = 0
                    return r2
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
            public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.c b(kotlin.reflect.jvm.internal.impl.name.c r1) {
                    r0 = this;
                    java.lang.Void r1 = r0.a(r1)
                    kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r1 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) r1
                    return r1
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
            public boolean isEmpty() {
                    r1 = this;
                    r0 = 1
                    return r0
            }

            @Override // java.lang.Iterable
            public java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> iterator() {
                    r1 = this;
                    java.util.List r0 = kotlin.collections.f0.J()
                    java.util.Iterator r0 = r0.iterator()
                    return r0
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
            public boolean l(kotlin.reflect.jvm.internal.impl.name.c r1) {
                    r0 = this;
                    boolean r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.b.b(r0, r1)
                    return r1
            }

            public java.lang.String toString() {
                    r1 = this;
                    java.lang.String r0 = "EMPTY"
                    return r0
            }
        }

        static {
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r0 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.a.a = r0
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a$a r0 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a$a
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.a.b = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g a(@org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> r2) {
                r1 = this;
                java.lang.String r0 = "annotations"
                kotlin.jvm.internal.g0.p(r2, r0)
                boolean r0 = r2.isEmpty()
                if (r0 == 0) goto Le
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.a.b
                return r2
            Le:
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.h r0 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.h
                r0.<init>(r2)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.a.b
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAnnotations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/Annotations$DefaultImpls\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n295#2,2:124\n*S KotlinDebug\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/Annotations$DefaultImpls\n*L\n29#1:124,2\n*E\n"})
    public static final class b {
        @org.jetbrains.annotations.Nullable
        public static kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r3) {
                java.lang.String r0 = "fqName"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.util.Iterator r2 = r2.iterator()
            L9:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L21
                java.lang.Object r0 = r2.next()
                r1 = r0
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r1 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) r1
                kotlin.reflect.jvm.internal.impl.name.c r1 = r1.d()
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
                if (r1 == 0) goto L9
                goto L22
            L21:
                r0 = 0
            L22:
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r0 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) r0
                return r0
        }

        public static boolean b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2) {
                java.lang.String r0 = "fqName"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r1 = r1.b(r2)
                if (r1 == 0) goto Ld
                r1 = 1
                return r1
            Ld:
                r1 = 0
                return r1
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.a.a
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0 = r0
            return
    }

    @org.jetbrains.annotations.Nullable
    kotlin.reflect.jvm.internal.impl.descriptors.annotations.c b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r1);

    boolean isEmpty();

    boolean l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r1);
}
