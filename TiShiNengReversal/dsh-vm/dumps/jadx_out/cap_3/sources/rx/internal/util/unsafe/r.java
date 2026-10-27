package rx.internal.util.unsafe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@rx.internal.util.SuppressAnimalSniffer
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class r<E> extends rx.internal.util.unsafe.v<E> {
    public r(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, rx.internal.util.unsafe.i
    public boolean isEmpty() {
            r5 = this;
            long r0 = r5.t()
            long r2 = r5.q()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.i
    public boolean offer(E r11) {
            r10 = this;
            if (r11 == 0) goto L32
            E[] r0 = r10.r
            long r1 = r10.q
            long r3 = r10.q()
            long r5 = r10.a(r3)
            java.lang.Object r7 = r10.j(r0, r5)
            if (r7 == 0) goto L27
            long r7 = r10.t()
            long r7 = r3 - r7
            int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r9 <= 0) goto L20
            r11 = 0
            return r11
        L20:
            java.lang.Object r1 = r10.j(r0, r5)
            if (r1 == 0) goto L27
            goto L20
        L27:
            r10.p(r0, r5, r11)
            r0 = 1
            long r3 = r3 + r0
            r10.r(r3)
            r11 = 1
            return r11
        L32:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r0 = "Null is not a valid element"
            r11.<init>(r0)
            throw r11
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.i
    public E peek() {
            r7 = this;
            long r0 = r7.u()
        L4:
            long r2 = r7.t()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 < 0) goto L19
            long r4 = r7.q()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L16
            r0 = 0
            return r0
        L16:
            r7.v(r4)
        L19:
            long r2 = r7.a(r2)
            java.lang.Object r2 = r7.g(r2)
            if (r2 == 0) goto L4
            return r2
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.i
    public E poll() {
            r8 = this;
            long r0 = r8.u()
        L4:
            long r2 = r8.t()
            r4 = 0
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 < 0) goto L19
            long r5 = r8.q()
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 < 0) goto L16
            return r4
        L16:
            r8.v(r5)
        L19:
            r5 = 1
            long r5 = r5 + r2
            boolean r5 = r8.s(r2, r5)
            if (r5 == 0) goto L4
            long r0 = r8.a(r2)
            E[] r2 = r8.r
            java.lang.Object r3 = r8.f(r2, r0)
            r8.n(r2, r0, r4)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, rx.internal.util.unsafe.i
    public int size() {
            r7 = this;
            long r0 = r7.t()
        L4:
            long r2 = r7.q()
            long r4 = r7.t()
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
