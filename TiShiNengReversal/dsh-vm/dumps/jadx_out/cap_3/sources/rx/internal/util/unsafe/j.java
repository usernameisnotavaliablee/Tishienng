package rx.internal.util.unsafe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@rx.internal.util.SuppressAnimalSniffer
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class j<E> extends rx.internal.util.unsafe.k<E> {
    long F0;
    long G0;
    long H0;
    long I0;
    long J0;
    long K0;
    long L0;
    long M0;
    long N0;
    long O0;
    long P0;
    long Q0;
    long R0;
    long S0;
    long T0;

    public j(int r2) {
            r1 = this;
            r0 = 2
            int r2 = java.lang.Math.max(r0, r2)
            r1.<init>(r2)
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, rx.internal.util.unsafe.i
    public boolean isEmpty() {
            r5 = this;
            long r0 = r5.w()
            long r2 = r5.u()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.i
    public boolean offer(E r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            if (r1 == 0) goto L56
            long r2 = r0.q
            r4 = 1
            long r2 = r2 + r4
            long[] r6 = r0.w
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L12:
            long r9 = r0.u()
            r11 = r2
            long r2 = r0.q(r9)
            long r13 = r0.r(r6, r2)
            long r13 = r13 - r9
            r15 = 0
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 != 0) goto L3e
            long r13 = r9 + r4
            boolean r15 = r0.t(r9, r13)
            if (r15 == 0) goto L3c
            long r4 = r0.a(r9)
            r0.o(r4, r1)
            r1 = r6
            r4 = r13
            r0.s(r1, r2, r4)
            r0 = 1
            return r0
        L3c:
            r0 = r6
            goto L51
        L3e:
            r0 = r6
            if (r17 >= 0) goto L51
            long r9 = r9 - r11
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 > 0) goto L51
            long r2 = r18.w()
            int r6 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r6 > 0) goto L50
            r0 = 0
            return r0
        L50:
            r7 = r2
        L51:
            r6 = r0
            r2 = r11
            r0 = r18
            goto L12
        L56:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null is not a valid element"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.i
    public E peek() {
            r6 = this;
        L0:
            long r0 = r6.w()
            long r2 = r6.a(r0)
            java.lang.Object r2 = r6.e(r2)
            if (r2 != 0) goto L16
            long r3 = r6.u()
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L0
        L16:
            return r2
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.i
    public E poll() {
            r18 = this;
            r0 = r18
            long[] r1 = r0.w
            r2 = -1
        L6:
            long r4 = r0.w()
            r6 = r2
            long r2 = r0.q(r4)
            long r8 = r0.r(r1, r2)
            r10 = 1
            long r12 = r4 + r10
            long r8 = r8 - r12
            r14 = 0
            r16 = r10
            r10 = 0
            int r11 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r11 != 0) goto L3b
            boolean r8 = r0.v(r4, r12)
            if (r8 == 0) goto L4a
            long r6 = r0.a(r4)
            java.lang.Object r8 = r0.e(r6)
            r0.o(r6, r10)
            long r6 = r0.q
            long r4 = r4 + r6
            long r4 = r4 + r16
            r0.s(r1, r2, r4)
            return r8
        L3b:
            if (r11 >= 0) goto L4a
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L4a
            long r2 = r18.u()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L4b
            return r10
        L4a:
            r2 = r6
        L4b:
            r0 = r18
            goto L6
    }

    @Override // java.util.AbstractCollection, java.util.Collection, rx.internal.util.unsafe.i
    public int size() {
            r7 = this;
            long r0 = r7.w()
        L4:
            long r2 = r7.u()
            long r4 = r7.w()
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L13
            long r2 = r2 - r4
            int r0 = (int) r2
            return r0
        L13:
            r0 = r4
            goto L4
    }
}
