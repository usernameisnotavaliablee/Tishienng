package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class n3 {
    public n3() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.util.List<java.util.List<com.huawei.hms.scankit.aiscan.common.BarcodeFormat>> a(int r18) {
            if (r18 > 0) goto L5
            r0 = 8191(0x1fff, float:1.1478E-41)
            goto L7
        L5:
            r0 = r18
        L7:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            if (r0 <= 0) goto Ld8
            r8 = 15
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat[] r9 = new com.huawei.hms.scankit.aiscan.common.BarcodeFormat[r8]
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r10 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.e
            r11 = 0
            r9[r11] = r10
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r10 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.c
            r12 = 1
            r9[r12] = r10
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r10 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.d
            r12 = 2
            r9[r12] = r10
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r10 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.b
            r12 = 3
            r9[r12] = r10
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r10 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.f
            r12 = 4
            r9[r12] = r10
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r10 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.h
            r13 = 5
            r9[r13] = r10
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r10 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.g
            r13 = 6
            r9[r13] = r10
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r10 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.i
            r13 = 7
            r9[r13] = r10
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r10 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.k
            r13 = 8
            r9[r13] = r10
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r10 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.l
            r14 = 9
            r9[r14] = r10
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r10 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.m
            r14 = 10
            r9[r14] = r10
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r10 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.j
            r14 = 11
            r9[r14] = r10
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r10 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.a
            r15 = 12
            r9[r15] = r10
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r10 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.p
            r11 = 13
            r9[r11] = r10
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r10 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.q
            r11 = 14
            r9[r11] = r10
            int[] r10 = new int[r8]
            r10 = {x00f4: FILL_ARRAY_DATA , data: [1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384} // fill-array
            r16 = r10[r13]
            r16 = r0 & r16
            if (r16 == 0) goto L92
            r11 = r9[r13]
            r1.add(r11)
        L92:
            r11 = r10[r14]
            r11 = r11 & r0
            if (r11 == 0) goto L9c
            r11 = r9[r14]
            r3.add(r11)
        L9c:
            r11 = 0
        L9d:
            if (r11 >= r8) goto Ld8
            r17 = r10[r11]
            r17 = r0 & r17
            if (r17 == 0) goto Ld3
            if (r11 == r13) goto Ld3
            if (r11 != r14) goto Laa
            goto Ld3
        Laa:
            if (r11 != r12) goto Lb2
            r8 = r9[r11]
            r5.add(r8)
            goto Ld3
        Lb2:
            if (r11 != r15) goto Lba
            r8 = r9[r11]
            r4.add(r8)
            goto Ld3
        Lba:
            r8 = 13
            if (r11 != r8) goto Lc4
            r8 = r9[r11]
            r6.add(r8)
            goto Ld3
        Lc4:
            r8 = 14
            if (r11 != r8) goto Lce
            r8 = r9[r11]
            r7.add(r8)
            goto Ld3
        Lce:
            r8 = r9[r11]
            r2.add(r8)
        Ld3:
            int r11 = r11 + 1
            r8 = 15
            goto L9d
        Ld8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r1)
            r0.add(r2)
            r0.add(r3)
            r0.add(r5)
            r0.add(r4)
            r0.add(r6)
            r0.add(r7)
            return r0
    }
}
