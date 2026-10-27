package com.bumptech.glide.load.engine.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class c {
    private final java.util.Map<java.lang.String, com.bumptech.glide.load.engine.cache.c.a> a;
    private final com.bumptech.glide.load.engine.cache.c.b b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        final java.util.concurrent.locks.Lock a;
        int b;

        a() {
                r1 = this;
                r1.<init>()
                java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
                r0.<init>()
                r1.a = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b {
        private static final int b = 10;
        private final java.util.Queue<com.bumptech.glide.load.engine.cache.c.a> a;

        b() {
                r1 = this;
                r1.<init>()
                java.util.ArrayDeque r0 = new java.util.ArrayDeque
                r0.<init>()
                r1.a = r0
                return
        }

        com.bumptech.glide.load.engine.cache.c.a a() {
                r2 = this;
                java.util.Queue<com.bumptech.glide.load.engine.cache.c$a> r0 = r2.a
                monitor-enter(r0)
                java.util.Queue<com.bumptech.glide.load.engine.cache.c$a> r1 = r2.a     // Catch: java.lang.Throwable -> L15
                java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L15
                com.bumptech.glide.load.engine.cache.c$a r1 = (com.bumptech.glide.load.engine.cache.c.a) r1     // Catch: java.lang.Throwable -> L15
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                if (r1 != 0) goto L14
                com.bumptech.glide.load.engine.cache.c$a r0 = new com.bumptech.glide.load.engine.cache.c$a
                r0.<init>()
                return r0
            L14:
                return r1
            L15:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                throw r1
        }

        void b(com.bumptech.glide.load.engine.cache.c.a r4) {
                r3 = this;
                java.util.Queue<com.bumptech.glide.load.engine.cache.c$a> r0 = r3.a
                monitor-enter(r0)
                java.util.Queue<com.bumptech.glide.load.engine.cache.c$a> r1 = r3.a     // Catch: java.lang.Throwable -> L13
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L13
                r2 = 10
                if (r1 >= r2) goto L15
                java.util.Queue<com.bumptech.glide.load.engine.cache.c$a> r1 = r3.a     // Catch: java.lang.Throwable -> L13
                r1.offer(r4)     // Catch: java.lang.Throwable -> L13
                goto L15
            L13:
                r4 = move-exception
                goto L17
            L15:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return
            L17:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r4
        }
    }

    c() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a = r0
            com.bumptech.glide.load.engine.cache.c$b r0 = new com.bumptech.glide.load.engine.cache.c$b
            r0.<init>()
            r1.b = r0
            return
    }

    void a(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.String, com.bumptech.glide.load.engine.cache.c$a> r0 = r2.a     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L17
            com.bumptech.glide.load.engine.cache.c$a r0 = (com.bumptech.glide.load.engine.cache.c.a) r0     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            com.bumptech.glide.load.engine.cache.c$b r0 = r2.b     // Catch: java.lang.Throwable -> L17
            com.bumptech.glide.load.engine.cache.c$a r0 = r0.a()     // Catch: java.lang.Throwable -> L17
            java.util.Map<java.lang.String, com.bumptech.glide.load.engine.cache.c$a> r1 = r2.a     // Catch: java.lang.Throwable -> L17
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r3 = move-exception
            goto L26
        L19:
            int r3 = r0.b     // Catch: java.lang.Throwable -> L17
            int r3 = r3 + 1
            r0.b = r3     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            java.util.concurrent.locks.Lock r3 = r0.a
            r3.lock()
            return
        L26:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r3
    }

    void b(java.lang.String r6) {
            r5 = this;
            monitor-enter(r5)
            java.util.Map<java.lang.String, com.bumptech.glide.load.engine.cache.c$a> r0 = r5.a     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r0 = com.bumptech.glide.util.k.d(r0)     // Catch: java.lang.Throwable -> L2b
            com.bumptech.glide.load.engine.cache.c$a r0 = (com.bumptech.glide.load.engine.cache.c.a) r0     // Catch: java.lang.Throwable -> L2b
            int r1 = r0.b     // Catch: java.lang.Throwable -> L2b
            r2 = 1
            if (r1 < r2) goto L5b
            int r1 = r1 - r2
            r0.b = r1     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L54
            java.util.Map<java.lang.String, com.bumptech.glide.load.engine.cache.c$a> r1 = r5.a     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r1 = r1.remove(r6)     // Catch: java.lang.Throwable -> L2b
            com.bumptech.glide.load.engine.cache.c$a r1 = (com.bumptech.glide.load.engine.cache.c.a) r1     // Catch: java.lang.Throwable -> L2b
            boolean r2 = r1.equals(r0)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L2d
            com.bumptech.glide.load.engine.cache.c$b r6 = r5.b     // Catch: java.lang.Throwable -> L2b
            r6.b(r1)     // Catch: java.lang.Throwable -> L2b
            goto L54
        L2b:
            r6 = move-exception
            goto L7c
        L2d:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r3.<init>()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = "Removed the wrong lock, expected to remove: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L2b
            r3.append(r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = ", but actually removed: "
            r3.append(r0)     // Catch: java.lang.Throwable -> L2b
            r3.append(r1)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = ", safeKey: "
            r3.append(r0)     // Catch: java.lang.Throwable -> L2b
            r3.append(r6)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L2b
            throw r2     // Catch: java.lang.Throwable -> L2b
        L54:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2b
            java.util.concurrent.locks.Lock r6 = r0.a
            r6.unlock()
            return
        L5b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r2.<init>()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = "Cannot release a lock that is not held, safeKey: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L2b
            r2.append(r6)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r6 = ", interestedThreads: "
            r2.append(r6)     // Catch: java.lang.Throwable -> L2b
            int r6 = r0.b     // Catch: java.lang.Throwable -> L2b
            r2.append(r6)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L2b
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L2b
            throw r1     // Catch: java.lang.Throwable -> L2b
        L7c:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2b
            throw r6
    }
}
