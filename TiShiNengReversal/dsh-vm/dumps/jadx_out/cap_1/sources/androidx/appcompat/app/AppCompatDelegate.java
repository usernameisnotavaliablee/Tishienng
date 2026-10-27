package androidx.appcompat.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class AppCompatDelegate {
    static final boolean DEBUG = false;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;
    public static final int FEATURE_SUPPORT_ACTION_BAR = 108;
    public static final int FEATURE_SUPPORT_ACTION_BAR_OVERLAY = 109;

    @java.lang.Deprecated
    public static final int MODE_NIGHT_AUTO = 0;
    public static final int MODE_NIGHT_AUTO_BATTERY = 3;

    @java.lang.Deprecated
    public static final int MODE_NIGHT_AUTO_TIME = 0;
    public static final int MODE_NIGHT_FOLLOW_SYSTEM = -1;
    public static final int MODE_NIGHT_NO = 1;
    public static final int MODE_NIGHT_UNSPECIFIED = -100;
    public static final int MODE_NIGHT_YES = 2;
    static final java.lang.String TAG = "AppCompatDelegate";
    private static final androidx.collection.ArraySet<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> sActivityDelegates = null;
    private static final java.lang.Object sActivityDelegatesLock = null;
    private static final java.lang.Object sAppLocalesStorageSyncLock = null;
    private static int sDefaultNightMode;
    private static java.lang.Boolean sIsAutoStoreLocalesOptedIn;
    private static boolean sIsFrameworkSyncChecked;
    private static androidx.core.os.LocaleListCompat sRequestedAppLocales;
    static androidx.appcompat.app.AppLocalesStorageHelper.SerialExecutor sSerialExecutorForLocalesStorage;
    private static androidx.core.os.LocaleListCompat sStoredAppLocales;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(24)
    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.os.LocaleList localeListForLanguageTags(java.lang.String r0) {
                android.os.LocaleList r0 = android.os.LocaleList.forLanguageTags(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(33)
    static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.os.LocaleList localeManagerGetApplicationLocales(java.lang.Object r0) {
                android.app.LocaleManager r0 = (android.app.LocaleManager) r0
                android.os.LocaleList r0 = r0.getApplicationLocales()
                return r0
        }

        @androidx.annotation.DoNotInline
        static void localeManagerSetApplicationLocales(java.lang.Object r0, android.os.LocaleList r1) {
                android.app.LocaleManager r0 = (android.app.LocaleManager) r0
                r0.setApplicationLocales(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface NightMode {
    }

    static {
            androidx.appcompat.app.AppLocalesStorageHelper$SerialExecutor r0 = new androidx.appcompat.app.AppLocalesStorageHelper$SerialExecutor
            androidx.appcompat.app.AppLocalesStorageHelper$ThreadPerTaskExecutor r1 = new androidx.appcompat.app.AppLocalesStorageHelper$ThreadPerTaskExecutor
            r1.<init>()
            r0.<init>(r1)
            androidx.appcompat.app.AppCompatDelegate.sSerialExecutorForLocalesStorage = r0
            r0 = -100
            androidx.appcompat.app.AppCompatDelegate.sDefaultNightMode = r0
            r0 = 0
            androidx.appcompat.app.AppCompatDelegate.sRequestedAppLocales = r0
            androidx.appcompat.app.AppCompatDelegate.sStoredAppLocales = r0
            androidx.appcompat.app.AppCompatDelegate.sIsAutoStoreLocalesOptedIn = r0
            r0 = 0
            androidx.appcompat.app.AppCompatDelegate.sIsFrameworkSyncChecked = r0
            androidx.collection.ArraySet r0 = new androidx.collection.ArraySet
            r0.<init>()
            androidx.appcompat.app.AppCompatDelegate.sActivityDelegates = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.appcompat.app.AppCompatDelegate.sActivityDelegatesLock = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.appcompat.app.AppCompatDelegate.sAppLocalesStorageSyncLock = r0
            return
    }

    AppCompatDelegate() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void a(android.content.Context r0) {
            androidx.appcompat.app.AppLocalesStorageHelper.syncLocalesToFramework(r0)
            r0 = 1
            androidx.appcompat.app.AppCompatDelegate.sIsFrameworkSyncChecked = r0
            return
    }

    static void addActiveDelegate(@androidx.annotation.NonNull androidx.appcompat.app.AppCompatDelegate r3) {
            java.lang.Object r0 = androidx.appcompat.app.AppCompatDelegate.sActivityDelegatesLock
            monitor-enter(r0)
            removeDelegateFromActives(r3)     // Catch: java.lang.Throwable -> L12
            androidx.collection.ArraySet<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> r1 = androidx.appcompat.app.AppCompatDelegate.sActivityDelegates     // Catch: java.lang.Throwable -> L12
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L12
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L12
            r1.add(r2)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    private static void applyDayNightToActiveDelegates() {
            java.lang.Object r0 = androidx.appcompat.app.AppCompatDelegate.sActivityDelegatesLock
            monitor-enter(r0)
            androidx.collection.ArraySet<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> r1 = androidx.appcompat.app.AppCompatDelegate.sActivityDelegates     // Catch: java.lang.Throwable -> L21
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L21
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L21
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L21
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L21
            androidx.appcompat.app.AppCompatDelegate r2 = (androidx.appcompat.app.AppCompatDelegate) r2     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L9
            r2.applyDayNight()     // Catch: java.lang.Throwable -> L21
            goto L9
        L21:
            r1 = move-exception
            goto L25
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r1
    }

    private static void applyLocalesToActiveDelegates() {
            androidx.collection.ArraySet<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> r0 = androidx.appcompat.app.AppCompatDelegate.sActivityDelegates
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            androidx.appcompat.app.AppCompatDelegate r1 = (androidx.appcompat.app.AppCompatDelegate) r1
            if (r1 == 0) goto L6
            r1.applyAppLocales()
            goto L6
        L1e:
            return
    }

    public static /* synthetic */ void b(android.content.Context r0) {
            syncRequestedAndStoredLocales(r0)
            return
    }

    @androidx.annotation.NonNull
    public static androidx.appcompat.app.AppCompatDelegate create(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.Nullable androidx.appcompat.app.AppCompatCallback r2) {
            androidx.appcompat.app.AppCompatDelegateImpl r0 = new androidx.appcompat.app.AppCompatDelegateImpl
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.appcompat.app.AppCompatDelegate create(@androidx.annotation.NonNull android.app.Dialog r1, @androidx.annotation.Nullable androidx.appcompat.app.AppCompatCallback r2) {
            androidx.appcompat.app.AppCompatDelegateImpl r0 = new androidx.appcompat.app.AppCompatDelegateImpl
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.appcompat.app.AppCompatDelegate create(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull android.app.Activity r2, @androidx.annotation.Nullable androidx.appcompat.app.AppCompatCallback r3) {
            androidx.appcompat.app.AppCompatDelegateImpl r0 = new androidx.appcompat.app.AppCompatDelegateImpl
            r0.<init>(r1, r2, r3)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.appcompat.app.AppCompatDelegate create(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull android.view.Window r2, @androidx.annotation.Nullable androidx.appcompat.app.AppCompatCallback r3) {
            androidx.appcompat.app.AppCompatDelegateImpl r0 = new androidx.appcompat.app.AppCompatDelegateImpl
            r0.<init>(r1, r2, r3)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.AnyThread
    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    public static androidx.core.os.LocaleListCompat getApplicationLocales() {
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r0 == 0) goto L15
            java.lang.Object r0 = getLocaleManagerForApplication()
            if (r0 == 0) goto L1a
            android.os.LocaleList r0 = androidx.appcompat.app.AppCompatDelegate.Api33Impl.localeManagerGetApplicationLocales(r0)
            androidx.core.os.LocaleListCompat r0 = androidx.core.os.LocaleListCompat.wrap(r0)
            return r0
        L15:
            androidx.core.os.LocaleListCompat r0 = androidx.appcompat.app.AppCompatDelegate.sRequestedAppLocales
            if (r0 == 0) goto L1a
            return r0
        L1a:
            androidx.core.os.LocaleListCompat r0 = androidx.core.os.LocaleListCompat.getEmptyLocaleList()
            return r0
    }

    public static int getDefaultNightMode() {
            int r0 = androidx.appcompat.app.AppCompatDelegate.sDefaultNightMode
            return r0
    }

    @androidx.annotation.RequiresApi(33)
    static java.lang.Object getLocaleManagerForApplication() {
            androidx.collection.ArraySet<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> r0 = androidx.appcompat.app.AppCompatDelegate.sActivityDelegates
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            androidx.appcompat.app.AppCompatDelegate r1 = (androidx.appcompat.app.AppCompatDelegate) r1
            if (r1 == 0) goto L6
            android.content.Context r1 = r1.getContextForDelegate()
            if (r1 == 0) goto L6
            java.lang.String r0 = "locale"
            java.lang.Object r0 = r1.getSystemService(r0)
            return r0
        L27:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    static androidx.core.os.LocaleListCompat getRequestedAppLocales() {
            androidx.core.os.LocaleListCompat r0 = androidx.appcompat.app.AppCompatDelegate.sRequestedAppLocales
            return r0
    }

    @androidx.annotation.Nullable
    static androidx.core.os.LocaleListCompat getStoredAppLocales() {
            androidx.core.os.LocaleListCompat r0 = androidx.appcompat.app.AppCompatDelegate.sStoredAppLocales
            return r0
    }

    static boolean isAutoStorageOptedIn(android.content.Context r1) {
            java.lang.Boolean r0 = androidx.appcompat.app.AppCompatDelegate.sIsAutoStoreLocalesOptedIn
            if (r0 != 0) goto L1d
            android.content.pm.ServiceInfo r1 = androidx.appcompat.app.AppLocalesMetadataHolderService.getServiceInfo(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            android.os.Bundle r1 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            if (r1 == 0) goto L1d
            java.lang.String r0 = "autoStoreLocales"
            boolean r1 = r1.getBoolean(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            androidx.appcompat.app.AppCompatDelegate.sIsAutoStoreLocalesOptedIn = r1     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            goto L1d
        L19:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            androidx.appcompat.app.AppCompatDelegate.sIsAutoStoreLocalesOptedIn = r1
        L1d:
            java.lang.Boolean r1 = androidx.appcompat.app.AppCompatDelegate.sIsAutoStoreLocalesOptedIn
            boolean r1 = r1.booleanValue()
            return r1
    }

    public static boolean isCompatVectorFromResourcesEnabled() {
            boolean r0 = androidx.appcompat.widget.VectorEnabledTintResources.isCompatVectorFromResourcesEnabled()
            return r0
    }

    static void removeActivityDelegate(@androidx.annotation.NonNull androidx.appcompat.app.AppCompatDelegate r1) {
            java.lang.Object r0 = androidx.appcompat.app.AppCompatDelegate.sActivityDelegatesLock
            monitor-enter(r0)
            removeDelegateFromActives(r1)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    private static void removeDelegateFromActives(@androidx.annotation.NonNull androidx.appcompat.app.AppCompatDelegate r3) {
            java.lang.Object r0 = androidx.appcompat.app.AppCompatDelegate.sActivityDelegatesLock
            monitor-enter(r0)
            androidx.collection.ArraySet<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> r1 = androidx.appcompat.app.AppCompatDelegate.sActivityDelegates     // Catch: java.lang.Throwable -> L23
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L23
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L23
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L23
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L23
            androidx.appcompat.app.AppCompatDelegate r2 = (androidx.appcompat.app.AppCompatDelegate) r2     // Catch: java.lang.Throwable -> L23
            if (r2 == r3) goto L1f
            if (r2 != 0) goto L9
        L1f:
            r1.remove()     // Catch: java.lang.Throwable -> L23
            goto L9
        L23:
            r3 = move-exception
            goto L27
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r3
    }

    @androidx.annotation.VisibleForTesting
    static void resetStaticRequestedAndStoredLocales() {
            r0 = 0
            androidx.appcompat.app.AppCompatDelegate.sRequestedAppLocales = r0
            androidx.appcompat.app.AppCompatDelegate.sStoredAppLocales = r0
            return
    }

    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    public static void setApplicationLocales(@androidx.annotation.NonNull androidx.core.os.LocaleListCompat r1) {
            java.util.Objects.requireNonNull(r1)
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r0 == 0) goto L1b
            java.lang.Object r0 = getLocaleManagerForApplication()
            if (r0 == 0) goto L30
            java.lang.String r1 = r1.toLanguageTags()
            android.os.LocaleList r1 = androidx.appcompat.app.AppCompatDelegate.Api24Impl.localeListForLanguageTags(r1)
            androidx.appcompat.app.AppCompatDelegate.Api33Impl.localeManagerSetApplicationLocales(r0, r1)
            return
        L1b:
            androidx.core.os.LocaleListCompat r0 = androidx.appcompat.app.AppCompatDelegate.sRequestedAppLocales
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L30
            java.lang.Object r0 = androidx.appcompat.app.AppCompatDelegate.sActivityDelegatesLock
            monitor-enter(r0)
            androidx.appcompat.app.AppCompatDelegate.sRequestedAppLocales = r1     // Catch: java.lang.Throwable -> L2d
            applyLocalesToActiveDelegates()     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            return
        L2d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            throw r1
        L30:
            return
    }

    public static void setCompatVectorFromResourcesEnabled(boolean r0) {
            androidx.appcompat.widget.VectorEnabledTintResources.setCompatVectorFromResourcesEnabled(r0)
            return
    }

    public static void setDefaultNightMode(int r1) {
            r0 = -1
            if (r1 == r0) goto Lf
            if (r1 == 0) goto Lf
            r0 = 1
            if (r1 == r0) goto Lf
            r0 = 2
            if (r1 == r0) goto Lf
            r0 = 3
            if (r1 == r0) goto Lf
            return
        Lf:
            int r0 = androidx.appcompat.app.AppCompatDelegate.sDefaultNightMode
            if (r0 == r1) goto L18
            androidx.appcompat.app.AppCompatDelegate.sDefaultNightMode = r1
            applyDayNightToActiveDelegates()
        L18:
            return
    }

    @androidx.annotation.VisibleForTesting
    static void setIsAutoStoreLocalesOptedIn(boolean r0) {
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            androidx.appcompat.app.AppCompatDelegate.sIsAutoStoreLocalesOptedIn = r0
            return
    }

    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    static void syncRequestedAndStoredLocales(android.content.Context r3) {
            boolean r0 = isAutoStorageOptedIn(r3)
            if (r0 != 0) goto L7
            goto L1b
        L7:
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r0 == 0) goto L1c
            boolean r0 = androidx.appcompat.app.AppCompatDelegate.sIsFrameworkSyncChecked
            if (r0 != 0) goto L1b
            androidx.appcompat.app.AppLocalesStorageHelper$SerialExecutor r0 = androidx.appcompat.app.AppCompatDelegate.sSerialExecutorForLocalesStorage
            androidx.appcompat.app.a r1 = new androidx.appcompat.app.a
            r1.<init>(r3)
            r0.execute(r1)
        L1b:
            return
        L1c:
            java.lang.Object r0 = androidx.appcompat.app.AppCompatDelegate.sAppLocalesStorageSyncLock
            monitor-enter(r0)
            androidx.core.os.LocaleListCompat r1 = androidx.appcompat.app.AppCompatDelegate.sRequestedAppLocales     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L43
            androidx.core.os.LocaleListCompat r1 = androidx.appcompat.app.AppCompatDelegate.sStoredAppLocales     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L34
            java.lang.String r3 = androidx.appcompat.app.AppLocalesStorageHelper.readLocales(r3)     // Catch: java.lang.Throwable -> L32
            androidx.core.os.LocaleListCompat r3 = androidx.core.os.LocaleListCompat.forLanguageTags(r3)     // Catch: java.lang.Throwable -> L32
            androidx.appcompat.app.AppCompatDelegate.sStoredAppLocales = r3     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r3 = move-exception
            goto L58
        L34:
            androidx.core.os.LocaleListCompat r3 = androidx.appcompat.app.AppCompatDelegate.sStoredAppLocales     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return
        L3e:
            androidx.core.os.LocaleListCompat r3 = androidx.appcompat.app.AppCompatDelegate.sStoredAppLocales     // Catch: java.lang.Throwable -> L32
            androidx.appcompat.app.AppCompatDelegate.sRequestedAppLocales = r3     // Catch: java.lang.Throwable -> L32
            goto L56
        L43:
            androidx.core.os.LocaleListCompat r2 = androidx.appcompat.app.AppCompatDelegate.sStoredAppLocales     // Catch: java.lang.Throwable -> L32
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L56
            androidx.core.os.LocaleListCompat r1 = androidx.appcompat.app.AppCompatDelegate.sRequestedAppLocales     // Catch: java.lang.Throwable -> L32
            androidx.appcompat.app.AppCompatDelegate.sStoredAppLocales = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = r1.toLanguageTags()     // Catch: java.lang.Throwable -> L32
            androidx.appcompat.app.AppLocalesStorageHelper.persistLocales(r3, r1)     // Catch: java.lang.Throwable -> L32
        L56:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return
        L58:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r3
    }

    public abstract void addContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2);

    boolean applyAppLocales() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract boolean applyDayNight();

    void asyncExecuteSyncRequestedAndStoredLocales(android.content.Context r3) {
            r2 = this;
            androidx.appcompat.app.AppLocalesStorageHelper$SerialExecutor r0 = androidx.appcompat.app.AppCompatDelegate.sSerialExecutorForLocalesStorage
            androidx.appcompat.app.b r1 = new androidx.appcompat.app.b
            r1.<init>(r3)
            r0.execute(r1)
            return
    }

    @java.lang.Deprecated
    public void attachBaseContext(android.content.Context r1) {
            r0 = this;
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CallSuper
    public android.content.Context attachBaseContext2(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.attachBaseContext(r1)
            return r1
    }

    public abstract android.view.View createView(@androidx.annotation.Nullable android.view.View r1, java.lang.String r2, @androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull android.util.AttributeSet r4);

    @androidx.annotation.Nullable
    public abstract <T extends android.view.View> T findViewById(@androidx.annotation.IdRes int r1);

    @androidx.annotation.Nullable
    public android.content.Context getContextForDelegate() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public abstract androidx.appcompat.app.ActionBarDrawerToggle.Delegate getDrawerToggleDelegate();

    public int getLocalNightMode() {
            r1 = this;
            r0 = -100
            return r0
    }

    public abstract android.view.MenuInflater getMenuInflater();

    @androidx.annotation.Nullable
    public abstract androidx.appcompat.app.ActionBar getSupportActionBar();

    public abstract boolean hasWindowFeature(int r1);

    public abstract void installViewFactory();

    public abstract void invalidateOptionsMenu();

    public abstract boolean isHandleNativeActionModesEnabled();

    public abstract void onConfigurationChanged(android.content.res.Configuration r1);

    public abstract void onCreate(android.os.Bundle r1);

    public abstract void onDestroy();

    public abstract void onPostCreate(android.os.Bundle r1);

    public abstract void onPostResume();

    public abstract void onSaveInstanceState(android.os.Bundle r1);

    public abstract void onStart();

    public abstract void onStop();

    public abstract boolean requestWindowFeature(int r1);

    public abstract void setContentView(@androidx.annotation.LayoutRes int r1);

    public abstract void setContentView(android.view.View r1);

    public abstract void setContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2);

    public abstract void setHandleNativeActionModesEnabled(boolean r1);

    @androidx.annotation.RequiresApi(17)
    public abstract void setLocalNightMode(int r1);

    @androidx.annotation.RequiresApi(33)
    @androidx.annotation.CallSuper
    public void setOnBackInvokedDispatcher(@androidx.annotation.Nullable android.window.OnBackInvokedDispatcher r1) {
            r0 = this;
            return
    }

    public abstract void setSupportActionBar(@androidx.annotation.Nullable androidx.appcompat.widget.Toolbar r1);

    public void setTheme(@androidx.annotation.StyleRes int r1) {
            r0 = this;
            return
    }

    public abstract void setTitle(@androidx.annotation.Nullable java.lang.CharSequence r1);

    @androidx.annotation.Nullable
    public abstract androidx.appcompat.view.ActionMode startSupportActionMode(@androidx.annotation.NonNull androidx.appcompat.view.ActionMode.Callback r1);
}
