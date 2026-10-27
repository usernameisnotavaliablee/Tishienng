package androidx.legacy.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ActionBarDrawerToggle implements androidx.drawerlayout.widget.DrawerLayout.DrawerListener {
    private static final int ID_HOME = 16908332;
    private static final java.lang.String TAG = "ActionBarDrawerToggle";
    private static final int[] THEME_ATTRS = null;
    private static final float TOGGLE_DRAWABLE_OFFSET = 0.33333334f;
    final android.app.Activity mActivity;
    private final androidx.legacy.app.ActionBarDrawerToggle.Delegate mActivityImpl;
    private final int mCloseDrawerContentDescRes;
    private android.graphics.drawable.Drawable mDrawerImage;
    private final int mDrawerImageResource;
    private boolean mDrawerIndicatorEnabled;
    private final androidx.drawerlayout.widget.DrawerLayout mDrawerLayout;
    private boolean mHasCustomUpIndicator;
    private android.graphics.drawable.Drawable mHomeAsUpIndicator;
    private final int mOpenDrawerContentDescRes;
    private androidx.legacy.app.ActionBarDrawerToggle.SetIndicatorInfo mSetIndicatorInfo;
    private androidx.legacy.app.ActionBarDrawerToggle.SlideDrawable mSlider;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.Deprecated
    public interface Delegate {
        @androidx.annotation.Nullable
        android.graphics.drawable.Drawable getThemeUpIndicator();

        void setActionBarDescription(@androidx.annotation.StringRes int r1);

        void setActionBarUpIndicator(android.graphics.drawable.Drawable r1, @androidx.annotation.StringRes int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.Deprecated
    public interface DelegateProvider {
        @androidx.annotation.Nullable
        androidx.legacy.app.ActionBarDrawerToggle.Delegate getDrawerToggleDelegate();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SetIndicatorInfo {
        java.lang.reflect.Method mSetHomeActionContentDescription;
        java.lang.reflect.Method mSetHomeAsUpIndicator;
        android.widget.ImageView mUpIndicatorView;

        SetIndicatorInfo(android.app.Activity r7) {
                r6 = this;
                java.lang.Class<android.app.ActionBar> r0 = android.app.ActionBar.class
                r6.<init>()
                r1 = 0
                r2 = 1
                java.lang.String r3 = "setHomeAsUpIndicator"
                java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L24
                java.lang.Class<android.graphics.drawable.Drawable> r5 = android.graphics.drawable.Drawable.class
                r4[r1] = r5     // Catch: java.lang.NoSuchMethodException -> L24
                java.lang.reflect.Method r3 = r0.getDeclaredMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L24
                r6.mSetHomeAsUpIndicator = r3     // Catch: java.lang.NoSuchMethodException -> L24
                java.lang.String r3 = "setHomeActionContentDescription"
                java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L24
                java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L24
                r4[r1] = r5     // Catch: java.lang.NoSuchMethodException -> L24
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L24
                r6.mSetHomeActionContentDescription = r0     // Catch: java.lang.NoSuchMethodException -> L24
                return
            L24:
                r0 = 16908332(0x102002c, float:2.3877352E-38)
                android.view.View r7 = r7.findViewById(r0)
                if (r7 != 0) goto L2f
                goto L55
            L2f:
                android.view.ViewParent r7 = r7.getParent()
                android.view.ViewGroup r7 = (android.view.ViewGroup) r7
                int r3 = r7.getChildCount()
                r4 = 2
                if (r3 == r4) goto L3d
                goto L55
            L3d:
                android.view.View r1 = r7.getChildAt(r1)
                android.view.View r7 = r7.getChildAt(r2)
                int r2 = r1.getId()
                if (r2 != r0) goto L4c
                r1 = r7
            L4c:
                boolean r7 = r1 instanceof android.widget.ImageView
                if (r7 == 0) goto L55
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r6.mUpIndicatorView = r1
            L55:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class SlideDrawable extends android.graphics.drawable.InsetDrawable implements android.graphics.drawable.Drawable.Callback {
        private final boolean mHasMirroring;
        private float mOffset;
        private float mPosition;
        private final android.graphics.Rect mTmpRect;
        final /* synthetic */ androidx.legacy.app.ActionBarDrawerToggle this$0;

        SlideDrawable(androidx.legacy.app.ActionBarDrawerToggle r1, android.graphics.drawable.Drawable r2) {
                r0 = this;
                r0.this$0 = r1
                r1 = 0
                r0.<init>(r2, r1)
                r1 = 1
                r0.mHasMirroring = r1
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.mTmpRect = r1
                return
        }

        @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public void draw(@androidx.annotation.NonNull android.graphics.Canvas r6) {
                r5 = this;
                android.graphics.Rect r0 = r5.mTmpRect
                r5.copyBounds(r0)
                r6.save()
                androidx.legacy.app.ActionBarDrawerToggle r0 = r5.this$0
                android.app.Activity r0 = r0.mActivity
                android.view.Window r0 = r0.getWindow()
                android.view.View r0 = r0.getDecorView()
                int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r0)
                r1 = 1
                if (r0 != r1) goto L1d
                r0 = 1
                goto L1e
            L1d:
                r0 = 0
            L1e:
                if (r0 == 0) goto L21
                r1 = -1
            L21:
                android.graphics.Rect r2 = r5.mTmpRect
                int r2 = r2.width()
                float r3 = r5.mOffset
                float r3 = -r3
                float r2 = (float) r2
                float r3 = r3 * r2
                float r4 = r5.mPosition
                float r3 = r3 * r4
                float r1 = (float) r1
                float r3 = r3 * r1
                r1 = 0
                r6.translate(r3, r1)
                if (r0 == 0) goto L48
                boolean r0 = r5.mHasMirroring
                if (r0 != 0) goto L48
                r6.translate(r2, r1)
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1 = 1065353216(0x3f800000, float:1.0)
                r6.scale(r0, r1)
            L48:
                super.draw(r6)
                r6.restore()
                return
        }

        public float getPosition() {
                r1 = this;
                float r0 = r1.mPosition
                return r0
        }

        public void setOffset(float r1) {
                r0 = this;
                r0.mOffset = r1
                r0.invalidateSelf()
                return
        }

        public void setPosition(float r1) {
                r0 = this;
                r0.mPosition = r1
                r0.invalidateSelf()
                return
        }
    }

    static {
            r0 = 16843531(0x101030b, float:2.369574E-38)
            int[] r0 = new int[]{r0}
            androidx.legacy.app.ActionBarDrawerToggle.THEME_ATTRS = r0
            return
    }

    public ActionBarDrawerToggle(android.app.Activity r9, androidx.drawerlayout.widget.DrawerLayout r10, @androidx.annotation.DrawableRes int r11, @androidx.annotation.StringRes int r12, @androidx.annotation.StringRes int r13) {
            r8 = this;
            boolean r0 = assumeMaterial(r9)
            r4 = r0 ^ 1
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
    }

    public ActionBarDrawerToggle(android.app.Activity r2, androidx.drawerlayout.widget.DrawerLayout r3, boolean r4, @androidx.annotation.DrawableRes int r5, @androidx.annotation.StringRes int r6, @androidx.annotation.StringRes int r7) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mDrawerIndicatorEnabled = r0
            r1.mActivity = r2
            boolean r0 = r2 instanceof androidx.legacy.app.ActionBarDrawerToggle.DelegateProvider
            if (r0 == 0) goto L16
            r0 = r2
            androidx.legacy.app.ActionBarDrawerToggle$DelegateProvider r0 = (androidx.legacy.app.ActionBarDrawerToggle.DelegateProvider) r0
            androidx.legacy.app.ActionBarDrawerToggle$Delegate r0 = r0.getDrawerToggleDelegate()
            r1.mActivityImpl = r0
            goto L19
        L16:
            r0 = 0
            r1.mActivityImpl = r0
        L19:
            r1.mDrawerLayout = r3
            r1.mDrawerImageResource = r5
            r1.mOpenDrawerContentDescRes = r6
            r1.mCloseDrawerContentDescRes = r7
            android.graphics.drawable.Drawable r3 = r1.getThemeUpIndicator()
            r1.mHomeAsUpIndicator = r3
            android.graphics.drawable.Drawable r2 = androidx.core.content.ContextCompat.getDrawable(r2, r5)
            r1.mDrawerImage = r2
            androidx.legacy.app.ActionBarDrawerToggle$SlideDrawable r2 = new androidx.legacy.app.ActionBarDrawerToggle$SlideDrawable
            android.graphics.drawable.Drawable r3 = r1.mDrawerImage
            r2.<init>(r1, r3)
            r1.mSlider = r2
            if (r4 == 0) goto L3c
            r3 = 1051372203(0x3eaaaaab, float:0.33333334)
            goto L3d
        L3c:
            r3 = 0
        L3d:
            r2.setOffset(r3)
            return
    }

    private static boolean assumeMaterial(android.content.Context r1) {
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()
            int r1 = r1.targetSdkVersion
            r0 = 21
            if (r1 < r0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    private android.graphics.drawable.Drawable getThemeUpIndicator() {
            r5 = this;
            androidx.legacy.app.ActionBarDrawerToggle$Delegate r0 = r5.mActivityImpl
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getThemeUpIndicator()
            return r0
        L9:
            android.app.Activity r0 = r5.mActivity
            android.app.ActionBar r0 = r0.getActionBar()
            if (r0 == 0) goto L16
            android.content.Context r0 = r0.getThemedContext()
            goto L18
        L16:
            android.app.Activity r0 = r5.mActivity
        L18:
            int[] r1 = androidx.legacy.app.ActionBarDrawerToggle.THEME_ATTRS
            r2 = 16843470(0x10102ce, float:2.369557E-38)
            r3 = 0
            r4 = 0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r3, r1, r2, r4)
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r4)
            r0.recycle()
            return r1
    }

    private void setActionBarDescription(int r2) {
            r1 = this;
            androidx.legacy.app.ActionBarDrawerToggle$Delegate r0 = r1.mActivityImpl
            if (r0 == 0) goto L8
            r0.setActionBarDescription(r2)
            return
        L8:
            android.app.Activity r0 = r1.mActivity
            android.app.ActionBar r0 = r0.getActionBar()
            if (r0 == 0) goto L13
            r0.setHomeActionContentDescription(r2)
        L13:
            return
    }

    private void setActionBarUpIndicator(android.graphics.drawable.Drawable r2, int r3) {
            r1 = this;
            androidx.legacy.app.ActionBarDrawerToggle$Delegate r0 = r1.mActivityImpl
            if (r0 == 0) goto L8
            r0.setActionBarUpIndicator(r2, r3)
            return
        L8:
            android.app.Activity r0 = r1.mActivity
            android.app.ActionBar r0 = r0.getActionBar()
            if (r0 == 0) goto L16
            r0.setHomeAsUpIndicator(r2)
            r0.setHomeActionContentDescription(r3)
        L16:
            return
    }

    public boolean isDrawerIndicatorEnabled() {
            r1 = this;
            boolean r0 = r1.mDrawerIndicatorEnabled
            return r0
    }

    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            boolean r2 = r1.mHasCustomUpIndicator
            if (r2 != 0) goto La
            android.graphics.drawable.Drawable r2 = r1.getThemeUpIndicator()
            r1.mHomeAsUpIndicator = r2
        La:
            android.app.Activity r2 = r1.mActivity
            int r0 = r1.mDrawerImageResource
            android.graphics.drawable.Drawable r2 = androidx.core.content.ContextCompat.getDrawable(r2, r0)
            r1.mDrawerImage = r2
            r1.syncState()
            return
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerClosed(android.view.View r2) {
            r1 = this;
            androidx.legacy.app.ActionBarDrawerToggle$SlideDrawable r2 = r1.mSlider
            r0 = 0
            r2.setPosition(r0)
            boolean r2 = r1.mDrawerIndicatorEnabled
            if (r2 == 0) goto Lf
            int r2 = r1.mOpenDrawerContentDescRes
            r1.setActionBarDescription(r2)
        Lf:
            return
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerOpened(android.view.View r2) {
            r1 = this;
            androidx.legacy.app.ActionBarDrawerToggle$SlideDrawable r2 = r1.mSlider
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setPosition(r0)
            boolean r2 = r1.mDrawerIndicatorEnabled
            if (r2 == 0) goto L10
            int r2 = r1.mCloseDrawerContentDescRes
            r1.setActionBarDescription(r2)
        L10:
            return
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerSlide(android.view.View r4, float r5) {
            r3 = this;
            androidx.legacy.app.ActionBarDrawerToggle$SlideDrawable r4 = r3.mSlider
            float r4 = r4.getPosition()
            r0 = 1073741824(0x40000000, float:2.0)
            r1 = 1056964608(0x3f000000, float:0.5)
            int r2 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r2 <= 0) goto L1b
            r2 = 0
            float r5 = r5 - r1
            float r5 = java.lang.Math.max(r2, r5)
            float r5 = r5 * r0
            float r4 = java.lang.Math.max(r4, r5)
            goto L21
        L1b:
            float r5 = r5 * r0
            float r4 = java.lang.Math.min(r4, r5)
        L21:
            androidx.legacy.app.ActionBarDrawerToggle$SlideDrawable r5 = r3.mSlider
            r5.setPosition(r4)
            return
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerStateChanged(int r1) {
            r0 = this;
            return
    }

    public boolean onOptionsItemSelected(android.view.MenuItem r2) {
            r1 = this;
            if (r2 == 0) goto L27
            int r2 = r2.getItemId()
            r0 = 16908332(0x102002c, float:2.3877352E-38)
            if (r2 != r0) goto L27
            boolean r2 = r1.mDrawerIndicatorEnabled
            if (r2 == 0) goto L27
            androidx.drawerlayout.widget.DrawerLayout r2 = r1.mDrawerLayout
            r0 = 8388611(0x800003, float:1.1754948E-38)
            boolean r2 = r2.isDrawerVisible(r0)
            if (r2 == 0) goto L20
            androidx.drawerlayout.widget.DrawerLayout r2 = r1.mDrawerLayout
            r2.closeDrawer(r0)
            goto L25
        L20:
            androidx.drawerlayout.widget.DrawerLayout r2 = r1.mDrawerLayout
            r2.openDrawer(r0)
        L25:
            r2 = 1
            return r2
        L27:
            r2 = 0
            return r2
    }

    public void setDrawerIndicatorEnabled(boolean r4) {
            r3 = this;
            boolean r0 = r3.mDrawerIndicatorEnabled
            if (r4 == r0) goto L24
            if (r4 == 0) goto L1c
            androidx.legacy.app.ActionBarDrawerToggle$SlideDrawable r0 = r3.mSlider
            androidx.drawerlayout.widget.DrawerLayout r1 = r3.mDrawerLayout
            r2 = 8388611(0x800003, float:1.1754948E-38)
            boolean r1 = r1.isDrawerOpen(r2)
            if (r1 == 0) goto L16
            int r1 = r3.mCloseDrawerContentDescRes
            goto L18
        L16:
            int r1 = r3.mOpenDrawerContentDescRes
        L18:
            r3.setActionBarUpIndicator(r0, r1)
            goto L22
        L1c:
            android.graphics.drawable.Drawable r0 = r3.mHomeAsUpIndicator
            r1 = 0
            r3.setActionBarUpIndicator(r0, r1)
        L22:
            r3.mDrawerIndicatorEnabled = r4
        L24:
            return
    }

    public void setHomeAsUpIndicator(int r2) {
            r1 = this;
            if (r2 == 0) goto L9
            android.app.Activity r0 = r1.mActivity
            android.graphics.drawable.Drawable r2 = androidx.core.content.ContextCompat.getDrawable(r0, r2)
            goto La
        L9:
            r2 = 0
        La:
            r1.setHomeAsUpIndicator(r2)
            return
    }

    public void setHomeAsUpIndicator(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r0 = 0
            if (r2 != 0) goto Lc
            android.graphics.drawable.Drawable r2 = r1.getThemeUpIndicator()
            r1.mHomeAsUpIndicator = r2
            r1.mHasCustomUpIndicator = r0
            goto L11
        Lc:
            r1.mHomeAsUpIndicator = r2
            r2 = 1
            r1.mHasCustomUpIndicator = r2
        L11:
            boolean r2 = r1.mDrawerIndicatorEnabled
            if (r2 != 0) goto L1a
            android.graphics.drawable.Drawable r2 = r1.mHomeAsUpIndicator
            r1.setActionBarUpIndicator(r2, r0)
        L1a:
            return
    }

    public void syncState() {
            r3 = this;
            androidx.drawerlayout.widget.DrawerLayout r0 = r3.mDrawerLayout
            r1 = 8388611(0x800003, float:1.1754948E-38)
            boolean r0 = r0.isDrawerOpen(r1)
            if (r0 == 0) goto L13
            androidx.legacy.app.ActionBarDrawerToggle$SlideDrawable r0 = r3.mSlider
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.setPosition(r2)
            goto L19
        L13:
            androidx.legacy.app.ActionBarDrawerToggle$SlideDrawable r0 = r3.mSlider
            r2 = 0
            r0.setPosition(r2)
        L19:
            boolean r0 = r3.mDrawerIndicatorEnabled
            if (r0 == 0) goto L2f
            androidx.legacy.app.ActionBarDrawerToggle$SlideDrawable r0 = r3.mSlider
            androidx.drawerlayout.widget.DrawerLayout r2 = r3.mDrawerLayout
            boolean r1 = r2.isDrawerOpen(r1)
            if (r1 == 0) goto L2a
            int r1 = r3.mCloseDrawerContentDescRes
            goto L2c
        L2a:
            int r1 = r3.mOpenDrawerContentDescRes
        L2c:
            r3.setActionBarUpIndicator(r0, r1)
        L2f:
            return
    }
}
