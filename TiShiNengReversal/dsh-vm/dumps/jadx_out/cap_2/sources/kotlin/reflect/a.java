package kotlin.reflect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.ExperimentalStdlibApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class a implements java.lang.reflect.GenericArrayType, kotlin.reflect.v {

    @org.jetbrains.annotations.NotNull
    private final java.lang.reflect.Type a;

    public a(@org.jetbrains.annotations.NotNull java.lang.reflect.Type r2) {
            r1 = this;
            java.lang.String r0 = "elementType"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L16
            java.lang.reflect.Type r0 = r1.getGenericComponentType()
            java.lang.reflect.GenericArrayType r2 = (java.lang.reflect.GenericArrayType) r2
            java.lang.reflect.Type r2 = r2.getGenericComponentType()
            boolean r2 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r2 == 0) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    @Override // java.lang.reflect.GenericArrayType
    @org.jetbrains.annotations.NotNull
    public java.lang.reflect.Type getGenericComponentType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.a
            return r0
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.v
    @org.jetbrains.annotations.NotNull
    public java.lang.String getTypeName() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.reflect.Type r1 = r2.a
            java.lang.String r1 = kotlin.reflect.y.b(r1)
            r0.append(r1)
            java.lang.String r1 = "[]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.getGenericComponentType()
            int r0 = r0.hashCode()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.getTypeName()
            return r0
    }
}
