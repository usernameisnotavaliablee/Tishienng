package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class V2ItemForAiFitnessListBindingImpl extends com.bxkj.student.databinding.V2ItemForAiFitnessListBinding implements com.bxkj.student.generated.callback.a.InterfaceC0073a {

    @androidx.annotation.Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;

    @androidx.annotation.Nullable
    private static final android.util.SparseIntArray sViewsWithIds = null;

    @androidx.annotation.Nullable
    private final android.view.View.OnClickListener mCallback78;
    private long mDirtyFlags;

    @androidx.annotation.NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;

    @androidx.annotation.NonNull
    private final androidx.cardview.widget.CardView mboundView1;

    static {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            com.bxkj.student.databinding.V2ItemForAiFitnessListBindingImpl.sViewsWithIds = r0
            r1 = 2131297155(0x7f090383, float:1.8212247E38)
            r2 = 3
            r0.put(r1, r2)
            return
    }

    public V2ItemForAiFitnessListBindingImpl(@androidx.annotation.Nullable androidx.databinding.DataBindingComponent r4, @androidx.annotation.NonNull android.view.View r5) {
            r3 = this;
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = com.bxkj.student.databinding.V2ItemForAiFitnessListBindingImpl.sIncludes
            android.util.SparseIntArray r1 = com.bxkj.student.databinding.V2ItemForAiFitnessListBindingImpl.sViewsWithIds
            r2 = 4
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.mapBindings(r4, r5, r2, r0, r1)
            r3.<init>(r4, r5, r0)
            return
    }

    private V2ItemForAiFitnessListBindingImpl(androidx.databinding.DataBindingComponent r8, android.view.View r9, java.lang.Object[] r10) {
            r7 = this;
            r0 = 2
            r0 = r10[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 3
            r0 = r10[r0]
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r8 = -1
            r1.mDirtyFlags = r8
            android.widget.TextView r8 = r1.btMenu
            r9 = 0
            r8.setTag(r9)
            r8 = 0
            r8 = r10[r8]
            androidx.constraintlayout.widget.ConstraintLayout r8 = (androidx.constraintlayout.widget.ConstraintLayout) r8
            r1.mboundView0 = r8
            r8.setTag(r9)
            r8 = 1
            r10 = r10[r8]
            androidx.cardview.widget.CardView r10 = (androidx.cardview.widget.CardView) r10
            r1.mboundView1 = r10
            r10.setTag(r9)
            r7.setRootTag(r3)
            com.bxkj.student.generated.callback.a r9 = new com.bxkj.student.generated.callback.a
            r9.<init>(r7, r8)
            r1.mCallback78 = r9
            r7.invalidateAll()
            return
    }

    @Override // com.bxkj.student.generated.callback.a.InterfaceC0073a
    public final void _internalCallbackOnClick(int r1, android.view.View r2) {
            r0 = this;
            com.bxkj.student.v2.ai.fitness.AIFitnessHomeActivity r1 = r0.mAiFitnessHomeActivity
            com.bxkj.student.v2.ai.fitness.data.FitnessModel r2 = r0.mFitnessModel
            if (r1 == 0) goto L9
            r1.M(r2)
        L9:
            return
    }

    protected void executeBindings() {
            r8 = this;
            monitor-enter(r8)
            long r0 = r8.mDirtyFlags     // Catch: java.lang.Throwable -> L2f
            r2 = 0
            r8.mDirtyFlags = r2     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L2f
            com.bxkj.student.v2.ai.fitness.data.FitnessModel r4 = r8.mFitnessModel
            r5 = 6
            long r5 = r5 & r0
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 == 0) goto L18
            if (r4 == 0) goto L18
            java.lang.String r4 = r4.b()
            goto L19
        L18:
            r4 = 0
        L19:
            if (r7 == 0) goto L20
            android.widget.TextView r5 = r8.btMenu
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r5, r4)
        L20:
            r4 = 4
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L2e
            androidx.cardview.widget.CardView r0 = r8.mboundView1
            android.view.View$OnClickListener r1 = r8.mCallback78
            r0.setOnClickListener(r1)
        L2e:
            return
        L2f:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L2f
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
            r0 = 4
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

    @Override // com.bxkj.student.databinding.V2ItemForAiFitnessListBinding
    public void setAiFitnessHomeActivity(@androidx.annotation.Nullable com.bxkj.student.v2.ai.fitness.AIFitnessHomeActivity r5) {
            r4 = this;
            r4.mAiFitnessHomeActivity = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L13
            r2 = 1
            long r0 = r0 | r2
            r4.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L13
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L13
            r5 = 2
            r4.notifyPropertyChanged(r5)
            super.requestRebind()
            return
        L13:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L13
            throw r5
    }

    @Override // com.bxkj.student.databinding.V2ItemForAiFitnessListBinding
    public void setFitnessModel(@androidx.annotation.Nullable com.bxkj.student.v2.ai.fitness.data.FitnessModel r5) {
            r4 = this;
            r4.mFitnessModel = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L14
            r2 = 2
            long r0 = r0 | r2
            r4.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            r5 = 10
            r4.notifyPropertyChanged(r5)
            super.requestRebind()
            return
        L14:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r5
    }

    public boolean setVariable(int r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r2 = this;
            r0 = 2
            r1 = 1
            if (r0 != r3) goto La
            com.bxkj.student.v2.ai.fitness.AIFitnessHomeActivity r4 = (com.bxkj.student.v2.ai.fitness.AIFitnessHomeActivity) r4
            r2.setAiFitnessHomeActivity(r4)
            return r1
        La:
            r0 = 10
            if (r0 != r3) goto L14
            com.bxkj.student.v2.ai.fitness.data.FitnessModel r4 = (com.bxkj.student.v2.ai.fitness.data.FitnessModel) r4
            r2.setFitnessModel(r4)
            return r1
        L14:
            r3 = 0
            return r3
    }
}
