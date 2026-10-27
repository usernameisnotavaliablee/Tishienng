package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class q<T> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.t<T> a;
    private int b;

    @org.jetbrains.annotations.Nullable
    private T c;

    public void a() {
            r0 = this;
            return
    }

    public void b() {
            r1 = this;
            T r0 = r1.c
            if (r0 != 0) goto La
            int r0 = r1.b
            int r0 = r0 + 1
            r1.b = r0
        La:
            return
    }

    public void c(@org.jetbrains.annotations.NotNull T r2) {
            r1 = this;
            java.lang.String r0 = "objectType"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.d(r2)
            return
    }

    protected final void d(@org.jetbrains.annotations.NotNull T r5) {
            r4 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r5, r0)
            T r0 = r4.c
            if (r0 != 0) goto L32
            int r0 = r4.b
            if (r0 <= 0) goto L30
            kotlin.reflect.jvm.internal.impl.load.kotlin.t<T> r0 = r4.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "["
            int r3 = r4.b
            java.lang.String r2 = kotlin.text.u.t2(r2, r3)
            r1.append(r2)
            kotlin.reflect.jvm.internal.impl.load.kotlin.t<T> r2 = r4.a
            java.lang.String r5 = r2.e(r5)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.Object r5 = r0.a(r5)
        L30:
            r4.c = r5
        L32:
            return
    }

    public void e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull T r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "type"
            kotlin.jvm.internal.g0.p(r3, r2)
            r1.d(r3)
            return
    }
}
