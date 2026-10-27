package kotlin.reflect.jvm.internal.impl.load.java;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class h0 {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.java.h0 a = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.name.c b = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.name.b c = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.name.b d = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.name.b e = null;

    static {
            kotlin.reflect.jvm.internal.impl.load.java.h0 r0 = new kotlin.reflect.jvm.internal.impl.load.java.h0
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.load.java.h0.a = r0
            kotlin.reflect.jvm.internal.impl.name.c r0 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r1 = "kotlin.jvm.JvmField"
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.load.java.h0.b = r0
            kotlin.reflect.jvm.internal.impl.name.b$a r1 = kotlin.reflect.jvm.internal.impl.name.b.d
            kotlin.reflect.jvm.internal.impl.name.b r0 = r1.c(r0)
            kotlin.reflect.jvm.internal.impl.load.java.h0.c = r0
            kotlin.reflect.jvm.internal.impl.name.c r0 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r2 = "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"
            r0.<init>(r2)
            kotlin.reflect.jvm.internal.impl.name.b r0 = r1.c(r0)
            kotlin.reflect.jvm.internal.impl.load.java.h0.d = r0
            r0 = 2
            r2 = 0
            java.lang.String r3 = "kotlin/jvm/internal/RepeatableContainer"
            r4 = 0
            kotlin.reflect.jvm.internal.impl.name.b r0 = kotlin.reflect.jvm.internal.impl.name.b.a.b(r1, r3, r4, r0, r2)
            kotlin.reflect.jvm.internal.impl.load.java.h0.e = r0
            return
    }

    private h0() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String b(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "propertyName"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = f(r2)
            if (r0 == 0) goto Lc
            return r2
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "get"
            r0.append(r1)
            java.lang.String r2 = e4.a.a(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @kotlin.jvm.JvmStatic
    public static final boolean c(@org.jetbrains.annotations.NotNull java.lang.String r4) {
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "get"
            r1 = 0
            r2 = 2
            r3 = 0
            boolean r0 = kotlin.text.u.H2(r4, r0, r1, r2, r3)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "is"
            boolean r4 = kotlin.text.u.H2(r4, r0, r1, r2, r3)
            if (r4 == 0) goto L19
            goto L1a
        L19:
            return r1
        L1a:
            r4 = 1
            return r4
    }

    @kotlin.jvm.JvmStatic
    public static final boolean d(@org.jetbrains.annotations.NotNull java.lang.String r4) {
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 2
            r1 = 0
            java.lang.String r2 = "set"
            r3 = 0
            boolean r4 = kotlin.text.u.H2(r4, r2, r3, r0, r1)
            return r4
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String e(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "propertyName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "set"
            r0.append(r1)
            boolean r1 = f(r2)
            if (r1 == 0) goto L20
            r1 = 2
            java.lang.String r2 = r2.substring(r1)
            java.lang.String r1 = "substring(...)"
            kotlin.jvm.internal.g0.o(r2, r1)
            goto L24
        L20:
            java.lang.String r2 = e4.a.a(r2)
        L24:
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @kotlin.jvm.JvmStatic
    public static final boolean f(@org.jetbrains.annotations.NotNull java.lang.String r4) {
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 0
            java.lang.String r1 = "is"
            r2 = 0
            r3 = 2
            boolean r0 = kotlin.text.u.H2(r4, r1, r2, r3, r0)
            if (r0 != 0) goto L11
            return r2
        L11:
            int r0 = r4.length()
            if (r0 != r3) goto L18
            return r2
        L18:
            char r4 = r4.charAt(r3)
            r0 = 97
            int r0 = kotlin.jvm.internal.g0.t(r0, r4)
            if (r0 > 0) goto L2e
            r0 = 122(0x7a, float:1.71E-43)
            int r4 = kotlin.jvm.internal.g0.t(r4, r0)
            if (r4 <= 0) goto L2d
            goto L2e
        L2d:
            return r2
        L2e:
            r4 = 1
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.b a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.b r0 = kotlin.reflect.jvm.internal.impl.load.java.h0.e
            return r0
    }
}
