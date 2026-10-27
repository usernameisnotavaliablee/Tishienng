package androidx.appcompat.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class AppCompatDrawableManager {
    private static final boolean DEBUG = false;
    private static final android.graphics.PorterDuff.Mode DEFAULT_MODE = null;
    private static androidx.appcompat.widget.AppCompatDrawableManager INSTANCE = null;
    private static final java.lang.String TAG = "AppCompatDrawableManag";
    private androidx.appcompat.widget.ResourceManagerInternal mResourceManager;


    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            androidx.appcompat.widget.AppCompatDrawableManager.DEFAULT_MODE = r0
            return
    }

    public AppCompatDrawableManager() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ android.graphics.PorterDuff.Mode access$000() {
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.AppCompatDrawableManager.DEFAULT_MODE
            return r0
    }

    public static synchronized androidx.appcompat.widget.AppCompatDrawableManager get() {
            java.lang.Class<androidx.appcompat.widget.AppCompatDrawableManager> r0 = androidx.appcompat.widget.AppCompatDrawableManager.class
            monitor-enter(r0)
            androidx.appcompat.widget.AppCompatDrawableManager r1 = androidx.appcompat.widget.AppCompatDrawableManager.INSTANCE     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto Ld
            preload()     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r1 = move-exception
            goto L11
        Ld:
            androidx.appcompat.widget.AppCompatDrawableManager r1 = androidx.appcompat.widget.AppCompatDrawableManager.INSTANCE     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return r1
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    public static synchronized android.graphics.PorterDuffColorFilter getPorterDuffColorFilter(int r1, android.graphics.PorterDuff.Mode r2) {
            java.lang.Class<androidx.appcompat.widget.AppCompatDrawableManager> r0 = androidx.appcompat.widget.AppCompatDrawableManager.class
            monitor-enter(r0)
            android.graphics.PorterDuffColorFilter r1 = androidx.appcompat.widget.ResourceManagerInternal.getPorterDuffColorFilter(r1, r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return r1
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    public static synchronized void preload() {
            java.lang.Class<androidx.appcompat.widget.AppCompatDrawableManager> r0 = androidx.appcompat.widget.AppCompatDrawableManager.class
            monitor-enter(r0)
            androidx.appcompat.widget.AppCompatDrawableManager r1 = androidx.appcompat.widget.AppCompatDrawableManager.INSTANCE     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L23
            androidx.appcompat.widget.AppCompatDrawableManager r1 = new androidx.appcompat.widget.AppCompatDrawableManager     // Catch: java.lang.Throwable -> L21
            r1.<init>()     // Catch: java.lang.Throwable -> L21
            androidx.appcompat.widget.AppCompatDrawableManager.INSTANCE = r1     // Catch: java.lang.Throwable -> L21
            androidx.appcompat.widget.ResourceManagerInternal r2 = androidx.appcompat.widget.ResourceManagerInternal.get()     // Catch: java.lang.Throwable -> L21
            r1.mResourceManager = r2     // Catch: java.lang.Throwable -> L21
            androidx.appcompat.widget.AppCompatDrawableManager r1 = androidx.appcompat.widget.AppCompatDrawableManager.INSTANCE     // Catch: java.lang.Throwable -> L21
            androidx.appcompat.widget.ResourceManagerInternal r1 = r1.mResourceManager     // Catch: java.lang.Throwable -> L21
            androidx.appcompat.widget.AppCompatDrawableManager$1 r2 = new androidx.appcompat.widget.AppCompatDrawableManager$1     // Catch: java.lang.Throwable -> L21
            r2.<init>()     // Catch: java.lang.Throwable -> L21
            r1.setHooks(r2)     // Catch: java.lang.Throwable -> L21
            goto L23
        L21:
            r1 = move-exception
            goto L25
        L23:
            monitor-exit(r0)
            return
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r1
    }

    static void tintDrawable(android.graphics.drawable.Drawable r0, androidx.appcompat.widget.TintInfo r1, int[] r2) {
            androidx.appcompat.widget.ResourceManagerInternal.tintDrawable(r0, r1, r2)
            return
    }

    public synchronized android.graphics.drawable.Drawable getDrawable(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.DrawableRes int r3) {
            r1 = this;
            monitor-enter(r1)
            androidx.appcompat.widget.ResourceManagerInternal r0 = r1.mResourceManager     // Catch: java.lang.Throwable -> L9
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2, r3)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    synchronized android.graphics.drawable.Drawable getDrawable(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.DrawableRes int r3, boolean r4) {
            r1 = this;
            monitor-enter(r1)
            androidx.appcompat.widget.ResourceManagerInternal r0 = r1.mResourceManager     // Catch: java.lang.Throwable -> L9
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2, r3, r4)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    synchronized android.content.res.ColorStateList getTintList(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.DrawableRes int r3) {
            r1 = this;
            monitor-enter(r1)
            androidx.appcompat.widget.ResourceManagerInternal r0 = r1.mResourceManager     // Catch: java.lang.Throwable -> L9
            android.content.res.ColorStateList r2 = r0.getTintList(r2, r3)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    public synchronized void onConfigurationChanged(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            monitor-enter(r1)
            androidx.appcompat.widget.ResourceManagerInternal r0 = r1.mResourceManager     // Catch: java.lang.Throwable -> L8
            r0.onConfigurationChanged(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    synchronized android.graphics.drawable.Drawable onDrawableLoadedFromResources(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull androidx.appcompat.widget.VectorEnabledTintResources r3, @androidx.annotation.DrawableRes int r4) {
            r1 = this;
            monitor-enter(r1)
            androidx.appcompat.widget.ResourceManagerInternal r0 = r1.mResourceManager     // Catch: java.lang.Throwable -> L9
            android.graphics.drawable.Drawable r2 = r0.onDrawableLoadedFromResources(r2, r3, r4)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    boolean tintDrawableUsingColorFilter(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.DrawableRes int r3, @androidx.annotation.NonNull android.graphics.drawable.Drawable r4) {
            r1 = this;
            androidx.appcompat.widget.ResourceManagerInternal r0 = r1.mResourceManager
            boolean r2 = r0.tintDrawableUsingColorFilter(r2, r3, r4)
            return r2
    }
}
