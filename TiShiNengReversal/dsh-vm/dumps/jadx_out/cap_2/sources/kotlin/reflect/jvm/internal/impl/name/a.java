package kotlin.reflect.jvm.internal.impl.name;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCallableId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallableId.kt\norg/jetbrains/kotlin/name/CallableId\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.name.a.C0057a f = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.name.f g = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.name.c h = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.name.c a;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.name.c b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.name.f c;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.name.b d;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.name.c e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCallableId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallableId.kt\norg/jetbrains/kotlin/name/CallableId$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
    /* renamed from: kotlin.reflect.jvm.internal.impl.name.a$a, reason: collision with other inner class name */
    public static final class C0057a {
        private C0057a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C0057a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.name.a$a r0 = new kotlin.reflect.jvm.internal.impl.name.a$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.name.a.f = r0
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.name.h.n
            kotlin.reflect.jvm.internal.impl.name.a.g = r0
            kotlin.reflect.jvm.internal.impl.name.c$a r1 = kotlin.reflect.jvm.internal.impl.name.c.c
            kotlin.reflect.jvm.internal.impl.name.c r0 = r1.a(r0)
            kotlin.reflect.jvm.internal.impl.name.a.h = r0
            return
    }

    private a(kotlin.reflect.jvm.internal.impl.name.c r1, kotlin.reflect.jvm.internal.impl.name.c r2, kotlin.reflect.jvm.internal.impl.name.f r3, kotlin.reflect.jvm.internal.impl.name.b r4, kotlin.reflect.jvm.internal.impl.name.c r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r9) {
            r7 = this;
            java.lang.String r0 = "packageName"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "callableName"
            kotlin.jvm.internal.g0.p(r9, r0)
            r5 = 0
            r6 = 0
            r3 = 0
            r1 = r7
            r2 = r8
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.name.a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.reflect.jvm.internal.impl.name.c r1 = r4.a
            kotlin.reflect.jvm.internal.impl.name.a r5 = (kotlin.reflect.jvm.internal.impl.name.a) r5
            kotlin.reflect.jvm.internal.impl.name.c r3 = r5.a
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 == 0) goto L2b
            kotlin.reflect.jvm.internal.impl.name.c r1 = r4.b
            kotlin.reflect.jvm.internal.impl.name.c r3 = r5.b
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 == 0) goto L2b
            kotlin.reflect.jvm.internal.impl.name.f r1 = r4.c
            kotlin.reflect.jvm.internal.impl.name.f r5 = r5.c
            boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
            if (r5 == 0) goto L2b
            return r0
        L2b:
            return r2
    }

    public int hashCode() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = r2.a
            int r0 = r0.hashCode()
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            kotlin.reflect.jvm.internal.impl.name.c r0 = r2.b
            if (r0 == 0) goto L14
            int r0 = r0.hashCode()
            goto L15
        L14:
            r0 = 0
        L15:
            int r1 = r1 + r0
            int r1 = r1 * 31
            kotlin.reflect.jvm.internal.impl.name.f r0 = r2.c
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.name.c r1 = r8.a
            java.lang.String r2 = r1.a()
            r6 = 4
            r7 = 0
            r3 = 46
            r4 = 47
            r5 = 0
            java.lang.String r1 = kotlin.text.u.w2(r2, r3, r4, r5, r6, r7)
            r0.append(r1)
            java.lang.String r1 = "/"
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.name.c r1 = r8.b
            if (r1 == 0) goto L2a
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
        L2a:
            kotlin.reflect.jvm.internal.impl.name.f r1 = r8.c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
