package kotlin.reflect.jvm.internal.impl.name;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class g {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.name.g a = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.text.Regex b = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String c = null;

    static {
            kotlin.reflect.jvm.internal.impl.name.g r0 = new kotlin.reflect.jvm.internal.impl.name.g
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.name.g.a = r0
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r1 = "[^\\p{L}\\p{Digit}]"
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.name.g.b = r0
            java.lang.String r0 = "$context_receiver"
            kotlin.reflect.jvm.internal.impl.name.g.c = r0
            return
    }

    private g() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.name.f a(int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = kotlin.reflect.jvm.internal.impl.name.g.c
            r0.append(r1)
            r1 = 95
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            kotlin.reflect.jvm.internal.impl.name.f r2 = kotlin.reflect.jvm.internal.impl.name.f.h(r2)
            java.lang.String r0 = "identifier(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            return r2
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String b(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.text.Regex r0 = kotlin.reflect.jvm.internal.impl.name.g.b
            java.lang.String r1 = "_"
            java.lang.String r2 = r0.replace(r2, r1)
            return r2
    }
}
