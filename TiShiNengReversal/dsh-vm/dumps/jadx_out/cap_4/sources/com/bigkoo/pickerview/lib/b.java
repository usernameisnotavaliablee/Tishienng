package com.bigkoo.pickerview.lib;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class b extends android.view.GestureDetector.SimpleOnGestureListener {
    final com.bigkoo.pickerview.lib.WheelView a;

    b(com.bigkoo.pickerview.lib.WheelView r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(android.view.MotionEvent r1, android.view.MotionEvent r2, float r3, float r4) {
            r0 = this;
            com.bigkoo.pickerview.lib.WheelView r1 = r0.a
            r1.n(r4)
            r1 = 1
            return r1
    }
}
