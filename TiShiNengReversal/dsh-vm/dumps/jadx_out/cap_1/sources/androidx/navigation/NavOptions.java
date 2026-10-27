package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class NavOptions {

    @androidx.annotation.AnimRes
    @androidx.annotation.AnimatorRes
    private int mEnterAnim;

    @androidx.annotation.AnimRes
    @androidx.annotation.AnimatorRes
    private int mExitAnim;

    @androidx.annotation.AnimRes
    @androidx.annotation.AnimatorRes
    private int mPopEnterAnim;

    @androidx.annotation.AnimRes
    @androidx.annotation.AnimatorRes
    private int mPopExitAnim;

    @androidx.annotation.IdRes
    private int mPopUpTo;
    private boolean mPopUpToInclusive;
    private boolean mSingleTop;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {

        @androidx.annotation.AnimRes
        @androidx.annotation.AnimatorRes
        int mEnterAnim;

        @androidx.annotation.AnimRes
        @androidx.annotation.AnimatorRes
        int mExitAnim;

        @androidx.annotation.AnimRes
        @androidx.annotation.AnimatorRes
        int mPopEnterAnim;

        @androidx.annotation.AnimRes
        @androidx.annotation.AnimatorRes
        int mPopExitAnim;

        @androidx.annotation.IdRes
        int mPopUpTo;
        boolean mPopUpToInclusive;
        boolean mSingleTop;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.mPopUpTo = r0
                r1.mEnterAnim = r0
                r1.mExitAnim = r0
                r1.mPopEnterAnim = r0
                r1.mPopExitAnim = r0
                return
        }

        @androidx.annotation.NonNull
        public androidx.navigation.NavOptions build() {
                r8 = this;
                androidx.navigation.NavOptions r0 = new androidx.navigation.NavOptions
                boolean r1 = r8.mSingleTop
                int r2 = r8.mPopUpTo
                boolean r3 = r8.mPopUpToInclusive
                int r4 = r8.mEnterAnim
                int r5 = r8.mExitAnim
                int r6 = r8.mPopEnterAnim
                int r7 = r8.mPopExitAnim
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.navigation.NavOptions.Builder setEnterAnim(@androidx.annotation.AnimRes @androidx.annotation.AnimatorRes int r1) {
                r0 = this;
                r0.mEnterAnim = r1
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.navigation.NavOptions.Builder setExitAnim(@androidx.annotation.AnimRes @androidx.annotation.AnimatorRes int r1) {
                r0 = this;
                r0.mExitAnim = r1
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.navigation.NavOptions.Builder setLaunchSingleTop(boolean r1) {
                r0 = this;
                r0.mSingleTop = r1
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.navigation.NavOptions.Builder setPopEnterAnim(@androidx.annotation.AnimRes @androidx.annotation.AnimatorRes int r1) {
                r0 = this;
                r0.mPopEnterAnim = r1
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.navigation.NavOptions.Builder setPopExitAnim(@androidx.annotation.AnimRes @androidx.annotation.AnimatorRes int r1) {
                r0 = this;
                r0.mPopExitAnim = r1
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.navigation.NavOptions.Builder setPopUpTo(@androidx.annotation.IdRes int r1, boolean r2) {
                r0 = this;
                r0.mPopUpTo = r1
                r0.mPopUpToInclusive = r2
                return r0
        }
    }

    NavOptions(boolean r1, @androidx.annotation.IdRes int r2, boolean r3, @androidx.annotation.AnimRes @androidx.annotation.AnimatorRes int r4, @androidx.annotation.AnimRes @androidx.annotation.AnimatorRes int r5, @androidx.annotation.AnimRes @androidx.annotation.AnimatorRes int r6, @androidx.annotation.AnimRes @androidx.annotation.AnimatorRes int r7) {
            r0 = this;
            r0.<init>()
            r0.mSingleTop = r1
            r0.mPopUpTo = r2
            r0.mPopUpToInclusive = r3
            r0.mEnterAnim = r4
            r0.mExitAnim = r5
            r0.mPopEnterAnim = r6
            r0.mPopExitAnim = r7
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L3d
            java.lang.Class<androidx.navigation.NavOptions> r2 = androidx.navigation.NavOptions.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L3d
        L10:
            androidx.navigation.NavOptions r5 = (androidx.navigation.NavOptions) r5
            boolean r2 = r4.mSingleTop
            boolean r3 = r5.mSingleTop
            if (r2 != r3) goto L3d
            int r2 = r4.mPopUpTo
            int r3 = r5.mPopUpTo
            if (r2 != r3) goto L3d
            boolean r2 = r4.mPopUpToInclusive
            boolean r3 = r5.mPopUpToInclusive
            if (r2 != r3) goto L3d
            int r2 = r4.mEnterAnim
            int r3 = r5.mEnterAnim
            if (r2 != r3) goto L3d
            int r2 = r4.mExitAnim
            int r3 = r5.mExitAnim
            if (r2 != r3) goto L3d
            int r2 = r4.mPopEnterAnim
            int r3 = r5.mPopEnterAnim
            if (r2 != r3) goto L3d
            int r2 = r4.mPopExitAnim
            int r5 = r5.mPopExitAnim
            if (r2 != r5) goto L3d
            return r0
        L3d:
            return r1
    }

    @androidx.annotation.AnimRes
    @androidx.annotation.AnimatorRes
    public int getEnterAnim() {
            r1 = this;
            int r0 = r1.mEnterAnim
            return r0
    }

    @androidx.annotation.AnimRes
    @androidx.annotation.AnimatorRes
    public int getExitAnim() {
            r1 = this;
            int r0 = r1.mExitAnim
            return r0
    }

    @androidx.annotation.AnimRes
    @androidx.annotation.AnimatorRes
    public int getPopEnterAnim() {
            r1 = this;
            int r0 = r1.mPopEnterAnim
            return r0
    }

    @androidx.annotation.AnimRes
    @androidx.annotation.AnimatorRes
    public int getPopExitAnim() {
            r1 = this;
            int r0 = r1.mPopExitAnim
            return r0
    }

    @androidx.annotation.IdRes
    public int getPopUpTo() {
            r1 = this;
            int r0 = r1.mPopUpTo
            return r0
    }

    public int hashCode() {
            r2 = this;
            boolean r0 = r2.shouldLaunchSingleTop()
            int r0 = r0 * 31
            int r1 = r2.getPopUpTo()
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.isPopUpToInclusive()
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.getEnterAnim()
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.getExitAnim()
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.getPopEnterAnim()
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.getPopExitAnim()
            int r0 = r0 + r1
            return r0
    }

    public boolean isPopUpToInclusive() {
            r1 = this;
            boolean r0 = r1.mPopUpToInclusive
            return r0
    }

    public boolean shouldLaunchSingleTop() {
            r1 = this;
            boolean r0 = r1.mSingleTop
            return r0
    }
}
