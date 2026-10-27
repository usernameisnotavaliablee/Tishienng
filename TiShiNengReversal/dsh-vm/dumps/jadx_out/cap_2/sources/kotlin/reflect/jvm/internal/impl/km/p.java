package kotlin.reflect.jvm.internal.impl.km;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class p {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.km.p.a c = null;

    @org.jetbrains.annotations.NotNull
    private kotlin.reflect.jvm.internal.impl.km.u a;

    @org.jetbrains.annotations.Nullable
    private java.lang.String b;

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
            kotlin.reflect.jvm.internal.impl.km.p$a r0 = new kotlin.reflect.jvm.internal.impl.km.p$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.km.p.c = r0
            return
    }

    public p(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.u r2, @org.jetbrains.annotations.Nullable java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.km.p
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.reflect.jvm.internal.impl.km.p r5 = (kotlin.reflect.jvm.internal.impl.km.p) r5
            kotlin.reflect.jvm.internal.impl.km.u r1 = r4.a
            kotlin.reflect.jvm.internal.impl.km.u r3 = r5.a
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.b
            java.lang.String r5 = r5.b
            boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.km.u getType() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.u r0 = r1.a
            return r0
    }

    public int hashCode() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.km.u r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.b
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "KmFlexibleTypeUpperBound(type="
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.km.u r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", typeFlexibilityId="
            r0.append(r1)
            java.lang.String r1 = r2.b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
