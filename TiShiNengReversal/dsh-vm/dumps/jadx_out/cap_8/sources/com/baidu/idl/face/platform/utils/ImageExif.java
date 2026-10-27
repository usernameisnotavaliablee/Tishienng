package com.baidu.idl.face.platform.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ImageExif {
    private static final java.lang.String TAG = "CameraExif";

    public ImageExif() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getOrientation(byte[] r10) {
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            r1 = 0
        L5:
            int r2 = r1 + 3
            int r3 = r10.length
            r4 = 1
            r5 = 4
            r6 = 8
            r7 = 2
            if (r2 >= r3) goto L5c
            int r2 = r1 + 1
            r3 = r10[r1]
            r8 = 255(0xff, float:3.57E-43)
            r3 = r3 & r8
            if (r3 != r8) goto L5b
            r3 = r10[r2]
            r3 = r3 & r8
            if (r3 != r8) goto L1f
        L1d:
            r1 = r2
            goto L5
        L1f:
            int r2 = r1 + 2
            r8 = 216(0xd8, float:3.03E-43)
            if (r3 == r8) goto L1d
            if (r3 != r4) goto L28
            goto L1d
        L28:
            r8 = 217(0xd9, float:3.04E-43)
            if (r3 == r8) goto L5b
            r8 = 218(0xda, float:3.05E-43)
            if (r3 != r8) goto L31
            goto L5b
        L31:
            int r8 = pack(r10, r2, r7, r0)
            if (r8 < r7) goto L5a
            int r2 = r2 + r8
            int r9 = r10.length
            if (r2 <= r9) goto L3c
            goto L5a
        L3c:
            r9 = 225(0xe1, float:3.15E-43)
            if (r3 != r9) goto L1d
            if (r8 < r6) goto L1d
            int r3 = r1 + 4
            int r3 = pack(r10, r3, r5, r0)
            r9 = 1165519206(0x45786966, float:3974.5874)
            if (r3 != r9) goto L1d
            int r3 = r1 + 8
            int r3 = pack(r10, r3, r7, r0)
            if (r3 != 0) goto L1d
            int r1 = r1 + 10
            int r8 = r8 + (-8)
            goto L5d
        L5a:
            return r0
        L5b:
            r1 = r2
        L5c:
            r8 = 0
        L5d:
            if (r8 <= r6) goto Lb5
            int r2 = pack(r10, r1, r5, r0)
            r3 = 1229531648(0x49492a00, float:823968.0)
            if (r2 == r3) goto L6e
            r9 = 1296891946(0x4d4d002a, float:2.1495875E8)
            if (r2 == r9) goto L6e
            return r0
        L6e:
            if (r2 != r3) goto L71
            goto L72
        L71:
            r4 = 0
        L72:
            int r2 = r1 + 4
            int r2 = pack(r10, r2, r5, r4)
            int r2 = r2 + r7
            r3 = 10
            if (r2 < r3) goto Lb5
            if (r2 <= r8) goto L80
            goto Lb5
        L80:
            int r1 = r1 + r2
            int r8 = r8 - r2
            int r2 = r1 + (-2)
            int r2 = pack(r10, r2, r7, r4)
        L88:
            int r3 = r2 + (-1)
            if (r2 <= 0) goto Lb5
            r2 = 12
            if (r8 < r2) goto Lb5
            int r2 = pack(r10, r1, r7, r4)
            r5 = 274(0x112, float:3.84E-43)
            if (r2 != r5) goto Laf
            int r1 = r1 + r6
            int r10 = pack(r10, r1, r7, r4)
            r1 = 3
            if (r10 == r1) goto Lac
            r1 = 6
            if (r10 == r1) goto La9
            if (r10 == r6) goto La6
            return r0
        La6:
            r10 = 270(0x10e, float:3.78E-43)
            return r10
        La9:
            r10 = 90
            return r10
        Lac:
            r10 = 180(0xb4, float:2.52E-43)
            return r10
        Laf:
            int r1 = r1 + 12
            int r8 = r8 + (-12)
            r2 = r3
            goto L88
        Lb5:
            return r0
    }

    private static int pack(byte[] r2, int r3, int r4, boolean r5) {
            if (r5 == 0) goto L7
            int r5 = r4 + (-1)
            int r3 = r3 + r5
            r5 = -1
            goto L8
        L7:
            r5 = 1
        L8:
            r0 = 0
        L9:
            int r1 = r4 + (-1)
            if (r4 <= 0) goto L1f
            if (r3 < 0) goto L1c
            if (r2 == 0) goto L1c
            int r4 = r2.length
            if (r3 >= r4) goto L1c
            int r4 = r0 << 8
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r4 = r4 | r0
            r0 = r4
        L1c:
            int r3 = r3 + r5
            r4 = r1
            goto L9
        L1f:
            return r0
    }
}
