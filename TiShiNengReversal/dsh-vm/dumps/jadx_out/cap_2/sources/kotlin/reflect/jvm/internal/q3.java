package kotlin.reflect.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class q3 {

    @org.jetbrains.annotations.NotNull
    private final java.lang.ref.WeakReference<java.lang.ClassLoader> a;
    private final int b;

    @org.jetbrains.annotations.Nullable
    private java.lang.ClassLoader c;

    public q3(@org.jetbrains.annotations.NotNull java.lang.ClassLoader r2) {
            r1 = this;
            java.lang.String r0 = "classLoader"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.a = r0
            int r0 = java.lang.System.identityHashCode(r2)
            r1.b = r0
            r1.c = r2
            return
    }

    public final void a(@org.jetbrains.annotations.Nullable java.lang.ClassLoader r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.q3
            if (r0 == 0) goto L16
            java.lang.ref.WeakReference<java.lang.ClassLoader> r0 = r1.a
            java.lang.Object r0 = r0.get()
            kotlin.reflect.jvm.internal.q3 r2 = (kotlin.reflect.jvm.internal.q3) r2
            java.lang.ref.WeakReference<java.lang.ClassLoader> r2 = r2.a
            java.lang.Object r2 = r2.get()
            if (r0 != r2) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.ref.WeakReference<java.lang.ClassLoader> r0 = r1.a
            java.lang.Object r0 = r0.get()
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L11
            goto L12
        L11:
            return r0
        L12:
            java.lang.String r0 = "<null>"
            return r0
    }
}
