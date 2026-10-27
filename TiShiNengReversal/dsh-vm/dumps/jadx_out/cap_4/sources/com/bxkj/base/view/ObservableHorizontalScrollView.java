package com.bxkj.base.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ObservableHorizontalScrollView extends android.widget.HorizontalScrollView {
    private com.bxkj.base.view.ObservableHorizontalScrollView.a a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(com.bxkj.base.view.ObservableHorizontalScrollView r1, int r2, int r3, int r4, int r5);
    }

    public ObservableHorizontalScrollView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.a = r1
            return
    }

    public ObservableHorizontalScrollView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.a = r1
            return
    }

    public ObservableHorizontalScrollView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.a = r1
            return
    }

    @Override // android.view.View
    protected void onScrollChanged(int r7, int r8, int r9, int r10) {
            r6 = this;
            super.onScrollChanged(r7, r8, r9, r10)
            com.bxkj.base.view.ObservableHorizontalScrollView$a r0 = r6.a
            if (r0 == 0) goto Lf
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.a(r1, r2, r3, r4, r5)
        Lf:
            return
    }

    public void setScrollViewListener(com.bxkj.base.view.ObservableHorizontalScrollView.a r1) {
            r0 = this;
            r0.a = r1
            return
    }
}
