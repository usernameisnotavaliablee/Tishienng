package androidx.appcompat.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class TintContextWrapper extends android.content.ContextWrapper {
    private static final java.lang.Object CACHE_LOCK = null;
    private static java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper>> sCache;
    private final android.content.res.Resources mResources;
    private final android.content.res.Resources.Theme mTheme;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.appcompat.widget.TintContextWrapper.CACHE_LOCK = r0
            return
    }

    private TintContextWrapper(@androidx.annotation.NonNull android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            boolean r0 = androidx.appcompat.widget.VectorEnabledTintResources.shouldBeUsed()
            if (r0 == 0) goto L22
            androidx.appcompat.widget.VectorEnabledTintResources r0 = new androidx.appcompat.widget.VectorEnabledTintResources
            android.content.res.Resources r1 = r3.getResources()
            r0.<init>(r2, r1)
            r2.mResources = r0
            android.content.res.Resources$Theme r0 = r0.newTheme()
            r2.mTheme = r0
            android.content.res.Resources$Theme r3 = r3.getTheme()
            r0.setTo(r3)
            return
        L22:
            androidx.appcompat.widget.TintResources r0 = new androidx.appcompat.widget.TintResources
            android.content.res.Resources r3 = r3.getResources()
            r0.<init>(r2, r3)
            r2.mResources = r0
            r3 = 0
            r2.mTheme = r3
            return
    }

    private static boolean shouldWrap(@androidx.annotation.NonNull android.content.Context r2) {
            boolean r0 = r2 instanceof androidx.appcompat.widget.TintContextWrapper
            r1 = 0
            if (r0 != 0) goto L1e
            android.content.res.Resources r0 = r2.getResources()
            boolean r0 = r0 instanceof androidx.appcompat.widget.TintResources
            if (r0 != 0) goto L1e
            android.content.res.Resources r2 = r2.getResources()
            boolean r2 = r2 instanceof androidx.appcompat.widget.VectorEnabledTintResources
            if (r2 == 0) goto L16
            goto L1e
        L16:
            boolean r2 = androidx.appcompat.widget.VectorEnabledTintResources.shouldBeUsed()
            if (r2 == 0) goto L1e
            r2 = 1
            return r2
        L1e:
            return r1
    }

    public static android.content.Context wrap(@androidx.annotation.NonNull android.content.Context r4) {
            boolean r0 = shouldWrap(r4)
            if (r0 == 0) goto L73
            java.lang.Object r0 = androidx.appcompat.widget.TintContextWrapper.CACHE_LOCK
            monitor-enter(r0)
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper>> r1 = androidx.appcompat.widget.TintContextWrapper.sCache     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L17
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L15
            androidx.appcompat.widget.TintContextWrapper.sCache = r1     // Catch: java.lang.Throwable -> L15
            goto L60
        L15:
            r4 = move-exception
            goto L71
        L17:
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L15
            int r1 = r1 + (-1)
        L1d:
            if (r1 < 0) goto L37
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper>> r2 = androidx.appcompat.widget.TintContextWrapper.sCache     // Catch: java.lang.Throwable -> L15
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L34
        L2f:
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper>> r2 = androidx.appcompat.widget.TintContextWrapper.sCache     // Catch: java.lang.Throwable -> L15
            r2.remove(r1)     // Catch: java.lang.Throwable -> L15
        L34:
            int r1 = r1 + (-1)
            goto L1d
        L37:
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper>> r1 = androidx.appcompat.widget.TintContextWrapper.sCache     // Catch: java.lang.Throwable -> L15
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L15
            int r1 = r1 + (-1)
        L3f:
            if (r1 < 0) goto L60
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper>> r2 = androidx.appcompat.widget.TintContextWrapper.sCache     // Catch: java.lang.Throwable -> L15
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L52
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L15
            androidx.appcompat.widget.TintContextWrapper r2 = (androidx.appcompat.widget.TintContextWrapper) r2     // Catch: java.lang.Throwable -> L15
            goto L53
        L52:
            r2 = 0
        L53:
            if (r2 == 0) goto L5d
            android.content.Context r3 = r2.getBaseContext()     // Catch: java.lang.Throwable -> L15
            if (r3 != r4) goto L5d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return r2
        L5d:
            int r1 = r1 + (-1)
            goto L3f
        L60:
            androidx.appcompat.widget.TintContextWrapper r1 = new androidx.appcompat.widget.TintContextWrapper     // Catch: java.lang.Throwable -> L15
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L15
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper>> r4 = androidx.appcompat.widget.TintContextWrapper.sCache     // Catch: java.lang.Throwable -> L15
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L15
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L15
            r4.add(r2)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return r1
        L71:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r4
        L73:
            return r4
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.AssetManager getAssets() {
            r1 = this;
            android.content.res.Resources r0 = r1.mResources
            android.content.res.AssetManager r0 = r0.getAssets()
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
            r1 = this;
            android.content.res.Resources r0 = r1.mResources
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources.Theme getTheme() {
            r1 = this;
            android.content.res.Resources$Theme r0 = r1.mTheme
            if (r0 != 0) goto L8
            android.content.res.Resources$Theme r0 = super.getTheme()
        L8:
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int r3) {
            r2 = this;
            android.content.res.Resources$Theme r0 = r2.mTheme
            if (r0 != 0) goto L8
            super.setTheme(r3)
            return
        L8:
            r1 = 1
            r0.applyStyle(r3, r1)
            return
    }
}
