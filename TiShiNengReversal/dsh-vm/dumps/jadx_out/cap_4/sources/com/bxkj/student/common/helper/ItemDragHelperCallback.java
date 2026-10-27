package com.bxkj.student.common.helper;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ItemDragHelperCallback extends androidx.recyclerview.widget.ItemTouchHelper.Callback {
    public ItemDragHelperCallback() {
            r0 = this;
            r0.<init>()
            return
    }

    public void clearView(androidx.recyclerview.widget.RecyclerView r2, androidx.recyclerview.widget.RecyclerView.ViewHolder r3) {
            r1 = this;
            boolean r0 = r3 instanceof e0.a
            if (r0 == 0) goto La
            r0 = r3
            e0.a r0 = (e0.a) r0
            r0.a()
        La:
            super.clearView(r2, r3)
            return
    }

    public int getMovementFlags(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r1.getLayoutManager()
            boolean r2 = r1 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r2 != 0) goto Lf
            boolean r1 = r1 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 3
            goto L11
        Lf:
            r1 = 15
        L11:
            r2 = 0
            int r1 = androidx.recyclerview.widget.ItemTouchHelper.Callback.makeMovementFlags(r1, r2)
            return r1
    }

    public boolean isItemViewSwipeEnabled() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isLongPressDragEnabled() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean onMove(androidx.recyclerview.widget.RecyclerView r3, androidx.recyclerview.widget.RecyclerView.ViewHolder r4, androidx.recyclerview.widget.RecyclerView.ViewHolder r5) {
            r2 = this;
            int r0 = r4.getItemViewType()
            int r1 = r5.getItemViewType()
            if (r0 == r1) goto Lc
            r3 = 0
            return r3
        Lc:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r3.getAdapter()
            boolean r0 = r0 instanceof e0.b
            if (r0 == 0) goto L25
            androidx.recyclerview.widget.RecyclerView$Adapter r3 = r3.getAdapter()
            e0.b r3 = (e0.b) r3
            int r4 = r4.getAdapterPosition()
            int r5 = r5.getAdapterPosition()
            r3.a(r4, r5)
        L25:
            r3 = 1
            return r3
    }

    public void onSelectedChanged(androidx.recyclerview.widget.RecyclerView.ViewHolder r2, int r3) {
            r1 = this;
            if (r3 == 0) goto Lc
            boolean r0 = r2 instanceof e0.a
            if (r0 == 0) goto Lc
            r0 = r2
            e0.a r0 = (e0.a) r0
            r0.b()
        Lc:
            super.onSelectedChanged(r2, r3)
            return
    }

    public void onSwiped(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
            r0 = this;
            return
    }
}
