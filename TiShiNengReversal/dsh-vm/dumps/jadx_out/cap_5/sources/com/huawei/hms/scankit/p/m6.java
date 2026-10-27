package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class m6 extends com.huawei.hms.scankit.p.p4 {
    private final byte[] c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public m6(int r5, int r6, java.nio.ByteBuffer r7) {
            r4 = this;
            r4.<init>(r5, r6)
            r4.d = r5
            r4.e = r6
            r0 = 0
            r4.f = r0
            r4.g = r0
            byte[] r7 = r7.array()
            int r5 = r5 * r6
            byte[] r6 = new byte[r5]
            r4.c = r6
        L16:
            if (r0 >= r5) goto L4c
            int r6 = r0 * 4
            int r1 = r6 + 3
            r1 = r7[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            if (r1 != 0) goto L28
            byte[] r6 = r4.c
            r1 = -1
            r6[r0] = r1
            goto L49
        L28:
            r1 = r7[r6]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r6 + 1
            r2 = r7[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r6 = r6 + 2
            r6 = r7[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte[] r3 = r4.c
            int r1 = r1 * 306
            int r2 = r2 * 601
            int r1 = r1 + r2
            int r6 = r6 * 117
            int r1 = r1 + r6
            int r1 = r1 + 512
            int r6 = r1 >> 10
            byte r6 = (byte) r6
            r3[r0] = r6
        L49:
            int r0 = r0 + 1
            goto L16
        L4c:
            return
    }

    private m6(byte[] r1, int r2, int r3, int r4, int r5, int r6, int r7) {
            r0 = this;
            r0.<init>(r6, r7)
            int r6 = r6 + r4
            if (r6 > r2) goto L14
            int r7 = r7 + r5
            if (r7 > r3) goto L14
            r0.c = r1
            r0.d = r2
            r0.e = r3
            r0.f = r4
            r0.g = r5
            return
        L14:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Crop rectangle does not fit within image data."
            r1.<init>(r2)
            throw r1
    }

    @Override // com.huawei.hms.scankit.p.p4
    public com.huawei.hms.scankit.p.p4 a(int r9, int r10, int r11, int r12) {
            r8 = this;
            com.huawei.hms.scankit.p.m6 r0 = new com.huawei.hms.scankit.p.m6
            byte[] r1 = r8.c
            int r2 = r8.d
            int r3 = r8.e
            int r4 = r8.f
            int r4 = r4 + r9
            int r9 = r8.g
            int r5 = r9 + r10
            r6 = r11
            r7 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @Override // com.huawei.hms.scankit.p.p4
    public byte[] a(int r4, byte[] r5) {
            r3 = this;
            if (r4 < 0) goto L24
            int r0 = r3.a()
            if (r4 >= r0) goto L24
            int r0 = r3.c()
            if (r5 == 0) goto L11
            int r1 = r5.length
            if (r1 >= r0) goto L13
        L11:
            byte[] r5 = new byte[r0]
        L13:
            int r1 = r3.g
            int r4 = r4 + r1
            int r1 = r3.d
            int r4 = r4 * r1
            int r1 = r3.f
            int r4 = r4 + r1
            byte[] r1 = r3.c
            r2 = 0
            java.lang.System.arraycopy(r1, r4, r5, r2, r0)
            return r5
        L24:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Requested row is outside the image: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
    }

    @Override // com.huawei.hms.scankit.p.p4
    public byte[] b() {
            r7 = this;
            int r0 = r7.c()
            int r1 = r7.a()
            int r2 = r7.d
            if (r0 != r2) goto L13
            int r3 = r7.e
            if (r1 != r3) goto L13
            byte[] r0 = r7.c
            return r0
        L13:
            int r3 = r0 * r1
            byte[] r4 = new byte[r3]
            int r5 = r7.g
            int r5 = r5 * r2
            int r6 = r7.f
            int r5 = r5 + r6
            r6 = 0
            if (r0 != r2) goto L27
            byte[] r0 = r7.c
            java.lang.System.arraycopy(r0, r5, r4, r6, r3)
            return r4
        L27:
            if (r6 >= r1) goto L36
            int r2 = r6 * r0
            byte[] r3 = r7.c
            java.lang.System.arraycopy(r3, r5, r4, r2, r0)
            int r2 = r7.d
            int r5 = r5 + r2
            int r6 = r6 + 1
            goto L27
        L36:
            return r4
    }
}
