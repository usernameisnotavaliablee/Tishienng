package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class ListAdapter<T, VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.recyclerview.widget.RecyclerView.Adapter<VH> {
    final androidx.recyclerview.widget.AsyncListDiffer<T> mDiffer;
    private final androidx.recyclerview.widget.AsyncListDiffer.ListListener<T> mListener;


    protected ListAdapter(@androidx.annotation.NonNull androidx.recyclerview.widget.AsyncDifferConfig<T> r4) {
            r3 = this;
            r3.<init>()
            androidx.recyclerview.widget.ListAdapter$1 r0 = new androidx.recyclerview.widget.ListAdapter$1
            r0.<init>(r3)
            r3.mListener = r0
            androidx.recyclerview.widget.AsyncListDiffer r1 = new androidx.recyclerview.widget.AsyncListDiffer
            androidx.recyclerview.widget.AdapterListUpdateCallback r2 = new androidx.recyclerview.widget.AdapterListUpdateCallback
            r2.<init>(r3)
            r1.<init>(r2, r4)
            r3.mDiffer = r1
            r1.addListListener(r0)
            return
    }

    protected ListAdapter(@androidx.annotation.NonNull androidx.recyclerview.widget.DiffUtil.ItemCallback<T> r5) {
            r4 = this;
            r4.<init>()
            androidx.recyclerview.widget.ListAdapter$1 r0 = new androidx.recyclerview.widget.ListAdapter$1
            r0.<init>(r4)
            r4.mListener = r0
            androidx.recyclerview.widget.AsyncListDiffer r1 = new androidx.recyclerview.widget.AsyncListDiffer
            androidx.recyclerview.widget.AdapterListUpdateCallback r2 = new androidx.recyclerview.widget.AdapterListUpdateCallback
            r2.<init>(r4)
            androidx.recyclerview.widget.AsyncDifferConfig$Builder r3 = new androidx.recyclerview.widget.AsyncDifferConfig$Builder
            r3.<init>(r5)
            androidx.recyclerview.widget.AsyncDifferConfig r5 = r3.build()
            r1.<init>(r2, r5)
            r4.mDiffer = r1
            r1.addListListener(r0)
            return
    }

    @androidx.annotation.NonNull
    public java.util.List<T> getCurrentList() {
            r1 = this;
            androidx.recyclerview.widget.AsyncListDiffer<T> r0 = r1.mDiffer
            java.util.List r0 = r0.getCurrentList()
            return r0
    }

    protected T getItem(int r2) {
            r1 = this;
            androidx.recyclerview.widget.AsyncListDiffer<T> r0 = r1.mDiffer
            java.util.List r0 = r0.getCurrentList()
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            androidx.recyclerview.widget.AsyncListDiffer<T> r0 = r1.mDiffer
            java.util.List r0 = r0.getCurrentList()
            int r0 = r0.size()
            return r0
    }

    public void onCurrentListChanged(@androidx.annotation.NonNull java.util.List<T> r1, @androidx.annotation.NonNull java.util.List<T> r2) {
            r0 = this;
            return
    }

    public void submitList(@androidx.annotation.Nullable java.util.List<T> r2) {
            r1 = this;
            androidx.recyclerview.widget.AsyncListDiffer<T> r0 = r1.mDiffer
            r0.submitList(r2)
            return
    }

    public void submitList(@androidx.annotation.Nullable java.util.List<T> r2, @androidx.annotation.Nullable java.lang.Runnable r3) {
            r1 = this;
            androidx.recyclerview.widget.AsyncListDiffer<T> r0 = r1.mDiffer
            r0.submitList(r2, r3)
            return
    }
}
