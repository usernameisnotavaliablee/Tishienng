package com.kwad.components.core.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class e implements com.kwad.components.core.c.i {
    private static volatile com.kwad.components.core.c.e NE;

    @androidx.annotation.Nullable
    private java.lang.String NF;
    private int NG;
    private long NH;
    private int cacheSize;
    private boolean enable;

    private e() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.NG = r0
            r1 = 1
            r3.cacheSize = r1
            r1 = 1800(0x708, double:8.893E-321)
            r3.NH = r1
            r3.enable = r0
            return
    }

    private e(long r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.NG = r0
            r1 = 1
            r3.cacheSize = r1
            r1 = 1800(0x708, double:8.893E-321)
            r3.NH = r1
            r3.enable = r0
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3.NF = r4
            return
    }

    public static synchronized java.util.List<com.kwad.components.core.c.e> a(android.database.Cursor r3) {
            java.lang.Class<com.kwad.components.core.c.e> r0 = com.kwad.components.core.c.e.class
            monitor-enter(r0)
            if (r3 != 0) goto L8
            monitor-exit(r0)
            r3 = 0
            return r3
        L8:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1b
            r1.<init>()     // Catch: java.lang.Throwable -> L1b
        Ld:
            boolean r2 = r3.moveToNext()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L22
            com.kwad.components.core.c.e r2 = b(r3)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            r1.add(r2)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            goto Ld
        L1b:
            r3 = move-exception
            goto L24
        L1d:
            r2 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r2)     // Catch: java.lang.Throwable -> L1b
            goto Ld
        L22:
            monitor-exit(r0)
            return r1
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r3
    }

    public static com.kwad.components.core.c.e au(com.kwad.sdk.core.response.model.AdTemplate r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            long r0 = r3.posId
            com.kwad.sdk.core.response.model.AdInfo r3 = com.kwad.sdk.core.response.b.e.el(r3)
            com.kwad.components.core.c.e r2 = new com.kwad.components.core.c.e
            r2.<init>(r0)
            com.kwad.sdk.core.response.model.AdInfo$AdBaseInfo r3 = r3.adBaseInfo
            int r0 = r3.adCacheStrategy
            r2.NG = r0
            long r0 = r3.adCacheSecond
            r2.NH = r0
            int r0 = r3.adCacheSize
            r2.cacheSize = r0
            int r3 = r3.adCacheSwitch
            r0 = 1
            if (r3 != r0) goto L23
            goto L24
        L23:
            r0 = 0
        L24:
            r2.enable = r0
            return r2
    }

    private static synchronized com.kwad.components.core.c.e b(android.database.Cursor r7) {
            java.lang.Class<com.kwad.components.core.c.e> r0 = com.kwad.components.core.c.e.class
            monitor-enter(r0)
            java.lang.String r1 = "posId"
            int r1 = r7.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = r7.getString(r1)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r2 = "strategyCode"
            int r2 = r7.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L4b
            int r2 = r7.getInt(r2)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r3 = "cacheSize"
            int r3 = r7.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L4b
            int r3 = r7.getInt(r3)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r4 = "cacheSecond"
            int r4 = r7.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L4b
            long r4 = r7.getLong(r4)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r6 = "enable"
            int r6 = r7.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L4b
            int r7 = r7.getInt(r6)     // Catch: java.lang.Throwable -> L4b
            r6 = 1
            if (r7 != r6) goto L39
            goto L3a
        L39:
            r6 = 0
        L3a:
            com.kwad.components.core.c.e r7 = new com.kwad.components.core.c.e     // Catch: java.lang.Throwable -> L4b
            r7.<init>()     // Catch: java.lang.Throwable -> L4b
            r7.NF = r1     // Catch: java.lang.Throwable -> L4b
            r7.NG = r2     // Catch: java.lang.Throwable -> L4b
            r7.cacheSize = r3     // Catch: java.lang.Throwable -> L4b
            r7.NH = r4     // Catch: java.lang.Throwable -> L4b
            r7.enable = r6     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r0)
            return r7
        L4b:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4b
            throw r7
    }

    @androidx.annotation.NonNull
    private static com.kwad.components.core.c.e of() {
            com.kwad.components.core.c.e r0 = com.kwad.components.core.c.e.NE
            if (r0 != 0) goto L19
            java.lang.Class<com.kwad.components.core.c.e> r0 = com.kwad.components.core.c.e.class
            monitor-enter(r0)
            com.kwad.components.core.c.e r1 = com.kwad.components.core.c.e.NE     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.kwad.components.core.c.e r1 = new com.kwad.components.core.c.e     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.kwad.components.core.c.e.NE = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.kwad.components.core.c.e r0 = com.kwad.components.core.c.e.NE
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.WorkerThread
    public static com.kwad.components.core.c.e x(long r1) {
            com.kwad.components.core.c.a r0 = com.kwad.components.core.c.a.nZ()
            if (r0 == 0) goto L15
            com.kwad.components.core.c.a r0 = com.kwad.components.core.c.a.nZ()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            com.kwad.components.core.c.e r1 = r0.ad(r1)
            if (r1 == 0) goto L15
            return r1
        L15:
            com.kwad.components.core.c.e r1 = of()
            return r1
    }

    public final boolean isDefault() {
            r1 = this;
            com.kwad.components.core.c.e r0 = of()
            boolean r0 = r1.equals(r0)
            return r0
    }

    public final boolean isEnable() {
            r1 = this;
            boolean r0 = r1.enable
            return r0
    }

    public final java.lang.String og() {
            r1 = this;
            java.lang.String r0 = r1.NF
            return r0
    }

    public final int oh() {
            r1 = this;
            int r0 = r1.NG
            return r0
    }

    public final int oi() {
            r1 = this;
            int r0 = r1.cacheSize
            return r0
    }

    public final long oj() {
            r2 = this;
            long r0 = r2.NH
            return r0
    }

    @Override // com.kwad.components.core.c.i
    public final android.content.ContentValues ok() {
            r3 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "posId"
            java.lang.String r2 = r3.NF
            r0.put(r1, r2)
            int r1 = r3.NG
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "strategyCode"
            r0.put(r2, r1)
            int r1 = r3.cacheSize
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "cacheSize"
            r0.put(r2, r1)
            long r1 = r3.NH
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cacheSecond"
            r0.put(r2, r1)
            boolean r1 = r3.enable
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "enable"
            r0.put(r2, r1)
            return r0
    }
}
