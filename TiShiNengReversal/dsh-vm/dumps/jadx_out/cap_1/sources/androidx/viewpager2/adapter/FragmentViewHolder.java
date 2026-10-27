package androidx.viewpager2.adapter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FragmentViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private FragmentViewHolder(@androidx.annotation.NonNull android.widget.FrameLayout r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @androidx.annotation.NonNull
    static androidx.viewpager2.adapter.FragmentViewHolder create(@androidx.annotation.NonNull android.view.ViewGroup r2) {
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            android.content.Context r2 = r2.getContext()
            r0.<init>(r2)
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r2.<init>(r1, r1)
            r0.setLayoutParams(r2)
            int r2 = androidx.core.view.ViewCompat.generateViewId()
            r0.setId(r2)
            r2 = 0
            r0.setSaveEnabled(r2)
            androidx.viewpager2.adapter.FragmentViewHolder r2 = new androidx.viewpager2.adapter.FragmentViewHolder
            r2.<init>(r0)
            return r2
    }

    @androidx.annotation.NonNull
    android.widget.FrameLayout getContainer() {
            r1 = this;
            android.view.View r0 = r1.itemView
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            return r0
    }
}
