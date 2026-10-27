package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class e2 {
    private static final int[] g = null;
    private static final int[] h = null;
    private final com.huawei.hms.scankit.p.s a;
    private com.huawei.hms.scankit.p.v6 b;
    private com.huawei.hms.scankit.p.g3 c;
    private com.huawei.hms.scankit.p.g3 d;
    private com.huawei.hms.scankit.p.g3 e;
    private com.huawei.hms.scankit.p.g3 f;

    static {
            r0 = 6
            int[] r1 = new int[r0]
            r1 = {x0010: FILL_ARRAY_DATA , data: [210, 236, 264, 244, 270, 280} // fill-array
            com.huawei.hms.scankit.p.e2.g = r1
            int[] r0 = new int[r0]
            r0 = {x0020: FILL_ARRAY_DATA , data: [21, 25, 29, 33, 37, 41} // fill-array
            com.huawei.hms.scankit.p.e2.h = r0
            return
    }

    public e2(com.huawei.hms.scankit.p.s r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private float a(int r9, int r10, com.huawei.hms.scankit.p.s r11) throws com.huawei.hms.scankit.p.a {
            r8 = this;
            int r0 = r11.e()
            r1 = 5
            int[] r2 = new int[r1]
            r3 = 0
            r4 = 0
        L9:
            if (r4 >= r1) goto L10
            r2[r4] = r3
            int r4 = r4 + 1
            goto L9
        L10:
            r1 = r9
        L11:
            r4 = 2
            r5 = 1
            if (r1 < 0) goto L23
            boolean r6 = r11.b(r1, r10)
            if (r6 == 0) goto L23
            r6 = r2[r4]
            int r6 = r6 + r5
            r2[r4] = r6
            int r1 = r1 + (-1)
            goto L11
        L23:
            if (r1 < 0) goto La0
        L25:
            if (r1 < 0) goto L35
            boolean r6 = r11.b(r1, r10)
            if (r6 != 0) goto L35
            r6 = r2[r5]
            int r6 = r6 + r5
            r2[r5] = r6
            int r1 = r1 + (-1)
            goto L25
        L35:
            if (r1 < 0) goto L9b
        L37:
            if (r1 < 0) goto L47
            boolean r6 = r11.b(r1, r10)
            if (r6 == 0) goto L47
            r6 = r2[r3]
            int r6 = r6 + r5
            r2[r3] = r6
            int r1 = r1 + (-1)
            goto L37
        L47:
            int r9 = r9 + r5
        L48:
            if (r9 >= r0) goto L58
            boolean r1 = r11.b(r9, r10)
            if (r1 == 0) goto L58
            r1 = r2[r4]
            int r1 = r1 + r5
            r2[r4] = r1
            int r9 = r9 + 1
            goto L48
        L58:
            if (r9 == r0) goto L96
        L5a:
            r1 = 3
            if (r9 >= r0) goto L6b
            boolean r6 = r11.b(r9, r10)
            if (r6 != 0) goto L6b
            r6 = r2[r1]
            int r6 = r6 + r5
            r2[r1] = r6
            int r9 = r9 + 1
            goto L5a
        L6b:
            if (r9 == r0) goto L91
        L6d:
            r6 = 4
            if (r9 >= r0) goto L7e
            boolean r7 = r11.b(r9, r10)
            if (r7 == 0) goto L7e
            r7 = r2[r6]
            int r7 = r7 + r5
            r2[r6] = r7
            int r9 = r9 + 1
            goto L6d
        L7e:
            r9 = r2[r3]
            r10 = r2[r5]
            int r9 = r9 + r10
            r10 = r2[r4]
            int r9 = r9 + r10
            r10 = r2[r1]
            int r9 = r9 + r10
            r10 = r2[r6]
            int r9 = r9 + r10
            float r9 = (float) r9
            r10 = 1086324736(0x40c00000, float:6.0)
            float r9 = r9 / r10
            return r9
        L91:
            com.huawei.hms.scankit.p.a r9 = com.huawei.hms.scankit.p.a.a()
            throw r9
        L96:
            com.huawei.hms.scankit.p.a r9 = com.huawei.hms.scankit.p.a.a()
            throw r9
        L9b:
            com.huawei.hms.scankit.p.a r9 = com.huawei.hms.scankit.p.a.a()
            throw r9
        La0:
            com.huawei.hms.scankit.p.a r9 = com.huawei.hms.scankit.p.a.a()
            throw r9
    }

    private static int a(com.huawei.hms.scankit.p.u6 r0, com.huawei.hms.scankit.p.u6 r1, com.huawei.hms.scankit.p.u6 r2, float r3) throws com.huawei.hms.scankit.p.a {
            float r1 = com.huawei.hms.scankit.p.u6.a(r0, r1)
            float r1 = r1 / r3
            float r0 = com.huawei.hms.scankit.p.u6.a(r0, r2)
            float r0 = r0 / r3
            float r1 = r1 + r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            r0 = 1105251533(0x41e0cccd, float:28.1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L1e
            r0 = 1106824397(0x41f8cccd, float:31.1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L1e
            r0 = 1
            return r0
        L1e:
            r0 = 1107138970(0x41fd999a, float:31.7)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L2e
            r0 = 1108004045(0x420acccd, float:34.7)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L2e
            r0 = 2
            return r0
        L2e:
            r0 = 1108318618(0x420f999a, float:35.9)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L3e
            r0 = 1109105050(0x421b999a, float:38.9)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L3e
            r0 = 3
            return r0
        L3e:
            r0 = 1109839053(0x4226cccd, float:41.7)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L4e
            r0 = 1110625485(0x4232cccd, float:44.7)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L4e
            r0 = 4
            return r0
        L4e:
            r0 = 1111044915(0x42393333, float:46.3)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L5e
            r0 = 1111831347(0x42453333, float:49.3)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L5e
            r0 = 5
            return r0
        L5e:
            r0 = 1113168282(0x4259999a, float:54.4)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L6e
            r0 = 1113954714(0x4265999a, float:57.4)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L6e
            r0 = 6
            return r0
        L6e:
            r0 = 1103626240(0x41c80000, float:25.0)
            float r1 = r1 - r0
            r0 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 / r0
            int r0 = java.lang.Math.round(r1)
            return r0
    }

    private static com.huawei.hms.scankit.p.d6 a(com.huawei.hms.scankit.p.u6 r17, com.huawei.hms.scankit.p.u6 r18, com.huawei.hms.scankit.p.u6 r19, com.huawei.hms.scankit.p.u6 r20, com.huawei.hms.scankit.p.u6 r21, com.huawei.hms.scankit.p.u6 r22, com.huawei.hms.scankit.p.u6 r23, com.huawei.hms.scankit.p.u6 r24) throws com.huawei.hms.scankit.p.a {
            float r1 = r21.b()
            float r2 = r21.c()
            float r3 = r22.b()
            float r4 = r22.c()
            float r5 = r24.b()
            float r6 = r24.c()
            float r7 = r23.b()
            float r8 = r23.c()
            float r9 = r17.b()
            float r10 = r17.c()
            float r11 = r18.b()
            float r12 = r18.c()
            float r13 = r20.b()
            float r14 = r20.c()
            float r15 = r19.b()
            float r16 = r19.c()
            com.huawei.hms.scankit.p.d6 r0 = com.huawei.hms.scankit.p.d6.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
    }

    private static com.huawei.hms.scankit.p.s a(com.huawei.hms.scankit.p.s r6, com.huawei.hms.scankit.p.d6 r7, int r8) throws com.huawei.hms.scankit.p.a {
            com.huawei.hms.scankit.p.s3 r0 = com.huawei.hms.scankit.p.s3.a()
            r5 = 0
            r3 = r8
            r1 = r6
            r4 = r7
            r2 = r8
            com.huawei.hms.scankit.p.s r6 = r0.a(r1, r2, r3, r4, r5)
            return r6
    }

    private float b(int r9, int r10, com.huawei.hms.scankit.p.s r11) throws com.huawei.hms.scankit.p.a {
            r8 = this;
            int r0 = r11.c()
            r1 = 5
            int[] r2 = new int[r1]
            r3 = 0
            r4 = 0
        L9:
            if (r4 >= r1) goto L10
            r2[r4] = r3
            int r4 = r4 + 1
            goto L9
        L10:
            r1 = r9
        L11:
            r4 = 2
            r5 = 1
            if (r1 < 0) goto L23
            boolean r6 = r11.b(r10, r1)
            if (r6 == 0) goto L23
            r6 = r2[r4]
            int r6 = r6 + r5
            r2[r4] = r6
            int r1 = r1 + (-1)
            goto L11
        L23:
            if (r1 < 0) goto La0
        L25:
            if (r1 < 0) goto L35
            boolean r6 = r11.b(r10, r1)
            if (r6 != 0) goto L35
            r6 = r2[r5]
            int r6 = r6 + r5
            r2[r5] = r6
            int r1 = r1 + (-1)
            goto L25
        L35:
            if (r1 < 0) goto L9b
        L37:
            if (r1 < 0) goto L47
            boolean r6 = r11.b(r10, r1)
            if (r6 == 0) goto L47
            r6 = r2[r3]
            int r6 = r6 + r5
            r2[r3] = r6
            int r1 = r1 + (-1)
            goto L37
        L47:
            int r9 = r9 + r5
        L48:
            if (r9 >= r0) goto L58
            boolean r1 = r11.b(r10, r9)
            if (r1 == 0) goto L58
            r1 = r2[r4]
            int r1 = r1 + r5
            r2[r4] = r1
            int r9 = r9 + 1
            goto L48
        L58:
            if (r9 == r0) goto L96
        L5a:
            r1 = 3
            if (r9 >= r0) goto L6b
            boolean r6 = r11.b(r10, r9)
            if (r6 != 0) goto L6b
            r6 = r2[r1]
            int r6 = r6 + r5
            r2[r1] = r6
            int r9 = r9 + 1
            goto L5a
        L6b:
            if (r9 == r0) goto L91
        L6d:
            r6 = 4
            if (r9 >= r0) goto L7e
            boolean r7 = r11.b(r10, r9)
            if (r7 == 0) goto L7e
            r7 = r2[r6]
            int r7 = r7 + r5
            r2[r6] = r7
            int r9 = r9 + 1
            goto L6d
        L7e:
            r9 = r2[r3]
            r10 = r2[r5]
            int r9 = r9 + r10
            r10 = r2[r4]
            int r9 = r9 + r10
            r10 = r2[r1]
            int r9 = r9 + r10
            r10 = r2[r6]
            int r9 = r9 + r10
            float r9 = (float) r9
            r10 = 1086324736(0x40c00000, float:6.0)
            float r9 = r9 / r10
            return r9
        L91:
            com.huawei.hms.scankit.p.a r9 = com.huawei.hms.scankit.p.a.a()
            throw r9
        L96:
            com.huawei.hms.scankit.p.a r9 = com.huawei.hms.scankit.p.a.a()
            throw r9
        L9b:
            com.huawei.hms.scankit.p.a r9 = com.huawei.hms.scankit.p.a.a()
            throw r9
        La0:
            com.huawei.hms.scankit.p.a r9 = com.huawei.hms.scankit.p.a.a()
            throw r9
    }

    protected final float a(com.huawei.hms.scankit.p.u6 r4, com.huawei.hms.scankit.p.u6 r5, com.huawei.hms.scankit.p.u6 r6, com.huawei.hms.scankit.p.s r7) throws com.huawei.hms.scankit.p.a {
            r3 = this;
            float r0 = r4.b()
            int r0 = (int) r0
            float r1 = r4.c()
            int r1 = (int) r1
            float r0 = r3.a(r0, r1, r7)
            float r1 = r5.b()
            int r1 = (int) r1
            float r2 = r5.c()
            int r2 = (int) r2
            float r1 = r3.a(r1, r2, r7)
            float r0 = r0 + r1
            float r1 = r6.b()
            int r1 = (int) r1
            float r2 = r6.c()
            int r2 = (int) r2
            float r1 = r3.a(r1, r2, r7)
            float r0 = r0 + r1
            float r1 = r4.c()
            int r1 = (int) r1
            float r4 = r4.b()
            int r4 = (int) r4
            float r4 = r3.b(r1, r4, r7)
            float r0 = r0 + r4
            float r4 = r5.c()
            int r4 = (int) r4
            float r5 = r5.b()
            int r5 = (int) r5
            float r4 = r3.b(r4, r5, r7)
            float r0 = r0 + r4
            float r4 = r6.c()
            int r4 = (int) r4
            float r5 = r6.b()
            int r5 = (int) r5
            float r4 = r3.b(r4, r5, r7)
            float r0 = r0 + r4
            r4 = 1086324736(0x40c00000, float:6.0)
            float r0 = r0 / r4
            return r0
    }

    public final int a(com.huawei.hms.scankit.p.g3[] r3, com.huawei.hms.scankit.p.g3 r4) throws com.huawei.hms.scankit.p.a {
            r2 = this;
            r0 = 0
            r0 = r3[r0]
            r2.c = r0
            r0 = 1
            r0 = r3[r0]
            r2.d = r0
            r0 = 2
            r3 = r3[r0]
            r2.e = r3
            if (r4 != 0) goto L41
            float r3 = r3.b()
            com.huawei.hms.scankit.p.g3 r4 = r2.d
            float r4 = r4.b()
            float r3 = r3 - r4
            com.huawei.hms.scankit.p.g3 r4 = r2.c
            float r4 = r4.b()
            float r3 = r3 + r4
            com.huawei.hms.scankit.p.g3 r4 = r2.e
            float r4 = r4.c()
            com.huawei.hms.scankit.p.g3 r0 = r2.d
            float r0 = r0.c()
            float r4 = r4 - r0
            com.huawei.hms.scankit.p.g3 r0 = r2.c
            float r0 = r0.c()
            float r4 = r4 + r0
            com.huawei.hms.scankit.p.g3 r0 = new com.huawei.hms.scankit.p.g3
            r1 = 1086324736(0x40c00000, float:6.0)
            r0.<init>(r3, r4, r1)
            r2.f = r0
            goto L43
        L41:
            r2.f = r4
        L43:
            com.huawei.hms.scankit.p.g3 r3 = r2.d
            com.huawei.hms.scankit.p.g3 r4 = r2.e
            com.huawei.hms.scankit.p.g3 r0 = r2.c
            com.huawei.hms.scankit.p.s r1 = r2.a
            float r3 = r2.a(r3, r4, r0, r1)
            r4 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 < 0) goto L6a
            com.huawei.hms.scankit.p.g3 r4 = r2.d
            com.huawei.hms.scankit.p.g3 r0 = r2.e
            com.huawei.hms.scankit.p.g3 r1 = r2.c
            int r3 = a(r4, r0, r1, r3)
            if (r3 < 0) goto L65
            r4 = 7
            if (r3 > r4) goto L65
            return r3
        L65:
            com.huawei.hms.scankit.p.a r3 = com.huawei.hms.scankit.p.a.a()
            throw r3
        L6a:
            com.huawei.hms.scankit.p.a r3 = com.huawei.hms.scankit.p.a.a()
            throw r3
    }

    public final com.huawei.hms.scankit.p.j2 a(int r20) throws com.huawei.hms.scankit.p.a {
            r19 = this;
            r0 = r19
            int[] r1 = com.huawei.hms.scankit.p.e2.g
            int r2 = r20 + (-1)
            r1 = r1[r2]
            double r3 = (double) r1
            r5 = 4605249457297304856(0x3fe921fb54442d18, double:0.7853981633974483)
            double r7 = java.lang.Math.cos(r5)
            double r7 = r7 * r3
            r9 = 4643985272004935680(0x4072c00000000000, double:300.0)
            double r7 = r7 + r9
            float r1 = (float) r7
            double r5 = java.lang.Math.cos(r5)
            double r3 = r3 * r5
            double r3 = r9 - r3
            float r3 = (float) r3
            com.huawei.hms.scankit.p.u6 r15 = new com.huawei.hms.scankit.p.u6
            r15.<init>(r3, r3)
            com.huawei.hms.scankit.p.u6 r4 = new com.huawei.hms.scankit.p.u6
            r4.<init>(r1, r3)
            com.huawei.hms.scankit.p.u6 r5 = new com.huawei.hms.scankit.p.u6
            r5.<init>(r1, r1)
            com.huawei.hms.scankit.p.u6 r6 = new com.huawei.hms.scankit.p.u6
            r6.<init>(r3, r1)
            com.huawei.hms.scankit.p.g3 r11 = r0.d
            com.huawei.hms.scankit.p.g3 r12 = r0.e
            com.huawei.hms.scankit.p.g3 r13 = r0.c
            com.huawei.hms.scankit.p.g3 r14 = r0.f
            r16 = r4
            r18 = r5
            r17 = r6
            com.huawei.hms.scankit.p.d6 r1 = a(r11, r12, r13, r14, r15, r16, r17, r18)
            com.huawei.hms.scankit.p.s r3 = r0.a
            r4 = 600(0x258, float:8.41E-43)
            com.huawei.hms.scankit.p.s r1 = a(r3, r1, r4)
            int[] r3 = com.huawei.hms.scankit.p.e2.h
            r2 = r3[r2]
            com.huawei.hms.scankit.p.s r3 = new com.huawei.hms.scankit.p.s
            r3.<init>(r2, r2)
            switch(r20) {
                case 1: goto L7c;
                case 2: goto L77;
                case 3: goto L72;
                case 4: goto L6d;
                case 5: goto L68;
                case 6: goto L63;
                default: goto L5e;
            }
        L5e:
            com.huawei.hms.scankit.p.a r1 = com.huawei.hms.scankit.p.a.a()
            throw r1
        L63:
            com.huawei.hms.scankit.p.s r1 = com.huawei.hms.scankit.p.f8.a(r3, r1, r2, r9)
            goto L80
        L68:
            com.huawei.hms.scankit.p.s r1 = com.huawei.hms.scankit.p.c8.a(r3, r1, r2, r9)
            goto L80
        L6d:
            com.huawei.hms.scankit.p.s r1 = com.huawei.hms.scankit.p.d8.a(r3, r1, r2, r9)
            goto L80
        L72:
            com.huawei.hms.scankit.p.s r1 = com.huawei.hms.scankit.p.g8.a(r3, r1, r2, r9)
            goto L80
        L77:
            com.huawei.hms.scankit.p.s r1 = com.huawei.hms.scankit.p.h8.a(r3, r1, r2, r9)
            goto L80
        L7c:
            com.huawei.hms.scankit.p.s r1 = com.huawei.hms.scankit.p.e8.a(r3, r1, r2, r9)
        L80:
            com.huawei.hms.scankit.p.g3 r2 = r0.c
            com.huawei.hms.scankit.p.g3 r3 = r0.d
            com.huawei.hms.scankit.p.g3 r4 = r0.e
            com.huawei.hms.scankit.p.g3 r5 = r0.f
            r6 = 4
            com.huawei.hms.scankit.p.u6[] r6 = new com.huawei.hms.scankit.p.u6[r6]
            r7 = 0
            r6[r7] = r2
            r2 = 1
            r6[r2] = r3
            r2 = 2
            r6[r2] = r4
            r2 = 3
            r6[r2] = r5
            com.huawei.hms.scankit.p.j2 r2 = new com.huawei.hms.scankit.p.j2
            r2.<init>(r1, r6)
            return r2
    }

    public final com.huawei.hms.scankit.p.g3[] a(java.util.Map<com.huawei.hms.scankit.p.l1, ?> r4) throws com.huawei.hms.scankit.p.a {
            r3 = this;
            if (r4 != 0) goto L4
            r0 = 0
            goto Lc
        L4:
            com.huawei.hms.scankit.p.l1 r0 = com.huawei.hms.scankit.p.l1.j
            java.lang.Object r0 = r4.get(r0)
            com.huawei.hms.scankit.p.v6 r0 = (com.huawei.hms.scankit.p.v6) r0
        Lc:
            r3.b = r0
            com.huawei.hms.scankit.p.h3 r1 = new com.huawei.hms.scankit.p.h3
            com.huawei.hms.scankit.p.s r2 = r3.a
            r1.<init>(r2, r0)
            com.huawei.hms.scankit.p.g3[] r4 = r1.a(r4)
            return r4
    }
}
