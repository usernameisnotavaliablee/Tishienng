package androidx.navigation;

import androidx.navigation.NavArgs;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class NavArgsLazy<Args extends androidx.navigation.NavArgs> implements kotlin.s<Args> {
    private final kotlin.jvm.functions.Function0<android.os.Bundle> argumentProducer;
    private Args cached;
    private final kotlin.reflect.d<Args> navArgsClass;

    public NavArgsLazy(@org.jetbrains.annotations.NotNull kotlin.reflect.d<Args> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<android.os.Bundle> r3) {
            r1 = this;
            java.lang.String r0 = "navArgsClass"
            kotlin.jvm.internal.g0.q(r2, r0)
            java.lang.String r0 = "argumentProducer"
            kotlin.jvm.internal.g0.q(r3, r0)
            r1.<init>()
            r1.navArgsClass = r2
            r1.argumentProducer = r3
            return
    }

    @org.jetbrains.annotations.NotNull
    public Args getValue() {
            r4 = this;
            Args extends androidx.navigation.NavArgs r0 = r4.cached
            if (r0 != 0) goto L5a
            kotlin.jvm.functions.Function0<android.os.Bundle> r0 = r4.argumentProducer
            java.lang.Object r0 = r0.invoke()
            android.os.Bundle r0 = (android.os.Bundle) r0
            androidx.collection.ArrayMap r1 = androidx.navigation.NavArgsLazyKt.getMethodMap()
            kotlin.reflect.d<Args extends androidx.navigation.NavArgs> r2 = r4.navArgsClass
            java.lang.Object r1 = r1.get(r2)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 == 0) goto L1b
            goto L40
        L1b:
            kotlin.reflect.d<Args extends androidx.navigation.NavArgs> r1 = r4.navArgsClass
            java.lang.Class r1 = k3.a.e(r1)
            java.lang.Class[] r2 = androidx.navigation.NavArgsLazyKt.getMethodSignature()
            int r3 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.lang.Class[] r2 = (java.lang.Class[]) r2
            java.lang.String r3 = "fromBundle"
            java.lang.reflect.Method r1 = r1.getMethod(r3, r2)
            androidx.collection.ArrayMap r2 = androidx.navigation.NavArgsLazyKt.getMethodMap()
            kotlin.reflect.d<Args extends androidx.navigation.NavArgs> r3 = r4.navArgsClass
            r2.put(r3, r1)
            java.lang.String r2 = "navArgsClass.java.getMet…hod\n                    }"
            kotlin.jvm.internal.g0.h(r1, r2)
        L40:
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 0
            java.lang.Object r0 = r1.invoke(r0, r2)
            if (r0 == 0) goto L52
            androidx.navigation.NavArgs r0 = (androidx.navigation.NavArgs) r0
            r4.cached = r0
            return r0
        L52:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type Args"
            r0.<init>(r1)
            throw r0
        L5a:
            return r0
    }

    /* renamed from: getValue, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m68getValue() {
            r1 = this;
            androidx.navigation.NavArgs r0 = r1.getValue()
            return r0
    }

    public boolean isInitialized() {
            r1 = this;
            Args extends androidx.navigation.NavArgs r0 = r1.cached
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }
}
