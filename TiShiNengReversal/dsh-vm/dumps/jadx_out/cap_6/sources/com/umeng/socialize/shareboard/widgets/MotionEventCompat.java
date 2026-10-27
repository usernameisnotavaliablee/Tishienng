package com.umeng.socialize.shareboard.widgets;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class MotionEventCompat {
    static final int ACTION_MASK = 255;
    static final int ACTION_POINTER_DOWN = 5;
    static final int ACTION_POINTER_INDEX_MASK = 65280;
    static final int ACTION_POINTER_INDEX_SHIFT = 8;
    static final int ACTION_POINTER_UP = 6;

    MotionEventCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    static int getActionIndex(android.view.MotionEvent r1) {
            int r1 = r1.getAction()
            r0 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r0
            int r1 = r1 >> 8
            return r1
    }
}
