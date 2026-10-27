package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d0 extends kotlin.reflect.jvm.internal.impl.resolve.constants.f0<java.lang.Long> {
    public d0(long r1) {
            r0 = this;
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.<init>(r1)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t0 getType(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r2) {
            r1 = this;
            java.lang.String r0 = "module"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.name.b r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.G0
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = kotlin.reflect.jvm.internal.impl.descriptors.x.b(r2, r0)
            if (r2 == 0) goto L14
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r2.s()
            if (r2 == 0) goto L14
            return r2
        L14:
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r2 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE
            java.lang.String r0 = "ULong"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            kotlin.reflect.jvm.internal.impl.types.error.g r2 = kotlin.reflect.jvm.internal.impl.types.error.i.d(r2, r0)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r3.a()
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            r0.append(r1)
            java.lang.String r1 = ".toULong()"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
