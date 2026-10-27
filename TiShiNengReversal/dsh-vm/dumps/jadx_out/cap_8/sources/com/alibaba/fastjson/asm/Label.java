package com.alibaba.fastjson.asm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Label {
    int inputStackTop;
    com.alibaba.fastjson.asm.Label next;
    int outputStackMax;
    int position;
    private int referenceCount;
    private int[] srcAndRefPositions;
    int status;
    com.alibaba.fastjson.asm.Label successor;

    public Label() {
            r0 = this;
            r0.<init>()
            return
    }

    private void addReference(int r5, int r6) {
            r4 = this;
            int[] r0 = r4.srcAndRefPositions
            r1 = 6
            if (r0 != 0) goto L9
            int[] r0 = new int[r1]
            r4.srcAndRefPositions = r0
        L9:
            int r0 = r4.referenceCount
            int[] r2 = r4.srcAndRefPositions
            int r3 = r2.length
            if (r0 < r3) goto L1b
            int r0 = r2.length
            int r0 = r0 + r1
            int[] r0 = new int[r0]
            int r1 = r2.length
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r0, r3, r1)
            r4.srcAndRefPositions = r0
        L1b:
            int[] r0 = r4.srcAndRefPositions
            int r1 = r4.referenceCount
            int r2 = r1 + 1
            r4.referenceCount = r2
            r0[r1] = r5
            int r1 = r1 + 2
            r4.referenceCount = r1
            r0[r2] = r6
            return
    }

    void put(com.alibaba.fastjson.asm.MethodWriter r1, com.alibaba.fastjson.asm.ByteVector r2, int r3) {
            r0 = this;
            int r1 = r0.status
            r1 = r1 & 2
            if (r1 != 0) goto L10
            int r1 = r2.length
            r0.addReference(r3, r1)
            r1 = -1
            r2.putShort(r1)
            return
        L10:
            int r1 = r0.position
            int r1 = r1 - r3
            r2.putShort(r1)
            return
    }

    void resolve(com.alibaba.fastjson.asm.MethodWriter r5, int r6, byte[] r7) {
            r4 = this;
            int r5 = r4.status
            r5 = r5 | 2
            r4.status = r5
            r4.position = r6
            r5 = 0
        L9:
            int r0 = r4.referenceCount
            if (r5 >= r0) goto L24
            int[] r0 = r4.srcAndRefPositions
            int r1 = r5 + 1
            r2 = r0[r5]
            int r5 = r5 + 2
            r0 = r0[r1]
            int r1 = r6 - r2
            int r2 = r0 + 1
            int r3 = r1 >>> 8
            byte r3 = (byte) r3
            r7[r0] = r3
            byte r0 = (byte) r1
            r7[r2] = r0
            goto L9
        L24:
            return
    }
}
