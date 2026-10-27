package kotlin.reflect.jvm.internal.impl.km.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.d a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.j c;
    private final boolean d;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.km.internal.e e;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Object> f;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.Integer, java.lang.Integer> g;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.p> h;

    public e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r4, boolean r5, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.km.internal.e r6, @org.jetbrains.annotations.NotNull java.util.List<? extends java.lang.Object> r7) {
            r1 = this;
            java.lang.String r0 = "strings"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "types"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "versionRequirements"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "contextExtensions"
            kotlin.jvm.internal.g0.p(r7, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            r1.e = r6
            r1.f = r7
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.g = r2
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.p$a r2 = kotlin.reflect.jvm.internal.impl.km.internal.extensions.p.a
            java.util.List r2 = r2.c()
            r1.h = r2
            return
    }

    public /* synthetic */ e(kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r8, kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r9, kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r10, boolean r11, kotlin.reflect.jvm.internal.impl.km.internal.e r12, java.util.List r13, int r14, kotlin.jvm.internal.v r15) {
            r7 = this;
            r15 = r14 & 16
            if (r15 == 0) goto L5
            r12 = 0
        L5:
            r5 = r12
            r12 = r14 & 32
            if (r12 == 0) goto Le
            java.util.List r13 = kotlin.collections.f0.J()
        Le:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String a(int r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r0 = r1.a
            java.lang.String r2 = kotlin.reflect.jvm.internal.impl.km.internal.f.a(r0, r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String b(int r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r0 = r1.a
            java.lang.String r2 = r0.getString(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.p> c() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.p> r0 = r1.h
            return r0
    }

    public final boolean d() {
            r1 = this;
            boolean r0 = r1.d
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.d e() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer f(int r3) {
            r2 = this;
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r2.g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L19
            kotlin.reflect.jvm.internal.impl.km.internal.e r0 = r2.e
            if (r0 == 0) goto L17
            java.lang.Integer r3 = r0.f(r3)
            return r3
        L17:
            r3 = 0
            return r3
        L19:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h g() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.j h() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.km.internal.e i(@org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> r9) {
            r8 = this;
            java.lang.String r0 = "typeParameters"
            kotlin.jvm.internal.g0.p(r9, r0)
            kotlin.reflect.jvm.internal.impl.km.internal.e r1 = new kotlin.reflect.jvm.internal.impl.km.internal.e
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r2 = r8.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r3 = r8.b
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r4 = r8.c
            boolean r5 = r8.d
            java.util.List<java.lang.Object> r7 = r8.f
            r6 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.util.Iterator r9 = r9.iterator()
        L19:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r9.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter) r0
            java.util.Map<java.lang.Integer, java.lang.Integer> r2 = r1.g
            int r3 = r0.getName()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r0 = r0.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.put(r3, r0)
            goto L19
        L3b:
            return r1
    }
}
