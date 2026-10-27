package com.zhy.view.flowlayout;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class TagView extends android.widget.FrameLayout implements android.widget.Checkable {
    private static final int[] b = null;
    private boolean a;

    static {
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            com.zhy.view.flowlayout.TagView.b = r0
            return
    }

    public TagView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public android.view.View getTagView() {
            r1 = this;
            r0 = 0
            android.view.View r0 = r1.getChildAt(r0)
            return r0
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
            r1 = this;
            boolean r0 = r1.a
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int r2) {
            r1 = this;
            int r2 = r2 + 1
            int[] r2 = super.onCreateDrawableState(r2)
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto L11
            int[] r0 = com.zhy.view.flowlayout.TagView.b
            android.view.View.mergeDrawableStates(r2, r0)
        L11:
            return r2
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean r2) {
            r1 = this;
            boolean r0 = r1.a
            if (r0 == r2) goto L9
            r1.a = r2
            r1.refreshDrawableState()
        L9:
            return
    }

    @Override // android.widget.Checkable
    public void toggle() {
            r1 = this;
            boolean r0 = r1.a
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
    }
}
