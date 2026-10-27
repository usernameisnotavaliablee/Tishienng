package androidx.appcompat.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ResourcesFlusher {
    private static final java.lang.String TAG = "ResourcesFlusher";
    private static java.lang.reflect.Field sDrawableCacheField;
    private static boolean sDrawableCacheFieldFetched;
    private static java.lang.reflect.Field sResourcesImplField;
    private static boolean sResourcesImplFieldFetched;
    private static java.lang.Class<?> sThemedResourceCacheClazz;
    private static boolean sThemedResourceCacheClazzFetched;
    private static java.lang.reflect.Field sThemedResourceCache_mUnthemedEntriesField;
    private static boolean sThemedResourceCache_mUnthemedEntriesFieldFetched;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(16)
    static class Api16Impl {
        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static void clear(android.util.LongSparseArray r0) {
                r0.clear()
                return
        }
    }

    private ResourcesFlusher() {
            r0 = this;
            r0.<init>()
            return
    }

    static void flush(@androidx.annotation.NonNull android.content.res.Resources r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L7
            return
        L7:
            r1 = 24
            if (r0 < r1) goto Lf
            flushNougats(r2)
            return
        Lf:
            r1 = 23
            if (r0 < r1) goto L17
            flushMarshmallows(r2)
            return
        L17:
            flushLollipops(r2)
            return
    }

    @androidx.annotation.RequiresApi(21)
    private static void flushLollipops(@androidx.annotation.NonNull android.content.res.Resources r3) {
            boolean r0 = androidx.appcompat.app.ResourcesFlusher.sDrawableCacheFieldFetched
            if (r0 != 0) goto L14
            r0 = 1
            java.lang.Class<android.content.res.Resources> r1 = android.content.res.Resources.class
            java.lang.String r2 = "mDrawableCache"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L12
            androidx.appcompat.app.ResourcesFlusher.sDrawableCacheField = r1     // Catch: java.lang.NoSuchFieldException -> L12
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L12
        L12:
            androidx.appcompat.app.ResourcesFlusher.sDrawableCacheFieldFetched = r0
        L14:
            java.lang.reflect.Field r0 = androidx.appcompat.app.ResourcesFlusher.sDrawableCacheField
            if (r0 == 0) goto L25
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.IllegalAccessException -> L1f
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.IllegalAccessException -> L1f
            goto L20
        L1f:
            r3 = 0
        L20:
            if (r3 == 0) goto L25
            r3.clear()
        L25:
            return
    }

    @androidx.annotation.RequiresApi(23)
    private static void flushMarshmallows(@androidx.annotation.NonNull android.content.res.Resources r3) {
            boolean r0 = androidx.appcompat.app.ResourcesFlusher.sDrawableCacheFieldFetched
            if (r0 != 0) goto L14
            r0 = 1
            java.lang.Class<android.content.res.Resources> r1 = android.content.res.Resources.class
            java.lang.String r2 = "mDrawableCache"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L12
            androidx.appcompat.app.ResourcesFlusher.sDrawableCacheField = r1     // Catch: java.lang.NoSuchFieldException -> L12
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L12
        L12:
            androidx.appcompat.app.ResourcesFlusher.sDrawableCacheFieldFetched = r0
        L14:
            java.lang.reflect.Field r0 = androidx.appcompat.app.ResourcesFlusher.sDrawableCacheField
            if (r0 == 0) goto L1d
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.IllegalAccessException -> L1d
            goto L1e
        L1d:
            r3 = 0
        L1e:
            if (r3 != 0) goto L21
            return
        L21:
            flushThemedResourcesCache(r3)
            return
    }

    @androidx.annotation.RequiresApi(24)
    private static void flushNougats(@androidx.annotation.NonNull android.content.res.Resources r4) {
            boolean r0 = androidx.appcompat.app.ResourcesFlusher.sResourcesImplFieldFetched
            r1 = 1
            if (r0 != 0) goto L14
            java.lang.Class<android.content.res.Resources> r0 = android.content.res.Resources.class
            java.lang.String r2 = "mResourcesImpl"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L12
            androidx.appcompat.app.ResourcesFlusher.sResourcesImplField = r0     // Catch: java.lang.NoSuchFieldException -> L12
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L12
        L12:
            androidx.appcompat.app.ResourcesFlusher.sResourcesImplFieldFetched = r1
        L14:
            java.lang.reflect.Field r0 = androidx.appcompat.app.ResourcesFlusher.sResourcesImplField
            if (r0 != 0) goto L19
            goto L48
        L19:
            r2 = 0
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.IllegalAccessException -> L1f
            goto L21
        L1f:
            r4 = r2
        L21:
            if (r4 != 0) goto L24
            goto L48
        L24:
            boolean r0 = androidx.appcompat.app.ResourcesFlusher.sDrawableCacheFieldFetched
            if (r0 != 0) goto L39
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.NoSuchFieldException -> L37
            java.lang.String r3 = "mDrawableCache"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L37
            androidx.appcompat.app.ResourcesFlusher.sDrawableCacheField = r0     // Catch: java.lang.NoSuchFieldException -> L37
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L37
        L37:
            androidx.appcompat.app.ResourcesFlusher.sDrawableCacheFieldFetched = r1
        L39:
            java.lang.reflect.Field r0 = androidx.appcompat.app.ResourcesFlusher.sDrawableCacheField
            if (r0 == 0) goto L43
            java.lang.Object r2 = r0.get(r4)     // Catch: java.lang.IllegalAccessException -> L42
            goto L43
        L42:
        L43:
            if (r2 == 0) goto L48
            flushThemedResourcesCache(r2)
        L48:
            return
    }

    @androidx.annotation.RequiresApi(16)
    private static void flushThemedResourcesCache(@androidx.annotation.NonNull java.lang.Object r3) {
            boolean r0 = androidx.appcompat.app.ResourcesFlusher.sThemedResourceCacheClazzFetched
            r1 = 1
            if (r0 != 0) goto Lf
            java.lang.String r0 = "android.content.res.ThemedResourceCache"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> Ld
            androidx.appcompat.app.ResourcesFlusher.sThemedResourceCacheClazz = r0     // Catch: java.lang.ClassNotFoundException -> Ld
        Ld:
            androidx.appcompat.app.ResourcesFlusher.sThemedResourceCacheClazzFetched = r1
        Lf:
            java.lang.Class<?> r0 = androidx.appcompat.app.ResourcesFlusher.sThemedResourceCacheClazz
            if (r0 != 0) goto L14
            goto L37
        L14:
            boolean r2 = androidx.appcompat.app.ResourcesFlusher.sThemedResourceCache_mUnthemedEntriesFieldFetched
            if (r2 != 0) goto L25
            java.lang.String r2 = "mUnthemedEntries"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L23
            androidx.appcompat.app.ResourcesFlusher.sThemedResourceCache_mUnthemedEntriesField = r0     // Catch: java.lang.NoSuchFieldException -> L23
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L23
        L23:
            androidx.appcompat.app.ResourcesFlusher.sThemedResourceCache_mUnthemedEntriesFieldFetched = r1
        L25:
            java.lang.reflect.Field r0 = androidx.appcompat.app.ResourcesFlusher.sThemedResourceCache_mUnthemedEntriesField
            if (r0 != 0) goto L2a
            goto L37
        L2a:
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.IllegalAccessException -> L31
            android.util.LongSparseArray r3 = (android.util.LongSparseArray) r3     // Catch: java.lang.IllegalAccessException -> L31
            goto L32
        L31:
            r3 = 0
        L32:
            if (r3 == 0) goto L37
            androidx.appcompat.app.ResourcesFlusher.Api16Impl.clear(r3)
        L37:
            return
    }
}
