package androidx.fragment.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class FragmentFactory {
    private static final androidx.collection.SimpleArrayMap<java.lang.ClassLoader, androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Class<?>>> sClassCacheMap = null;

    static {
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            androidx.fragment.app.FragmentFactory.sClassCacheMap = r0
            return
    }

    public FragmentFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean isFragmentClass(@androidx.annotation.NonNull java.lang.ClassLoader r0, @androidx.annotation.NonNull java.lang.String r1) {
            java.lang.Class r0 = loadClass(r0, r1)     // Catch: java.lang.ClassNotFoundException -> Lb
            java.lang.Class<androidx.fragment.app.Fragment> r1 = androidx.fragment.app.Fragment.class
            boolean r0 = r1.isAssignableFrom(r0)     // Catch: java.lang.ClassNotFoundException -> Lb
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    private static java.lang.Class<?> loadClass(@androidx.annotation.NonNull java.lang.ClassLoader r2, @androidx.annotation.NonNull java.lang.String r3) throws java.lang.ClassNotFoundException {
            androidx.collection.SimpleArrayMap<java.lang.ClassLoader, androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Class<?>>> r0 = androidx.fragment.app.FragmentFactory.sClassCacheMap
            java.lang.Object r1 = r0.get(r2)
            androidx.collection.SimpleArrayMap r1 = (androidx.collection.SimpleArrayMap) r1
            if (r1 != 0) goto L12
            androidx.collection.SimpleArrayMap r1 = new androidx.collection.SimpleArrayMap
            r1.<init>()
            r0.put(r2, r1)
        L12:
            java.lang.Object r0 = r1.get(r3)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto L23
            r0 = 0
            java.lang.Class r2 = java.lang.Class.forName(r3, r0, r2)
            r1.put(r3, r2)
            return r2
        L23:
            return r0
    }

    @androidx.annotation.NonNull
    public static java.lang.Class<? extends androidx.fragment.app.Fragment> loadFragmentClass(@androidx.annotation.NonNull java.lang.ClassLoader r3, @androidx.annotation.NonNull java.lang.String r4) {
            java.lang.String r0 = "Unable to instantiate fragment "
            java.lang.Class r3 = loadClass(r3, r4)     // Catch: java.lang.ClassCastException -> L7 java.lang.ClassNotFoundException -> L22
            return r3
        L7:
            r3 = move-exception
            androidx.fragment.app.Fragment$InstantiationException r1 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = ": make sure class is a valid subclass of Fragment"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r3)
            throw r1
        L22:
            r3 = move-exception
            androidx.fragment.app.Fragment$InstantiationException r1 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = ": make sure class name exists"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r3)
            throw r1
    }

    @androidx.annotation.NonNull
    public androidx.fragment.app.Fragment instantiate(@androidx.annotation.NonNull java.lang.ClassLoader r5, @androidx.annotation.NonNull java.lang.String r6) {
            r4 = this;
            java.lang.String r0 = ": make sure class name exists, is public, and has an empty constructor that is public"
            java.lang.String r1 = "Unable to instantiate fragment "
            java.lang.Class r5 = loadFragmentClass(r5, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.NoSuchMethodException -> L16 java.lang.IllegalAccessException -> L18 java.lang.InstantiationException -> L1a
            r2 = 0
            java.lang.reflect.Constructor r5 = r5.getConstructor(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.NoSuchMethodException -> L16 java.lang.IllegalAccessException -> L18 java.lang.InstantiationException -> L1a
            java.lang.Object r5 = r5.newInstance(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.NoSuchMethodException -> L16 java.lang.IllegalAccessException -> L18 java.lang.InstantiationException -> L1a
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.NoSuchMethodException -> L16 java.lang.IllegalAccessException -> L18 java.lang.InstantiationException -> L1a
            return r5
        L14:
            r5 = move-exception
            goto L1c
        L16:
            r5 = move-exception
            goto L36
        L18:
            r5 = move-exception
            goto L50
        L1a:
            r5 = move-exception
            goto L68
        L1c:
            androidx.fragment.app.Fragment$InstantiationException r0 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r6)
            java.lang.String r6 = ": calling Fragment constructor caused an exception"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r0.<init>(r6, r5)
            throw r0
        L36:
            androidx.fragment.app.Fragment$InstantiationException r0 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r6)
            java.lang.String r6 = ": could not find Fragment constructor"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r0.<init>(r6, r5)
            throw r0
        L50:
            androidx.fragment.app.Fragment$InstantiationException r2 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r6)
            r3.append(r0)
            java.lang.String r6 = r3.toString()
            r2.<init>(r6, r5)
            throw r2
        L68:
            androidx.fragment.app.Fragment$InstantiationException r2 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r6)
            r3.append(r0)
            java.lang.String r6 = r3.toString()
            r2.<init>(r6, r5)
            throw r2
    }
}
