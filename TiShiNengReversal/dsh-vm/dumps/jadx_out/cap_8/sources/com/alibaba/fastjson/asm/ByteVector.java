package com.alibaba.fastjson.asm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ByteVector {
    byte[] data;
    int length;

    public ByteVector() {
            r1 = this;
            r1.<init>()
            r0 = 64
            byte[] r0 = new byte[r0]
            r1.data = r0
            return
    }

    public ByteVector(int r1) {
            r0 = this;
            r0.<init>()
            byte[] r1 = new byte[r1]
            r0.data = r1
            return
    }

    private void enlarge(int r4) {
            r3 = this;
            byte[] r0 = r3.data
            int r1 = r0.length
            int r1 = r1 * 2
            int r2 = r3.length
            int r4 = r4 + r2
            if (r1 <= r4) goto Lb
            goto Lc
        Lb:
            r1 = r4
        Lc:
            byte[] r4 = new byte[r1]
            r1 = 0
            java.lang.System.arraycopy(r0, r1, r4, r1, r2)
            r3.data = r4
            return
    }

    com.alibaba.fastjson.asm.ByteVector put11(int r5, int r6) {
            r4 = this;
            int r0 = r4.length
            int r1 = r0 + 2
            byte[] r2 = r4.data
            int r2 = r2.length
            r3 = 2
            if (r1 <= r2) goto Ld
            r4.enlarge(r3)
        Ld:
            byte[] r1 = r4.data
            int r2 = r0 + 1
            byte r5 = (byte) r5
            r1[r0] = r5
            int r0 = r0 + r3
            byte r5 = (byte) r6
            r1[r2] = r5
            r4.length = r0
            return r4
    }

    com.alibaba.fastjson.asm.ByteVector put12(int r6, int r7) {
            r5 = this;
            int r0 = r5.length
            int r1 = r0 + 3
            byte[] r2 = r5.data
            int r2 = r2.length
            r3 = 3
            if (r1 <= r2) goto Ld
            r5.enlarge(r3)
        Ld:
            byte[] r1 = r5.data
            int r2 = r0 + 1
            byte r6 = (byte) r6
            r1[r0] = r6
            int r6 = r0 + 2
            int r4 = r7 >>> 8
            byte r4 = (byte) r4
            r1[r2] = r4
            int r0 = r0 + r3
            byte r7 = (byte) r7
            r1[r6] = r7
            r5.length = r0
            return r5
    }

    public com.alibaba.fastjson.asm.ByteVector putByte(int r4) {
            r3 = this;
            int r0 = r3.length
            int r1 = r0 + 1
            byte[] r2 = r3.data
            int r2 = r2.length
            if (r1 <= r2) goto Ld
            r2 = 1
            r3.enlarge(r2)
        Ld:
            byte[] r2 = r3.data
            byte r4 = (byte) r4
            r2[r0] = r4
            r3.length = r1
            return r3
    }

    public com.alibaba.fastjson.asm.ByteVector putByteArray(byte[] r3, int r4, int r5) {
            r2 = this;
            int r0 = r2.length
            int r0 = r0 + r5
            byte[] r1 = r2.data
            int r1 = r1.length
            if (r0 <= r1) goto Lb
            r2.enlarge(r5)
        Lb:
            if (r3 == 0) goto L14
            byte[] r0 = r2.data
            int r1 = r2.length
            java.lang.System.arraycopy(r3, r4, r0, r1, r5)
        L14:
            int r3 = r2.length
            int r3 = r3 + r5
            r2.length = r3
            return r2
    }

    public com.alibaba.fastjson.asm.ByteVector putInt(int r7) {
            r6 = this;
            int r0 = r6.length
            int r1 = r0 + 4
            byte[] r2 = r6.data
            int r2 = r2.length
            r3 = 4
            if (r1 <= r2) goto Ld
            r6.enlarge(r3)
        Ld:
            byte[] r1 = r6.data
            int r2 = r0 + 1
            int r4 = r7 >>> 24
            byte r4 = (byte) r4
            r1[r0] = r4
            int r4 = r0 + 2
            int r5 = r7 >>> 16
            byte r5 = (byte) r5
            r1[r2] = r5
            int r2 = r0 + 3
            int r5 = r7 >>> 8
            byte r5 = (byte) r5
            r1[r4] = r5
            int r0 = r0 + r3
            byte r7 = (byte) r7
            r1[r2] = r7
            r6.length = r0
            return r6
    }

    public com.alibaba.fastjson.asm.ByteVector putShort(int r6) {
            r5 = this;
            int r0 = r5.length
            int r1 = r0 + 2
            byte[] r2 = r5.data
            int r2 = r2.length
            r3 = 2
            if (r1 <= r2) goto Ld
            r5.enlarge(r3)
        Ld:
            byte[] r1 = r5.data
            int r2 = r0 + 1
            int r4 = r6 >>> 8
            byte r4 = (byte) r4
            r1[r0] = r4
            int r0 = r0 + r3
            byte r6 = (byte) r6
            r1[r2] = r6
            r5.length = r0
            return r5
    }

    public com.alibaba.fastjson.asm.ByteVector putUTF8(java.lang.String r7) {
            r6 = this;
            int r0 = r7.length()
            int r1 = r6.length
            int r2 = r1 + 2
            int r2 = r2 + r0
            byte[] r3 = r6.data
            int r3 = r3.length
            if (r2 <= r3) goto L13
            int r2 = r0 + 2
            r6.enlarge(r2)
        L13:
            byte[] r2 = r6.data
            int r3 = r1 + 1
            int r4 = r0 >>> 8
            byte r4 = (byte) r4
            r2[r1] = r4
            int r1 = r1 + 2
            byte r4 = (byte) r0
            r2[r3] = r4
            r3 = 0
        L22:
            if (r3 >= r0) goto L3e
            char r4 = r7.charAt(r3)
            r5 = 1
            if (r4 < r5) goto L38
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 > r5) goto L38
            int r5 = r1 + 1
            byte r4 = (byte) r4
            r2[r1] = r4
            int r3 = r3 + 1
            r1 = r5
            goto L22
        L38:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            r7.<init>()
            throw r7
        L3e:
            r6.length = r1
            return r6
    }
}
