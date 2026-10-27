package androidx.navigation.ui;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class AppBarConfiguration {

    @androidx.annotation.Nullable
    private final androidx.navigation.ui.AppBarConfiguration.OnNavigateUpListener mFallbackOnNavigateUpListener;

    @androidx.annotation.Nullable
    private final androidx.customview.widget.Openable mOpenableLayout;

    @androidx.annotation.NonNull
    private final java.util.Set<java.lang.Integer> mTopLevelDestinations;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.navigation.ui.AppBarConfiguration$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {

        @androidx.annotation.Nullable
        private androidx.navigation.ui.AppBarConfiguration.OnNavigateUpListener mFallbackOnNavigateUpListener;

        @androidx.annotation.Nullable
        private androidx.customview.widget.Openable mOpenableLayout;

        @androidx.annotation.NonNull
        private final java.util.Set<java.lang.Integer> mTopLevelDestinations;

        public Builder(@androidx.annotation.NonNull android.view.Menu r5) {
                r4 = this;
                r4.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r4.mTopLevelDestinations = r0
                int r0 = r5.size()
                r1 = 0
            Lf:
                if (r1 >= r0) goto L25
                android.view.MenuItem r2 = r5.getItem(r1)
                java.util.Set<java.lang.Integer> r3 = r4.mTopLevelDestinations
                int r2 = r2.getItemId()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3.add(r2)
                int r1 = r1 + 1
                goto Lf
            L25:
                return
        }

        public Builder(@androidx.annotation.NonNull androidx.navigation.NavGraph r2) {
                r1 = this;
                r1.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.mTopLevelDestinations = r0
                androidx.navigation.NavDestination r2 = androidx.navigation.ui.NavigationUI.findStartDestination(r2)
                int r2 = r2.getId()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0.add(r2)
                return
        }

        public Builder(@androidx.annotation.NonNull java.util.Set<java.lang.Integer> r2) {
                r1 = this;
                r1.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.mTopLevelDestinations = r0
                r0.addAll(r2)
                return
        }

        public Builder(@androidx.annotation.NonNull int... r5) {
                r4 = this;
                r4.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r4.mTopLevelDestinations = r0
                int r0 = r5.length
                r1 = 0
            Lc:
                if (r1 >= r0) goto L1c
                r2 = r5[r1]
                java.util.Set<java.lang.Integer> r3 = r4.mTopLevelDestinations
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3.add(r2)
                int r1 = r1 + 1
                goto Lc
            L1c:
                return
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"SyntheticAccessor"})
        public androidx.navigation.ui.AppBarConfiguration build() {
                r5 = this;
                androidx.navigation.ui.AppBarConfiguration r0 = new androidx.navigation.ui.AppBarConfiguration
                java.util.Set<java.lang.Integer> r1 = r5.mTopLevelDestinations
                androidx.customview.widget.Openable r2 = r5.mOpenableLayout
                androidx.navigation.ui.AppBarConfiguration$OnNavigateUpListener r3 = r5.mFallbackOnNavigateUpListener
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        @androidx.annotation.NonNull
        @java.lang.Deprecated
        public androidx.navigation.ui.AppBarConfiguration.Builder setDrawerLayout(@androidx.annotation.Nullable androidx.drawerlayout.widget.DrawerLayout r1) {
                r0 = this;
                r0.mOpenableLayout = r1
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.navigation.ui.AppBarConfiguration.Builder setFallbackOnNavigateUpListener(@androidx.annotation.Nullable androidx.navigation.ui.AppBarConfiguration.OnNavigateUpListener r1) {
                r0 = this;
                r0.mFallbackOnNavigateUpListener = r1
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.navigation.ui.AppBarConfiguration.Builder setOpenableLayout(@androidx.annotation.Nullable androidx.customview.widget.Openable r1) {
                r0 = this;
                r0.mOpenableLayout = r1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnNavigateUpListener {
        boolean onNavigateUp();
    }

    private AppBarConfiguration(@androidx.annotation.NonNull java.util.Set<java.lang.Integer> r1, @androidx.annotation.Nullable androidx.customview.widget.Openable r2, @androidx.annotation.Nullable androidx.navigation.ui.AppBarConfiguration.OnNavigateUpListener r3) {
            r0 = this;
            r0.<init>()
            r0.mTopLevelDestinations = r1
            r0.mOpenableLayout = r2
            r0.mFallbackOnNavigateUpListener = r3
            return
    }

    /* synthetic */ AppBarConfiguration(java.util.Set r1, androidx.customview.widget.Openable r2, androidx.navigation.ui.AppBarConfiguration.OnNavigateUpListener r3, androidx.navigation.ui.AppBarConfiguration.AnonymousClass1 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public androidx.drawerlayout.widget.DrawerLayout getDrawerLayout() {
            r2 = this;
            androidx.customview.widget.Openable r0 = r2.mOpenableLayout
            boolean r1 = r0 instanceof androidx.drawerlayout.widget.DrawerLayout
            if (r1 == 0) goto L9
            androidx.drawerlayout.widget.DrawerLayout r0 = (androidx.drawerlayout.widget.DrawerLayout) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.navigation.ui.AppBarConfiguration.OnNavigateUpListener getFallbackOnNavigateUpListener() {
            r1 = this;
            androidx.navigation.ui.AppBarConfiguration$OnNavigateUpListener r0 = r1.mFallbackOnNavigateUpListener
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.customview.widget.Openable getOpenableLayout() {
            r1 = this;
            androidx.customview.widget.Openable r0 = r1.mOpenableLayout
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.Set<java.lang.Integer> getTopLevelDestinations() {
            r1 = this;
            java.util.Set<java.lang.Integer> r0 = r1.mTopLevelDestinations
            return r0
    }
}
