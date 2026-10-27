package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class V2ItemForClassifyMenuBindingImpl extends com.bxkj.student.databinding.V2ItemForClassifyMenuBinding {

    @androidx.annotation.Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;

    @androidx.annotation.Nullable
    private static final android.util.SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    @androidx.annotation.NonNull
    private final android.widget.FrameLayout mboundView0;

    static {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            com.bxkj.student.databinding.V2ItemForClassifyMenuBindingImpl.sViewsWithIds = r0
            r1 = 2131297201(0x7f0903b1, float:1.821234E38)
            r2 = 3
            r0.put(r1, r2)
            return
    }

    public V2ItemForClassifyMenuBindingImpl(@androidx.annotation.Nullable androidx.databinding.DataBindingComponent r4, @androidx.annotation.NonNull android.view.View r5) {
            r3 = this;
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = com.bxkj.student.databinding.V2ItemForClassifyMenuBindingImpl.sIncludes
            android.util.SparseIntArray r1 = com.bxkj.student.databinding.V2ItemForClassifyMenuBindingImpl.sViewsWithIds
            r2 = 4
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.mapBindings(r4, r5, r2, r0, r1)
            r3.<init>(r4, r5, r0)
            return
    }

    private V2ItemForClassifyMenuBindingImpl(androidx.databinding.DataBindingComponent r9, android.view.View r10, java.lang.Object[] r11) {
            r8 = this;
            r0 = 1
            r0 = r11[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 3
            r0 = r11[r0]
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = 2
            r0 = r11[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r4 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r9 = -1
            r1.mDirtyFlags = r9
            android.widget.ImageView r9 = r1.ivIcon
            r10 = 0
            r9.setTag(r10)
            r9 = 0
            r9 = r11[r9]
            android.widget.FrameLayout r9 = (android.widget.FrameLayout) r9
            r1.mboundView0 = r9
            r9.setTag(r10)
            android.widget.TextView r9 = r1.tvName
            r9.setTag(r10)
            r8.setRootTag(r3)
            r8.invalidateAll()
            return
    }

    protected void executeBindings() {
            r8 = this;
            monitor-enter(r8)
            long r0 = r8.mDirtyFlags     // Catch: java.lang.Throwable -> L4e
            r2 = 0
            r8.mDirtyFlags = r2     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4e
            java.util.Map<java.lang.String, java.lang.Object> r4 = r8.mMap
            r5 = 6
            long r0 = r0 & r5
            r5 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L26
            if (r4 == 0) goto L1a
            java.lang.String r0 = "name"
            java.lang.Object r5 = r4.get(r0)
        L1a:
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "icon"
            java.lang.String r0 = r0.t(r4, r1)
            r7 = r5
            r5 = r0
            r0 = r7
            goto L27
        L26:
            r0 = r5
        L27:
            if (r6 == 0) goto L4d
            android.widget.ImageView r1 = r8.ivIcon
            android.content.Context r2 = r1.getContext()
            r3 = 2131231942(0x7f0804c6, float:1.807998E38)
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r2, r3)
            android.widget.ImageView r3 = r8.ivIcon
            android.content.Context r3 = r3.getContext()
            r4 = 2131231941(0x7f0804c5, float:1.8079977E38)
            android.graphics.drawable.Drawable r3 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r3, r4)
            com.bxkj.base.v2.base.o.g(r1, r5, r2, r3)
            android.widget.TextView r1 = r8.tvName
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r1, r0)
        L4d:
            return
        L4e:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4e
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

    @Override // com.bxkj.student.databinding.V2ItemForClassifyMenuBinding
    public void setLoggedInUser(@androidx.annotation.Nullable com.bxkj.base.v2.data.b r1) {
            r0 = this;
            r0.mLoggedInUser = r1
            return
    }

    @Override // com.bxkj.student.databinding.V2ItemForClassifyMenuBinding
    public void setMap(@androidx.annotation.Nullable java.util.Map<java.lang.String, java.lang.Object> r5) {
            r4 = this;
            r4.mMap = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L14
            r2 = 2
            long r0 = r0 | r2
            r4.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            r5 = 20
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
            r0 = 14
            r1 = 1
            if (r0 != r3) goto Lb
            com.bxkj.base.v2.data.b r4 = (com.bxkj.base.v2.data.b) r4
            r2.setLoggedInUser(r4)
            return r1
        Lb:
            r0 = 20
            if (r0 != r3) goto L15
            java.util.Map r4 = (java.util.Map) r4
            r2.setMap(r4)
            return r1
        L15:
            r3 = 0
            return r3
    }
}
