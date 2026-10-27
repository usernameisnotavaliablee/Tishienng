package androidx.core.content.res;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ResourcesCompat {

    @androidx.annotation.AnyRes
    public static final int ID_NULL = 0;
    private static final java.lang.String TAG = "ResourcesCompat";
    private static final java.lang.Object sColorStateCacheLock = null;

    @androidx.annotation.GuardedBy("sColorStateCacheLock")
    private static final java.util.WeakHashMap<androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey, android.util.SparseArray<androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry>> sColorStateCaches = null;
    private static final java.lang.ThreadLocal<android.util.TypedValue> sTempTypedValue = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.graphics.drawable.Drawable getDrawable(android.content.res.Resources r0, int r1, android.content.res.Resources.Theme r2) {
                android.graphics.drawable.Drawable r0 = r0.getDrawable(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.graphics.drawable.Drawable getDrawableForDensity(android.content.res.Resources r0, int r1, int r2, android.content.res.Resources.Theme r3) {
                android.graphics.drawable.Drawable r0 = r0.getDrawableForDensity(r1, r2, r3)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(23)
    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static int getColor(android.content.res.Resources r0, int r1, android.content.res.Resources.Theme r2) {
                int r0 = r0.getColor(r1, r2)
                return r0
        }

        @androidx.annotation.NonNull
        @androidx.annotation.DoNotInline
        static android.content.res.ColorStateList getColorStateList(@androidx.annotation.NonNull android.content.res.Resources r0, @androidx.annotation.ColorRes int r1, @androidx.annotation.Nullable android.content.res.Resources.Theme r2) {
                android.content.res.ColorStateList r0 = r0.getColorStateList(r1, r2)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(29)
    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static float getFloat(@androidx.annotation.NonNull android.content.res.Resources r0, @androidx.annotation.DimenRes int r1) {
                float r0 = r0.getFloat(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ColorStateListCacheEntry {
        final android.content.res.Configuration mConfiguration;
        final int mThemeHash;
        final android.content.res.ColorStateList mValue;

        ColorStateListCacheEntry(@androidx.annotation.NonNull android.content.res.ColorStateList r1, @androidx.annotation.NonNull android.content.res.Configuration r2, @androidx.annotation.Nullable android.content.res.Resources.Theme r3) {
                r0 = this;
                r0.<init>()
                r0.mValue = r1
                r0.mConfiguration = r2
                if (r3 != 0) goto Lb
                r1 = 0
                goto Lf
            Lb:
                int r1 = r3.hashCode()
            Lf:
                r0.mThemeHash = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ColorStateListCacheKey {
        final android.content.res.Resources mResources;
        final android.content.res.Resources.Theme mTheme;

        ColorStateListCacheKey(@androidx.annotation.NonNull android.content.res.Resources r1, @androidx.annotation.Nullable android.content.res.Resources.Theme r2) {
                r0 = this;
                r0.<init>()
                r0.mResources = r1
                r0.mTheme = r2
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L27
                java.lang.Class<androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey> r2 = androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey.class
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L10
                goto L27
            L10:
                androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey r5 = (androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey) r5
                android.content.res.Resources r2 = r4.mResources
                android.content.res.Resources r3 = r5.mResources
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L27
                android.content.res.Resources$Theme r2 = r4.mTheme
                android.content.res.Resources$Theme r5 = r5.mTheme
                boolean r5 = androidx.core.util.ObjectsCompat.equals(r2, r5)
                if (r5 == 0) goto L27
                return r0
            L27:
                return r1
        }

        public int hashCode() {
                r4 = this;
                android.content.res.Resources r0 = r4.mResources
                android.content.res.Resources$Theme r1 = r4.mTheme
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r0
                r0 = 1
                r2[r0] = r1
                int r0 = androidx.core.util.ObjectsCompat.hash(r2)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class FontCallback {
        public FontCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(androidx.core.content.res.ResourcesCompat.FontCallback r0, android.graphics.Typeface r1) {
                r0.onFontRetrieved(r1)
                return
        }

        public static /* synthetic */ void b(androidx.core.content.res.ResourcesCompat.FontCallback r0, int r1) {
                r0.onFontRetrievalFailed(r1)
                return
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public static android.os.Handler getHandler(@androidx.annotation.Nullable android.os.Handler r1) {
                if (r1 != 0) goto Lb
                android.os.Handler r1 = new android.os.Handler
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r1.<init>(r0)
            Lb:
                return r1
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void callbackFailAsync(int r2, @androidx.annotation.Nullable android.os.Handler r3) {
                r1 = this;
                android.os.Handler r3 = getHandler(r3)
                androidx.core.content.res.b r0 = new androidx.core.content.res.b
                r0.<init>(r1, r2)
                r3.post(r0)
                return
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void callbackSuccessAsync(@androidx.annotation.NonNull android.graphics.Typeface r2, @androidx.annotation.Nullable android.os.Handler r3) {
                r1 = this;
                android.os.Handler r3 = getHandler(r3)
                androidx.core.content.res.a r0 = new androidx.core.content.res.a
                r0.<init>(r1, r2)
                r3.post(r0)
                return
        }

        public abstract void onFontRetrievalFailed(int r1);

        public abstract void onFontRetrieved(@androidx.annotation.NonNull android.graphics.Typeface r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class ThemeCompat {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @androidx.annotation.RequiresApi(23)
        static class Api23Impl {
            private static java.lang.reflect.Method sRebaseMethod;
            private static boolean sRebaseMethodFetched;
            private static final java.lang.Object sRebaseMethodLock = null;

            static {
                    java.lang.Object r0 = new java.lang.Object
                    r0.<init>()
                    androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethodLock = r0
                    return
            }

            private Api23Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @android.annotation.SuppressLint({"BanUncheckedReflection"})
            static void rebase(@androidx.annotation.NonNull android.content.res.Resources.Theme r5) {
                    java.lang.Object r0 = androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethodLock
                    monitor-enter(r0)
                    boolean r1 = androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethodFetched     // Catch: java.lang.Throwable -> L17
                    r2 = 0
                    if (r1 != 0) goto L1b
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r2)     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L19
                    androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethod = r3     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L19
                    r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L19
                    goto L19
                L17:
                    r5 = move-exception
                    goto L27
                L19:
                    androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethodFetched = r1     // Catch: java.lang.Throwable -> L17
                L1b:
                    java.lang.reflect.Method r1 = androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethod     // Catch: java.lang.Throwable -> L17
                    if (r1 == 0) goto L25
                    r1.invoke(r5, r2)     // Catch: java.lang.Throwable -> L17 java.lang.Throwable -> L23
                    goto L25
                L23:
                    androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethod = r2     // Catch: java.lang.Throwable -> L17
                L25:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                    return
                L27:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                    throw r5
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @androidx.annotation.RequiresApi(29)
        static class Api29Impl {
            private Api29Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @androidx.annotation.DoNotInline
            static void rebase(@androidx.annotation.NonNull android.content.res.Resources.Theme r0) {
                    r0.rebase()
                    return
            }
        }

        private ThemeCompat() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void rebase(@androidx.annotation.NonNull android.content.res.Resources.Theme r2) {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto La
                androidx.core.content.res.ResourcesCompat.ThemeCompat.Api29Impl.rebase(r2)
                return
            La:
                r1 = 23
                if (r0 < r1) goto L11
                androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.rebase(r2)
            L11:
                return
        }
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.core.content.res.ResourcesCompat.sTempTypedValue = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = 0
            r0.<init>(r1)
            androidx.core.content.res.ResourcesCompat.sColorStateCaches = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.content.res.ResourcesCompat.sColorStateCacheLock = r0
            return
    }

    private ResourcesCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addColorStateListToCache(@androidx.annotation.NonNull androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey r3, @androidx.annotation.ColorRes int r4, @androidx.annotation.NonNull android.content.res.ColorStateList r5, @androidx.annotation.Nullable android.content.res.Resources.Theme r6) {
            java.lang.Object r0 = androidx.core.content.res.ResourcesCompat.sColorStateCacheLock
            monitor-enter(r0)
            java.util.WeakHashMap<androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey, android.util.SparseArray<androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry>> r1 = androidx.core.content.res.ResourcesCompat.sColorStateCaches     // Catch: java.lang.Throwable -> L16
            java.lang.Object r2 = r1.get(r3)     // Catch: java.lang.Throwable -> L16
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L18
            android.util.SparseArray r2 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L16
            r2.<init>()     // Catch: java.lang.Throwable -> L16
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r3 = move-exception
            goto L28
        L18:
            androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry r1 = new androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry     // Catch: java.lang.Throwable -> L16
            android.content.res.Resources r3 = r3.mResources     // Catch: java.lang.Throwable -> L16
            android.content.res.Configuration r3 = r3.getConfiguration()     // Catch: java.lang.Throwable -> L16
            r1.<init>(r5, r3, r6)     // Catch: java.lang.Throwable -> L16
            r2.append(r4, r1)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r3
    }

    public static void clearCachesForTheme(@androidx.annotation.NonNull android.content.res.Resources.Theme r3) {
            java.lang.Object r0 = androidx.core.content.res.ResourcesCompat.sColorStateCacheLock
            monitor-enter(r0)
            java.util.WeakHashMap<androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey, android.util.SparseArray<androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry>> r1 = androidx.core.content.res.ResourcesCompat.sColorStateCaches     // Catch: java.lang.Throwable -> L27
            java.util.Set r1 = r1.keySet()     // Catch: java.lang.Throwable -> L27
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L27
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L27
            androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey r2 = (androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey) r2     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto Ld
            android.content.res.Resources$Theme r2 = r2.mTheme     // Catch: java.lang.Throwable -> L27
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto Ld
            r1.remove()     // Catch: java.lang.Throwable -> L27
            goto Ld
        L27:
            r3 = move-exception
            goto L2b
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r3
    }

    @androidx.annotation.Nullable
    private static android.content.res.ColorStateList getCachedColorStateList(@androidx.annotation.NonNull androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey r5, @androidx.annotation.ColorRes int r6) {
            java.lang.Object r0 = androidx.core.content.res.ResourcesCompat.sColorStateCacheLock
            monitor-enter(r0)
            java.util.WeakHashMap<androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey, android.util.SparseArray<androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry>> r1 = androidx.core.content.res.ResourcesCompat.sColorStateCaches     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry r2 = (androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.mConfiguration     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.mResources     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.mTheme     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.mThemeHash     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.mThemeHash     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.mValue     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
    }

    @androidx.annotation.Nullable
    public static android.graphics.Typeface getCachedFont(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.FontRes int r9) throws android.content.res.Resources.NotFoundException {
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto L8
            r8 = 0
            return r8
        L8:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r6 = 0
            r7 = 1
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r8
            r1 = r9
            android.graphics.Typeface r8 = loadFont(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    @androidx.annotation.ColorInt
    public static int getColor(@androidx.annotation.NonNull android.content.res.Resources r2, @androidx.annotation.ColorRes int r3, @androidx.annotation.Nullable android.content.res.Resources.Theme r4) throws android.content.res.Resources.NotFoundException {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            int r2 = androidx.core.content.res.ResourcesCompat.Api23Impl.getColor(r2, r3, r4)
            return r2
        Lb:
            int r2 = r2.getColor(r3)
            return r2
    }

    @androidx.annotation.Nullable
    public static android.content.res.ColorStateList getColorStateList(@androidx.annotation.NonNull android.content.res.Resources r2, @androidx.annotation.ColorRes int r3, @androidx.annotation.Nullable android.content.res.Resources.Theme r4) throws android.content.res.Resources.NotFoundException {
            androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey r0 = new androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey
            r0.<init>(r2, r4)
            android.content.res.ColorStateList r1 = getCachedColorStateList(r0, r3)
            if (r1 == 0) goto Lc
            return r1
        Lc:
            android.content.res.ColorStateList r1 = inflateColorStateList(r2, r3, r4)
            if (r1 == 0) goto L16
            addColorStateListToCache(r0, r3, r1, r4)
            return r1
        L16:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L21
            android.content.res.ColorStateList r2 = androidx.core.content.res.ResourcesCompat.Api23Impl.getColorStateList(r2, r3, r4)
            return r2
        L21:
            android.content.res.ColorStateList r2 = r2.getColorStateList(r3)
            return r2
    }

    @androidx.annotation.Nullable
    public static android.graphics.drawable.Drawable getDrawable(@androidx.annotation.NonNull android.content.res.Resources r0, @androidx.annotation.DrawableRes int r1, @androidx.annotation.Nullable android.content.res.Resources.Theme r2) throws android.content.res.Resources.NotFoundException {
            android.graphics.drawable.Drawable r0 = androidx.core.content.res.ResourcesCompat.Api21Impl.getDrawable(r0, r1, r2)
            return r0
    }

    @androidx.annotation.Nullable
    public static android.graphics.drawable.Drawable getDrawableForDensity(@androidx.annotation.NonNull android.content.res.Resources r0, @androidx.annotation.DrawableRes int r1, int r2, @androidx.annotation.Nullable android.content.res.Resources.Theme r3) throws android.content.res.Resources.NotFoundException {
            android.graphics.drawable.Drawable r0 = androidx.core.content.res.ResourcesCompat.Api21Impl.getDrawableForDensity(r0, r1, r2, r3)
            return r0
    }

    public static float getFloat(@androidx.annotation.NonNull android.content.res.Resources r3, @androidx.annotation.DimenRes int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            float r3 = androidx.core.content.res.ResourcesCompat.Api29Impl.getFloat(r3, r4)
            return r3
        Lb:
            android.util.TypedValue r0 = getTypedValue()
            r1 = 1
            r3.getValue(r4, r0, r1)
            int r3 = r0.type
            r1 = 4
            if (r3 != r1) goto L1d
            float r3 = r0.getFloat()
            return r3
        L1d:
            android.content.res.Resources$NotFoundException r3 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Resource ID #0x"
            r1.append(r2)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r1.append(r4)
            java.lang.String r4 = " type #0x"
            r1.append(r4)
            int r4 = r0.type
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r1.append(r4)
            java.lang.String r4 = " is not valid"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r3.<init>(r4)
            throw r3
    }

    @androidx.annotation.Nullable
    public static android.graphics.Typeface getFont(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.FontRes int r9) throws android.content.res.Resources.NotFoundException {
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto L8
            r8 = 0
            return r8
        L8:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r6 = 0
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r8
            r1 = r9
            android.graphics.Typeface r8 = loadFont(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static android.graphics.Typeface getFont(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.FontRes int r9, @androidx.annotation.NonNull android.util.TypedValue r10, int r11, @androidx.annotation.Nullable androidx.core.content.res.ResourcesCompat.FontCallback r12) throws android.content.res.Resources.NotFoundException {
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto L8
            r8 = 0
            return r8
        L8:
            r6 = 1
            r7 = 0
            r5 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            android.graphics.Typeface r8 = loadFont(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static void getFont(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.FontRes int r9, @androidx.annotation.NonNull androidx.core.content.res.ResourcesCompat.FontCallback r10, @androidx.annotation.Nullable android.os.Handler r11) throws android.content.res.Resources.NotFoundException {
            androidx.core.util.Preconditions.checkNotNull(r10)
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto Le
            r8 = -4
            r10.callbackFailAsync(r8, r11)
            return
        Le:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r6 = 0
            r7 = 0
            r3 = 0
            r0 = r8
            r1 = r9
            r4 = r10
            r5 = r11
            loadFont(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @androidx.annotation.NonNull
    private static android.util.TypedValue getTypedValue() {
            java.lang.ThreadLocal<android.util.TypedValue> r0 = androidx.core.content.res.ResourcesCompat.sTempTypedValue
            java.lang.Object r1 = r0.get()
            android.util.TypedValue r1 = (android.util.TypedValue) r1
            if (r1 != 0) goto L12
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r0.set(r1)
        L12:
            return r1
    }

    @androidx.annotation.Nullable
    private static android.content.res.ColorStateList inflateColorStateList(android.content.res.Resources r2, int r3, @androidx.annotation.Nullable android.content.res.Resources.Theme r4) {
            boolean r0 = isColorInt(r2, r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            android.content.res.XmlResourceParser r3 = r2.getXml(r3)
            android.content.res.ColorStateList r2 = androidx.core.content.res.ColorStateListInflaterCompat.createFromXml(r2, r3, r4)     // Catch: java.lang.Exception -> L11
            return r2
        L11:
            return r1
    }

    private static boolean isColorInt(@androidx.annotation.NonNull android.content.res.Resources r2, @androidx.annotation.ColorRes int r3) {
            android.util.TypedValue r0 = getTypedValue()
            r1 = 1
            r2.getValue(r3, r0, r1)
            int r2 = r0.type
            r3 = 28
            if (r2 < r3) goto L13
            r3 = 31
            if (r2 > r3) goto L13
            return r1
        L13:
            r2 = 0
            return r2
    }

    private static android.graphics.Typeface loadFont(@androidx.annotation.NonNull android.content.Context r9, int r10, @androidx.annotation.NonNull android.util.TypedValue r11, int r12, @androidx.annotation.Nullable androidx.core.content.res.ResourcesCompat.FontCallback r13, @androidx.annotation.Nullable android.os.Handler r14, boolean r15, boolean r16) {
            android.content.res.Resources r1 = r9.getResources()
            r0 = 1
            r1.getValue(r10, r11, r0)
            r0 = r9
            r3 = r10
            r2 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            android.graphics.Typeface r9 = loadFont(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r9 != 0) goto L3c
            if (r13 != 0) goto L3c
            if (r16 == 0) goto L1c
            goto L3c
        L1c:
            android.content.res.Resources$NotFoundException r9 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Font resource ID #0x"
            r11.append(r12)
            java.lang.String r10 = java.lang.Integer.toHexString(r10)
            r11.append(r10)
            java.lang.String r10 = " could not be retrieved."
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L3c:
            return r9
    }

    private static android.graphics.Typeface loadFont(@androidx.annotation.NonNull android.content.Context r12, android.content.res.Resources r13, @androidx.annotation.NonNull android.util.TypedValue r14, int r15, int r16, @androidx.annotation.Nullable androidx.core.content.res.ResourcesCompat.FontCallback r17, @androidx.annotation.Nullable android.os.Handler r18, boolean r19, boolean r20) {
            r7 = r17
            r8 = r18
            java.lang.CharSequence r0 = r14.string
            if (r0 == 0) goto L77
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "res/"
            boolean r0 = r4.startsWith(r0)
            r10 = 0
            r11 = -3
            if (r0 != 0) goto L1c
            if (r7 == 0) goto L1b
            r7.callbackFailAsync(r11, r8)
        L1b:
            return r10
        L1c:
            int r0 = r14.assetCookie
            r6 = r16
            android.graphics.Typeface r0 = androidx.core.graphics.TypefaceCompat.findFromCache(r13, r15, r4, r0, r6)
            if (r0 == 0) goto L2c
            if (r7 == 0) goto L2b
            r7.callbackSuccessAsync(r0, r8)
        L2b:
            return r0
        L2c:
            if (r20 == 0) goto L2f
            return r10
        L2f:
            java.lang.String r0 = r4.toLowerCase()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = ".xml"
            boolean r0 = r0.endsWith(r1)     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L5a
            android.content.res.XmlResourceParser r0 = r13.getXml(r15)     // Catch: java.lang.Throwable -> L4b
            androidx.core.content.res.FontResourcesParserCompat$FamilyResourceEntry r1 = androidx.core.content.res.FontResourcesParserCompat.parse(r0, r13)     // Catch: java.lang.Throwable -> L4b
            if (r1 != 0) goto L4e
            if (r7 == 0) goto L4d
            r7.callbackFailAsync(r11, r8)     // Catch: java.lang.Throwable -> L4b
            goto L4d
        L4b:
            goto L71
        L4d:
            return r10
        L4e:
            int r5 = r14.assetCookie     // Catch: java.lang.Throwable -> L4b
            r0 = r12
            r2 = r13
            r3 = r15
            r9 = r19
            android.graphics.Typeface r12 = androidx.core.graphics.TypefaceCompat.createFromResourcesFamilyXml(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4b
            return r12
        L5a:
            int r5 = r14.assetCookie     // Catch: java.lang.Throwable -> L4b
            r1 = r12
            r2 = r13
            r3 = r15
            r6 = r16
            android.graphics.Typeface r12 = androidx.core.graphics.TypefaceCompat.createFromResourcesFontFile(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4b
            if (r7 == 0) goto L70
            if (r12 == 0) goto L6d
            r7.callbackSuccessAsync(r12, r8)     // Catch: java.lang.Throwable -> L4b
            return r12
        L6d:
            r7.callbackFailAsync(r11, r8)     // Catch: java.lang.Throwable -> L4b
        L70:
            return r12
        L71:
            if (r7 == 0) goto L76
            r7.callbackFailAsync(r11, r8)
        L76:
            return r10
        L77:
            android.content.res.Resources$NotFoundException r12 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Resource \""
            r0.append(r1)
            java.lang.String r13 = r13.getResourceName(r15)
            r0.append(r13)
            java.lang.String r13 = "\" ("
            r0.append(r13)
            java.lang.String r13 = java.lang.Integer.toHexString(r15)
            r0.append(r13)
            java.lang.String r13 = ") is not a Font: "
            r0.append(r13)
            r0.append(r14)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
    }
}
