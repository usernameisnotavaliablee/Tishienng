package com.bytedance.pangle.fragment;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
class j {
    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.Class j(java.lang.String r0) {
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    private static java.lang.reflect.Field j(java.lang.Class r0, java.lang.String r1) {
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> Lb
            if (r0 == 0) goto La
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> Lb
        La:
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static void j(java.lang.Class r4) {
            java.lang.Class<androidx.fragment.app.Fragment> r0 = androidx.fragment.app.Fragment.class
            java.lang.String r1 = r0.getName()     // Catch: java.lang.Exception -> L76
            java.lang.String r2 = "support"
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Exception -> L76
            java.lang.String r2 = "sClassMap"
            r3 = 0
            if (r1 == 0) goto L23
            java.lang.reflect.Field r0 = j(r0, r2)     // Catch: java.lang.Exception -> L76
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Exception -> L76
            androidx.collection.SimpleArrayMap r0 = (androidx.collection.SimpleArrayMap) r0     // Catch: java.lang.Exception -> L76
            java.lang.String r1 = r4.getName()     // Catch: java.lang.Exception -> L76
            r0.put(r1, r4)     // Catch: java.lang.Exception -> L76
            return
        L23:
            java.lang.reflect.Field r0 = j(r0, r2)     // Catch: java.lang.Exception -> L76
            if (r0 == 0) goto L37
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Exception -> L76
            androidx.collection.SimpleArrayMap r0 = (androidx.collection.SimpleArrayMap) r0     // Catch: java.lang.Exception -> L76
            java.lang.String r1 = r4.getName()     // Catch: java.lang.Exception -> L76
            r0.put(r1, r4)     // Catch: java.lang.Exception -> L76
            return
        L37:
            java.lang.String r0 = "androidx.fragment.app.FragmentFactory"
            java.lang.Class r0 = j(r0)     // Catch: java.lang.Exception -> L76
            if (r0 != 0) goto L40
            goto L75
        L40:
            java.lang.reflect.Field r1 = j(r0, r2)     // Catch: java.lang.Exception -> L76
            if (r1 == 0) goto L54
            java.lang.Object r0 = r1.get(r3)     // Catch: java.lang.Exception -> L76
            androidx.collection.SimpleArrayMap r0 = (androidx.collection.SimpleArrayMap) r0     // Catch: java.lang.Exception -> L76
            java.lang.String r1 = r4.getName()     // Catch: java.lang.Exception -> L76
            r0.put(r1, r4)     // Catch: java.lang.Exception -> L76
            return
        L54:
            java.lang.String r1 = "sClassCacheMap"
            java.lang.reflect.Field r0 = j(r0, r1)     // Catch: java.lang.Exception -> L76
            if (r0 == 0) goto L75
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Exception -> L76
            androidx.collection.SimpleArrayMap r0 = (androidx.collection.SimpleArrayMap) r0     // Catch: java.lang.Exception -> L76
            androidx.collection.SimpleArrayMap r1 = new androidx.collection.SimpleArrayMap     // Catch: java.lang.Exception -> L76
            r1.<init>()     // Catch: java.lang.Exception -> L76
            java.lang.String r2 = r4.getName()     // Catch: java.lang.Exception -> L76
            r1.put(r2, r4)     // Catch: java.lang.Exception -> L76
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.Exception -> L76
            r0.put(r4, r1)     // Catch: java.lang.Exception -> L76
        L75:
            return
        L76:
            r4 = move-exception
            com.bytedance.sdk.openadsdk.api.m.j(r4)
            return
    }
}
