package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class n2 extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    public int a;

    public n2(@androidx.annotation.Px int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final androidx.recyclerview.widget.LinearLayoutManager a(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r2.getLayoutManager()
            boolean r0 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto Lb
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
            return r2
        Lb:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "The layoutManager must be LinearLayoutManager"
            r2.<init>(r0)
            throw r2
    }

    public void getItemOffsets(@androidx.annotation.NonNull android.graphics.Rect r1, @androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r3, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r4) {
            r0 = this;
            androidx.recyclerview.widget.LinearLayoutManager r2 = r0.a(r3)
            int r2 = r2.getOrientation()
            r3 = 1
            if (r2 != r3) goto L12
            int r2 = r0.a
            r1.top = r2
            r1.bottom = r2
            return
        L12:
            int r2 = r0.a
            r1.left = r2
            r1.right = r2
            return
    }
}
