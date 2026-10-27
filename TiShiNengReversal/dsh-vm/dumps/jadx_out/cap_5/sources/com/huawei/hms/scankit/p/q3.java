package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class q3 extends com.huawei.hms.scankit.p.o {
    private static final byte[] d = null;
    private byte[] b;
    private final int[] c;

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            com.huawei.hms.scankit.p.q3.d = r0
            return
    }

    public q3(com.huawei.hms.scankit.p.p4 r1) {
            r0 = this;
            r0.<init>(r1)
            byte[] r1 = com.huawei.hms.scankit.p.q3.d
            r0.b = r1
            r1 = 32
            int[] r1 = new int[r1]
            r0.c = r1
            return
    }

    private static int a(int[] r11, boolean r12) throws com.huawei.hms.scankit.p.a {
            int r0 = r11.length
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L6:
            if (r2 >= r0) goto L14
            r6 = r11[r2]
            if (r6 <= r3) goto Le
            r5 = r2
            r3 = r6
        Le:
            if (r6 <= r4) goto L11
            r4 = r6
        L11:
            int r2 = r2 + 1
            goto L6
        L14:
            r2 = 0
            r3 = 0
            r6 = 0
        L17:
            if (r2 >= r0) goto L28
            int r7 = r2 - r5
            r8 = r11[r2]
            int r8 = r8 * r7
            int r8 = r8 * r7
            if (r8 <= r6) goto L25
            r3 = r2
            r6 = r8
        L25:
            int r2 = r2 + 1
            goto L17
        L28:
            if (r5 <= r3) goto L2b
            goto L2e
        L2b:
            r10 = r5
            r5 = r3
            r3 = r10
        L2e:
            int r2 = r5 - r3
            int r0 = r0 / 16
            if (r2 <= r0) goto L63
            int r0 = r5 + (-1)
            r6 = -1
            r6 = r0
            r7 = -1
        L39:
            if (r0 <= r3) goto L50
            int r8 = r0 - r3
            int r8 = r8 * r8
            int r9 = r5 - r0
            int r8 = r8 * r9
            r9 = r11[r0]
            int r9 = r4 - r9
            int r8 = r8 * r9
            if (r8 <= r7) goto L4d
            r6 = r0
            r7 = r8
        L4d:
            int r0 = r0 + (-1)
            goto L39
        L50:
            if (r12 == 0) goto L60
            r11 = 10
            if (r6 >= r11) goto L5e
            r12 = 100000(0x186a0, float:1.4013E-40)
            if (r7 >= r12) goto L5e
            if (r2 >= r11) goto L5e
            r1 = 1
        L5e:
            com.huawei.hms.scankit.p.r3.t = r1
        L60:
            int r11 = r6 << 3
            return r11
        L63:
            com.huawei.hms.scankit.p.a r11 = com.huawei.hms.scankit.p.a.a()
            throw r11
    }

    private void a(int r3) {
            r2 = this;
            byte[] r0 = r2.b
            int r0 = r0.length
            if (r0 >= r3) goto L9
            byte[] r3 = new byte[r3]
            r2.b = r3
        L9:
            r3 = 0
            r0 = 0
        Lb:
            r1 = 32
            if (r0 >= r1) goto L16
            int[] r1 = r2.c
            r1[r0] = r3
            int r0 = r0 + 1
            goto Lb
        L16:
            return
    }

    @Override // com.huawei.hms.scankit.p.o
    public com.huawei.hms.scankit.p.o a(com.huawei.hms.scankit.p.p4 r2) {
            r1 = this;
            com.huawei.hms.scankit.p.q3 r0 = new com.huawei.hms.scankit.p.q3
            r0.<init>(r2)
            return r0
    }

    @Override // com.huawei.hms.scankit.p.o
    public com.huawei.hms.scankit.p.r a(int r10, com.huawei.hms.scankit.p.r r11) throws com.huawei.hms.scankit.p.a {
            r9 = this;
            com.huawei.hms.scankit.p.p4 r0 = r9.c()
            int r1 = r0.c()
            if (r11 == 0) goto L15
            int r2 = r11.e()
            if (r2 >= r1) goto L11
            goto L15
        L11:
            r11.a()
            goto L1a
        L15:
            com.huawei.hms.scankit.p.r r11 = new com.huawei.hms.scankit.p.r
            r11.<init>(r1)
        L1a:
            r9.a(r1)
            byte[] r2 = r9.b
            byte[] r10 = r0.a(r10, r2)
            int[] r0 = r9.c
            r2 = 0
            r3 = 0
        L27:
            r4 = 3
            r5 = 1
            if (r3 >= r1) goto L39
            r6 = r10[r3]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r4 = r6 >> 3
            r6 = r0[r4]
            int r6 = r6 + r5
            r0[r4] = r6
            int r3 = r3 + 1
            goto L27
        L39:
            int r0 = a(r0, r2)
            if (r1 >= r4) goto L4d
        L3f:
            if (r2 >= r1) goto L72
            r3 = r10[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            if (r3 >= r0) goto L4a
            r11.g(r2)
        L4a:
            int r2 = r2 + 1
            goto L3f
        L4d:
            r2 = r10[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = r10[r5]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = r3
            r3 = r2
            r2 = r4
            r4 = 1
        L59:
            int r6 = r1 + (-1)
            if (r4 >= r6) goto L72
            int r6 = r4 + 1
            r7 = r10[r6]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r2 * 4
            int r8 = r8 - r3
            int r8 = r8 - r7
            int r8 = r8 / 2
            if (r8 >= r0) goto L6e
            r11.g(r4)
        L6e:
            r3 = r2
            r4 = r6
            r2 = r7
            goto L59
        L72:
            return r11
    }

    @Override // com.huawei.hms.scankit.p.o
    public com.huawei.hms.scankit.p.s a() throws com.huawei.hms.scankit.p.a {
            r14 = this;
            com.huawei.hms.scankit.p.p4 r0 = r14.c()
            int r1 = r0.c()
            int r2 = r0.a()
            r14.a(r1)
            int[] r3 = r14.c
            r4 = 1
            r5 = 1
        L13:
            r6 = 5
            if (r5 >= r6) goto L37
            int r7 = r2 * r5
            int r7 = r7 / r6
            byte[] r8 = r14.b
            byte[] r7 = r0.a(r7, r8)
            int r8 = r1 * 4
            int r8 = r8 / r6
            int r6 = r1 / 5
        L24:
            if (r6 >= r8) goto L34
            r9 = r7[r6]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 >> 3
            r10 = r3[r9]
            int r10 = r10 + r4
            r3[r9] = r10
            int r6 = r6 + 1
            goto L24
        L34:
            int r5 = r5 + 1
            goto L13
        L37:
            int r3 = a(r3, r4)
            byte[] r0 = r0.b()
            int r5 = r1 + 31
            int r5 = r5 / 32
            int r6 = r5 * r2
            int[] r6 = new int[r6]
            r7 = 0
            r8 = 0
        L49:
            if (r8 >= r2) goto L6c
            int r9 = r8 * r1
            r10 = 0
        L4e:
            if (r10 >= r1) goto L69
            int r11 = r9 + r10
            r11 = r0[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            if (r11 >= r3) goto L66
            int r11 = r8 * r5
            int r12 = r10 >> 5
            int r11 = r11 + r12
            r12 = r6[r11]
            r13 = r10 & 31
            int r13 = r4 << r13
            r12 = r12 | r13
            r6[r11] = r12
        L66:
            int r10 = r10 + 1
            goto L4e
        L69:
            int r8 = r8 + 1
            goto L49
        L6c:
            com.huawei.hms.scankit.p.s r0 = new com.huawei.hms.scankit.p.s
            r0.<init>(r1, r2, r5, r6)
            return r0
    }
}
