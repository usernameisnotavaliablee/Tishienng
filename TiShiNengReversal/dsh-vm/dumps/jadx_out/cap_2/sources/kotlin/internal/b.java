package kotlin.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlin.internal.a a = null;

    static {
            kotlin.internal.jdk8.d r0 = new kotlin.internal.jdk8.d
            r0.<init>()
            kotlin.internal.b.a = r0
            return
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.PublishedApi
    public static final boolean a(int r1, int r2, int r3) {
            kotlin.p r0 = kotlin.p.g
            boolean r1 = r0.i(r1, r2, r3)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final /* synthetic */ <T> T b(java.lang.Object r5) {
            java.lang.String r0 = "T"
            r1 = 1
            kotlin.jvm.internal.g0.y(r1, r0)     // Catch: java.lang.ClassCastException -> L7
            return r5
        L7:
            r1 = move-exception
            java.lang.Class r5 = r5.getClass()
            java.lang.ClassLoader r5 = r5.getClassLoader()
            r2 = 4
            kotlin.jvm.internal.g0.y(r2, r0)
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            boolean r2 = kotlin.jvm.internal.g0.g(r5, r0)
            if (r2 != 0) goto L3f
            java.lang.ClassNotFoundException r2 = new java.lang.ClassNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Instance class was loaded from a different classloader: "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r5 = ", base type classloader: "
            r3.append(r5)
            r3.append(r0)
            java.lang.String r5 = r3.toString()
            r2.<init>(r5, r1)
            throw r2
        L3f:
            throw r1
    }
}
