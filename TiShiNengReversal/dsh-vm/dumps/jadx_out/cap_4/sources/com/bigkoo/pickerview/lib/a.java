package com.bigkoo.pickerview.lib;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class a extends java.util.TimerTask {
    float a;
    final float b;
    final com.bigkoo.pickerview.lib.WheelView c;

    a(com.bigkoo.pickerview.lib.WheelView r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            r0.b = r2
            r1 = 1325400064(0x4f000000, float:2.1474836E9)
            r0.a = r1
            return
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
            r14 = this;
            float r0 = r14.a
            r1 = 1325400064(0x4f000000, float:2.1474836E9)
            r2 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L27
            float r0 = r14.b
            float r0 = java.lang.Math.abs(r0)
            r1 = 1157234688(0x44fa0000, float:2000.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L23
            float r0 = r14.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1e
            r14.a = r1
            goto L27
        L1e:
            r0 = -990248960(0xffffffffc4fa0000, float:-2000.0)
            r14.a = r0
            goto L27
        L23:
            float r0 = r14.b
            r14.a = r0
        L27:
            float r0 = r14.a
            float r0 = java.lang.Math.abs(r0)
            r1 = 1101004800(0x41a00000, float:20.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L4c
            float r0 = r14.a
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L4c
            com.bigkoo.pickerview.lib.WheelView r0 = r14.c
            r0.a()
            com.bigkoo.pickerview.lib.WheelView r0 = r14.c
            android.os.Handler r0 = r0.c
            r1 = 2000(0x7d0, float:2.803E-42)
            r0.sendEmptyMessage(r1)
            return
        L4c:
            float r0 = r14.a
            r3 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 * r3
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 / r3
            int r0 = (int) r0
            com.bigkoo.pickerview.lib.WheelView r3 = r14.c
            int r4 = r3.A
            int r4 = r4 - r0
            r3.A = r4
            boolean r4 = r3.f283w
            if (r4 != 0) goto Lad
            float r4 = r3.f277q
            int r5 = r3.B
            int r5 = -r5
            float r5 = (float) r5
            float r5 = r5 * r4
            int r3 = r3.getItemsCount()
            int r3 = r3 + (-1)
            com.bigkoo.pickerview.lib.WheelView r6 = r14.c
            int r7 = r6.B
            int r3 = r3 - r7
            float r3 = (float) r3
            float r3 = r3 * r4
            int r7 = r6.A
            double r8 = (double) r7
            double r10 = (double) r4
            r12 = 4599075939470750515(0x3fd3333333333333, double:0.3)
            double r10 = r10 * r12
            double r8 = r8 - r10
            double r12 = (double) r5
            int r4 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r4 >= 0) goto L8b
            int r0 = r0 + r7
            float r5 = (float) r0
            goto L94
        L8b:
            double r8 = (double) r7
            double r8 = r8 + r10
            double r10 = (double) r3
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 <= 0) goto L94
            int r0 = r0 + r7
            float r3 = (float) r0
        L94:
            float r0 = (float) r7
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 > 0) goto La1
            r0 = 1109393408(0x42200000, float:40.0)
            r14.a = r0
            int r0 = (int) r5
            r6.A = r0
            goto Lad
        La1:
            float r0 = (float) r7
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto Lad
            int r0 = (int) r3
            r6.A = r0
            r0 = -1038090240(0xffffffffc2200000, float:-40.0)
            r14.a = r0
        Lad:
            float r0 = r14.a
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto Lb7
            float r0 = r0 + r1
            r14.a = r0
            goto Lba
        Lb7:
            float r0 = r0 - r1
            r14.a = r0
        Lba:
            com.bigkoo.pickerview.lib.WheelView r0 = r14.c
            android.os.Handler r0 = r0.c
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.sendEmptyMessage(r1)
            return
    }
}
