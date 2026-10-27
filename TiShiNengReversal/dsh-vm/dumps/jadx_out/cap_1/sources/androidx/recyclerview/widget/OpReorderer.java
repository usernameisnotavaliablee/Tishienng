package androidx.recyclerview.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class OpReorderer {
    final androidx.recyclerview.widget.OpReorderer.Callback mCallback;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface Callback {
        androidx.recyclerview.widget.AdapterHelper.UpdateOp obtainUpdateOp(int r1, int r2, int r3, java.lang.Object r4);

        void recycleUpdateOp(androidx.recyclerview.widget.AdapterHelper.UpdateOp r1);
    }

    OpReorderer(androidx.recyclerview.widget.OpReorderer.Callback r1) {
            r0 = this;
            r0.<init>()
            r0.mCallback = r1
            return
    }

    private int getLastMoveOutOfOrder(java.util.List<androidx.recyclerview.widget.AdapterHelper.UpdateOp> r6) {
            r5 = this;
            int r0 = r6.size()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
        L7:
            if (r0 < 0) goto L1c
            java.lang.Object r3 = r6.get(r0)
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r3 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r3
            int r3 = r3.cmd
            r4 = 8
            if (r3 != r4) goto L18
            if (r2 == 0) goto L19
            return r0
        L18:
            r2 = 1
        L19:
            int r0 = r0 + (-1)
            goto L7
        L1c:
            r6 = -1
            return r6
    }

    private void swapMoveAdd(java.util.List<androidx.recyclerview.widget.AdapterHelper.UpdateOp> r5, int r6, androidx.recyclerview.widget.AdapterHelper.UpdateOp r7, int r8, androidx.recyclerview.widget.AdapterHelper.UpdateOp r9) {
            r4 = this;
            int r0 = r7.itemCount
            int r1 = r9.positionStart
            if (r0 >= r1) goto L8
            r2 = -1
            goto L9
        L8:
            r2 = 0
        L9:
            int r3 = r7.positionStart
            if (r3 >= r1) goto Lf
            int r2 = r2 + 1
        Lf:
            if (r1 > r3) goto L16
            int r1 = r9.itemCount
            int r3 = r3 + r1
            r7.positionStart = r3
        L16:
            int r1 = r9.positionStart
            if (r1 > r0) goto L1f
            int r3 = r9.itemCount
            int r0 = r0 + r3
            r7.itemCount = r0
        L1f:
            int r1 = r1 + r2
            r9.positionStart = r1
            r5.set(r6, r9)
            r5.set(r8, r7)
            return
    }

    private void swapMoveOp(java.util.List<androidx.recyclerview.widget.AdapterHelper.UpdateOp> r8, int r9, int r10) {
            r7 = this;
            java.lang.Object r0 = r8.get(r9)
            r4 = r0
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r4 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r4
            java.lang.Object r0 = r8.get(r10)
            r6 = r0
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r6 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r6
            int r0 = r6.cmd
            r1 = 1
            if (r0 == r1) goto L2a
            r1 = 2
            if (r0 == r1) goto L22
            r1 = 4
            if (r0 == r1) goto L1a
            return
        L1a:
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r1.swapMoveUpdate(r2, r3, r4, r5, r6)
            return
        L22:
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r1.swapMoveRemove(r2, r3, r4, r5, r6)
            return
        L2a:
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r1.swapMoveAdd(r2, r3, r4, r5, r6)
            return
    }

    void reorderOps(java.util.List<androidx.recyclerview.widget.AdapterHelper.UpdateOp> r3) {
            r2 = this;
        L0:
            int r0 = r2.getLastMoveOutOfOrder(r3)
            r1 = -1
            if (r0 == r1) goto Ld
            int r1 = r0 + 1
            r2.swapMoveOp(r3, r0, r1)
            goto L0
        Ld:
            return
    }

    void swapMoveRemove(java.util.List<androidx.recyclerview.widget.AdapterHelper.UpdateOp> r10, int r11, androidx.recyclerview.widget.AdapterHelper.UpdateOp r12, int r13, androidx.recyclerview.widget.AdapterHelper.UpdateOp r14) {
            r9 = this;
            int r0 = r12.positionStart
            int r1 = r12.itemCount
            r2 = 1
            r3 = 0
            if (r0 >= r1) goto L17
            int r4 = r14.positionStart
            if (r4 != r0) goto L15
            int r4 = r14.itemCount
            int r0 = r1 - r0
            if (r4 != r0) goto L15
            r0 = 0
        L13:
            r3 = 1
            goto L25
        L15:
            r0 = 0
            goto L25
        L17:
            int r4 = r14.positionStart
            int r5 = r1 + 1
            if (r4 != r5) goto L24
            int r4 = r14.itemCount
            int r0 = r0 - r1
            if (r4 != r0) goto L24
            r0 = 1
            goto L13
        L24:
            r0 = 1
        L25:
            int r4 = r14.positionStart
            r5 = 2
            if (r1 >= r4) goto L2e
            int r4 = r4 - r2
            r14.positionStart = r4
            goto L47
        L2e:
            int r6 = r14.itemCount
            int r4 = r4 + r6
            if (r1 >= r4) goto L47
            int r6 = r6 - r2
            r14.itemCount = r6
            r12.cmd = r5
            r12.itemCount = r2
            int r11 = r14.itemCount
            if (r11 != 0) goto Lea
            r10.remove(r13)
            androidx.recyclerview.widget.OpReorderer$Callback r10 = r9.mCallback
            r10.recycleUpdateOp(r14)
            return
        L47:
            int r1 = r12.positionStart
            int r4 = r14.positionStart
            r6 = 0
            if (r1 > r4) goto L52
            int r4 = r4 + r2
            r14.positionStart = r4
            goto L68
        L52:
            int r7 = r14.itemCount
            int r8 = r4 + r7
            if (r1 >= r8) goto L68
            int r4 = r4 + r7
            int r4 = r4 - r1
            androidx.recyclerview.widget.OpReorderer$Callback r7 = r9.mCallback
            int r1 = r1 + r2
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r6 = r7.obtainUpdateOp(r5, r1, r4, r6)
            int r1 = r12.positionStart
            int r2 = r14.positionStart
            int r1 = r1 - r2
            r14.itemCount = r1
        L68:
            if (r3 == 0) goto L76
            r10.set(r11, r14)
            r10.remove(r13)
            androidx.recyclerview.widget.OpReorderer$Callback r10 = r9.mCallback
            r10.recycleUpdateOp(r12)
            return
        L76:
            if (r0 == 0) goto La7
            if (r6 == 0) goto L90
            int r0 = r12.positionStart
            int r1 = r6.positionStart
            if (r0 <= r1) goto L85
            int r1 = r6.itemCount
            int r0 = r0 - r1
            r12.positionStart = r0
        L85:
            int r0 = r12.itemCount
            int r1 = r6.positionStart
            if (r0 <= r1) goto L90
            int r1 = r6.itemCount
            int r0 = r0 - r1
            r12.itemCount = r0
        L90:
            int r0 = r12.positionStart
            int r1 = r14.positionStart
            if (r0 <= r1) goto L9b
            int r1 = r14.itemCount
            int r0 = r0 - r1
            r12.positionStart = r0
        L9b:
            int r0 = r12.itemCount
            int r1 = r14.positionStart
            if (r0 <= r1) goto Ld5
            int r1 = r14.itemCount
            int r0 = r0 - r1
            r12.itemCount = r0
            goto Ld5
        La7:
            if (r6 == 0) goto Lbf
            int r0 = r12.positionStart
            int r1 = r6.positionStart
            if (r0 < r1) goto Lb4
            int r1 = r6.itemCount
            int r0 = r0 - r1
            r12.positionStart = r0
        Lb4:
            int r0 = r12.itemCount
            int r1 = r6.positionStart
            if (r0 < r1) goto Lbf
            int r1 = r6.itemCount
            int r0 = r0 - r1
            r12.itemCount = r0
        Lbf:
            int r0 = r12.positionStart
            int r1 = r14.positionStart
            if (r0 < r1) goto Lca
            int r1 = r14.itemCount
            int r0 = r0 - r1
            r12.positionStart = r0
        Lca:
            int r0 = r12.itemCount
            int r1 = r14.positionStart
            if (r0 < r1) goto Ld5
            int r1 = r14.itemCount
            int r0 = r0 - r1
            r12.itemCount = r0
        Ld5:
            r10.set(r11, r14)
            int r14 = r12.positionStart
            int r0 = r12.itemCount
            if (r14 == r0) goto Le2
            r10.set(r13, r12)
            goto Le5
        Le2:
            r10.remove(r13)
        Le5:
            if (r6 == 0) goto Lea
            r10.add(r11, r6)
        Lea:
            return
    }

    void swapMoveUpdate(java.util.List<androidx.recyclerview.widget.AdapterHelper.UpdateOp> r9, int r10, androidx.recyclerview.widget.AdapterHelper.UpdateOp r11, int r12, androidx.recyclerview.widget.AdapterHelper.UpdateOp r13) {
            r8 = this;
            int r0 = r11.itemCount
            int r1 = r13.positionStart
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto Ld
            int r1 = r1 - r3
            r13.positionStart = r1
            goto L20
        Ld:
            int r5 = r13.itemCount
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r3
            r13.itemCount = r5
            androidx.recyclerview.widget.OpReorderer$Callback r0 = r8.mCallback
            int r1 = r11.positionStart
            java.lang.Object r5 = r13.payload
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r0 = r0.obtainUpdateOp(r2, r1, r3, r5)
            goto L21
        L20:
            r0 = r4
        L21:
            int r1 = r11.positionStart
            int r5 = r13.positionStart
            if (r1 > r5) goto L2b
            int r5 = r5 + r3
            r13.positionStart = r5
            goto L41
        L2b:
            int r6 = r13.itemCount
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.OpReorderer$Callback r4 = r8.mCallback
            int r1 = r1 + r3
            java.lang.Object r3 = r13.payload
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r4 = r4.obtainUpdateOp(r2, r1, r5, r3)
            int r1 = r13.itemCount
            int r1 = r1 - r5
            r13.itemCount = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.itemCount
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.OpReorderer$Callback r11 = r8.mCallback
            r11.recycleUpdateOp(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r4 == 0) goto L5e
            r9.add(r10, r4)
        L5e:
            return
    }
}
