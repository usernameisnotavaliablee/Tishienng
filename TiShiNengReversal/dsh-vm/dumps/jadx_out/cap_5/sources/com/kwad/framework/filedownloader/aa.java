package com.kwad.framework.filedownloader;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class aa implements com.kwad.framework.filedownloader.message.e.b {
    public aa() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean a(java.util.List<com.kwad.framework.filedownloader.a.InterfaceC0110a> r3, com.kwad.framework.filedownloader.message.MessageSnapshot r4) {
            int r0 = r3.size()
            r1 = 1
            if (r0 <= r1) goto L29
            byte r0 = r4.wJ()
            r2 = -3
            if (r0 != r2) goto L29
            java.util.Iterator r0 = r3.iterator()
        L12:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.next()
            com.kwad.framework.filedownloader.a$a r2 = (com.kwad.framework.filedownloader.a.InterfaceC0110a) r2
            com.kwad.framework.filedownloader.x$a r2 = r2.wS()
            boolean r2 = r2.c(r4)
            if (r2 == 0) goto L12
            return r1
        L29:
            java.util.Iterator r0 = r3.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r0.next()
            com.kwad.framework.filedownloader.a$a r2 = (com.kwad.framework.filedownloader.a.InterfaceC0110a) r2
            com.kwad.framework.filedownloader.x$a r2 = r2.wS()
            boolean r2 = r2.b(r4)
            if (r2 == 0) goto L2d
            return r1
        L44:
            r0 = -4
            byte r2 = r4.wJ()
            if (r0 != r2) goto L66
            java.util.Iterator r0 = r3.iterator()
        L4f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L66
            java.lang.Object r2 = r0.next()
            com.kwad.framework.filedownloader.a$a r2 = (com.kwad.framework.filedownloader.a.InterfaceC0110a) r2
            com.kwad.framework.filedownloader.x$a r2 = r2.wS()
            boolean r2 = r2.d(r4)
            if (r2 == 0) goto L4f
            return r1
        L66:
            int r0 = r3.size()
            r2 = 0
            if (r0 != r1) goto L7c
            java.lang.Object r3 = r3.get(r2)
            com.kwad.framework.filedownloader.a$a r3 = (com.kwad.framework.filedownloader.a.InterfaceC0110a) r3
            com.kwad.framework.filedownloader.x$a r3 = r3.wS()
            boolean r3 = r3.a(r4)
            return r3
        L7c:
            return r2
    }

    @Override // com.kwad.framework.filedownloader.message.e.b
    public final void r(com.kwad.framework.filedownloader.message.MessageSnapshot r11) {
            r10 = this;
            int r0 = r11.getId()
            java.lang.String r0 = java.lang.Integer.toString(r0)
            java.lang.String r0 = r0.intern()
            monitor-enter(r0)
            com.kwad.framework.filedownloader.h r1 = com.kwad.framework.filedownloader.h.xp()     // Catch: java.lang.Throwable -> L62
            int r2 = r11.getId()     // Catch: java.lang.Throwable -> L62
            java.util.List r1 = r1.bt(r2)     // Catch: java.lang.Throwable -> L62
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L62
            r3 = 1
            r4 = 0
            if (r2 <= 0) goto Lc4
            java.lang.Object r2 = r1.get(r4)     // Catch: java.lang.Throwable -> L62
            com.kwad.framework.filedownloader.a$a r2 = (com.kwad.framework.filedownloader.a.InterfaceC0110a) r2     // Catch: java.lang.Throwable -> L62
            com.kwad.framework.filedownloader.a r2 = r2.wR()     // Catch: java.lang.Throwable -> L62
            boolean r5 = com.kwad.framework.filedownloader.f.d.apD     // Catch: java.lang.Throwable -> L62
            if (r5 == 0) goto L64
            java.lang.String r5 = "~~~callback %s old[%s] new[%s] %d"
            int r6 = r11.getId()     // Catch: java.lang.Throwable -> L62
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L62
            byte r2 = r2.wJ()     // Catch: java.lang.Throwable -> L62
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)     // Catch: java.lang.Throwable -> L62
            byte r7 = r11.wJ()     // Catch: java.lang.Throwable -> L62
            java.lang.Byte r7 = java.lang.Byte.valueOf(r7)     // Catch: java.lang.Throwable -> L62
            int r8 = r1.size()     // Catch: java.lang.Throwable -> L62
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L62
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L62
            r9[r4] = r6     // Catch: java.lang.Throwable -> L62
            r9[r3] = r2     // Catch: java.lang.Throwable -> L62
            r2 = 2
            r9[r2] = r7     // Catch: java.lang.Throwable -> L62
            r2 = 3
            r9[r2] = r8     // Catch: java.lang.Throwable -> L62
            com.kwad.framework.filedownloader.f.d.c(r10, r5, r9)     // Catch: java.lang.Throwable -> L62
            goto L64
        L62:
            r11 = move-exception
            goto Ld7
        L64:
            boolean r2 = a(r1, r11)     // Catch: java.lang.Throwable -> L62
            if (r2 != 0) goto Ld5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = "The event isn't consumed, id:"
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L62
            int r5 = r11.getId()     // Catch: java.lang.Throwable -> L62
            r3.append(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = " status:"
            r3.append(r5)     // Catch: java.lang.Throwable -> L62
            byte r11 = r11.wJ()     // Catch: java.lang.Throwable -> L62
            r3.append(r11)     // Catch: java.lang.Throwable -> L62
            java.lang.String r11 = " task-count:"
            r3.append(r11)     // Catch: java.lang.Throwable -> L62
            int r11 = r1.size()     // Catch: java.lang.Throwable -> L62
            r3.append(r11)     // Catch: java.lang.Throwable -> L62
            java.lang.String r11 = r3.toString()     // Catch: java.lang.Throwable -> L62
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L62
            java.util.Iterator r11 = r1.iterator()     // Catch: java.lang.Throwable -> L62
        L9d:
            boolean r1 = r11.hasNext()     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto Lba
            java.lang.Object r1 = r11.next()     // Catch: java.lang.Throwable -> L62
            com.kwad.framework.filedownloader.a$a r1 = (com.kwad.framework.filedownloader.a.InterfaceC0110a) r1     // Catch: java.lang.Throwable -> L62
            java.lang.String r3 = " | "
            r2.append(r3)     // Catch: java.lang.Throwable -> L62
            com.kwad.framework.filedownloader.a r1 = r1.wR()     // Catch: java.lang.Throwable -> L62
            byte r1 = r1.wJ()     // Catch: java.lang.Throwable -> L62
            r2.append(r1)     // Catch: java.lang.Throwable -> L62
            goto L9d
        Lba:
            java.lang.String r11 = r2.toString()     // Catch: java.lang.Throwable -> L62
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L62
            com.kwad.framework.filedownloader.f.d.b(r10, r11, r1)     // Catch: java.lang.Throwable -> L62
            goto Ld5
        Lc4:
            java.lang.String r1 = "Receive the event %d, but there isn't any running task in the upper layer"
            byte r11 = r11.wJ()     // Catch: java.lang.Throwable -> L62
            java.lang.Byte r11 = java.lang.Byte.valueOf(r11)     // Catch: java.lang.Throwable -> L62
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L62
            r2[r4] = r11     // Catch: java.lang.Throwable -> L62
            com.kwad.framework.filedownloader.f.d.b(r10, r1, r2)     // Catch: java.lang.Throwable -> L62
        Ld5:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            return
        Ld7:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            throw r11
    }
}
