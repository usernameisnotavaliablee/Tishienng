package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class V2MainTabClassifyFragmentBindingImpl extends com.bxkj.student.databinding.V2MainTabClassifyFragmentBinding implements com.bxkj.student.generated.callback.a.InterfaceC0073a {

    @androidx.annotation.Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;

    @androidx.annotation.Nullable
    private static final android.util.SparseIntArray sViewsWithIds = null;

    @androidx.annotation.Nullable
    private final android.view.View.OnClickListener mCallback76;

    @androidx.annotation.Nullable
    private final android.view.View.OnClickListener mCallback77;
    private long mDirtyFlags;

    @androidx.annotation.NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;

    static {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            com.bxkj.student.databinding.V2MainTabClassifyFragmentBindingImpl.sViewsWithIds = r0
            r1 = 2131299164(0x7f090b5c, float:1.8216322E38)
            r2 = 3
            r0.put(r1, r2)
            r1 = 2131296698(0x7f0901ba, float:1.821132E38)
            r2 = 4
            r0.put(r1, r2)
            r1 = 2131298937(0x7f090a79, float:1.8215861E38)
            r2 = 5
            r0.put(r1, r2)
            r1 = 2131298427(0x7f09087b, float:1.8214827E38)
            r2 = 6
            r0.put(r1, r2)
            r1 = 2131298431(0x7f09087f, float:1.8214835E38)
            r2 = 7
            r0.put(r1, r2)
            return
    }

    public V2MainTabClassifyFragmentBindingImpl(@androidx.annotation.Nullable androidx.databinding.DataBindingComponent r4, @androidx.annotation.NonNull android.view.View r5) {
            r3 = this;
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = com.bxkj.student.databinding.V2MainTabClassifyFragmentBindingImpl.sIncludes
            android.util.SparseIntArray r1 = com.bxkj.student.databinding.V2MainTabClassifyFragmentBindingImpl.sViewsWithIds
            r2 = 8
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.mapBindings(r4, r5, r2, r0, r1)
            r3.<init>(r4, r5, r0)
            return
    }

    private V2MainTabClassifyFragmentBindingImpl(androidx.databinding.DataBindingComponent r14, android.view.View r15, java.lang.Object[] r16) {
            r13 = this;
            r0 = 4
            r0 = r16[r0]
            r5 = r0
            androidx.cardview.widget.CardView r5 = (androidx.cardview.widget.CardView) r5
            r0 = 6
            r0 = r16[r0]
            r6 = r0
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            r0 = 7
            r0 = r16[r0]
            r7 = r0
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            r0 = 2
            r1 = r16[r0]
            r8 = r1
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r12 = 1
            r1 = r16[r12]
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 5
            r1 = r16[r1]
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            r1 = 3
            r1 = r16[r1]
            r11 = r1
            android.widget.TextView r11 = (android.widget.TextView) r11
            r4 = 0
            r1 = r13
            r2 = r14
            r3 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r4 = -1
            r13.mDirtyFlags = r4
            r14 = 0
            r14 = r16[r14]
            androidx.constraintlayout.widget.ConstraintLayout r14 = (androidx.constraintlayout.widget.ConstraintLayout) r14
            r13.mboundView0 = r14
            r2 = 0
            r14.setTag(r2)
            android.widget.ImageView r14 = r13.tvHomeMenuArrow
            r14.setTag(r2)
            android.widget.TextView r14 = r13.tvHomeMenuCount
            r14.setTag(r2)
            r13.setRootTag(r15)
            com.bxkj.student.generated.callback.a r14 = new com.bxkj.student.generated.callback.a
            r14.<init>(r13, r12)
            r13.mCallback76 = r14
            com.bxkj.student.generated.callback.a r14 = new com.bxkj.student.generated.callback.a
            r14.<init>(r13, r0)
            r13.mCallback77 = r14
            r13.invalidateAll()
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
            com.bxkj.student.v2.ui.main.ClassifyFragment r1 = r0.mClassifyFragment
            if (r1 == 0) goto Le
            r1.L()
        Le:
            return
        Lf:
            com.bxkj.student.v2.ui.main.ClassifyFragment r1 = r0.mClassifyFragment
            if (r1 == 0) goto L16
            r1.L()
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
            android.widget.ImageView r0 = r6.tvHomeMenuArrow
            android.view.View$OnClickListener r1 = r6.mCallback77
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r6.tvHomeMenuCount
            android.view.View$OnClickListener r1 = r6.mCallback76
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

    @Override // com.bxkj.student.databinding.V2MainTabClassifyFragmentBinding
    public void setClassifyFragment(@androidx.annotation.Nullable com.bxkj.student.v2.ui.main.ClassifyFragment r5) {
            r4 = this;
            r4.mClassifyFragment = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L13
            r2 = 1
            long r0 = r0 | r2
            r4.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L13
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L13
            r5 = 6
            r4.notifyPropertyChanged(r5)
            super.requestRebind()
            return
        L13:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L13
            throw r5
    }

    public boolean setVariable(int r2, @androidx.annotation.Nullable java.lang.Object r3) {
            r1 = this;
            r0 = 6
            if (r0 != r2) goto La
            com.bxkj.student.v2.ui.main.ClassifyFragment r3 = (com.bxkj.student.v2.ui.main.ClassifyFragment) r3
            r1.setClassifyFragment(r3)
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }
}
