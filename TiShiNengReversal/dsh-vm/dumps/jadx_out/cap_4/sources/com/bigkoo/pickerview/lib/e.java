package com.bigkoo.pickerview.lib;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class e extends java.util.TimerTask {
    int a;
    int b;
    int c;
    final com.bigkoo.pickerview.lib.WheelView d;

    e(com.bigkoo.pickerview.lib.WheelView r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.d = r1
            r0.c = r2
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.a = r1
            r1 = 0
            r0.b = r1
            return
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
            r6 = this;
            int r0 = r6.a
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto Lb
            int r0 = r6.c
            r6.a = r0
        Lb:
            int r0 = r6.a
            float r1 = (float) r0
            r2 = 1036831949(0x3dcccccd, float:0.1)
            float r1 = r1 * r2
            int r1 = (int) r1
            r6.b = r1
            r2 = 1
            if (r1 != 0) goto L21
            if (r0 >= 0) goto L1f
            r1 = -1
            r6.b = r1
            goto L21
        L1f:
            r6.b = r2
        L21:
            int r0 = java.lang.Math.abs(r0)
            r1 = 3000(0xbb8, float:4.204E-42)
            if (r0 > r2) goto L36
            com.bigkoo.pickerview.lib.WheelView r0 = r6.d
            r0.a()
            com.bigkoo.pickerview.lib.WheelView r0 = r6.d
            android.os.Handler r0 = r0.c
            r0.sendEmptyMessage(r1)
            return
        L36:
            com.bigkoo.pickerview.lib.WheelView r0 = r6.d
            int r3 = r0.A
            int r4 = r6.b
            int r3 = r3 + r4
            r0.A = r3
            boolean r3 = r0.f283w
            if (r3 != 0) goto L74
            float r3 = r0.f277q
            int r4 = r0.B
            int r4 = -r4
            float r4 = (float) r4
            float r4 = r4 * r3
            int r0 = r0.getItemsCount()
            int r0 = r0 - r2
            com.bigkoo.pickerview.lib.WheelView r2 = r6.d
            int r5 = r2.B
            int r0 = r0 - r5
            float r0 = (float) r0
            float r0 = r0 * r3
            int r3 = r2.A
            float r5 = (float) r3
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 <= 0) goto L64
            float r4 = (float) r3
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L74
        L64:
            int r0 = r6.b
            int r3 = r3 - r0
            r2.A = r3
            r2.a()
            com.bigkoo.pickerview.lib.WheelView r0 = r6.d
            android.os.Handler r0 = r0.c
            r0.sendEmptyMessage(r1)
            return
        L74:
            com.bigkoo.pickerview.lib.WheelView r0 = r6.d
            android.os.Handler r0 = r0.c
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.sendEmptyMessage(r1)
            int r0 = r6.a
            int r1 = r6.b
            int r0 = r0 - r1
            r6.a = r0
            return
    }
}
