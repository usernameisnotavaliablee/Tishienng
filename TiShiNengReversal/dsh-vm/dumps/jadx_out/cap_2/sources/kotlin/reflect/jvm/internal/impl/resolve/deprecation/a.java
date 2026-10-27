package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class a implements java.lang.Comparable<kotlin.reflect.jvm.internal.impl.resolve.deprecation.a> {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public int a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.deprecation.a r3) {
            r2 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue r0 = r2.b()
            kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue r1 = r3.b()
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L21
            boolean r1 = r2.c()
            if (r1 != 0) goto L21
            boolean r3 = r3.c()
            if (r3 == 0) goto L21
            r3 = 1
            return r3
        L21:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public abstract kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue b();

    public abstract boolean c();

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(kotlin.reflect.jvm.internal.impl.resolve.deprecation.a r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.resolve.deprecation.a r1 = (kotlin.reflect.jvm.internal.impl.resolve.deprecation.a) r1
            int r1 = r0.a(r1)
            return r1
    }
}
