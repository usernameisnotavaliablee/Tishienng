package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class o4 extends com.acse.ottn.r4 {
    public com.acse.ottn.o4.a N;
    public long O;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(com.acse.ottn.o4 r1, long r2, long r4);
    }

    public o4() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.O = r0
            return
    }

    @Override // com.acse.ottn.r4
    public void D() {
            r0 = this;
            return
    }

    @Override // com.acse.ottn.r4
    public void a(float r1) {
            r0 = this;
            return
    }

    public void a(com.acse.ottn.o4.a r1) {
            r0 = this;
            r0.N = r1
            return
    }

    @Override // com.acse.ottn.r4
    public boolean c(long r12) {
            r11 = this;
            int r0 = r11.f2626i
            r1 = 0
            if (r0 != 0) goto L1a
            r0 = 1
            r11.f2626i = r0
            long r3 = r11.f2620c
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L12
            r11.f2619b = r12
            goto L1a
        L12:
            long r3 = r12 - r3
            r11.f2619b = r3
            r3 = -1
            r11.f2620c = r3
        L1a:
            com.acse.ottn.o4$a r5 = r11.N
            if (r5 == 0) goto L33
            long r3 = r11.f2619b
            long r7 = r12 - r3
            long r3 = r11.O
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L2a
        L28:
            r9 = r1
            goto L2d
        L2a:
            long r1 = r12 - r3
            goto L28
        L2d:
            r11.O = r12
            r6 = r11
            r5.a(r6, r7, r9)
        L33:
            r12 = 0
            return r12
    }
}
