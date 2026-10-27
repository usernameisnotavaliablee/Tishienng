package com.bigkoo.pickerview.lib;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class d implements java.lang.Runnable {
    final com.bigkoo.pickerview.lib.WheelView a;

    d(com.bigkoo.pickerview.lib.WheelView r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.bigkoo.pickerview.lib.WheelView r0 = r2.a
            o.c r1 = r0.e
            int r0 = r0.getCurrentItem()
            r1.a(r0)
            return
    }
}
