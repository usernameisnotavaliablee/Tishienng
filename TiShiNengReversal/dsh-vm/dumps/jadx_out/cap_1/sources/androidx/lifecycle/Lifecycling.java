package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Lifecycling {
    private static final int GENERATED_CALLBACK = 2;

    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.Lifecycling INSTANCE = null;
    private static final int REFLECTIVE_CALLBACK = 1;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<java.lang.Class<?>, java.lang.Integer> callbackCache = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> classToAdapters = null;

    static {
            androidx.lifecycle.Lifecycling r0 = new androidx.lifecycle.Lifecycling
            r0.<init>()
            androidx.lifecycle.Lifecycling.INSTANCE = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.lifecycle.Lifecycling.callbackCache = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.lifecycle.Lifecycling.classToAdapters = r0
            return
    }

    private Lifecycling() {
            r0 = this;
            r0.<init>()
            return
    }

    private final androidx.lifecycle.GeneratedAdapter createGeneratedAdapter(java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter> r3, java.lang.Object r4) {
            r2 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L13 java.lang.InstantiationException -> L15 java.lang.IllegalAccessException -> L17
            r1 = 0
            r0[r1] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L13 java.lang.InstantiationException -> L15 java.lang.IllegalAccessException -> L17
            java.lang.Object r3 = r3.newInstance(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L13 java.lang.InstantiationException -> L15 java.lang.IllegalAccessException -> L17
            java.lang.String r4 = "{\n            constructo…tance(`object`)\n        }"
            kotlin.jvm.internal.g0.o(r3, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L13 java.lang.InstantiationException -> L15 java.lang.IllegalAccessException -> L17
            androidx.lifecycle.GeneratedAdapter r3 = (androidx.lifecycle.GeneratedAdapter) r3     // Catch: java.lang.reflect.InvocationTargetException -> L13 java.lang.InstantiationException -> L15 java.lang.IllegalAccessException -> L17
            return r3
        L13:
            r3 = move-exception
            goto L19
        L15:
            r3 = move-exception
            goto L1f
        L17:
            r3 = move-exception
            goto L25
        L19:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
        L1f:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
        L25:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
    }

    private final java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter> generatedConstructor(java.lang.Class<?> r5) {
            r4 = this;
            java.lang.Package r0 = r5.getPackage()     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L79
            java.lang.String r1 = r5.getCanonicalName()     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L79
            if (r0 == 0) goto L11
            java.lang.String r0 = r0.getName()     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L79
            goto L13
        Lf:
            r5 = move-exception
            goto L73
        L11:
            java.lang.String r0 = ""
        L13:
            java.lang.String r2 = "fullPackage"
            kotlin.jvm.internal.g0.o(r0, r2)     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L79
            int r2 = r0.length()     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L79
            r3 = 1
            if (r2 != 0) goto L20
            goto L33
        L20:
            java.lang.String r2 = "name"
            kotlin.jvm.internal.g0.o(r1, r2)     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L79
            int r2 = r0.length()     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L79
            int r2 = r2 + r3
            java.lang.String r1 = r1.substring(r2)     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L79
            java.lang.String r2 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.g0.o(r1, r2)     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L79
        L33:
            java.lang.String r2 = "if (fullPackage.isEmpty(…g(fullPackage.length + 1)"
            kotlin.jvm.internal.g0.o(r1, r2)     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L79
            java.lang.String r1 = getAdapterName(r1)     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L79
            int r2 = r0.length()     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L79
            if (r2 != 0) goto L43
            goto L57
        L43:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L79
            r2.<init>()     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L79
            r2.append(r0)     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L79
            r0 = 46
            r2.append(r0)     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L79
            r2.append(r1)     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L79
            java.lang.String r1 = r2.toString()     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L79
        L57:
            java.lang.Class r0 = java.lang.Class.forName(r1)     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L79
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>"
            kotlin.jvm.internal.g0.n(r0, r1)     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L79
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L79
            r2 = 0
            r1[r2] = r5     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L79
            java.lang.reflect.Constructor r5 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L79
            boolean r0 = r5.isAccessible()     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L79
            if (r0 != 0) goto L72
            r5.setAccessible(r3)     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L79
        L72:
            return r5
        L73:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r5)
            throw r0
        L79:
            r5 = 0
            return r5
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getAdapterName(@org.jetbrains.annotations.NotNull java.lang.String r7) {
            java.lang.String r0 = "className"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r5 = 4
            r6 = 0
            java.lang.String r2 = "."
            java.lang.String r3 = "_"
            r4 = 0
            r1 = r7
            java.lang.String r7 = kotlin.text.u.x2(r1, r2, r3, r4, r5, r6)
            r0.append(r7)
            java.lang.String r7 = "_LifecycleAdapter"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            return r7
    }

    private final int getObserverConstructorType(java.lang.Class<?> r4) {
            r3 = this;
            java.util.Map<java.lang.Class<?>, java.lang.Integer> r0 = androidx.lifecycle.Lifecycling.callbackCache
            java.lang.Object r1 = r0.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto Lf
            int r4 = r1.intValue()
            return r4
        Lf:
            int r1 = r3.resolveObserverCallbackType(r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.put(r4, r2)
            return r1
    }

    private final boolean isLifecycleParent(java.lang.Class<?> r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            java.lang.Class<androidx.lifecycle.LifecycleObserver> r0 = androidx.lifecycle.LifecycleObserver.class
            boolean r2 = r0.isAssignableFrom(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.LifecycleEventObserver lifecycleEventObserver(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            java.lang.String r0 = "object"
            kotlin.jvm.internal.g0.p(r6, r0)
            boolean r0 = r6 instanceof androidx.lifecycle.LifecycleEventObserver
            boolean r1 = r6 instanceof androidx.lifecycle.DefaultLifecycleObserver
            if (r0 == 0) goto L18
            if (r1 == 0) goto L18
            androidx.lifecycle.DefaultLifecycleObserverAdapter r0 = new androidx.lifecycle.DefaultLifecycleObserverAdapter
            r1 = r6
            androidx.lifecycle.DefaultLifecycleObserver r1 = (androidx.lifecycle.DefaultLifecycleObserver) r1
            androidx.lifecycle.LifecycleEventObserver r6 = (androidx.lifecycle.LifecycleEventObserver) r6
            r0.<init>(r1, r6)
            return r0
        L18:
            if (r1 == 0) goto L23
            androidx.lifecycle.DefaultLifecycleObserverAdapter r0 = new androidx.lifecycle.DefaultLifecycleObserverAdapter
            androidx.lifecycle.DefaultLifecycleObserver r6 = (androidx.lifecycle.DefaultLifecycleObserver) r6
            r1 = 0
            r0.<init>(r6, r1)
            return r0
        L23:
            if (r0 == 0) goto L28
            androidx.lifecycle.LifecycleEventObserver r6 = (androidx.lifecycle.LifecycleEventObserver) r6
            return r6
        L28:
            java.lang.Class r0 = r6.getClass()
            androidx.lifecycle.Lifecycling r1 = androidx.lifecycle.Lifecycling.INSTANCE
            int r2 = r1.getObserverConstructorType(r0)
            r3 = 2
            if (r2 != r3) goto L77
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r2 = androidx.lifecycle.Lifecycling.classToAdapters
            java.lang.Object r0 = r2.get(r0)
            kotlin.jvm.internal.g0.m(r0)
            java.util.List r0 = (java.util.List) r0
            int r2 = r0.size()
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L58
            java.lang.Object r0 = r0.get(r3)
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            androidx.lifecycle.GeneratedAdapter r6 = r1.createGeneratedAdapter(r0, r6)
            androidx.lifecycle.SingleGeneratedAdapterObserver r0 = new androidx.lifecycle.SingleGeneratedAdapterObserver
            r0.<init>(r6)
            return r0
        L58:
            int r1 = r0.size()
            androidx.lifecycle.GeneratedAdapter[] r2 = new androidx.lifecycle.GeneratedAdapter[r1]
        L5e:
            if (r3 >= r1) goto L71
            androidx.lifecycle.Lifecycling r4 = androidx.lifecycle.Lifecycling.INSTANCE
            java.lang.Object r5 = r0.get(r3)
            java.lang.reflect.Constructor r5 = (java.lang.reflect.Constructor) r5
            androidx.lifecycle.GeneratedAdapter r4 = r4.createGeneratedAdapter(r5, r6)
            r2[r3] = r4
            int r3 = r3 + 1
            goto L5e
        L71:
            androidx.lifecycle.CompositeGeneratedAdaptersObserver r6 = new androidx.lifecycle.CompositeGeneratedAdaptersObserver
            r6.<init>(r2)
            return r6
        L77:
            androidx.lifecycle.ReflectiveGenericLifecycleObserver r0 = new androidx.lifecycle.ReflectiveGenericLifecycleObserver
            r0.<init>(r6)
            return r0
    }

    private final int resolveObserverCallbackType(java.lang.Class<?> r9) {
            r8 = this;
            java.lang.String r0 = r9.getCanonicalName()
            r1 = 1
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.reflect.Constructor r0 = r8.generatedConstructor(r9)
            r2 = 2
            if (r0 == 0) goto L19
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r1 = androidx.lifecycle.Lifecycling.classToAdapters
            java.util.List r0 = kotlin.collections.f0.l(r0)
            r1.put(r9, r0)
            return r2
        L19:
            androidx.lifecycle.ClassesInfoCache r0 = androidx.lifecycle.ClassesInfoCache.sInstance
            boolean r0 = r0.hasLifecycleMethods(r9)
            if (r0 == 0) goto L22
            return r1
        L22:
            java.lang.Class r0 = r9.getSuperclass()
            boolean r3 = r8.isLifecycleParent(r0)
            if (r3 == 0) goto L49
            java.lang.String r3 = "superclass"
            kotlin.jvm.internal.g0.o(r0, r3)
            int r3 = r8.getObserverConstructorType(r0)
            if (r3 != r1) goto L38
            return r1
        L38:
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r4 = androidx.lifecycle.Lifecycling.classToAdapters
            java.lang.Object r0 = r4.get(r0)
            kotlin.jvm.internal.g0.m(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            r3.<init>(r0)
            goto L4a
        L49:
            r3 = 0
        L4a:
            java.lang.Class[] r0 = r9.getInterfaces()
            java.lang.String r4 = "klass.interfaces"
            kotlin.jvm.internal.g0.o(r0, r4)
            int r4 = r0.length
            r5 = 0
        L55:
            if (r5 >= r4) goto L84
            r6 = r0[r5]
            boolean r7 = r8.isLifecycleParent(r6)
            if (r7 != 0) goto L60
            goto L81
        L60:
            java.lang.String r7 = "intrface"
            kotlin.jvm.internal.g0.o(r6, r7)
            int r7 = r8.getObserverConstructorType(r6)
            if (r7 != r1) goto L6c
            return r1
        L6c:
            if (r3 != 0) goto L73
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L73:
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r7 = androidx.lifecycle.Lifecycling.classToAdapters
            java.lang.Object r6 = r7.get(r6)
            kotlin.jvm.internal.g0.m(r6)
            java.util.Collection r6 = (java.util.Collection) r6
            r3.addAll(r6)
        L81:
            int r5 = r5 + 1
            goto L55
        L84:
            if (r3 == 0) goto L8c
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r0 = androidx.lifecycle.Lifecycling.classToAdapters
            r0.put(r9, r3)
            return r2
        L8c:
            return r1
    }
}
