package com.umeng.commonsdk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UMConfigureImpl {
    private static java.lang.String a = null;
    private static java.util.concurrent.CopyOnWriteArrayList<com.umeng.commonsdk.utils.onMessageSendListener> b = null;
    private static int c = 0;
    private static boolean d = false;
    private static final int e = 1000;
    private static java.util.concurrent.ScheduledExecutorService f;
    private static android.content.Context g;
    private static int h;
    private static java.lang.Runnable i;


    static {
            com.umeng.analytics.pro.au r0 = com.umeng.analytics.pro.au.b()
            java.lang.String r1 = "dtfn"
            java.lang.String r0 = r0.b(r1)
            com.umeng.commonsdk.UMConfigureImpl.a = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            com.umeng.commonsdk.UMConfigureImpl.b = r0
            r0 = 0
            com.umeng.commonsdk.UMConfigureImpl.c = r0
            com.umeng.commonsdk.UMConfigureImpl.d = r0
            com.umeng.commonsdk.UMConfigureImpl.h = r0
            com.umeng.commonsdk.UMConfigureImpl$1 r0 = new com.umeng.commonsdk.UMConfigureImpl$1
            r0.<init>()
            com.umeng.commonsdk.UMConfigureImpl.i = r0
            return
    }

    public UMConfigureImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ int a() {
            int r0 = com.umeng.commonsdk.UMConfigureImpl.c
            return r0
    }

    static /* synthetic */ java.util.concurrent.ScheduledExecutorService a(java.util.concurrent.ScheduledExecutorService r0) {
            com.umeng.commonsdk.UMConfigureImpl.f = r0
            return r0
    }

    static /* synthetic */ void a(android.content.Context r0) {
            b(r0)
            return
    }

    static /* synthetic */ boolean a(boolean r0) {
            com.umeng.commonsdk.UMConfigureImpl.d = r0
            return r0
    }

    static /* synthetic */ int b() {
            int r0 = com.umeng.commonsdk.UMConfigureImpl.h
            return r0
    }

    private static synchronized void b(android.content.Context r2) {
            java.lang.Class<com.umeng.commonsdk.UMConfigureImpl> r2 = com.umeng.commonsdk.UMConfigureImpl.class
            monitor-enter(r2)
            r0 = 1
            com.umeng.commonsdk.framework.UMEnvelopeBuild.setTransmissionSendFlag(r0)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2a
            java.util.concurrent.CopyOnWriteArrayList<com.umeng.commonsdk.utils.onMessageSendListener> r0 = com.umeng.commonsdk.UMConfigureImpl.b     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2a
            if (r0 == 0) goto L2a
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2a
            if (r0 <= 0) goto L2a
            java.util.concurrent.CopyOnWriteArrayList<com.umeng.commonsdk.utils.onMessageSendListener> r0 = com.umeng.commonsdk.UMConfigureImpl.b     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2a
        L17:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2a
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2a
            com.umeng.commonsdk.utils.onMessageSendListener r1 = (com.umeng.commonsdk.utils.onMessageSendListener) r1     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2a
            r1.onMessageSend()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2a
            goto L17
        L27:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            throw r0
        L2a:
            monitor-exit(r2)
            return
    }

    private static void c(android.content.Context r2) {
            java.lang.String r0 = com.umeng.commonsdk.UMConfigureImpl.a     // Catch: java.lang.Throwable -> L16
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L16
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = com.umeng.commonsdk.UMConfigureImpl.a     // Catch: java.lang.Throwable -> L16
            r1 = 1
            r2.putBoolean(r0, r1)     // Catch: java.lang.Throwable -> L16
            r2.commit()     // Catch: java.lang.Throwable -> L16
        L16:
            return
    }

    static /* synthetic */ boolean c() {
            boolean r0 = com.umeng.commonsdk.UMConfigureImpl.d
            return r0
    }

    static /* synthetic */ android.content.Context d() {
            android.content.Context r0 = com.umeng.commonsdk.UMConfigureImpl.g
            return r0
    }

    private static boolean d(android.content.Context r2) {
            r0 = 0
            java.lang.String r1 = com.umeng.commonsdk.UMConfigureImpl.a     // Catch: java.lang.Throwable -> L10
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r1, r0)     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L10
            java.lang.String r1 = com.umeng.commonsdk.UMConfigureImpl.a     // Catch: java.lang.Throwable -> L10
            boolean r2 = r2.getBoolean(r1, r0)     // Catch: java.lang.Throwable -> L10
            return r2
        L10:
            return r0
    }

    static /* synthetic */ java.util.concurrent.ScheduledExecutorService e() {
            java.util.concurrent.ScheduledExecutorService r0 = com.umeng.commonsdk.UMConfigureImpl.f
            return r0
    }

    static /* synthetic */ int f() {
            int r0 = com.umeng.commonsdk.UMConfigureImpl.h
            int r1 = r0 + 1
            com.umeng.commonsdk.UMConfigureImpl.h = r1
            return r0
    }

    public static void init(android.content.Context r9) {
            if (r9 != 0) goto L3
            goto L34
        L3:
            com.umeng.commonsdk.UMConfigureImpl.g = r9
            int r0 = com.umeng.commonsdk.UMConfigureImpl.c     // Catch: java.lang.Exception -> L34
            r1 = 1
            if (r0 < r1) goto L31
            boolean r0 = d(r9)     // Catch: java.lang.Exception -> L34
            if (r0 != 0) goto L2d
            r0 = 0
            com.umeng.commonsdk.framework.UMEnvelopeBuild.setTransmissionSendFlag(r0)     // Catch: java.lang.Exception -> L34
            c(r9)     // Catch: java.lang.Exception -> L34
            java.util.concurrent.ScheduledExecutorService r9 = com.umeng.commonsdk.UMConfigureImpl.f     // Catch: java.lang.Exception -> L34
            if (r9 != 0) goto L34
            java.util.concurrent.ScheduledExecutorService r2 = java.util.concurrent.Executors.newScheduledThreadPool(r1)     // Catch: java.lang.Exception -> L34
            com.umeng.commonsdk.UMConfigureImpl.f = r2     // Catch: java.lang.Exception -> L34
            java.lang.Runnable r3 = com.umeng.commonsdk.UMConfigureImpl.i     // Catch: java.lang.Exception -> L34
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L34
            r4 = 0
            r6 = 100
            r2.scheduleAtFixedRate(r3, r4, r6, r8)     // Catch: java.lang.Exception -> L34
            return
        L2d:
            com.umeng.commonsdk.framework.UMEnvelopeBuild.setTransmissionSendFlag(r1)     // Catch: java.lang.Exception -> L34
            return
        L31:
            com.umeng.commonsdk.framework.UMEnvelopeBuild.setTransmissionSendFlag(r1)     // Catch: java.lang.Exception -> L34
        L34:
            return
    }

    public static synchronized void registerInterruptFlag() {
            java.lang.Class<com.umeng.commonsdk.UMConfigureImpl> r0 = com.umeng.commonsdk.UMConfigureImpl.class
            monitor-enter(r0)
            int r1 = com.umeng.commonsdk.UMConfigureImpl.c     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            int r1 = r1 + 1
            com.umeng.commonsdk.UMConfigureImpl.c = r1     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            goto Ld
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
        Ld:
            monitor-exit(r0)
            return
    }

    public static synchronized void registerMessageSendListener(com.umeng.commonsdk.utils.onMessageSendListener r2) {
            java.lang.Class<com.umeng.commonsdk.UMConfigureImpl> r0 = com.umeng.commonsdk.UMConfigureImpl.class
            monitor-enter(r0)
            java.util.concurrent.CopyOnWriteArrayList<com.umeng.commonsdk.utils.onMessageSendListener> r1 = com.umeng.commonsdk.UMConfigureImpl.b     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L35
            if (r1 == 0) goto Ld
            r1.add(r2)     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L35
            goto Ld
        Lb:
            r2 = move-exception
            goto L33
        Ld:
            boolean r2 = com.umeng.commonsdk.framework.UMEnvelopeBuild.getTransmissionSendFlag()     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L35
            if (r2 == 0) goto L35
            java.util.concurrent.CopyOnWriteArrayList<com.umeng.commonsdk.utils.onMessageSendListener> r2 = com.umeng.commonsdk.UMConfigureImpl.b     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L35
            if (r2 == 0) goto L35
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L35
            if (r2 <= 0) goto L35
            java.util.concurrent.CopyOnWriteArrayList<com.umeng.commonsdk.utils.onMessageSendListener> r2 = com.umeng.commonsdk.UMConfigureImpl.b     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L35
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L35
        L23:
            boolean r1 = r2.hasNext()     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L35
            if (r1 == 0) goto L35
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L35
            com.umeng.commonsdk.utils.onMessageSendListener r1 = (com.umeng.commonsdk.utils.onMessageSendListener) r1     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L35
            r1.onMessageSend()     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L35
            goto L23
        L33:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r2
        L35:
            monitor-exit(r0)
            return
    }

    public static synchronized void removeInterruptFlag() {
            java.lang.Class<com.umeng.commonsdk.UMConfigureImpl> r0 = com.umeng.commonsdk.UMConfigureImpl.class
            monitor-enter(r0)
            int r1 = com.umeng.commonsdk.UMConfigureImpl.c     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            int r1 = r1 + (-1)
            com.umeng.commonsdk.UMConfigureImpl.c = r1     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            goto Ld
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
        Ld:
            monitor-exit(r0)
            return
    }

    public static synchronized void removeMessageSendListener(com.umeng.commonsdk.utils.onMessageSendListener r2) {
            java.lang.Class<com.umeng.commonsdk.UMConfigureImpl> r0 = com.umeng.commonsdk.UMConfigureImpl.class
            monitor-enter(r0)
            java.util.concurrent.CopyOnWriteArrayList<com.umeng.commonsdk.utils.onMessageSendListener> r1 = com.umeng.commonsdk.UMConfigureImpl.b     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> Le
            if (r1 == 0) goto Le
            r1.remove(r2)     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> Le
            goto Le
        Lb:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r2
        Le:
            monitor-exit(r0)
            return
    }
}
