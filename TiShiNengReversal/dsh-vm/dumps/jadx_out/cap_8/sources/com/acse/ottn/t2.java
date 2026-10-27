package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class t2 extends android.widget.ScrollView {
    public com.acse.ottn.t2.a a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(int r1);
    }

    public t2(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public t2(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public t2(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // android.widget.ScrollView, android.view.View
    public void computeScroll() {
            r2 = this;
            super.computeScroll()
            com.acse.ottn.t2$a r0 = r2.a
            if (r0 == 0) goto Le
            int r1 = r2.getScrollY()
            r0.a(r1)
        Le:
            return
    }

    public void setOnScrollListener(com.acse.ottn.t2.a r1) {
            r0 = this;
            r0.a = r1
            return
    }
}
