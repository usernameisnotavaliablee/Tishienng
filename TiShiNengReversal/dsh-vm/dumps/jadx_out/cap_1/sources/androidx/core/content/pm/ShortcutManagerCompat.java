package androidx.core.content.pm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ShortcutManagerCompat {

    @androidx.annotation.VisibleForTesting
    static final java.lang.String ACTION_INSTALL_SHORTCUT = "com.android.launcher.action.INSTALL_SHORTCUT";
    private static final int DEFAULT_MAX_ICON_DIMENSION_DP = 96;
    private static final int DEFAULT_MAX_ICON_DIMENSION_LOWRAM_DP = 48;
    public static final java.lang.String EXTRA_SHORTCUT_ID = "android.intent.extra.shortcut.ID";
    public static final int FLAG_MATCH_CACHED = 8;
    public static final int FLAG_MATCH_DYNAMIC = 2;
    public static final int FLAG_MATCH_MANIFEST = 1;
    public static final int FLAG_MATCH_PINNED = 4;

    @androidx.annotation.VisibleForTesting
    static final java.lang.String INSTALL_SHORTCUT_PERMISSION = "com.android.launcher.permission.INSTALL_SHORTCUT";
    private static final java.lang.String SHORTCUT_LISTENER_INTENT_FILTER_ACTION = "androidx.core.content.pm.SHORTCUT_LISTENER";
    private static final java.lang.String SHORTCUT_LISTENER_META_DATA_KEY = "androidx.core.content.pm.shortcut_listener_impl";
    private static volatile java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> sShortcutInfoChangeListeners;
    private static volatile androidx.core.content.pm.ShortcutInfoCompatSaver<?> sShortcutInfoCompatSaver;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(25)
    private static class Api25Impl {
        private Api25Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.lang.String getShortcutInfoWithLowestRank(@androidx.annotation.NonNull java.util.List<android.content.pm.ShortcutInfo> r5) {
                java.util.Iterator r5 = r5.iterator()
                r0 = -1
                r1 = 0
            L6:
                boolean r2 = r5.hasNext()
                if (r2 == 0) goto L24
                java.lang.Object r2 = r5.next()
                android.content.pm.ShortcutInfo r2 = (android.content.pm.ShortcutInfo) r2
                int r3 = r2.getRank()
                if (r3 <= r0) goto L6
                java.lang.String r0 = r2.getId()
                int r1 = r2.getRank()
                r4 = r1
                r1 = r0
                r0 = r4
                goto L6
            L24:
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ShortcutMatchFlags {
    }

    static {
            return
    }

    private ShortcutManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean addDynamicShortcuts(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r6) {
            r0 = 1
            java.util.List r1 = removeShortcutsExcludedFromSurface(r6, r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 > r3) goto Le
            convertUriIconsToBitmapIcons(r5, r1)
        Le:
            r3 = 25
            if (r2 < r3) goto L43
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r1.iterator()
        L1b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2f
            java.lang.Object r4 = r3.next()
            androidx.core.content.pm.ShortcutInfoCompat r4 = (androidx.core.content.pm.ShortcutInfoCompat) r4
            android.content.pm.ShortcutInfo r4 = r4.toShortcutInfo()
            r2.add(r4)
            goto L1b
        L2f:
            java.lang.Class r3 = androidx.core.content.pm.o0.a()
            java.lang.Object r3 = androidx.core.content.pm.z0.a(r5, r3)
            android.content.pm.ShortcutManager r3 = androidx.core.content.pm.e1.a(r3)
            boolean r2 = androidx.core.content.pm.k1.a(r3, r2)
            if (r2 != 0) goto L43
            r5 = 0
            return r5
        L43:
            androidx.core.content.pm.ShortcutInfoCompatSaver r2 = getShortcutInfoSaverInstance(r5)
            r2.addShortcuts(r1)
            java.util.List r5 = getShortcutInfoListeners(r5)
            java.util.Iterator r5 = r5.iterator()
        L52:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L62
            java.lang.Object r1 = r5.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r1 = (androidx.core.content.pm.ShortcutInfoChangeListener) r1
            r1.onShortcutAdded(r6)
            goto L52
        L62:
            return r0
    }

    @androidx.annotation.VisibleForTesting
    static boolean convertUriIconToBitmapIcon(@androidx.annotation.NonNull android.content.Context r6, @androidx.annotation.NonNull androidx.core.content.pm.ShortcutInfoCompat r7) {
            androidx.core.graphics.drawable.IconCompat r0 = r7.mIcon
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r2 = r0.mType
            r3 = 1
            r4 = 6
            if (r2 == r4) goto L10
            r5 = 4
            if (r2 == r5) goto L10
            return r3
        L10:
            java.io.InputStream r6 = r0.getUriInputStream(r6)
            if (r6 != 0) goto L17
            return r1
        L17:
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r6)
            if (r6 != 0) goto L1e
            return r1
        L1e:
            if (r2 != r4) goto L25
            androidx.core.graphics.drawable.IconCompat r6 = androidx.core.graphics.drawable.IconCompat.createWithAdaptiveBitmap(r6)
            goto L29
        L25:
            androidx.core.graphics.drawable.IconCompat r6 = androidx.core.graphics.drawable.IconCompat.createWithBitmap(r6)
        L29:
            r7.mIcon = r6
            return r3
    }

    @androidx.annotation.VisibleForTesting
    static void convertUriIconsToBitmapIcons(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            androidx.core.content.pm.ShortcutInfoCompat r1 = (androidx.core.content.pm.ShortcutInfoCompat) r1
            boolean r2 = convertUriIconToBitmapIcon(r3, r1)
            if (r2 != 0) goto L9
            r4.remove(r1)
            goto L9
        L1f:
            return
    }

    @androidx.annotation.NonNull
    public static android.content.Intent createShortcutResultIntent(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull androidx.core.content.pm.ShortcutInfoCompat r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L1b
            java.lang.Class r0 = androidx.core.content.pm.o0.a()
            java.lang.Object r2 = androidx.core.content.pm.z0.a(r2, r0)
            android.content.pm.ShortcutManager r2 = androidx.core.content.pm.e1.a(r2)
            android.content.pm.ShortcutInfo r0 = r3.toShortcutInfo()
            android.content.Intent r2 = androidx.core.content.pm.g1.a(r2, r0)
            goto L1c
        L1b:
            r2 = 0
        L1c:
            if (r2 != 0) goto L23
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
        L23:
            android.content.Intent r2 = r3.addToIntent(r2)
            return r2
    }

    public static void disableShortcuts(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.util.List<java.lang.String> r3, @androidx.annotation.Nullable java.lang.CharSequence r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L15
            java.lang.Class r0 = androidx.core.content.pm.o0.a()
            java.lang.Object r0 = androidx.core.content.pm.z0.a(r2, r0)
            android.content.pm.ShortcutManager r0 = androidx.core.content.pm.e1.a(r0)
            androidx.core.content.pm.y0.a(r0, r3, r4)
        L15:
            androidx.core.content.pm.ShortcutInfoCompatSaver r4 = getShortcutInfoSaverInstance(r2)
            r4.removeShortcuts(r3)
            java.util.List r2 = getShortcutInfoListeners(r2)
            java.util.Iterator r2 = r2.iterator()
        L24:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L34
            java.lang.Object r4 = r2.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r4 = (androidx.core.content.pm.ShortcutInfoChangeListener) r4
            r4.onShortcutRemoved(r3)
            goto L24
        L34:
            return
    }

    public static void enableShortcuts(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r5) {
            r0 = 1
            java.util.List r0 = removeShortcutsExcludedFromSurface(r5, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 25
            if (r1 < r2) goto L39
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r5.size()
            r1.<init>(r2)
            java.util.Iterator r2 = r0.iterator()
        L18:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r2.next()
            androidx.core.content.pm.ShortcutInfoCompat r3 = (androidx.core.content.pm.ShortcutInfoCompat) r3
            java.lang.String r3 = r3.mId
            r1.add(r3)
            goto L18
        L2a:
            java.lang.Class r2 = androidx.core.content.pm.o0.a()
            java.lang.Object r2 = androidx.core.content.pm.z0.a(r4, r2)
            android.content.pm.ShortcutManager r2 = androidx.core.content.pm.e1.a(r2)
            androidx.core.content.pm.a1.a(r2, r1)
        L39:
            androidx.core.content.pm.ShortcutInfoCompatSaver r1 = getShortcutInfoSaverInstance(r4)
            r1.addShortcuts(r0)
            java.util.List r4 = getShortcutInfoListeners(r4)
            java.util.Iterator r4 = r4.iterator()
        L48:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L58
            java.lang.Object r0 = r4.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r0 = (androidx.core.content.pm.ShortcutInfoChangeListener) r0
            r0.onShortcutAdded(r5)
            goto L48
        L58:
            return
    }

    @androidx.annotation.NonNull
    public static java.util.List<androidx.core.content.pm.ShortcutInfoCompat> getDynamicShortcuts(@androidx.annotation.NonNull android.content.Context r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L3f
            java.lang.Class r0 = androidx.core.content.pm.o0.a()
            java.lang.Object r0 = androidx.core.content.pm.z0.a(r4, r0)
            android.content.pm.ShortcutManager r0 = androidx.core.content.pm.e1.a(r0)
            java.util.List r0 = androidx.core.content.pm.q0.a(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L23:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r0.next()
            android.content.pm.ShortcutInfo r2 = androidx.core.content.pm.f.a(r2)
            androidx.core.content.pm.ShortcutInfoCompat$Builder r3 = new androidx.core.content.pm.ShortcutInfoCompat$Builder
            r3.<init>(r4, r2)
            androidx.core.content.pm.ShortcutInfoCompat r2 = r3.build()
            r1.add(r2)
            goto L23
        L3e:
            return r1
        L3f:
            androidx.core.content.pm.ShortcutInfoCompatSaver r4 = getShortcutInfoSaverInstance(r4)     // Catch: java.lang.Exception -> L48
            java.util.List r4 = r4.getShortcuts()     // Catch: java.lang.Exception -> L48
            return r4
        L48:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            return r4
    }

    private static int getIconDimensionInternal(@androidx.annotation.NonNull android.content.Context r2, boolean r3) {
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            r1 = 1
            if (r0 == 0) goto L14
            boolean r0 = r0.isLowRamDevice()
            if (r0 == 0) goto L12
            goto L14
        L12:
            r0 = 0
            goto L15
        L14:
            r0 = 1
        L15:
            if (r0 == 0) goto L1a
            r0 = 48
            goto L1c
        L1a:
            r0 = 96
        L1c:
            int r0 = java.lang.Math.max(r1, r0)
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            if (r3 == 0) goto L2d
            float r2 = r2.xdpi
            goto L2f
        L2d:
            float r2 = r2.ydpi
        L2f:
            r3 = 1126170624(0x43200000, float:160.0)
            float r2 = r2 / r3
            float r3 = (float) r0
            float r3 = r3 * r2
            int r2 = (int) r3
            return r2
    }

    public static int getIconMaxHeight(@androidx.annotation.NonNull android.content.Context r2) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L1a
            java.lang.Class r0 = androidx.core.content.pm.o0.a()
            java.lang.Object r2 = androidx.core.content.pm.z0.a(r2, r0)
            android.content.pm.ShortcutManager r2 = androidx.core.content.pm.e1.a(r2)
            int r2 = androidx.core.content.pm.f1.a(r2)
            return r2
        L1a:
            r0 = 0
            int r2 = getIconDimensionInternal(r2, r0)
            return r2
    }

    public static int getIconMaxWidth(@androidx.annotation.NonNull android.content.Context r2) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L1a
            java.lang.Class r0 = androidx.core.content.pm.o0.a()
            java.lang.Object r2 = androidx.core.content.pm.z0.a(r2, r0)
            android.content.pm.ShortcutManager r2 = androidx.core.content.pm.e1.a(r2)
            int r2 = androidx.core.content.pm.i1.a(r2)
            return r2
        L1a:
            r0 = 1
            int r2 = getIconDimensionInternal(r2, r0)
            return r2
    }

    public static int getMaxShortcutCountPerActivity(@androidx.annotation.NonNull android.content.Context r2) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L1a
            java.lang.Class r0 = androidx.core.content.pm.o0.a()
            java.lang.Object r2 = androidx.core.content.pm.z0.a(r2, r0)
            android.content.pm.ShortcutManager r2 = androidx.core.content.pm.e1.a(r2)
            int r2 = androidx.core.content.pm.c1.a(r2)
            return r2
        L1a:
            r2 = 5
            return r2
    }

    @androidx.annotation.VisibleForTesting
    static java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> getShortcutInfoChangeListeners() {
            java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> r0 = androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoChangeListeners
            return r0
    }

    private static java.lang.String getShortcutInfoCompatWithLowestRank(@androidx.annotation.NonNull java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r5) {
            java.util.Iterator r5 = r5.iterator()
            r0 = -1
            r1 = 0
        L6:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r5.next()
            androidx.core.content.pm.ShortcutInfoCompat r2 = (androidx.core.content.pm.ShortcutInfoCompat) r2
            int r3 = r2.getRank()
            if (r3 <= r0) goto L6
            java.lang.String r0 = r2.getId()
            int r1 = r2.getRank()
            r4 = r1
            r1 = r0
            r0 = r4
            goto L6
        L24:
            return r1
    }

    private static java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> getShortcutInfoListeners(android.content.Context r8) {
            java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> r0 = androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoChangeListeners
            if (r0 != 0) goto L73
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.core.content.pm.SHORTCUT_LISTENER"
            r2.<init>(r3)
            java.lang.String r3 = r8.getPackageName()
            r2.setPackage(r3)
            r3 = 128(0x80, float:1.8E-43)
            java.util.List r1 = r1.queryIntentActivities(r2, r3)
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6d
            java.lang.Object r2 = r1.next()
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            android.content.pm.ActivityInfo r2 = r2.activityInfo
            if (r2 != 0) goto L36
            goto L25
        L36:
            android.os.Bundle r2 = r2.metaData
            if (r2 != 0) goto L3b
            goto L25
        L3b:
            java.lang.String r3 = "androidx.core.content.pm.shortcut_listener_impl"
            java.lang.String r2 = r2.getString(r3)
            if (r2 != 0) goto L44
            goto L25
        L44:
            java.lang.Class<androidx.core.content.pm.ShortcutManagerCompat> r3 = androidx.core.content.pm.ShortcutManagerCompat.class
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Exception -> L6b
            r4 = 0
            java.lang.Class r2 = java.lang.Class.forName(r2, r4, r3)     // Catch: java.lang.Exception -> L6b
            java.lang.String r3 = "getInstance"
            r5 = 1
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L6b
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r4] = r7     // Catch: java.lang.Exception -> L6b
            java.lang.reflect.Method r2 = r2.getMethod(r3, r6)     // Catch: java.lang.Exception -> L6b
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L6b
            r3[r4] = r8     // Catch: java.lang.Exception -> L6b
            r4 = 0
            java.lang.Object r2 = r2.invoke(r4, r3)     // Catch: java.lang.Exception -> L6b
            androidx.core.content.pm.ShortcutInfoChangeListener r2 = (androidx.core.content.pm.ShortcutInfoChangeListener) r2     // Catch: java.lang.Exception -> L6b
            r0.add(r2)     // Catch: java.lang.Exception -> L6b
            goto L25
        L6b:
            goto L25
        L6d:
            java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> r8 = androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoChangeListeners
            if (r8 != 0) goto L73
            androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoChangeListeners = r0
        L73:
            java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> r8 = androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoChangeListeners
            return r8
    }

    private static androidx.core.content.pm.ShortcutInfoCompatSaver<?> getShortcutInfoSaverInstance(android.content.Context r6) {
            androidx.core.content.pm.ShortcutInfoCompatSaver<?> r0 = androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoCompatSaver
            if (r0 != 0) goto L3e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L33
            java.lang.Class<androidx.core.content.pm.ShortcutManagerCompat> r0 = androidx.core.content.pm.ShortcutManagerCompat.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Exception -> L32
            java.lang.String r1 = "androidx.sharetarget.ShortcutInfoCompatSaverImpl"
            r2 = 0
            java.lang.Class r0 = java.lang.Class.forName(r1, r2, r0)     // Catch: java.lang.Exception -> L32
            java.lang.String r1 = "getInstance"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L32
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r4[r2] = r5     // Catch: java.lang.Exception -> L32
            java.lang.reflect.Method r0 = r0.getMethod(r1, r4)     // Catch: java.lang.Exception -> L32
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L32
            r1[r2] = r6     // Catch: java.lang.Exception -> L32
            r6 = 0
            java.lang.Object r6 = r0.invoke(r6, r1)     // Catch: java.lang.Exception -> L32
            androidx.core.content.pm.ShortcutInfoCompatSaver r6 = (androidx.core.content.pm.ShortcutInfoCompatSaver) r6     // Catch: java.lang.Exception -> L32
            androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoCompatSaver = r6     // Catch: java.lang.Exception -> L32
            goto L33
        L32:
        L33:
            androidx.core.content.pm.ShortcutInfoCompatSaver<?> r6 = androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoCompatSaver
            if (r6 != 0) goto L3e
            androidx.core.content.pm.ShortcutInfoCompatSaver$NoopImpl r6 = new androidx.core.content.pm.ShortcutInfoCompatSaver$NoopImpl
            r6.<init>()
            androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoCompatSaver = r6
        L3e:
            androidx.core.content.pm.ShortcutInfoCompatSaver<?> r6 = androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoCompatSaver
            return r6
    }

    @androidx.annotation.NonNull
    public static java.util.List<androidx.core.content.pm.ShortcutInfoCompat> getShortcuts(@androidx.annotation.NonNull android.content.Context r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L1b
            java.lang.Class r0 = androidx.core.content.pm.o0.a()
            java.lang.Object r0 = androidx.core.content.pm.z0.a(r3, r0)
            android.content.pm.ShortcutManager r0 = androidx.core.content.pm.e1.a(r0)
            java.util.List r4 = androidx.core.content.pm.v0.a(r0, r4)
            java.util.List r3 = androidx.core.content.pm.ShortcutInfoCompat.fromShortcuts(r3, r4)
            return r3
        L1b:
            r1 = 25
            if (r0 < r1) goto L56
            java.lang.Class r0 = androidx.core.content.pm.o0.a()
            java.lang.Object r0 = androidx.core.content.pm.z0.a(r3, r0)
            android.content.pm.ShortcutManager r0 = androidx.core.content.pm.e1.a(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = r4 & 1
            if (r2 == 0) goto L3b
            java.util.List r2 = androidx.core.content.pm.w0.a(r0)
            r1.addAll(r2)
        L3b:
            r2 = r4 & 2
            if (r2 == 0) goto L46
            java.util.List r2 = androidx.core.content.pm.q0.a(r0)
            r1.addAll(r2)
        L46:
            r4 = r4 & 4
            if (r4 == 0) goto L51
            java.util.List r4 = androidx.core.content.pm.x0.a(r0)
            r1.addAll(r4)
        L51:
            java.util.List r3 = androidx.core.content.pm.ShortcutInfoCompat.fromShortcuts(r3, r1)
            return r3
        L56:
            r4 = r4 & 2
            if (r4 == 0) goto L63
            androidx.core.content.pm.ShortcutInfoCompatSaver r3 = getShortcutInfoSaverInstance(r3)     // Catch: java.lang.Exception -> L63
            java.util.List r3 = r3.getShortcuts()     // Catch: java.lang.Exception -> L63
            return r3
        L63:
            java.util.List r3 = java.util.Collections.EMPTY_LIST
            return r3
    }

    public static boolean isRateLimitingActive(@androidx.annotation.NonNull android.content.Context r2) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L1a
            java.lang.Class r0 = androidx.core.content.pm.o0.a()
            java.lang.Object r2 = androidx.core.content.pm.z0.a(r2, r0)
            android.content.pm.ShortcutManager r2 = androidx.core.content.pm.e1.a(r2)
            boolean r2 = androidx.core.content.pm.p0.a(r2)
            return r2
        L1a:
            r0 = 3
            java.util.List r0 = getShortcuts(r2, r0)
            int r0 = r0.size()
            int r2 = getMaxShortcutCountPerActivity(r2)
            if (r0 != r2) goto L2b
            r2 = 1
            return r2
        L2b:
            r2 = 0
            return r2
    }

    public static boolean isRequestPinShortcutSupported(@androidx.annotation.NonNull android.content.Context r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L17
            java.lang.Class r0 = androidx.core.content.pm.o0.a()
            java.lang.Object r4 = androidx.core.content.pm.z0.a(r4, r0)
            android.content.pm.ShortcutManager r4 = androidx.core.content.pm.e1.a(r4)
            boolean r4 = androidx.core.content.pm.s0.a(r4)
            return r4
        L17:
            java.lang.String r0 = "com.android.launcher.permission.INSTALL_SHORTCUT"
            int r1 = androidx.core.content.ContextCompat.checkSelfPermission(r4, r0)
            r2 = 0
            if (r1 == 0) goto L21
            return r2
        L21:
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r3 = "com.android.launcher.action.INSTALL_SHORTCUT"
            r1.<init>(r3)
            java.util.List r4 = r4.queryBroadcastReceivers(r1, r2)
            java.util.Iterator r4 = r4.iterator()
        L34:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L52
            java.lang.Object r1 = r4.next()
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1
            android.content.pm.ActivityInfo r1 = r1.activityInfo
            java.lang.String r1 = r1.permission
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L50
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L34
        L50:
            r4 = 1
            return r4
        L52:
            return r2
    }

    public static boolean pushDynamicShortcut(@androidx.annotation.NonNull android.content.Context r6, @androidx.annotation.NonNull androidx.core.content.pm.ShortcutInfoCompat r7) {
            androidx.core.util.Preconditions.checkNotNull(r6)
            androidx.core.util.Preconditions.checkNotNull(r7)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 32
            r2 = 1
            if (r0 > r1) goto L30
            boolean r1 = r7.isExcludedFromSurfaces(r2)
            if (r1 == 0) goto L30
            java.util.List r6 = getShortcutInfoListeners(r6)
            java.util.Iterator r6 = r6.iterator()
        L1b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r6.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r0 = (androidx.core.content.pm.ShortcutInfoChangeListener) r0
            java.util.List r1 = java.util.Collections.singletonList(r7)
            r0.onShortcutAdded(r1)
            goto L1b
        L2f:
            return r2
        L30:
            int r1 = getMaxShortcutCountPerActivity(r6)
            r3 = 0
            if (r1 != 0) goto L38
            return r3
        L38:
            r4 = 29
            if (r0 > r4) goto L3f
            convertUriIconToBitmapIcon(r6, r7)
        L3f:
            r4 = 30
            if (r0 < r4) goto L57
            java.lang.Class r0 = androidx.core.content.pm.o0.a()
            java.lang.Object r0 = androidx.core.content.pm.z0.a(r6, r0)
            android.content.pm.ShortcutManager r0 = androidx.core.content.pm.e1.a(r0)
            android.content.pm.ShortcutInfo r4 = r7.toShortcutInfo()
            androidx.core.content.pm.l1.a(r0, r4)
            goto L96
        L57:
            r4 = 25
            if (r0 < r4) goto L96
            java.lang.Class r0 = androidx.core.content.pm.o0.a()
            java.lang.Object r0 = androidx.core.content.pm.z0.a(r6, r0)
            android.content.pm.ShortcutManager r0 = androidx.core.content.pm.e1.a(r0)
            boolean r4 = androidx.core.content.pm.p0.a(r0)
            if (r4 == 0) goto L6e
            return r3
        L6e:
            java.util.List r4 = androidx.core.content.pm.q0.a(r0)
            int r5 = r4.size()
            if (r5 < r1) goto L87
            java.lang.String r4 = androidx.core.content.pm.ShortcutManagerCompat.Api25Impl.getShortcutInfoWithLowestRank(r4)
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.util.List r4 = java.util.Arrays.asList(r4)
            androidx.core.content.pm.h1.a(r0, r4)
        L87:
            android.content.pm.ShortcutInfo[] r4 = new android.content.pm.ShortcutInfo[r2]
            android.content.pm.ShortcutInfo r5 = r7.toShortcutInfo()
            r4[r3] = r5
            java.util.List r4 = java.util.Arrays.asList(r4)
            androidx.core.content.pm.k1.a(r0, r4)
        L96:
            androidx.core.content.pm.ShortcutInfoCompatSaver r0 = getShortcutInfoSaverInstance(r6)
            java.util.List r4 = r0.getShortcuts()     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> L109
            int r5 = r4.size()     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> L109
            if (r5 < r1) goto Lb6
            java.lang.String r1 = getShortcutInfoCompatWithLowestRank(r4)     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> L109
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> L109
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> L109
            r0.removeShortcuts(r1)     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> L109
            goto Lb6
        Lb4:
            r0 = move-exception
            goto Le5
        Lb6:
            androidx.core.content.pm.ShortcutInfoCompat[] r1 = new androidx.core.content.pm.ShortcutInfoCompat[r2]     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> L109
            r1[r3] = r7     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> L109
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> L109
            r0.addShortcuts(r1)     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> L109
            java.util.List r0 = getShortcutInfoListeners(r6)
            java.util.Iterator r0 = r0.iterator()
        Lc9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ldd
            java.lang.Object r1 = r0.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r1 = (androidx.core.content.pm.ShortcutInfoChangeListener) r1
            java.util.List r3 = java.util.Collections.singletonList(r7)
            r1.onShortcutAdded(r3)
            goto Lc9
        Ldd:
            java.lang.String r7 = r7.getId()
            reportShortcutUsed(r6, r7)
            return r2
        Le5:
            java.util.List r1 = getShortcutInfoListeners(r6)
            java.util.Iterator r1 = r1.iterator()
        Led:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L101
            java.lang.Object r2 = r1.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r2 = (androidx.core.content.pm.ShortcutInfoChangeListener) r2
            java.util.List r3 = java.util.Collections.singletonList(r7)
            r2.onShortcutAdded(r3)
            goto Led
        L101:
            java.lang.String r7 = r7.getId()
            reportShortcutUsed(r6, r7)
            throw r0
        L109:
            java.util.List r0 = getShortcutInfoListeners(r6)
            java.util.Iterator r0 = r0.iterator()
        L111:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L125
            java.lang.Object r1 = r0.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r1 = (androidx.core.content.pm.ShortcutInfoChangeListener) r1
            java.util.List r2 = java.util.Collections.singletonList(r7)
            r1.onShortcutAdded(r2)
            goto L111
        L125:
            java.lang.String r7 = r7.getId()
            reportShortcutUsed(r6, r7)
            return r3
    }

    public static void removeAllDynamicShortcuts(@androidx.annotation.NonNull android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L15
            java.lang.Class r0 = androidx.core.content.pm.o0.a()
            java.lang.Object r0 = androidx.core.content.pm.z0.a(r2, r0)
            android.content.pm.ShortcutManager r0 = androidx.core.content.pm.e1.a(r0)
            androidx.core.content.pm.u0.a(r0)
        L15:
            androidx.core.content.pm.ShortcutInfoCompatSaver r0 = getShortcutInfoSaverInstance(r2)
            r0.removeAllShortcuts()
            java.util.List r2 = getShortcutInfoListeners(r2)
            java.util.Iterator r2 = r2.iterator()
        L24:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r2.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r0 = (androidx.core.content.pm.ShortcutInfoChangeListener) r0
            r0.onAllShortcutsRemoved()
            goto L24
        L34:
            return
    }

    public static void removeDynamicShortcuts(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.util.List<java.lang.String> r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L15
            java.lang.Class r0 = androidx.core.content.pm.o0.a()
            java.lang.Object r0 = androidx.core.content.pm.z0.a(r2, r0)
            android.content.pm.ShortcutManager r0 = androidx.core.content.pm.e1.a(r0)
            androidx.core.content.pm.h1.a(r0, r3)
        L15:
            androidx.core.content.pm.ShortcutInfoCompatSaver r0 = getShortcutInfoSaverInstance(r2)
            r0.removeShortcuts(r3)
            java.util.List r2 = getShortcutInfoListeners(r2)
            java.util.Iterator r2 = r2.iterator()
        L24:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r2.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r0 = (androidx.core.content.pm.ShortcutInfoChangeListener) r0
            r0.onShortcutRemoved(r3)
            goto L24
        L34:
            return
    }

    public static void removeLongLivedShortcuts(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.util.List<java.lang.String> r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 >= r1) goto La
            removeDynamicShortcuts(r2, r3)
            return
        La:
            java.lang.Class r0 = androidx.core.content.pm.o0.a()
            java.lang.Object r0 = androidx.core.content.pm.z0.a(r2, r0)
            android.content.pm.ShortcutManager r0 = androidx.core.content.pm.e1.a(r0)
            androidx.core.content.pm.j1.a(r0, r3)
            androidx.core.content.pm.ShortcutInfoCompatSaver r0 = getShortcutInfoSaverInstance(r2)
            r0.removeShortcuts(r3)
            java.util.List r2 = getShortcutInfoListeners(r2)
            java.util.Iterator r2 = r2.iterator()
        L28:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r2.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r0 = (androidx.core.content.pm.ShortcutInfoChangeListener) r0
            r0.onShortcutRemoved(r3)
            goto L28
        L38:
            return
    }

    @androidx.annotation.NonNull
    private static java.util.List<androidx.core.content.pm.ShortcutInfoCompat> removeShortcutsExcludedFromSurface(@androidx.annotation.NonNull java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r3, int r4) {
            java.util.Objects.requireNonNull(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 32
            if (r0 <= r1) goto La
            return r3
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            java.util.Iterator r3 = r3.iterator()
        L13:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r3.next()
            androidx.core.content.pm.ShortcutInfoCompat r1 = (androidx.core.content.pm.ShortcutInfoCompat) r1
            boolean r2 = r1.isExcludedFromSurfaces(r4)
            if (r2 == 0) goto L13
            r0.remove(r1)
            goto L13
        L29:
            return r0
    }

    public static void reportShortcutUsed(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.lang.String r3) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            androidx.core.util.Preconditions.checkNotNull(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L1b
            java.lang.Class r0 = androidx.core.content.pm.o0.a()
            java.lang.Object r0 = androidx.core.content.pm.z0.a(r2, r0)
            android.content.pm.ShortcutManager r0 = androidx.core.content.pm.e1.a(r0)
            androidx.core.content.pm.r0.a(r0, r3)
        L1b:
            java.util.List r2 = getShortcutInfoListeners(r2)
            java.util.Iterator r2 = r2.iterator()
        L23:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r2.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r0 = (androidx.core.content.pm.ShortcutInfoChangeListener) r0
            java.util.List r1 = java.util.Collections.singletonList(r3)
            r0.onShortcutUsageReported(r1)
            goto L23
        L37:
            return
    }

    public static boolean requestPinShortcut(@androidx.annotation.NonNull android.content.Context r12, @androidx.annotation.NonNull androidx.core.content.pm.ShortcutInfoCompat r13, @androidx.annotation.Nullable android.content.IntentSender r14) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 32
            r2 = 0
            r3 = 1
            if (r0 > r1) goto Lf
            boolean r1 = r13.isExcludedFromSurfaces(r3)
            if (r1 == 0) goto Lf
            return r2
        Lf:
            r1 = 26
            if (r0 < r1) goto L28
            java.lang.Class r0 = androidx.core.content.pm.o0.a()
            java.lang.Object r12 = androidx.core.content.pm.z0.a(r12, r0)
            android.content.pm.ShortcutManager r12 = androidx.core.content.pm.e1.a(r12)
            android.content.pm.ShortcutInfo r13 = r13.toShortcutInfo()
            boolean r12 = androidx.core.content.pm.d1.a(r12, r13, r14)
            return r12
        L28:
            boolean r0 = isRequestPinShortcutSupported(r12)
            if (r0 != 0) goto L2f
            return r2
        L2f:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.android.launcher.action.INSTALL_SHORTCUT"
            r0.<init>(r1)
            android.content.Intent r5 = r13.addToIntent(r0)
            if (r14 != 0) goto L40
            r12.sendBroadcast(r5)
            return r3
        L40:
            androidx.core.content.pm.ShortcutManagerCompat$1 r7 = new androidx.core.content.pm.ShortcutManagerCompat$1
            r7.<init>(r14)
            r10 = 0
            r11 = 0
            r6 = 0
            r8 = 0
            r9 = -1
            r4 = r12
            r4.sendOrderedBroadcast(r5, r6, r7, r8, r9, r10, r11)
            return r3
    }

    public static boolean setDynamicShortcuts(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r6) {
            androidx.core.util.Preconditions.checkNotNull(r5)
            androidx.core.util.Preconditions.checkNotNull(r6)
            r0 = 1
            java.util.List r1 = removeShortcutsExcludedFromSurface(r6, r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 25
            if (r2 < r3) goto L46
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r3 = r1.iterator()
        L1e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L32
            java.lang.Object r4 = r3.next()
            androidx.core.content.pm.ShortcutInfoCompat r4 = (androidx.core.content.pm.ShortcutInfoCompat) r4
            android.content.pm.ShortcutInfo r4 = r4.toShortcutInfo()
            r2.add(r4)
            goto L1e
        L32:
            java.lang.Class r3 = androidx.core.content.pm.o0.a()
            java.lang.Object r3 = androidx.core.content.pm.z0.a(r5, r3)
            android.content.pm.ShortcutManager r3 = androidx.core.content.pm.e1.a(r3)
            boolean r2 = androidx.core.content.pm.b1.a(r3, r2)
            if (r2 != 0) goto L46
            r5 = 0
            return r5
        L46:
            androidx.core.content.pm.ShortcutInfoCompatSaver r2 = getShortcutInfoSaverInstance(r5)
            r2.removeAllShortcuts()
            androidx.core.content.pm.ShortcutInfoCompatSaver r2 = getShortcutInfoSaverInstance(r5)
            r2.addShortcuts(r1)
            java.util.List r5 = getShortcutInfoListeners(r5)
            java.util.Iterator r5 = r5.iterator()
        L5c:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L6f
            java.lang.Object r1 = r5.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r1 = (androidx.core.content.pm.ShortcutInfoChangeListener) r1
            r1.onAllShortcutsRemoved()
            r1.onShortcutAdded(r6)
            goto L5c
        L6f:
            return r0
    }

    @androidx.annotation.VisibleForTesting
    static void setShortcutInfoChangeListeners(java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> r0) {
            androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoChangeListeners = r0
            return
    }

    @androidx.annotation.VisibleForTesting
    static void setShortcutInfoCompatSaver(androidx.core.content.pm.ShortcutInfoCompatSaver<java.lang.Void> r0) {
            androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoCompatSaver = r0
            return
    }

    public static boolean updateShortcuts(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r6) {
            r0 = 1
            java.util.List r1 = removeShortcutsExcludedFromSurface(r6, r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 > r3) goto Le
            convertUriIconsToBitmapIcons(r5, r1)
        Le:
            r3 = 25
            if (r2 < r3) goto L43
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r1.iterator()
        L1b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2f
            java.lang.Object r4 = r3.next()
            androidx.core.content.pm.ShortcutInfoCompat r4 = (androidx.core.content.pm.ShortcutInfoCompat) r4
            android.content.pm.ShortcutInfo r4 = r4.toShortcutInfo()
            r2.add(r4)
            goto L1b
        L2f:
            java.lang.Class r3 = androidx.core.content.pm.o0.a()
            java.lang.Object r3 = androidx.core.content.pm.z0.a(r5, r3)
            android.content.pm.ShortcutManager r3 = androidx.core.content.pm.e1.a(r3)
            boolean r2 = androidx.core.content.pm.t0.a(r3, r2)
            if (r2 != 0) goto L43
            r5 = 0
            return r5
        L43:
            androidx.core.content.pm.ShortcutInfoCompatSaver r2 = getShortcutInfoSaverInstance(r5)
            r2.addShortcuts(r1)
            java.util.List r5 = getShortcutInfoListeners(r5)
            java.util.Iterator r5 = r5.iterator()
        L52:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L62
            java.lang.Object r1 = r5.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r1 = (androidx.core.content.pm.ShortcutInfoChangeListener) r1
            r1.onShortcutUpdated(r6)
            goto L52
        L62:
            return r0
    }
}
