package com.bigkoo.pickerview.lib;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class c extends android.os.Handler {
    public static final int b = 1000;
    public static final int c = 2000;
    public static final int d = 3000;
    final com.bigkoo.pickerview.lib.WheelView a;

    c(com.bigkoo.pickerview.lib.WheelView r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message r2) {
            r1 = this;
            int r2 = r2.what
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r2 == r0) goto L1d
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r2 == r0) goto L15
            r0 = 3000(0xbb8, float:4.204E-42)
            if (r2 == r0) goto Lf
            return
        Lf:
            com.bigkoo.pickerview.lib.WheelView r2 = r1.a
            r2.k()
            return
        L15:
            com.bigkoo.pickerview.lib.WheelView r2 = r1.a
            com.bigkoo.pickerview.lib.WheelView$ACTION r0 = com.bigkoo.pickerview.lib.WheelView.ACTION.FLING
            r2.o(r0)
            return
        L1d:
            com.bigkoo.pickerview.lib.WheelView r2 = r1.a
            r2.invalidate()
            return
    }
}
