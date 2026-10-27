package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AcSplashBindingImpl extends com.bxkj.student.databinding.AcSplashBinding {

    @androidx.annotation.Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;

    @androidx.annotation.Nullable
    private static final android.util.SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    static {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            com.bxkj.student.databinding.AcSplashBindingImpl.sViewsWithIds = r0
            r1 = 2131297182(0x7f09039e, float:1.8212302E38)
            r2 = 1
            r0.put(r1, r2)
            r1 = 2131299091(0x7f090b13, float:1.8216174E38)
            r2 = 2
            r0.put(r1, r2)
            r1 = 2131299158(0x7f090b56, float:1.821631E38)
            r2 = 3
            r0.put(r1, r2)
            return
    }

    public AcSplashBindingImpl(@androidx.annotation.Nullable androidx.databinding.DataBindingComponent r4, @androidx.annotation.NonNull android.view.View r5) {
            r3 = this;
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = com.bxkj.student.databinding.AcSplashBindingImpl.sIncludes
            android.util.SparseIntArray r1 = com.bxkj.student.databinding.AcSplashBindingImpl.sViewsWithIds
            r2 = 4
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.mapBindings(r4, r5, r2, r0, r1)
            r3.<init>(r4, r5, r0)
            return
    }

    private AcSplashBindingImpl(androidx.databinding.DataBindingComponent r10, android.view.View r11, java.lang.Object[] r12) {
            r9 = this;
            r0 = 0
            r0 = r12[r0]
            r5 = r0
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            r0 = 1
            r0 = r12[r0]
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = 2
            r0 = r12[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 3
            r12 = r12[r0]
            r8 = r12
            android.widget.TextView r8 = (android.widget.TextView) r8
            r4 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r10 = -1
            r1.mDirtyFlags = r10
            android.widget.FrameLayout r10 = r1.adsFl
            r11 = 0
            r10.setTag(r11)
            r9.setRootTag(r3)
            r9.invalidateAll()
            return
    }

    protected void executeBindings() {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            r2.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L7
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
            throw r0
    }

    public boolean hasPendingBindings() {
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.mDirtyFlags     // Catch: java.lang.Throwable -> Lc
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Le
            r0 = 1
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lc
            return r0
        Lc:
            r0 = move-exception
            goto L11
        Le:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lc
            r0 = 0
            return r0
        L11:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    public void invalidateAll() {
            r2 = this;
            monitor-enter(r2)
            r0 = 1
            r2.mDirtyFlags = r0     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            r2.requestRebind()
            return
        La:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    protected boolean onFieldChange(int r1, java.lang.Object r2, int r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    public boolean setVariable(int r1, @androidx.annotation.Nullable java.lang.Object r2) {
            r0 = this;
            r1 = 1
            return r1
    }
}
