package kotlin.reflect.jvm.internal.impl.load.java;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class r implements kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition {
    public r() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract r0 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract.BOTH
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r3, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.d r4) {
            r1 = this;
            java.lang.String r4 = "superDescriptor"
            kotlin.jvm.internal.g0.p(r2, r4)
            java.lang.String r4 = "subDescriptor"
            kotlin.jvm.internal.g0.p(r3, r4)
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.w0
            if (r4 == 0) goto L4a
            boolean r4 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.w0
            if (r4 != 0) goto L13
            goto L4a
        L13:
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r3
            kotlin.reflect.jvm.internal.impl.name.f r4 = r3.getName()
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r2
            kotlin.reflect.jvm.internal.impl.name.f r0 = r2.getName()
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r0)
            if (r4 != 0) goto L28
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r2 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN
            return r2
        L28:
            boolean r4 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d.a(r3)
            if (r4 == 0) goto L37
            boolean r4 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d.a(r2)
            if (r4 == 0) goto L37
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r2 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.OVERRIDABLE
            return r2
        L37:
            boolean r3 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d.a(r3)
            if (r3 != 0) goto L47
            boolean r2 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d.a(r2)
            if (r2 == 0) goto L44
            goto L47
        L44:
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r2 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN
            return r2
        L47:
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r2 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.INCOMPATIBLE
            return r2
        L4a:
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r2 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN
            return r2
    }
}
