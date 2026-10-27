package androidx.navigation.ui;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
abstract class AbstractAppBarOnDestinationChangedListener implements androidx.navigation.NavController.OnDestinationChangedListener {
    private android.animation.ValueAnimator mAnimator;
    private androidx.appcompat.graphics.drawable.DrawerArrowDrawable mArrowDrawable;
    private final android.content.Context mContext;

    @androidx.annotation.Nullable
    private final java.lang.ref.WeakReference<androidx.customview.widget.Openable> mOpenableLayoutWeakReference;
    private final java.util.Set<java.lang.Integer> mTopLevelDestinations;

    AbstractAppBarOnDestinationChangedListener(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull androidx.navigation.ui.AppBarConfiguration r2) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            java.util.Set r1 = r2.getTopLevelDestinations()
            r0.mTopLevelDestinations = r1
            androidx.customview.widget.Openable r1 = r2.getOpenableLayout()
            if (r1 == 0) goto L19
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.mOpenableLayoutWeakReference = r2
            return
        L19:
            r1 = 0
            r0.mOpenableLayoutWeakReference = r1
            return
    }

    private void setActionBarUpIndicator(boolean r6) {
            r5 = this;
            androidx.appcompat.graphics.drawable.DrawerArrowDrawable r0 = r5.mArrowDrawable
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L11
            androidx.appcompat.graphics.drawable.DrawerArrowDrawable r0 = new androidx.appcompat.graphics.drawable.DrawerArrowDrawable
            android.content.Context r3 = r5.mContext
            r0.<init>(r3)
            r5.mArrowDrawable = r0
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            androidx.appcompat.graphics.drawable.DrawerArrowDrawable r3 = r5.mArrowDrawable
            if (r6 == 0) goto L19
            int r4 = androidx.navigation.ui.R.string.nav_app_bar_open_drawer_description
            goto L1b
        L19:
            int r4 = androidx.navigation.ui.R.string.nav_app_bar_navigate_up_description
        L1b:
            r5.setNavigationIcon(r3, r4)
            if (r6 == 0) goto L22
            r6 = 0
            goto L24
        L22:
            r6 = 1065353216(0x3f800000, float:1.0)
        L24:
            if (r0 == 0) goto L48
            androidx.appcompat.graphics.drawable.DrawerArrowDrawable r0 = r5.mArrowDrawable
            float r0 = r0.getProgress()
            android.animation.ValueAnimator r3 = r5.mAnimator
            if (r3 == 0) goto L33
            r3.cancel()
        L33:
            androidx.appcompat.graphics.drawable.DrawerArrowDrawable r3 = r5.mArrowDrawable
            r4 = 2
            float[] r4 = new float[r4]
            r4[r1] = r0
            r4[r2] = r6
            java.lang.String r6 = "progress"
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r3, r6, r4)
            r5.mAnimator = r6
            r6.start()
            return
        L48:
            androidx.appcompat.graphics.drawable.DrawerArrowDrawable r0 = r5.mArrowDrawable
            r0.setProgress(r6)
            return
    }

    @Override // androidx.navigation.NavController.OnDestinationChangedListener
    public void onDestinationChanged(@androidx.annotation.NonNull androidx.navigation.NavController r8, @androidx.annotation.NonNull androidx.navigation.NavDestination r9, @androidx.annotation.Nullable android.os.Bundle r10) {
            r7 = this;
            boolean r0 = r9 instanceof androidx.navigation.FloatingWindow
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.ref.WeakReference<androidx.customview.widget.Openable> r0 = r7.mOpenableLayoutWeakReference
            r1 = 0
            if (r0 == 0) goto L11
            java.lang.Object r0 = r0.get()
            androidx.customview.widget.Openable r0 = (androidx.customview.widget.Openable) r0
            goto L12
        L11:
            r0 = r1
        L12:
            java.lang.ref.WeakReference<androidx.customview.widget.Openable> r2 = r7.mOpenableLayoutWeakReference
            if (r2 == 0) goto L1c
            if (r0 != 0) goto L1c
            r8.removeOnDestinationChangedListener(r7)
            return
        L1c:
            java.lang.CharSequence r8 = r9.getLabel()
            r2 = 1
            if (r8 == 0) goto L82
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            java.lang.String r4 = "\\{(.+?)\\}"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)
            java.util.regex.Matcher r4 = r4.matcher(r8)
        L32:
            boolean r5 = r4.find()
            if (r5 == 0) goto L7c
            java.lang.String r5 = r4.group(r2)
            if (r10 == 0) goto L55
            boolean r6 = r10.containsKey(r5)
            if (r6 == 0) goto L55
            java.lang.String r6 = ""
            r4.appendReplacement(r3, r6)
            java.lang.Object r5 = r10.get(r5)
            java.lang.String r5 = r5.toString()
            r3.append(r5)
            goto L32
        L55:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Could not find "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = " in "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = " to fill label "
            r0.append(r10)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8)
            throw r9
        L7c:
            r4.appendTail(r3)
            r7.setTitle(r3)
        L82:
            java.util.Set<java.lang.Integer> r8 = r7.mTopLevelDestinations
            boolean r8 = androidx.navigation.ui.NavigationUI.matchDestinations(r9, r8)
            r9 = 0
            if (r0 != 0) goto L91
            if (r8 == 0) goto L91
            r7.setNavigationIcon(r1, r9)
            return
        L91:
            if (r0 == 0) goto L96
            if (r8 == 0) goto L96
            goto L97
        L96:
            r2 = 0
        L97:
            r7.setActionBarUpIndicator(r2)
            return
    }

    protected abstract void setNavigationIcon(android.graphics.drawable.Drawable r1, @androidx.annotation.StringRes int r2);

    protected abstract void setTitle(java.lang.CharSequence r1);
}
