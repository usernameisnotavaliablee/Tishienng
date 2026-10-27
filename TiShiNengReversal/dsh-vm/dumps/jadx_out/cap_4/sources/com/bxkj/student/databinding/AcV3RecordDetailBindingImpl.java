package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AcV3RecordDetailBindingImpl extends com.bxkj.student.databinding.AcV3RecordDetailBinding implements com.bxkj.student.generated.callback.a.InterfaceC0073a {

    @androidx.annotation.Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;

    @androidx.annotation.Nullable
    private static final android.util.SparseIntArray sViewsWithIds = null;

    @androidx.annotation.Nullable
    private final android.view.View.OnClickListener mCallback26;

    @androidx.annotation.Nullable
    private final android.view.View.OnClickListener mCallback27;
    private long mDirtyFlags;

    @androidx.annotation.NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;

    static {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            com.bxkj.student.databinding.AcV3RecordDetailBindingImpl.sViewsWithIds = r0
            r1 = 2131298764(0x7f0909cc, float:1.821551E38)
            r2 = 3
            r0.put(r1, r2)
            r1 = 2131298632(0x7f090948, float:1.8215243E38)
            r2 = 4
            r0.put(r1, r2)
            r1 = 2131299266(0x7f090bc2, float:1.8216529E38)
            r2 = 5
            r0.put(r1, r2)
            return
    }

    public AcV3RecordDetailBindingImpl(@androidx.annotation.Nullable androidx.databinding.DataBindingComponent r4, @androidx.annotation.NonNull android.view.View r5) {
            r3 = this;
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = com.bxkj.student.databinding.AcV3RecordDetailBindingImpl.sIncludes
            android.util.SparseIntArray r1 = com.bxkj.student.databinding.AcV3RecordDetailBindingImpl.sViewsWithIds
            r2 = 6
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.mapBindings(r4, r5, r2, r0, r1)
            r3.<init>(r4, r5, r0)
            return
    }

    private AcV3RecordDetailBindingImpl(androidx.databinding.DataBindingComponent r12, android.view.View r13, java.lang.Object[] r14) {
            r11 = this;
            r0 = 1
            r1 = r14[r0]
            r6 = r1
            androidx.appcompat.widget.AppCompatImageButton r6 = (androidx.appcompat.widget.AppCompatImageButton) r6
            r1 = 4
            r1 = r14[r1]
            r7 = r1
            com.google.android.material.tabs.TabLayout r7 = (com.google.android.material.tabs.TabLayout) r7
            r1 = 2
            r2 = r14[r1]
            r8 = r2
            android.widget.TextView r8 = (android.widget.TextView) r8
            r2 = 3
            r2 = r14[r2]
            r9 = r2
            com.bxkj.base.view.MarqueeTextView r9 = (com.bxkj.base.view.MarqueeTextView) r9
            r2 = 5
            r2 = r14[r2]
            r10 = r2
            cn.bluemobi.dylan.base.view.NoSlidingViewPager r10 = (cn.bluemobi.dylan.base.view.NoSlidingViewPager) r10
            r5 = 0
            r2 = r11
            r3 = r12
            r4 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r12 = -1
            r2.mDirtyFlags = r12
            androidx.appcompat.widget.AppCompatImageButton r12 = r2.ibBack
            r13 = 0
            r12.setTag(r13)
            r12 = 0
            r12 = r14[r12]
            androidx.constraintlayout.widget.ConstraintLayout r12 = (androidx.constraintlayout.widget.ConstraintLayout) r12
            r2.mboundView0 = r12
            r12.setTag(r13)
            android.widget.TextView r12 = r2.toolbar
            r12.setTag(r13)
            r11.setRootTag(r4)
            com.bxkj.student.generated.callback.a r12 = new com.bxkj.student.generated.callback.a
            r12.<init>(r11, r1)
            r2.mCallback27 = r12
            com.bxkj.student.generated.callback.a r12 = new com.bxkj.student.generated.callback.a
            r12.<init>(r11, r0)
            r2.mCallback26 = r12
            r11.invalidateAll()
            return
    }

    @Override // com.bxkj.student.generated.callback.a.InterfaceC0073a
    public final void _internalCallbackOnClick(int r1, android.view.View r2) {
            r0 = this;
            r2 = 1
            if (r1 == r2) goto Lf
            r2 = 2
            if (r1 == r2) goto L7
            return
        L7:
            com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity r1 = r0.mMActivity
            if (r1 == 0) goto Le
            r1.O()
        Le:
            return
        Lf:
            com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity r1 = r0.mMActivity
            if (r1 == 0) goto L16
            r1.onBackPressed()
        L16:
            return
    }

    protected void executeBindings() {
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.mDirtyFlags     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            r6.mDirtyFlags = r2     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L1e
            r4 = 2
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1d
            androidx.appcompat.widget.AppCompatImageButton r0 = r6.ibBack
            android.view.View$OnClickListener r1 = r6.mCallback26
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r6.toolbar
            android.view.View$OnClickListener r1 = r6.mCallback27
            r0.setOnClickListener(r1)
        L1d:
            return
        L1e:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L1e
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
            r0 = 2
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

    @Override // com.bxkj.student.databinding.AcV3RecordDetailBinding
    public void setMActivity(@androidx.annotation.Nullable com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity r5) {
            r4 = this;
            r4.mMActivity = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L14
            r2 = 1
            long r0 = r0 | r2
            r4.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            r5 = 17
            r4.notifyPropertyChanged(r5)
            super.requestRebind()
            return
        L14:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r5
    }

    public boolean setVariable(int r2, @androidx.annotation.Nullable java.lang.Object r3) {
            r1 = this;
            r0 = 17
            if (r0 != r2) goto Lb
            com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity r3 = (com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity) r3
            r1.setMActivity(r3)
            r2 = 1
            return r2
        Lb:
            r2 = 0
            return r2
    }
}
