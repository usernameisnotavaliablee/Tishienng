package com.bykv.vk.openvk.component.video.j.xt.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw extends com.bykv.vk.openvk.component.video.j.xt.j.j {
    private volatile long ae;
    private final java.util.concurrent.locks.ReentrantReadWriteLock cw;
    private final com.bykv.vk.openvk.component.video.j.xt.j.cw.xt g;
    public final java.io.File j;

    /* renamed from: m, reason: collision with root package name */
    private final java.util.Set<com.bykv.vk.openvk.component.video.j.xt.j.cw.j> f1713m;
    private final java.lang.Runnable oq;
    private final android.os.Handler qv;

    /* renamed from: r, reason: collision with root package name */
    private final java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock f1714r;
    private volatile float tl;
    private final java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock up;
    private final java.util.LinkedHashMap<java.lang.String, java.io.File> xt;






    public interface j {
        void j(java.lang.String r1);

        void j(java.util.Set<java.lang.String> r1);
    }

    private static final class xt {
        private final java.util.Map<java.lang.String, java.lang.Integer> j;

        private xt() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.j = r0
                return
        }

        /* synthetic */ xt(com.bykv.vk.openvk.component.video.j.xt.j.cw.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        synchronized boolean cw(java.lang.String r2) {
                r1 = this;
                monitor-enter(r1)
                boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Lf
                if (r0 != 0) goto L11
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r1.j     // Catch: java.lang.Throwable -> Lf
                boolean r2 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> Lf
                monitor-exit(r1)
                return r2
            Lf:
                r2 = move-exception
                goto L14
            L11:
                monitor-exit(r1)
                r2 = 0
                return r2
            L14:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
                throw r2
        }

        synchronized void j(java.lang.String r4) {
                r3 = this;
                monitor-enter(r3)
                boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L1d
                if (r0 != 0) goto L2d
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.j     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L1d
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L1d
                r1 = 1
                if (r0 != 0) goto L1f
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.j     // Catch: java.lang.Throwable -> L1d
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L1d
                r0.put(r4, r1)     // Catch: java.lang.Throwable -> L1d
                monitor-exit(r3)
                return
            L1d:
                r4 = move-exception
                goto L2f
            L1f:
                java.util.Map<java.lang.String, java.lang.Integer> r2 = r3.j     // Catch: java.lang.Throwable -> L1d
                int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L1d
                int r0 = r0 + r1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L1d
                r2.put(r4, r0)     // Catch: java.lang.Throwable -> L1d
            L2d:
                monitor-exit(r3)
                return
            L2f:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
                throw r4
        }

        synchronized void xt(java.lang.String r4) {
                r3 = this;
                monitor-enter(r3)
                boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L1f
                if (r0 != 0) goto L2f
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.j     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L1f
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L1f
                if (r0 == 0) goto L2f
                int r1 = r0.intValue()     // Catch: java.lang.Throwable -> L1f
                r2 = 1
                if (r1 != r2) goto L21
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.j     // Catch: java.lang.Throwable -> L1f
                r0.remove(r4)     // Catch: java.lang.Throwable -> L1f
                monitor-exit(r3)
                return
            L1f:
                r4 = move-exception
                goto L31
            L21:
                java.util.Map<java.lang.String, java.lang.Integer> r1 = r3.j     // Catch: java.lang.Throwable -> L1f
                int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L1f
                int r0 = r0 - r2
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L1f
                r1.put(r4, r0)     // Catch: java.lang.Throwable -> L1f
            L2f:
                monitor-exit(r3)
                return
            L31:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L1f
                throw r4
        }
    }

    public cw(java.io.File r5) throws java.io.IOException {
            r4 = this;
            r4.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = 1061158912(0x3f400000, float:0.75)
            r2 = 1
            r3 = 0
            r0.<init>(r3, r1, r2)
            r4.xt = r0
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r4.cw = r0
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            r4.f1714r = r1
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r4.up = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r4.f1713m = r0
            r0 = 104857600(0x6400000, double:5.1806538E-316)
            r4.ae = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r4.tl = r0
            com.bykv.vk.openvk.component.video.j.xt.j.cw$xt r0 = new com.bykv.vk.openvk.component.video.j.xt.j.cw$xt
            r1 = 0
            r0.<init>(r1)
            r4.g = r0
            com.bykv.vk.openvk.component.video.j.xt.j.cw$1 r0 = new com.bykv.vk.openvk.component.video.j.xt.j.cw$1
            r0.<init>(r4)
            r4.oq = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r4.qv = r0
            if (r5 == 0) goto L78
            boolean r0 = r5.exists()
            if (r0 == 0) goto L78
            boolean r0 = r5.isDirectory()
            if (r0 == 0) goto L78
            boolean r0 = r5.canRead()
            if (r0 == 0) goto L78
            boolean r0 = r5.canWrite()
            if (r0 != 0) goto L6a
            goto L78
        L6a:
            r4.j = r5
            com.bykv.vk.openvk.component.video.j.xt.j.cw$2 r5 = new com.bykv.vk.openvk.component.video.j.xt.j.cw$2
            java.lang.String r0 = "DiskLruCache"
            r1 = 5
            r5.<init>(r4, r0, r1)
            com.bytedance.sdk.component.oq.ae.xt(r5)
            return
        L78:
            if (r5 != 0) goto L7d
            java.lang.String r5 = " dir null"
            goto Lb3
        L7d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "exists: "
            r0.<init>(r1)
            boolean r1 = r5.exists()
            r0.append(r1)
            java.lang.String r1 = ", isDirectory: "
            r0.append(r1)
            boolean r1 = r5.isDirectory()
            r0.append(r1)
            java.lang.String r1 = ", canRead: "
            r0.append(r1)
            boolean r1 = r5.canRead()
            r0.append(r1)
            java.lang.String r1 = ", canWrite: "
            r0.append(r1)
            boolean r5 = r5.canWrite()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
        Lb3:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "dir error!  "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
    }

    private void cw() {
            r4 = this;
            android.os.Handler r0 = r4.qv
            java.lang.Runnable r1 = r4.oq
            r0.removeCallbacks(r1)
            android.os.Handler r0 = r4.qv
            java.lang.Runnable r1 = r4.oq
            r2 = 10000(0x2710, double:4.9407E-320)
            r0.postDelayed(r1, r2)
            return
    }

    static /* synthetic */ long j(com.bykv.vk.openvk.component.video.j.xt.j.cw r2) {
            long r0 = r2.ae
            return r0
    }

    private java.lang.String j(java.io.File r1) {
            r0 = this;
            java.lang.String r1 = r1.getName()
            return r1
    }

    static /* synthetic */ void j(com.bykv.vk.openvk.component.video.j.xt.j.cw r0, long r1) {
            r0.xt(r1)
            return
    }

    private void xt() {
            r8 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r8.up
            r0.lock()
            java.io.File r0 = r8.j     // Catch: java.lang.Throwable -> L37
            java.io.File[] r0 = r0.listFiles()     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L5e
            int r1 = r0.length     // Catch: java.lang.Throwable -> L37
            if (r1 <= 0) goto L5e
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L37
            int r2 = r0.length     // Catch: java.lang.Throwable -> L37
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L37
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L37
            int r3 = r0.length     // Catch: java.lang.Throwable -> L37
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L37
            int r3 = r0.length     // Catch: java.lang.Throwable -> L37
            r4 = 0
        L1e:
            if (r4 >= r3) goto L3c
            r5 = r0[r4]     // Catch: java.lang.Throwable -> L37
            boolean r6 = r5.isFile()     // Catch: java.lang.Throwable -> L37
            if (r6 == 0) goto L39
            r2.add(r5)     // Catch: java.lang.Throwable -> L37
            long r6 = r5.lastModified()     // Catch: java.lang.Throwable -> L37
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L37
            r1.put(r5, r6)     // Catch: java.lang.Throwable -> L37
            goto L39
        L37:
            r0 = move-exception
            goto L67
        L39:
            int r4 = r4 + 1
            goto L1e
        L3c:
            com.bykv.vk.openvk.component.video.j.xt.j.cw$3 r0 = new com.bykv.vk.openvk.component.video.j.xt.j.cw$3     // Catch: java.lang.Throwable -> L37
            r0.<init>(r8, r1)     // Catch: java.lang.Throwable -> L37
            java.util.Collections.sort(r2, r0)     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r0 = r2.iterator()     // Catch: java.lang.Throwable -> L37
        L48:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L37
            java.io.File r1 = (java.io.File) r1     // Catch: java.lang.Throwable -> L37
            java.util.LinkedHashMap<java.lang.String, java.io.File> r2 = r8.xt     // Catch: java.lang.Throwable -> L37
            java.lang.String r3 = r8.j(r1)     // Catch: java.lang.Throwable -> L37
            r2.put(r3, r1)     // Catch: java.lang.Throwable -> L37
            goto L48
        L5e:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r8.up
            r0.unlock()
            r8.cw()
            return
        L67:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r8.up
            r1.unlock()
            throw r0
    }

    private void xt(long r13) {
            r12 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r12.up
            r1.lock()
            r1 = 0
            java.util.LinkedHashMap<java.lang.String, java.io.File> r2 = r12.xt     // Catch: java.lang.Throwable -> L2f
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L2f
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2f
            r3 = 0
        L17:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r5 == 0) goto L32
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L2f
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L2f
            java.io.File r5 = (java.io.File) r5     // Catch: java.lang.Throwable -> L2f
            long r5 = r5.length()     // Catch: java.lang.Throwable -> L2f
            long r3 = r3 + r5
            goto L17
        L2f:
            r13 = move-exception
            goto Ld1
        L32:
            int r2 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r2 > 0) goto L3c
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r13 = r12.up
            r13.unlock()
            return
        L3c:
            float r13 = (float) r13
            float r14 = r12.tl     // Catch: java.lang.Throwable -> L2f
            float r13 = r13 * r14
            long r13 = (long) r13     // Catch: java.lang.Throwable -> L2f
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L2f
            r2.<init>()     // Catch: java.lang.Throwable -> L2f
            java.util.LinkedHashMap<java.lang.String, java.io.File> r1 = r12.xt     // Catch: java.lang.Throwable -> La7
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> La7
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La7
        L51:
            boolean r5 = r1.hasNext()     // Catch: java.lang.Throwable -> La7
            if (r5 == 0) goto Lb5
            java.lang.Object r5 = r1.next()     // Catch: java.lang.Throwable -> La7
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> La7
            java.lang.Object r6 = r5.getValue()     // Catch: java.lang.Throwable -> La7
            java.io.File r6 = (java.io.File) r6     // Catch: java.lang.Throwable -> La7
            if (r6 == 0) goto Laa
            boolean r7 = r6.exists()     // Catch: java.lang.Throwable -> La7
            if (r7 == 0) goto Laa
            com.bykv.vk.openvk.component.video.j.xt.j.cw$xt r7 = r12.g     // Catch: java.lang.Throwable -> La7
            java.lang.String r8 = r12.j(r6)     // Catch: java.lang.Throwable -> La7
            boolean r7 = r7.cw(r8)     // Catch: java.lang.Throwable -> La7
            if (r7 != 0) goto Lb1
            long r7 = r6.length()     // Catch: java.lang.Throwable -> La7
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> La7
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7
            r10.<init>()     // Catch: java.lang.Throwable -> La7
            java.lang.String r11 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> La7
            r10.append(r11)     // Catch: java.lang.Throwable -> La7
            java.lang.String r11 = "-tmp"
            r10.append(r11)     // Catch: java.lang.Throwable -> La7
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> La7
            r9.<init>(r10)     // Catch: java.lang.Throwable -> La7
            boolean r6 = r6.renameTo(r9)     // Catch: java.lang.Throwable -> La7
            if (r6 == 0) goto Lb1
            r0.add(r9)     // Catch: java.lang.Throwable -> La7
            long r3 = r3 - r7
            java.lang.Object r5 = r5.getKey()     // Catch: java.lang.Throwable -> La7
            r2.add(r5)     // Catch: java.lang.Throwable -> La7
            goto Lb1
        La7:
            r13 = move-exception
            r1 = r2
            goto Ld1
        Laa:
            java.lang.Object r5 = r5.getKey()     // Catch: java.lang.Throwable -> La7
            r2.add(r5)     // Catch: java.lang.Throwable -> La7
        Lb1:
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 > 0) goto L51
        Lb5:
            java.util.Iterator r13 = r2.iterator()     // Catch: java.lang.Throwable -> La7
        Lb9:
            boolean r14 = r13.hasNext()     // Catch: java.lang.Throwable -> La7
            if (r14 == 0) goto Lcb
            java.lang.Object r14 = r13.next()     // Catch: java.lang.Throwable -> La7
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> La7
            java.util.LinkedHashMap<java.lang.String, java.io.File> r1 = r12.xt     // Catch: java.lang.Throwable -> La7
            r1.remove(r14)     // Catch: java.lang.Throwable -> La7
            goto Lb9
        Lcb:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r13 = r12.up
            r13.unlock()
            goto Lda
        Ld1:
            com.bytedance.sdk.component.utils.vl.j(r13)     // Catch: java.lang.Throwable -> Lfc
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r13 = r12.up
            r13.unlock()
            r2 = r1
        Lda:
            java.util.Set<com.bykv.vk.openvk.component.video.j.xt.j.cw$j> r13 = r12.f1713m
            java.util.Iterator r13 = r13.iterator()
        Le0:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto Lf0
            java.lang.Object r14 = r13.next()
            com.bykv.vk.openvk.component.video.j.xt.j.cw$j r14 = (com.bykv.vk.openvk.component.video.j.xt.j.cw.j) r14
            r14.j(r2)
            goto Le0
        Lf0:
            com.bykv.vk.openvk.component.video.j.xt.j.cw$5 r13 = new com.bykv.vk.openvk.component.video.j.xt.j.cw$5
            java.lang.String r14 = "trimSize"
            r1 = 1
            r13.<init>(r12, r14, r1, r0)
            com.bytedance.sdk.component.oq.ae.xt(r13)
            return
        Lfc:
            r13 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r14 = r12.up
            r14.unlock()
            throw r13
    }

    static /* synthetic */ void xt(com.bykv.vk.openvk.component.video.j.xt.j.cw r0) {
            r0.xt()
            return
    }

    @Override // com.bykv.vk.openvk.component.video.j.xt.j.j
    public java.io.File cw(java.lang.String r4) {
            r3 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.f1714r
            r0.lock()
            java.util.LinkedHashMap<java.lang.String, java.io.File> r0 = r3.xt
            java.lang.Object r0 = r0.get(r4)
            java.io.File r0 = (java.io.File) r0
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r3.f1714r
            r1.unlock()
            if (r0 == 0) goto L15
            return r0
        L15:
            java.io.File r0 = new java.io.File
            java.io.File r1 = r3.j
            r0.<init>(r1, r4)
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r3.up
            r1.lock()
            java.util.LinkedHashMap<java.lang.String, java.io.File> r1 = r3.xt
            r1.put(r4, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r3.up
            r1.unlock()
            java.util.Set<com.bykv.vk.openvk.component.video.j.xt.j.cw$j> r1 = r3.f1713m
            java.util.Iterator r1 = r1.iterator()
        L31:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L41
            java.lang.Object r2 = r1.next()
            com.bykv.vk.openvk.component.video.j.xt.j.cw$j r2 = (com.bykv.vk.openvk.component.video.j.xt.j.cw.j) r2
            r2.j(r4)
            goto L31
        L41:
            r3.cw()
            return r0
    }

    public void j() {
            r3 = this;
            com.bykv.vk.openvk.component.video.j.xt.r r0 = com.bykv.vk.openvk.component.video.j.xt.r.cw()
            r0.r()
            android.content.Context r0 = com.bykv.vk.openvk.component.video.j.xt.up.getContext()
            if (r0 == 0) goto L15
            com.bykv.vk.openvk.component.video.j.xt.xt.cw r0 = com.bykv.vk.openvk.component.video.j.xt.xt.cw.j(r0)
            r1 = 0
            r0.j(r1)
        L15:
            android.os.Handler r0 = r3.qv
            java.lang.Runnable r1 = r3.oq
            r0.removeCallbacks(r1)
            com.bykv.vk.openvk.component.video.j.xt.j.cw$4 r0 = new com.bykv.vk.openvk.component.video.j.xt.j.cw$4
            java.lang.String r1 = "clear"
            r2 = 1
            r0.<init>(r3, r1, r2)
            com.bytedance.sdk.component.oq.ae.xt(r0)
            return
    }

    public void j(long r1) {
            r0 = this;
            r0.ae = r1
            r0.cw()
            return
    }

    public void j(com.bykv.vk.openvk.component.video.j.xt.j.cw.j r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.Set<com.bykv.vk.openvk.component.video.j.xt.j.cw$j> r0 = r1.f1713m
            r0.add(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.openvk.component.video.j.xt.j.j
    public void j(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Lb
            com.bykv.vk.openvk.component.video.j.xt.j.cw$xt r0 = r1.g
            r0.j(r2)
        Lb:
            return
    }

    @Override // com.bykv.vk.openvk.component.video.j.xt.j.j
    public java.io.File r(java.lang.String r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.f1714r
            boolean r0 = r0.tryLock()
            if (r0 == 0) goto L16
            java.util.LinkedHashMap<java.lang.String, java.io.File> r0 = r1.xt
            java.lang.Object r2 = r0.get(r2)
            java.io.File r2 = (java.io.File) r2
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.f1714r
            r0.unlock()
            return r2
        L16:
            r2 = 0
            return r2
    }

    @Override // com.bykv.vk.openvk.component.video.j.xt.j.j
    public void xt(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Lb
            com.bykv.vk.openvk.component.video.j.xt.j.cw$xt r0 = r1.g
            r0.xt(r2)
        Lb:
            return
    }
}
