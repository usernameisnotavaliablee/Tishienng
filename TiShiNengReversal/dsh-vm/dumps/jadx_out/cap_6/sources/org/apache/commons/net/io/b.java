package org.apache.commons.net.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b implements org.apache.commons.net.io.c {
    private final org.apache.commons.net.util.ListenerList a;

    public b() {
            r1 = this;
            r1.<init>()
            org.apache.commons.net.util.ListenerList r0 = new org.apache.commons.net.util.ListenerList
            r0.<init>()
            r1.a = r0
            return
    }

    @Override // org.apache.commons.net.io.c
    public void a(org.apache.commons.net.io.CopyStreamEvent r3) {
            r2 = this;
            org.apache.commons.net.util.ListenerList r0 = r2.a
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            java.util.EventListener r1 = (java.util.EventListener) r1
            org.apache.commons.net.io.c r1 = (org.apache.commons.net.io.c) r1
            r1.a(r3)
            goto L6
        L18:
            return
    }

    @Override // org.apache.commons.net.io.c
    public void c(long r9, int r11, long r12) {
            r8 = this;
            org.apache.commons.net.util.ListenerList r0 = r8.a
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            java.util.EventListener r1 = (java.util.EventListener) r1
            r2 = r1
            org.apache.commons.net.io.c r2 = (org.apache.commons.net.io.c) r2
            r3 = r9
            r5 = r11
            r6 = r12
            r2.c(r3, r5, r6)
            goto L6
        L1c:
            return
    }

    public void e(org.apache.commons.net.io.c r2) {
            r1 = this;
            org.apache.commons.net.util.ListenerList r0 = r1.a
            r0.addListener(r2)
            return
    }

    public void f(org.apache.commons.net.io.c r2) {
            r1 = this;
            org.apache.commons.net.util.ListenerList r0 = r1.a
            r0.removeListener(r2)
            return
    }
}
