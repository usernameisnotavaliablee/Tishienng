package com.bykv.vk.openvk.component.video.j.xt.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw {
    private static volatile com.bykv.vk.openvk.component.video.j.xt.xt.cw xt;
    private final com.bykv.vk.openvk.component.video.j.xt.xt.r cw;
    private final android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.j.xt.xt.j>> j;

    /* renamed from: r, reason: collision with root package name */
    private final java.util.concurrent.Executor f1732r;
    private volatile android.database.sqlite.SQLiteStatement up;




    private cw(android.content.Context r11) {
            r10 = this;
            r10.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r1 = 2
            r0.<init>(r1)
            r10.j = r0
            com.bytedance.sdk.component.oq.r.r r2 = new com.bytedance.sdk.component.oq.r.r
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingDeque r8 = new java.util.concurrent.LinkedBlockingDeque
            r8.<init>()
            com.bytedance.sdk.component.oq.oq r9 = new com.bytedance.sdk.component.oq.oq
            r1 = 5
            java.lang.String r3 = "video_proxy_db"
            r9.<init>(r1, r3)
            r3 = 0
            r4 = 1
            r5 = 60
            r2.<init>(r3, r4, r5, r7, r8, r9)
            r10.f1732r = r2
            com.bykv.vk.openvk.component.video.j.xt.xt.r r1 = new com.bykv.vk.openvk.component.video.j.xt.xt.r
            android.content.Context r11 = r11.getApplicationContext()
            android.content.Context r11 = com.stub.StubApp.getOrigApplicationContext(r11)
            r1.<init>(r11)
            r10.cw = r1
            java.util.concurrent.ConcurrentHashMap r11 = new java.util.concurrent.ConcurrentHashMap
            r11.<init>()
            r1 = 0
            r0.put(r1, r11)
            java.util.concurrent.ConcurrentHashMap r11 = new java.util.concurrent.ConcurrentHashMap
            r11.<init>()
            r1 = 1
            r0.put(r1, r11)
            return
    }

    static /* synthetic */ android.database.sqlite.SQLiteStatement j(com.bykv.vk.openvk.component.video.j.xt.xt.cw r0) {
            android.database.sqlite.SQLiteStatement r0 = r0.up
            return r0
    }

    static /* synthetic */ android.database.sqlite.SQLiteStatement j(com.bykv.vk.openvk.component.video.j.xt.xt.cw r0, android.database.sqlite.SQLiteStatement r1) {
            r0.up = r1
            return r1
    }

    public static com.bykv.vk.openvk.component.video.j.xt.xt.cw j(android.content.Context r2) {
            com.bykv.vk.openvk.component.video.j.xt.xt.cw r0 = com.bykv.vk.openvk.component.video.j.xt.xt.cw.xt
            if (r0 != 0) goto L19
            java.lang.Class<com.bykv.vk.openvk.component.video.j.xt.xt.cw> r0 = com.bykv.vk.openvk.component.video.j.xt.xt.cw.class
            monitor-enter(r0)
            com.bykv.vk.openvk.component.video.j.xt.xt.cw r1 = com.bykv.vk.openvk.component.video.j.xt.xt.cw.xt     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bykv.vk.openvk.component.video.j.xt.xt.cw r1 = new com.bykv.vk.openvk.component.video.j.xt.xt.cw     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            com.bykv.vk.openvk.component.video.j.xt.xt.cw.xt = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            com.bykv.vk.openvk.component.video.j.xt.xt.cw r2 = com.bykv.vk.openvk.component.video.j.xt.xt.cw.xt
            return r2
    }

    static /* synthetic */ com.bykv.vk.openvk.component.video.j.xt.xt.r xt(com.bykv.vk.openvk.component.video.j.xt.xt.cw r0) {
            com.bykv.vk.openvk.component.video.j.xt.xt.r r0 = r0.cw
            return r0
    }

    private java.lang.String xt(int r4) {
            r3 = this;
            if (r4 > 0) goto L5
            java.lang.String r4 = ""
            return r4
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4 << 1
            r0.<init>(r1)
            java.lang.String r1 = "?"
            r0.append(r1)
            r1 = 1
        L12:
            if (r1 >= r4) goto L1c
            java.lang.String r2 = ",?"
            r0.append(r2)
            int r1 = r1 + 1
            goto L12
        L1c:
            java.lang.String r4 = r0.toString()
            return r4
    }

    public void delete(java.lang.String r3, int r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L1d
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.j.xt.xt.j>> r0 = r2.j
            java.lang.Object r0 = r0.get(r4)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L13
            r0.remove(r3)
        L13:
            java.util.concurrent.Executor r0 = r2.f1732r
            com.bykv.vk.openvk.component.video.j.xt.xt.cw$2 r1 = new com.bykv.vk.openvk.component.video.j.xt.xt.cw$2
            r1.<init>(r2, r3, r4)
            r0.execute(r1)
        L1d:
            return
    }

    public void insert(com.bykv.vk.openvk.component.video.j.xt.xt.j r3) {
            r2 = this;
            if (r3 == 0) goto L1d
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.j.xt.xt.j>> r0 = r2.j
            int r1 = r3.f1733r
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L13
            java.lang.String r1 = r3.j
            r0.put(r1, r3)
        L13:
            java.util.concurrent.Executor r0 = r2.f1732r
            com.bykv.vk.openvk.component.video.j.xt.xt.cw$1 r1 = new com.bykv.vk.openvk.component.video.j.xt.xt.cw$1
            r1.<init>(r2, r3)
            r0.execute(r1)
        L1d:
            return
    }

    public void j(int r3) {
            r2 = this;
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.j.xt.xt.j>> r0 = r2.j
            java.lang.Object r0 = r0.get(r3)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto Ld
            r0.clear()
        Ld:
            java.util.concurrent.Executor r0 = r2.f1732r
            com.bykv.vk.openvk.component.video.j.xt.xt.cw$3 r1 = new com.bykv.vk.openvk.component.video.j.xt.xt.cw$3
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    public void j(java.util.Collection<java.lang.String> r6, int r7) {
            r5 = this;
            if (r6 == 0) goto L5d
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L5d
            int r0 = r6.size()
            int r0 = r0 + 1
            java.lang.String[] r1 = new java.lang.String[r0]
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.j.xt.xt.j>> r2 = r5.j
            java.lang.Object r2 = r2.get(r7)
            java.util.Map r2 = (java.util.Map) r2
            java.util.Iterator r6 = r6.iterator()
            r3 = -1
        L1d:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L33
            java.lang.Object r4 = r6.next()
            java.lang.String r4 = (java.lang.String) r4
            if (r2 == 0) goto L2e
            r2.remove(r4)
        L2e:
            int r3 = r3 + 1
            r1[r3] = r4
            goto L1d
        L33:
            int r3 = r3 + 1
            java.lang.String r6 = java.lang.String.valueOf(r7)
            r1[r3] = r6
            com.bykv.vk.openvk.component.video.j.xt.xt.r r6 = r5.cw     // Catch: java.lang.Throwable -> L5d
            android.database.sqlite.SQLiteDatabase r6 = r6.getWritableDatabase()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r7 = "video_http_header_t"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = "key IN("
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = r5.xt(r0)     // Catch: java.lang.Throwable -> L5d
            r2.append(r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = ") AND flag=?"
            r2.append(r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L5d
            r6.delete(r7, r0, r1)     // Catch: java.lang.Throwable -> L5d
        L5d:
            return
    }

    public com.bykv.vk.openvk.component.video.j.xt.xt.j query(java.lang.String r14, int r15) {
            r13 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.j.xt.xt.j>> r0 = r13.j
            java.lang.Object r0 = r0.get(r15)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L14
            r2 = r1
            goto L1a
        L14:
            java.lang.Object r2 = r0.get(r14)
            com.bykv.vk.openvk.component.video.j.xt.xt.j r2 = (com.bykv.vk.openvk.component.video.j.xt.xt.j) r2
        L1a:
            if (r2 == 0) goto L1d
            return r2
        L1d:
            com.bykv.vk.openvk.component.video.j.xt.xt.r r3 = r13.cw     // Catch: java.lang.Throwable -> L81
            android.database.sqlite.SQLiteDatabase r4 = r3.getReadableDatabase()     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = "video_http_header_t"
            java.lang.String r7 = "key=? AND flag=?"
            java.lang.String r3 = java.lang.String.valueOf(r15)     // Catch: java.lang.Throwable -> L81
            java.lang.String[] r8 = new java.lang.String[]{r14, r3}     // Catch: java.lang.Throwable -> L81
            java.lang.String r12 = "1"
            r6 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L81
            if (r3 == 0) goto L79
            int r4 = r3.getCount()     // Catch: java.lang.Throwable -> L81
            if (r4 <= 0) goto L76
            boolean r4 = r3.moveToNext()     // Catch: java.lang.Throwable -> L81
            if (r4 == 0) goto L76
            java.lang.String r2 = "key"
            int r2 = r3.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = r3.getString(r2)     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = "mime"
            int r2 = r3.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L81
            java.lang.String r6 = r3.getString(r2)     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = "contentLength"
            int r2 = r3.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L81
            int r7 = r3.getInt(r2)     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = "extra"
            int r2 = r3.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L81
            java.lang.String r9 = r3.getString(r2)     // Catch: java.lang.Throwable -> L81
            com.bykv.vk.openvk.component.video.j.xt.xt.j r4 = new com.bykv.vk.openvk.component.video.j.xt.xt.j     // Catch: java.lang.Throwable -> L81
            r8 = r15
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L81
            r2 = r4
        L76:
            r3.close()     // Catch: java.lang.Throwable -> L81
        L79:
            if (r2 == 0) goto L80
            if (r0 == 0) goto L80
            r0.put(r14, r2)     // Catch: java.lang.Throwable -> L81
        L80:
            return r2
        L81:
            return r1
    }
}
