package kotlin.reflect.jvm.internal.impl.km;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class x {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.km.x.a c = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.km.x d = null;

    @org.jetbrains.annotations.Nullable
    private kotlin.reflect.jvm.internal.impl.km.KmVariance a;

    @org.jetbrains.annotations.Nullable
    private kotlin.reflect.jvm.internal.impl.km.u b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.km.x$a r0 = new kotlin.reflect.jvm.internal.impl.km.x$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.km.x.c = r0
            kotlin.reflect.jvm.internal.impl.km.x r0 = new kotlin.reflect.jvm.internal.impl.km.x
            r0.<init>(r1, r1)
            kotlin.reflect.jvm.internal.impl.km.x.d = r0
            return
    }

    public x(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.km.KmVariance r1, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.km.u r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.km.KmVariance a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.KmVariance r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.km.u b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.u r0 = r1.b
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.km.x
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.reflect.jvm.internal.impl.km.x r5 = (kotlin.reflect.jvm.internal.impl.km.x) r5
            kotlin.reflect.jvm.internal.impl.km.KmVariance r1 = r4.a
            kotlin.reflect.jvm.internal.impl.km.KmVariance r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            kotlin.reflect.jvm.internal.impl.km.u r1 = r4.b
            kotlin.reflect.jvm.internal.impl.km.u r5 = r5.b
            boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
            if (r5 != 0) goto L1e
            return r2
        L1e:
            return r0
    }

    public int hashCode() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.km.KmVariance r0 = r3.a
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            kotlin.reflect.jvm.internal.impl.km.u r2 = r3.b
            if (r2 != 0) goto L12
            goto L16
        L12:
            int r1 = r2.hashCode()
        L16:
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "KmTypeProjection(variance="
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.km.KmVariance r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.km.u r1 = r2.b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
