package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class w<T> extends com.acse.ottn.u<T, com.acse.ottn.x> {
    public w(java.util.List<T> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.acse.ottn.t1
    public /* bridge */ /* synthetic */ java.lang.Object a(android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.acse.ottn.x r1 = r0.b(r1, r2)
            return r1
    }

    public com.acse.ottn.x b(android.view.ViewGroup r2, int r3) {
            r1 = this;
            android.widget.ImageView r3 = new android.widget.ImageView
            android.content.Context r2 = r2.getContext()
            r3.<init>(r2)
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r0 = -1
            r2.<init>(r0, r0)
            r3.setLayoutParams(r2)
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.CENTER_CROP
            r3.setScaleType(r2)
            com.acse.ottn.x r2 = new com.acse.ottn.x
            r2.<init>(r3)
            return r2
    }
}
