package com.yalantis.ucrop.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class i extends android.graphics.drawable.StateListDrawable {
    private int a;

    public i(android.graphics.drawable.Drawable r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            r2 = 16842913(0x10100a1, float:2.369401E-38)
            int[] r2 = new int[]{r2}
            r0.addState(r2, r1)
            r2 = 0
            int[] r2 = new int[r2]
            r0.addState(r2, r1)
            return
    }

    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r6) {
            r5 = this;
            int r0 = r6.length
            r1 = 0
            r2 = 0
        L3:
            if (r1 >= r0) goto L10
            r3 = r6[r1]
            r4 = 16842913(0x10100a1, float:2.369401E-38)
            if (r3 != r4) goto Ld
            r2 = 1
        Ld:
            int r1 = r1 + 1
            goto L3
        L10:
            if (r2 == 0) goto L1a
            int r0 = r5.a
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            super.setColorFilter(r0, r1)
            goto L1d
        L1a:
            super.clearColorFilter()
        L1d:
            boolean r6 = super.onStateChange(r6)
            return r6
    }
}
