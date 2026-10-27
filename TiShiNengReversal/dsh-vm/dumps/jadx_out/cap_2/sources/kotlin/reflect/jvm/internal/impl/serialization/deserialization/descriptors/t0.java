package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class t0 {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t0.a c = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t0 d = null;
    private final boolean a;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> b;

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
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t0$a r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t0$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t0.c = r0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t0 r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t0
            r2 = 0
            r3 = 2
            r0.<init>(r2, r1, r3, r1)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t0.d = r0
            return
    }

    public t0(boolean r2, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r3) {
            r1 = this;
            java.lang.String r0 = "poisoningFeatures"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            return
    }

    public /* synthetic */ t0(boolean r1, java.util.List r2, int r3, kotlin.jvm.internal.v r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L8
            java.util.List r2 = kotlin.collections.f0.J()
        L8:
            r0.<init>(r1, r2)
            return
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t0 r5 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t0) r5
            boolean r1 = r4.a
            boolean r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.List<java.lang.String> r1 = r4.b
            java.util.List<java.lang.String> r5 = r5.b
            boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
            if (r5 != 0) goto L1e
            return r2
        L1e:
            return r0
    }

    public int hashCode() {
            r2 = this;
            boolean r0 = r2.a
            int r0 = kotlin.reflect.jvm.internal.impl.km.f.a(r0)
            int r0 = r0 * 31
            java.util.List<java.lang.String> r1 = r2.b
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PreReleaseInfo(isInvisible="
            r0.append(r1)
            boolean r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", poisoningFeatures="
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r2.b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
