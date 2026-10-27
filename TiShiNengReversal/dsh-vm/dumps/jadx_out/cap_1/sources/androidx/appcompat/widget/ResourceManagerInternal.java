package androidx.appcompat.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ResourceManagerInternal {
    private static final androidx.appcompat.widget.ResourceManagerInternal.ColorFilterLruCache COLOR_FILTER_CACHE = null;
    private static final boolean DEBUG = false;
    private static final android.graphics.PorterDuff.Mode DEFAULT_MODE = null;
    private static androidx.appcompat.widget.ResourceManagerInternal INSTANCE = null;
    private static final java.lang.String PLATFORM_VD_CLAZZ = "android.graphics.drawable.VectorDrawable";
    private static final java.lang.String SKIP_DRAWABLE_TAG = "appcompat_skip_skip";
    private static final java.lang.String TAG = "ResourceManagerInternal";
    private androidx.collection.SimpleArrayMap<java.lang.String, androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate> mDelegates;
    private final java.util.WeakHashMap<android.content.Context, androidx.collection.LongSparseArray<java.lang.ref.WeakReference<android.graphics.drawable.Drawable.ConstantState>>> mDrawableCaches;
    private boolean mHasCheckedVectorDrawableSetup;
    private androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks mHooks;
    private androidx.collection.SparseArrayCompat<java.lang.String> mKnownDrawableIdTags;
    private java.util.WeakHashMap<android.content.Context, androidx.collection.SparseArrayCompat<android.content.res.ColorStateList>> mTintLists;
    private android.util.TypedValue mTypedValue;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class AsldcInflateDelegate implements androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate {
        AsldcInflateDelegate() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public android.graphics.drawable.Drawable createFromXmlInner(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r3, @androidx.annotation.NonNull android.util.AttributeSet r4, @androidx.annotation.Nullable android.content.res.Resources.Theme r5) {
                r1 = this;
                android.content.res.Resources r0 = r2.getResources()     // Catch: java.lang.Exception -> L9
                androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat r2 = androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.createFromXmlInner(r2, r0, r3, r4, r5)     // Catch: java.lang.Exception -> L9
                return r2
            L9:
                r2 = 0
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class AvdcInflateDelegate implements androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate {
        AvdcInflateDelegate() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public android.graphics.drawable.Drawable createFromXmlInner(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r3, @androidx.annotation.NonNull android.util.AttributeSet r4, @androidx.annotation.Nullable android.content.res.Resources.Theme r5) {
                r1 = this;
                android.content.res.Resources r0 = r2.getResources()     // Catch: java.lang.Exception -> L9
                androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r2 = androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.createFromXmlInner(r2, r0, r3, r4, r5)     // Catch: java.lang.Exception -> L9
                return r2
            L9:
                r2 = 0
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ColorFilterLruCache extends androidx.collection.LruCache<java.lang.Integer, android.graphics.PorterDuffColorFilter> {
        public ColorFilterLruCache(int r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private static int generateCacheKey(int r1, android.graphics.PorterDuff.Mode r2) {
                r0 = 31
                int r1 = r1 + r0
                int r1 = r1 * 31
                int r2 = r2.hashCode()
                int r1 = r1 + r2
                return r1
        }

        android.graphics.PorterDuffColorFilter get(int r1, android.graphics.PorterDuff.Mode r2) {
                r0 = this;
                int r1 = generateCacheKey(r1, r2)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object r1 = r0.get(r1)
                android.graphics.PorterDuffColorFilter r1 = (android.graphics.PorterDuffColorFilter) r1
                return r1
        }

        android.graphics.PorterDuffColorFilter put(int r1, android.graphics.PorterDuff.Mode r2, android.graphics.PorterDuffColorFilter r3) {
                r0 = this;
                int r1 = generateCacheKey(r1, r2)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object r1 = r0.put(r1, r3)
                android.graphics.PorterDuffColorFilter r1 = (android.graphics.PorterDuffColorFilter) r1
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class DrawableDelegate implements androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate {
        DrawableDelegate() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public android.graphics.drawable.Drawable createFromXmlInner(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r5, @androidx.annotation.NonNull android.util.AttributeSet r6, @androidx.annotation.Nullable android.content.res.Resources.Theme r7) {
                r3 = this;
                java.lang.String r0 = r6.getClassAttribute()
                r1 = 0
                if (r0 == 0) goto L29
                java.lang.Class<androidx.appcompat.widget.ResourceManagerInternal$DrawableDelegate> r2 = androidx.appcompat.widget.ResourceManagerInternal.DrawableDelegate.class
                java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Exception -> L29
                java.lang.Class r0 = r2.loadClass(r0)     // Catch: java.lang.Exception -> L29
                java.lang.Class<android.graphics.drawable.Drawable> r2 = android.graphics.drawable.Drawable.class
                java.lang.Class r0 = r0.asSubclass(r2)     // Catch: java.lang.Exception -> L29
                java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.Exception -> L29
                java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L29
                android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0     // Catch: java.lang.Exception -> L29
                android.content.res.Resources r4 = r4.getResources()     // Catch: java.lang.Exception -> L29
                androidx.appcompat.resources.Compatibility.Api21Impl.inflate(r0, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L29
                return r0
            L29:
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface InflateDelegate {
        android.graphics.drawable.Drawable createFromXmlInner(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r2, @androidx.annotation.NonNull android.util.AttributeSet r3, @androidx.annotation.Nullable android.content.res.Resources.Theme r4);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface ResourceManagerHooks {
        @androidx.annotation.Nullable
        android.graphics.drawable.Drawable createDrawableFor(@androidx.annotation.NonNull androidx.appcompat.widget.ResourceManagerInternal r1, @androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.DrawableRes int r3);

        @androidx.annotation.Nullable
        android.content.res.ColorStateList getTintListForDrawableRes(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.DrawableRes int r2);

        @androidx.annotation.Nullable
        android.graphics.PorterDuff.Mode getTintModeForDrawableRes(int r1);

        boolean tintDrawable(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.DrawableRes int r2, @androidx.annotation.NonNull android.graphics.drawable.Drawable r3);

        boolean tintDrawableUsingColorFilter(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.DrawableRes int r2, @androidx.annotation.NonNull android.graphics.drawable.Drawable r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class VdcInflateDelegate implements androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate {
        VdcInflateDelegate() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public android.graphics.drawable.Drawable createFromXmlInner(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r2, @androidx.annotation.NonNull android.util.AttributeSet r3, @androidx.annotation.Nullable android.content.res.Resources.Theme r4) {
                r0 = this;
                android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Exception -> L9
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r1 = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.createFromXmlInner(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L9
                return r1
            L9:
                r1 = 0
                return r1
        }
    }

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            androidx.appcompat.widget.ResourceManagerInternal.DEFAULT_MODE = r0
            androidx.appcompat.widget.ResourceManagerInternal$ColorFilterLruCache r0 = new androidx.appcompat.widget.ResourceManagerInternal$ColorFilterLruCache
            r1 = 6
            r0.<init>(r1)
            androidx.appcompat.widget.ResourceManagerInternal.COLOR_FILTER_CACHE = r0
            return
    }

    public ResourceManagerInternal() {
            r2 = this;
            r2.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = 0
            r0.<init>(r1)
            r2.mDrawableCaches = r0
            return
    }

    private void addDelegate(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate r3) {
            r1 = this;
            androidx.collection.SimpleArrayMap<java.lang.String, androidx.appcompat.widget.ResourceManagerInternal$InflateDelegate> r0 = r1.mDelegates
            if (r0 != 0) goto Lb
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            r1.mDelegates = r0
        Lb:
            androidx.collection.SimpleArrayMap<java.lang.String, androidx.appcompat.widget.ResourceManagerInternal$InflateDelegate> r0 = r1.mDelegates
            r0.put(r2, r3)
            return
    }

    private synchronized boolean addDrawableToCache(@androidx.annotation.NonNull android.content.Context r3, long r4, @androidx.annotation.NonNull android.graphics.drawable.Drawable r6) {
            r2 = this;
            monitor-enter(r2)
            android.graphics.drawable.Drawable$ConstantState r6 = r6.getConstantState()     // Catch: java.lang.Throwable -> L1c
            if (r6 == 0) goto L29
            java.util.WeakHashMap<android.content.Context, androidx.collection.LongSparseArray<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r2.mDrawableCaches     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L1c
            androidx.collection.LongSparseArray r0 = (androidx.collection.LongSparseArray) r0     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L1e
            androidx.collection.LongSparseArray r0 = new androidx.collection.LongSparseArray     // Catch: java.lang.Throwable -> L1c
            r0.<init>()     // Catch: java.lang.Throwable -> L1c
            java.util.WeakHashMap<android.content.Context, androidx.collection.LongSparseArray<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r1 = r2.mDrawableCaches     // Catch: java.lang.Throwable -> L1c
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r3 = move-exception
            goto L2c
        L1e:
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L1c
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L1c
            r0.put(r4, r3)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r2)
            r3 = 1
            return r3
        L29:
            monitor-exit(r2)
            r3 = 0
            return r3
        L2c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r3
    }

    private void addTintListToCache(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.DrawableRes int r4, @androidx.annotation.NonNull android.content.res.ColorStateList r5) {
            r2 = this;
            java.util.WeakHashMap<android.content.Context, androidx.collection.SparseArrayCompat<android.content.res.ColorStateList>> r0 = r2.mTintLists
            if (r0 != 0) goto Lb
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r2.mTintLists = r0
        Lb:
            java.util.WeakHashMap<android.content.Context, androidx.collection.SparseArrayCompat<android.content.res.ColorStateList>> r0 = r2.mTintLists
            java.lang.Object r0 = r0.get(r3)
            androidx.collection.SparseArrayCompat r0 = (androidx.collection.SparseArrayCompat) r0
            if (r0 != 0) goto L1f
            androidx.collection.SparseArrayCompat r0 = new androidx.collection.SparseArrayCompat
            r0.<init>()
            java.util.WeakHashMap<android.content.Context, androidx.collection.SparseArrayCompat<android.content.res.ColorStateList>> r1 = r2.mTintLists
            r1.put(r3, r0)
        L1f:
            r0.append(r4, r5)
            return
    }

    private void checkVectorDrawableSetup(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            boolean r0 = r1.mHasCheckedVectorDrawableSetup
            if (r0 == 0) goto L5
            goto L16
        L5:
            r0 = 1
            r1.mHasCheckedVectorDrawableSetup = r0
            int r0 = androidx.appcompat.resources.R.drawable.abc_vector_test
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r2, r0)
            if (r2 == 0) goto L17
            boolean r2 = isVectorDrawable(r2)
            if (r2 == 0) goto L17
        L16:
            return
        L17:
            r2 = 0
            r1.mHasCheckedVectorDrawableSetup = r2
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r2.<init>(r0)
            throw r2
    }

    private static long createCacheKey(android.util.TypedValue r4) {
            int r0 = r4.assetCookie
            long r0 = (long) r0
            r2 = 32
            long r0 = r0 << r2
            int r4 = r4.data
            long r2 = (long) r4
            long r0 = r0 | r2
            return r0
    }

    private android.graphics.drawable.Drawable createDrawableIfNeeded(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.DrawableRes int r6) {
            r4 = this;
            android.util.TypedValue r0 = r4.mTypedValue
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r4.mTypedValue = r0
        Lb:
            android.util.TypedValue r0 = r4.mTypedValue
            android.content.res.Resources r1 = r5.getResources()
            r2 = 1
            r1.getValue(r6, r0, r2)
            long r1 = createCacheKey(r0)
            android.graphics.drawable.Drawable r3 = r4.getCachedDrawable(r5, r1)
            if (r3 == 0) goto L20
            return r3
        L20:
            androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks r3 = r4.mHooks
            if (r3 != 0) goto L26
            r6 = 0
            goto L2a
        L26:
            android.graphics.drawable.Drawable r6 = r3.createDrawableFor(r4, r5, r6)
        L2a:
            if (r6 == 0) goto L34
            int r0 = r0.changingConfigurations
            r6.setChangingConfigurations(r0)
            r4.addDrawableToCache(r5, r1, r6)
        L34:
            return r6
    }

    private static android.graphics.PorterDuffColorFilter createTintFilter(android.content.res.ColorStateList r1, android.graphics.PorterDuff.Mode r2, int[] r3) {
            if (r1 == 0) goto Lf
            if (r2 != 0) goto L5
            goto Lf
        L5:
            r0 = 0
            int r1 = r1.getColorForState(r3, r0)
            android.graphics.PorterDuffColorFilter r1 = getPorterDuffColorFilter(r1, r2)
            return r1
        Lf:
            r1 = 0
            return r1
    }

    public static synchronized androidx.appcompat.widget.ResourceManagerInternal get() {
            java.lang.Class<androidx.appcompat.widget.ResourceManagerInternal> r0 = androidx.appcompat.widget.ResourceManagerInternal.class
            monitor-enter(r0)
            androidx.appcompat.widget.ResourceManagerInternal r1 = androidx.appcompat.widget.ResourceManagerInternal.INSTANCE     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L14
            androidx.appcompat.widget.ResourceManagerInternal r1 = new androidx.appcompat.widget.ResourceManagerInternal     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            androidx.appcompat.widget.ResourceManagerInternal.INSTANCE = r1     // Catch: java.lang.Throwable -> L12
            installDefaultInflateDelegates(r1)     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r1 = move-exception
            goto L18
        L14:
            androidx.appcompat.widget.ResourceManagerInternal r1 = androidx.appcompat.widget.ResourceManagerInternal.INSTANCE     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r1
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    private synchronized android.graphics.drawable.Drawable getCachedDrawable(@androidx.annotation.NonNull android.content.Context r4, long r5) {
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, androidx.collection.LongSparseArray<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.mDrawableCaches     // Catch: java.lang.Throwable -> L28
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L28
            androidx.collection.LongSparseArray r0 = (androidx.collection.LongSparseArray) r0     // Catch: java.lang.Throwable -> L28
            r1 = 0
            if (r0 != 0) goto Le
            monitor-exit(r3)
            return r1
        Le:
            java.lang.Object r2 = r0.get(r5)     // Catch: java.lang.Throwable -> L28
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L28
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L2a
            android.content.res.Resources r4 = r4.getResources()     // Catch: java.lang.Throwable -> L28
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r3)
            return r4
        L28:
            r4 = move-exception
            goto L2f
        L2a:
            r0.remove(r5)     // Catch: java.lang.Throwable -> L28
        L2d:
            monitor-exit(r3)
            return r1
        L2f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
            throw r4
    }

    public static synchronized android.graphics.PorterDuffColorFilter getPorterDuffColorFilter(int r3, android.graphics.PorterDuff.Mode r4) {
            java.lang.Class<androidx.appcompat.widget.ResourceManagerInternal> r0 = androidx.appcompat.widget.ResourceManagerInternal.class
            monitor-enter(r0)
            androidx.appcompat.widget.ResourceManagerInternal$ColorFilterLruCache r1 = androidx.appcompat.widget.ResourceManagerInternal.COLOR_FILTER_CACHE     // Catch: java.lang.Throwable -> L14
            android.graphics.PorterDuffColorFilter r2 = r1.get(r3, r4)     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L16
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter     // Catch: java.lang.Throwable -> L14
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L14
            r1.put(r3, r4, r2)     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r3 = move-exception
            goto L18
        L16:
            monitor-exit(r0)
            return r2
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r3
    }

    private android.content.res.ColorStateList getTintListFromCache(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.DrawableRes int r4) {
            r2 = this;
            java.util.WeakHashMap<android.content.Context, androidx.collection.SparseArrayCompat<android.content.res.ColorStateList>> r0 = r2.mTintLists
            r1 = 0
            if (r0 == 0) goto L14
            java.lang.Object r3 = r0.get(r3)
            androidx.collection.SparseArrayCompat r3 = (androidx.collection.SparseArrayCompat) r3
            if (r3 == 0) goto L14
            java.lang.Object r3 = r3.get(r4)
            android.content.res.ColorStateList r3 = (android.content.res.ColorStateList) r3
            return r3
        L14:
            return r1
    }

    private static void installDefaultInflateDelegates(@androidx.annotation.NonNull androidx.appcompat.widget.ResourceManagerInternal r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 >= r1) goto L2f
            androidx.appcompat.widget.ResourceManagerInternal$VdcInflateDelegate r0 = new androidx.appcompat.widget.ResourceManagerInternal$VdcInflateDelegate
            r0.<init>()
            java.lang.String r1 = "vector"
            r2.addDelegate(r1, r0)
            androidx.appcompat.widget.ResourceManagerInternal$AvdcInflateDelegate r0 = new androidx.appcompat.widget.ResourceManagerInternal$AvdcInflateDelegate
            r0.<init>()
            java.lang.String r1 = "animated-vector"
            r2.addDelegate(r1, r0)
            androidx.appcompat.widget.ResourceManagerInternal$AsldcInflateDelegate r0 = new androidx.appcompat.widget.ResourceManagerInternal$AsldcInflateDelegate
            r0.<init>()
            java.lang.String r1 = "animated-selector"
            r2.addDelegate(r1, r0)
            androidx.appcompat.widget.ResourceManagerInternal$DrawableDelegate r0 = new androidx.appcompat.widget.ResourceManagerInternal$DrawableDelegate
            r0.<init>()
            java.lang.String r1 = "drawable"
            r2.addDelegate(r1, r0)
        L2f:
            return
    }

    private static boolean isVectorDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable r1) {
            boolean r0 = r1 instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat
            if (r0 != 0) goto L17
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r0 = "android.graphics.drawable.VectorDrawable"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L15
            goto L17
        L15:
            r1 = 0
            return r1
        L17:
            r1 = 1
            return r1
    }

    private android.graphics.drawable.Drawable loadDrawableFromDelegates(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.DrawableRes int r12) {
            r10 = this;
            androidx.collection.SimpleArrayMap<java.lang.String, androidx.appcompat.widget.ResourceManagerInternal$InflateDelegate> r0 = r10.mDelegates
            r1 = 0
            if (r0 == 0) goto Lac
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lac
            androidx.collection.SparseArrayCompat<java.lang.String> r0 = r10.mKnownDrawableIdTags
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L28
            java.lang.Object r0 = r0.get(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L27
            if (r0 == 0) goto L2f
            androidx.collection.SimpleArrayMap<java.lang.String, androidx.appcompat.widget.ResourceManagerInternal$InflateDelegate> r3 = r10.mDelegates
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L2f
        L27:
            return r1
        L28:
            androidx.collection.SparseArrayCompat r0 = new androidx.collection.SparseArrayCompat
            r0.<init>()
            r10.mKnownDrawableIdTags = r0
        L2f:
            android.util.TypedValue r0 = r10.mTypedValue
            if (r0 != 0) goto L3a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.mTypedValue = r0
        L3a:
            android.util.TypedValue r0 = r10.mTypedValue
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = createCacheKey(r0)
            android.graphics.drawable.Drawable r6 = r10.getCachedDrawable(r11, r4)
            if (r6 == 0) goto L4f
            return r6
        L4f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto La4
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto La4
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch: java.lang.Exception -> L8f
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch: java.lang.Exception -> L8f
        L67:
            int r8 = r1.next()     // Catch: java.lang.Exception -> L8f
            r9 = 2
            if (r8 == r9) goto L71
            if (r8 == r3) goto L71
            goto L67
        L71:
            if (r8 != r9) goto L9c
            java.lang.String r3 = r1.getName()     // Catch: java.lang.Exception -> L8f
            androidx.collection.SparseArrayCompat<java.lang.String> r8 = r10.mKnownDrawableIdTags     // Catch: java.lang.Exception -> L8f
            r8.append(r12, r3)     // Catch: java.lang.Exception -> L8f
            androidx.collection.SimpleArrayMap<java.lang.String, androidx.appcompat.widget.ResourceManagerInternal$InflateDelegate> r8 = r10.mDelegates     // Catch: java.lang.Exception -> L8f
            java.lang.Object r3 = r8.get(r3)     // Catch: java.lang.Exception -> L8f
            androidx.appcompat.widget.ResourceManagerInternal$InflateDelegate r3 = (androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate) r3     // Catch: java.lang.Exception -> L8f
            if (r3 == 0) goto L91
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch: java.lang.Exception -> L8f
            android.graphics.drawable.Drawable r6 = r3.createFromXmlInner(r11, r1, r7, r8)     // Catch: java.lang.Exception -> L8f
            goto L91
        L8f:
            goto La4
        L91:
            if (r6 == 0) goto La4
            int r0 = r0.changingConfigurations     // Catch: java.lang.Exception -> L8f
            r6.setChangingConfigurations(r0)     // Catch: java.lang.Exception -> L8f
            r10.addDrawableToCache(r11, r4, r6)     // Catch: java.lang.Exception -> L8f
            goto La4
        L9c:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Exception -> L8f
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch: java.lang.Exception -> L8f
            throw r11     // Catch: java.lang.Exception -> L8f
        La4:
            if (r6 != 0) goto Lab
            androidx.collection.SparseArrayCompat<java.lang.String> r11 = r10.mKnownDrawableIdTags
            r11.append(r12, r2)
        Lab:
            return r6
        Lac:
            return r1
    }

    private android.graphics.drawable.Drawable tintDrawable(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.DrawableRes int r3, boolean r4, @androidx.annotation.NonNull android.graphics.drawable.Drawable r5) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.getTintList(r2, r3)
            if (r0 == 0) goto L21
            boolean r2 = androidx.appcompat.widget.DrawableUtils.canSafelyMutateDrawable(r5)
            if (r2 == 0) goto L10
            android.graphics.drawable.Drawable r5 = r5.mutate()
        L10:
            android.graphics.drawable.Drawable r2 = androidx.core.graphics.drawable.DrawableCompat.wrap(r5)
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r2, r0)
            android.graphics.PorterDuff$Mode r3 = r1.getTintMode(r3)
            if (r3 == 0) goto L20
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r2, r3)
        L20:
            return r2
        L21:
            androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks r0 = r1.mHooks
            if (r0 == 0) goto L2c
            boolean r0 = r0.tintDrawable(r2, r3, r5)
            if (r0 == 0) goto L2c
            goto L36
        L2c:
            boolean r2 = r1.tintDrawableUsingColorFilter(r2, r3, r5)
            if (r2 != 0) goto L36
            if (r4 == 0) goto L36
            r2 = 0
            return r2
        L36:
            return r5
    }

    static void tintDrawable(android.graphics.drawable.Drawable r2, androidx.appcompat.widget.TintInfo r3, int[] r4) {
            int[] r0 = r2.getState()
            boolean r1 = androidx.appcompat.widget.DrawableUtils.canSafelyMutateDrawable(r2)
            if (r1 == 0) goto L12
            android.graphics.drawable.Drawable r1 = r2.mutate()
            if (r1 != r2) goto L11
            goto L12
        L11:
            return
        L12:
            boolean r1 = r2 instanceof android.graphics.drawable.LayerDrawable
            if (r1 == 0) goto L25
            boolean r1 = r2.isStateful()
            if (r1 == 0) goto L25
            r1 = 0
            int[] r1 = new int[r1]
            r2.setState(r1)
            r2.setState(r0)
        L25:
            boolean r0 = r3.mHasTintList
            if (r0 != 0) goto L32
            boolean r1 = r3.mHasTintMode
            if (r1 == 0) goto L2e
            goto L32
        L2e:
            r2.clearColorFilter()
            goto L48
        L32:
            if (r0 == 0) goto L37
            android.content.res.ColorStateList r0 = r3.mTintList
            goto L38
        L37:
            r0 = 0
        L38:
            boolean r1 = r3.mHasTintMode
            if (r1 == 0) goto L3f
            android.graphics.PorterDuff$Mode r3 = r3.mTintMode
            goto L41
        L3f:
            android.graphics.PorterDuff$Mode r3 = androidx.appcompat.widget.ResourceManagerInternal.DEFAULT_MODE
        L41:
            android.graphics.PorterDuffColorFilter r3 = createTintFilter(r0, r3, r4)
            r2.setColorFilter(r3)
        L48:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r3 > r4) goto L51
            r2.invalidateSelf()
        L51:
            return
    }

    public synchronized android.graphics.drawable.Drawable getDrawable(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.DrawableRes int r3) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r2, r3, r0)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return r2
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    synchronized android.graphics.drawable.Drawable getDrawable(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.DrawableRes int r3, boolean r4) {
            r1 = this;
            monitor-enter(r1)
            r1.checkVectorDrawableSetup(r2)     // Catch: java.lang.Throwable -> Lf
            android.graphics.drawable.Drawable r0 = r1.loadDrawableFromDelegates(r2, r3)     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L11
            android.graphics.drawable.Drawable r0 = r1.createDrawableIfNeeded(r2, r3)     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L24
        L11:
            if (r0 != 0) goto L17
            android.graphics.drawable.Drawable r0 = androidx.core.content.ContextCompat.getDrawable(r2, r3)     // Catch: java.lang.Throwable -> Lf
        L17:
            if (r0 == 0) goto L1d
            android.graphics.drawable.Drawable r0 = r1.tintDrawable(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> Lf
        L1d:
            if (r0 == 0) goto L22
            androidx.appcompat.widget.DrawableUtils.fixDrawable(r0)     // Catch: java.lang.Throwable -> Lf
        L22:
            monitor-exit(r1)
            return r0
        L24:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    synchronized android.content.res.ColorStateList getTintList(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.DrawableRes int r3) {
            r1 = this;
            monitor-enter(r1)
            android.content.res.ColorStateList r0 = r1.getTintListFromCache(r2, r3)     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks r0 = r1.mHooks     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto Ld
            r0 = 0
            goto L11
        Ld:
            android.content.res.ColorStateList r0 = r0.getTintListForDrawableRes(r2, r3)     // Catch: java.lang.Throwable -> L17
        L11:
            if (r0 == 0) goto L19
            r1.addTintListToCache(r2, r3, r0)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r2 = move-exception
            goto L1b
        L19:
            monitor-exit(r1)
            return r0
        L1b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r2
    }

    android.graphics.PorterDuff.Mode getTintMode(int r2) {
            r1 = this;
            androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks r0 = r1.mHooks
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            android.graphics.PorterDuff$Mode r2 = r0.getTintModeForDrawableRes(r2)
            return r2
    }

    public synchronized void onConfigurationChanged(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.WeakHashMap<android.content.Context, androidx.collection.LongSparseArray<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r1.mDrawableCaches     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> Lf
            androidx.collection.LongSparseArray r2 = (androidx.collection.LongSparseArray) r2     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            r2.clear()     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L13
        L11:
            monitor-exit(r1)
            return
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    synchronized android.graphics.drawable.Drawable onDrawableLoadedFromResources(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull androidx.appcompat.widget.VectorEnabledTintResources r3, @androidx.annotation.DrawableRes int r4) {
            r1 = this;
            monitor-enter(r1)
            android.graphics.drawable.Drawable r0 = r1.loadDrawableFromDelegates(r2, r4)     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto Le
            android.graphics.drawable.Drawable r0 = r3.getDrawableCanonical(r4)     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r2 = move-exception
            goto L1a
        Le:
            if (r0 == 0) goto L17
            r3 = 0
            android.graphics.drawable.Drawable r2 = r1.tintDrawable(r2, r4, r3, r0)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return r2
        L17:
            monitor-exit(r1)
            r2 = 0
            return r2
        L1a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }

    public synchronized void setHooks(androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks r1) {
            r0 = this;
            monitor-enter(r0)
            r0.mHooks = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    boolean tintDrawableUsingColorFilter(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.DrawableRes int r3, @androidx.annotation.NonNull android.graphics.drawable.Drawable r4) {
            r1 = this;
            androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks r0 = r1.mHooks
            if (r0 == 0) goto Lc
            boolean r2 = r0.tintDrawableUsingColorFilter(r2, r3, r4)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }
}
