package androidx.recyclerview.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class SortedListAdapterCallback<T2> extends androidx.recyclerview.widget.SortedList.Callback<T2> {
    final androidx.recyclerview.widget.RecyclerView.Adapter<?> mAdapter;

    public SortedListAdapterCallback(@android.annotation.SuppressLint({"UnknownNullness", "MissingNullability"}) androidx.recyclerview.widget.RecyclerView.Adapter<?> r1) {
            r0 = this;
            r0.<init>()
            r0.mAdapter = r1
            return
    }

    @Override // androidx.recyclerview.widget.SortedList.Callback
    public void onChanged(int r2, int r3) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter<?> r0 = r1.mAdapter
            r0.notifyItemRangeChanged(r2, r3)
            return
    }

    @Override // androidx.recyclerview.widget.SortedList.Callback, androidx.recyclerview.widget.ListUpdateCallback
    @android.annotation.SuppressLint({"UnknownNullness"})
    public void onChanged(int r2, int r3, java.lang.Object r4) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter<?> r0 = r1.mAdapter
            r0.notifyItemRangeChanged(r2, r3, r4)
            return
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int r2, int r3) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter<?> r0 = r1.mAdapter
            r0.notifyItemRangeInserted(r2, r3)
            return
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int r2, int r3) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter<?> r0 = r1.mAdapter
            r0.notifyItemMoved(r2, r3)
            return
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int r2, int r3) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter<?> r0 = r1.mAdapter
            r0.notifyItemRangeRemoved(r2, r3)
            return
    }
}
