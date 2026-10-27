package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SavedStateViewModelFactoryKt {

    @org.jetbrains.annotations.NotNull
    private static final java.util.List<java.lang.Class<?>> ANDROID_VIEWMODEL_SIGNATURE = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.List<java.lang.Class<?>> VIEWMODEL_SIGNATURE = null;

    static {
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<android.app.Application> r1 = android.app.Application.class
            r2 = 0
            r0[r2] = r1
            r1 = 1
            java.lang.Class<androidx.lifecycle.SavedStateHandle> r2 = androidx.lifecycle.SavedStateHandle.class
            r0[r1] = r2
            java.util.List r0 = kotlin.collections.f0.Q(r0)
            androidx.lifecycle.SavedStateViewModelFactoryKt.ANDROID_VIEWMODEL_SIGNATURE = r0
            java.util.List r0 = kotlin.collections.f0.l(r2)
            androidx.lifecycle.SavedStateViewModelFactoryKt.VIEWMODEL_SIGNATURE = r0
            return
    }

    public static final /* synthetic */ java.util.List access$getANDROID_VIEWMODEL_SIGNATURE$p() {
            java.util.List<java.lang.Class<?>> r0 = androidx.lifecycle.SavedStateViewModelFactoryKt.ANDROID_VIEWMODEL_SIGNATURE
            return r0
    }

    public static final /* synthetic */ java.util.List access$getVIEWMODEL_SIGNATURE$p() {
            java.util.List<java.lang.Class<?>> r0 = androidx.lifecycle.SavedStateViewModelFactoryKt.VIEWMODEL_SIGNATURE
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.reflect.Constructor<T> findMatchingConstructor(@org.jetbrains.annotations.NotNull java.lang.Class<T> r6, @org.jetbrains.annotations.NotNull java.util.List<? extends java.lang.Class<?>> r7) {
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "signature"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.reflect.Constructor[] r0 = r6.getConstructors()
            java.lang.String r1 = "modelClass.constructors"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r1 = r0.length
            r2 = 0
        L15:
            if (r2 >= r1) goto L6c
            r3 = r0[r2]
            java.lang.Class[] r4 = r3.getParameterTypes()
            java.lang.String r5 = "constructor.parameterTypes"
            kotlin.jvm.internal.g0.o(r4, r5)
            java.util.List r4 = kotlin.collections.n.dz(r4)
            boolean r5 = kotlin.jvm.internal.g0.g(r7, r4)
            if (r5 == 0) goto L32
            java.lang.String r6 = "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>"
            kotlin.jvm.internal.g0.n(r3, r6)
            return r3
        L32:
            int r3 = r7.size()
            int r5 = r4.size()
            if (r3 != r5) goto L69
            r3 = r7
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r4.containsAll(r3)
            if (r3 != 0) goto L46
            goto L69
        L46:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Class "
            r1.append(r2)
            java.lang.String r6 = r6.getSimpleName()
            r1.append(r6)
            java.lang.String r6 = " must have parameters in the proper order: "
            r1.append(r6)
            r1.append(r7)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L69:
            int r2 = r2 + 1
            goto L15
        L6c:
            r6 = 0
            return r6
    }

    public static final <T extends androidx.lifecycle.ViewModel> T newInstance(@org.jetbrains.annotations.NotNull java.lang.Class<T> r2, @org.jetbrains.annotations.NotNull java.lang.reflect.Constructor<T> r3, @org.jetbrains.annotations.NotNull java.lang.Object... r4) {
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "constructor"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "params"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.length     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.InstantiationException -> L1d java.lang.IllegalAccessException -> L1f
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.InstantiationException -> L1d java.lang.IllegalAccessException -> L1f
            java.lang.Object r3 = r3.newInstance(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.InstantiationException -> L1d java.lang.IllegalAccessException -> L1f
            androidx.lifecycle.ViewModel r3 = (androidx.lifecycle.ViewModel) r3     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.InstantiationException -> L1d java.lang.IllegalAccessException -> L1f
            return r3
        L1b:
            r3 = move-exception
            goto L21
        L1d:
            r3 = move-exception
            goto L3c
        L1f:
            r3 = move-exception
            goto L58
        L21:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "An exception happened in constructor of "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.Throwable r3 = r3.getCause()
            r4.<init>(r2, r3)
            throw r4
        L3c:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "A "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = " cannot be instantiated."
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r4.<init>(r2, r3)
            throw r4
        L58:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to access "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r4.<init>(r2, r3)
            throw r4
    }
}
