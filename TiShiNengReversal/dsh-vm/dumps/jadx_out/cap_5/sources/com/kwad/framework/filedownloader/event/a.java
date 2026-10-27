package com.kwad.framework.filedownloader.event;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a {
    private final java.util.concurrent.Executor aou;
    private final java.util.HashMap<java.lang.String, java.util.LinkedList<com.kwad.framework.filedownloader.event.c>> aov;


    public a() {
            r2 = this;
            r2.<init>()
            r0 = 10
            java.lang.String r1 = "EventPool"
            java.util.concurrent.ThreadPoolExecutor r0 = com.kwad.framework.filedownloader.f.b.r(r0, r1)
            r2.aou = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.aov = r0
            return
    }

    private static void a(java.util.LinkedList<com.kwad.framework.filedownloader.event.c> r3, com.kwad.framework.filedownloader.event.b r4) {
            java.lang.Object[] r3 = r3.toArray()
            int r0 = r3.length
            r1 = 0
        L6:
            if (r1 >= r0) goto L14
            r2 = r3[r1]
            if (r2 == 0) goto L11
            com.kwad.framework.filedownloader.event.c r2 = (com.kwad.framework.filedownloader.event.c) r2
            r2.a(r4)
        L11:
            int r1 = r1 + 1
            goto L6
        L14:
            java.lang.Runnable r3 = r4.aoA
            if (r3 == 0) goto L1b
            r3.run()
        L1b:
            return
    }

    public final boolean a(java.lang.String r4, com.kwad.framework.filedownloader.event.c r5) {
            r3 = this;
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD
            if (r0 == 0) goto Lf
            java.lang.String r0 = "setListener %s"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            com.kwad.framework.filedownloader.f.d.e(r3, r0, r1)
        Lf:
            if (r5 == 0) goto L4a
            java.util.HashMap<java.lang.String, java.util.LinkedList<com.kwad.framework.filedownloader.event.c>> r0 = r3.aov
            java.lang.Object r0 = r0.get(r4)
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            if (r0 != 0) goto L3c
            java.lang.String r1 = r4.intern()
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, java.util.LinkedList<com.kwad.framework.filedownloader.event.c>> r0 = r3.aov     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L36
            java.util.LinkedList r0 = (java.util.LinkedList) r0     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L38
            java.util.HashMap<java.lang.String, java.util.LinkedList<com.kwad.framework.filedownloader.event.c>> r0 = r3.aov     // Catch: java.lang.Throwable -> L36
            java.util.LinkedList r2 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L36
            r2.<init>()     // Catch: java.lang.Throwable -> L36
            r0.put(r4, r2)     // Catch: java.lang.Throwable -> L36
            r0 = r2
            goto L38
        L36:
            r4 = move-exception
            goto L3a
        L38:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L36
            goto L3c
        L3a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L36
            throw r4
        L3c:
            java.lang.String r4 = r4.intern()
            monitor-enter(r4)
            boolean r5 = r0.add(r5)     // Catch: java.lang.Throwable -> L47
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L47
            return r5
        L47:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L47
            throw r5
        L4a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "listener must not be null!"
            r4.<init>(r5)
            throw r4
    }

    public final boolean b(com.kwad.framework.filedownloader.event.b r6) {
            r5 = this;
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L13
            java.lang.String r0 = "publish %s"
            java.lang.String r3 = r6.getId()
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r1] = r3
            com.kwad.framework.filedownloader.f.d.e(r5, r0, r4)
        L13:
            if (r6 == 0) goto L4c
            java.lang.String r0 = r6.getId()
            java.util.HashMap<java.lang.String, java.util.LinkedList<com.kwad.framework.filedownloader.event.c>> r3 = r5.aov
            java.lang.Object r3 = r3.get(r0)
            java.util.LinkedList r3 = (java.util.LinkedList) r3
            if (r3 != 0) goto L48
            java.lang.String r4 = r0.intern()
            monitor-enter(r4)
            java.util.HashMap<java.lang.String, java.util.LinkedList<com.kwad.framework.filedownloader.event.c>> r3 = r5.aov     // Catch: java.lang.Throwable -> L40
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L40
            java.util.LinkedList r3 = (java.util.LinkedList) r3     // Catch: java.lang.Throwable -> L40
            if (r3 != 0) goto L44
            boolean r6 = com.kwad.framework.filedownloader.f.d.apD     // Catch: java.lang.Throwable -> L40
            if (r6 == 0) goto L42
            java.lang.String r6 = "No listener for this event %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L40
            r2[r1] = r0     // Catch: java.lang.Throwable -> L40
            com.kwad.framework.filedownloader.f.d.c(r5, r6, r2)     // Catch: java.lang.Throwable -> L40
            goto L42
        L40:
            r6 = move-exception
            goto L46
        L42:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L40
            return r1
        L44:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L40
            goto L48
        L46:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L40
            throw r6
        L48:
            a(r3, r6)
            return r2
        L4c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "event must not be null!"
            r6.<init>(r0)
            throw r6
    }

    public final void c(com.kwad.framework.filedownloader.event.b r4) {
            r3 = this;
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD
            if (r0 == 0) goto L13
            java.lang.String r0 = r4.getId()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "asyncPublishInNewThread %s"
            com.kwad.framework.filedownloader.f.d.e(r3, r0, r1)
        L13:
            java.util.concurrent.Executor r0 = r3.aou
            com.kwad.framework.filedownloader.event.a$1 r1 = new com.kwad.framework.filedownloader.event.a$1
            r1.<init>(r3, r4)
            r0.execute(r1)
            return
    }
}
