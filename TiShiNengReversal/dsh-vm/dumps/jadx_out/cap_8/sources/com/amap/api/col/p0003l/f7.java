package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f7 {
    static java.lang.ref.WeakReference<com.amap.api.col.p0003l.d7> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements java.lang.Runnable {
        final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.content.Context f3295b;

        a(java.lang.String r1, android.content.Context r2) {
                r0 = this;
                r0.a = r1
                r0.f3295b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r9 = this;
                java.lang.Class<com.amap.api.col.3l.f7> r1 = com.amap.api.col.p0003l.f7.class
                monitor-enter(r1)
                java.lang.String r0 = r9.a     // Catch: java.lang.Throwable -> L37
                byte[] r0 = com.amap.api.col.p0003l.q4.o(r0)     // Catch: java.lang.Throwable -> L37
                java.lang.String r0 = com.amap.api.col.p0003l.m4.b(r0)     // Catch: java.lang.Throwable -> L37
                java.lang.ref.WeakReference<com.amap.api.col.3l.d7> r2 = com.amap.api.col.p0003l.f7.a     // Catch: java.lang.Throwable -> L37
                com.amap.api.col.3l.d7 r4 = com.amap.api.col.p0003l.k7.a(r2)     // Catch: java.lang.Throwable -> L37
                android.content.Context r3 = r9.f3295b     // Catch: java.lang.Throwable -> L37
                java.lang.String r5 = com.amap.api.col.p0003l.s5.f3970j     // Catch: java.lang.Throwable -> L37
                java.lang.String r8 = "10"
                r6 = 50
                r7 = 102400(0x19000, float:1.43493E-40)
                com.amap.api.col.p0003l.k7.f(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L37
                com.amap.api.col.3l.l6 r2 = r4.f3150e     // Catch: java.lang.Throwable -> L37
                if (r2 != 0) goto L39
                com.amap.api.col.3l.k6 r2 = new com.amap.api.col.3l.k6     // Catch: java.lang.Throwable -> L37
                com.amap.api.col.3l.n6 r3 = new com.amap.api.col.3l.n6     // Catch: java.lang.Throwable -> L37
                com.amap.api.col.3l.m6 r5 = new com.amap.api.col.3l.m6     // Catch: java.lang.Throwable -> L37
                r5.<init>()     // Catch: java.lang.Throwable -> L37
                r3.<init>(r5)     // Catch: java.lang.Throwable -> L37
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L37
                r4.f3150e = r2     // Catch: java.lang.Throwable -> L37
                goto L39
            L37:
                r0 = move-exception
                goto L63
            L39:
                long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L37
                java.lang.String r5 = "yyyyMMdd HH:mm:ss"
                java.lang.String r2 = com.amap.api.col.p0003l.q4.c(r2, r5)     // Catch: java.lang.Throwable -> L37
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
                java.lang.String r5 = " \"timestamp\":\""
                r3.<init>(r5)     // Catch: java.lang.Throwable -> L37
                r3.append(r2)     // Catch: java.lang.Throwable -> L37
                java.lang.String r2 = "\",\"details\":"
                r3.append(r2)     // Catch: java.lang.Throwable -> L37
                java.lang.String r2 = r9.a     // Catch: java.lang.Throwable -> L37
                r3.append(r2)     // Catch: java.lang.Throwable -> L37
                java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L37
                byte[] r2 = com.amap.api.col.p0003l.q4.o(r2)     // Catch: java.lang.Throwable -> L37
                com.amap.api.col.p0003l.e7.c(r0, r2, r4)     // Catch: java.lang.Throwable -> L37
                goto L6a
            L63:
                java.lang.String r2 = "mam"
                java.lang.String r3 = "ap"
                com.amap.api.col.p0003l.w5.p(r0, r2, r3)     // Catch: java.lang.Throwable -> L6c
            L6a:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L6c
                return
            L6c:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L6c
                throw r0
        }
    }

    public f7() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(java.lang.String r2, android.content.Context r3) {
            java.util.concurrent.ExecutorService r0 = com.amap.api.col.p0003l.w5.r()
            com.amap.api.col.3l.f7$a r1 = new com.amap.api.col.3l.f7$a
            r1.<init>(r2, r3)
            r0.submit(r1)
            return
    }
}
