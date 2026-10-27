package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class h {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.d a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.e1 d;

    public h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r5) {
            r1 = this;
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "classProto"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "metadataVersion"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "sourceElement"
            kotlin.jvm.internal.g0.p(r5, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.d a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a c() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.e1 d() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r0 = r1.d
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.h
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.h r5 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.h) r5
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r1 = r4.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r3 = r5.a
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r1 = r4.b
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r3 = r5.b
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r1 = r4.c
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r3 = r5.c
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r1 = r4.d
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r5 = r5.d
            boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
            if (r5 != 0) goto L38
            return r2
        L38:
            return r0
    }

    public int hashCode() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r1 = r2.b
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r1 = r2.c
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r1 = r2.d
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ClassData(nameResolver="
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", classProto="
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", metadataVersion="
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", sourceElement="
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r1 = r2.d
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
